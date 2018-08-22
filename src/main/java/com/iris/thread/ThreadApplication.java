package com.iris.thread;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;

import static java.util.concurrent.Executors.newFixedThreadPool;


@SpringBootApplication
public class ThreadApplication {

	public static void main(String[] args) {

		BlockingQueue<Food> queue=new LinkedBlockingDeque <>(10);
        //3名生产者
		Producer[] p=new Producer[3];
        //15名消费者
		Consumer[] c=new Consumer[15];


        //消费者和生产者 ->统一队列
        for(int i=0;i<3;i++){
            p[i]=new Producer(queue);
        }
        for(int j=0;j<15;j++){
            c[j]=new Consumer(queue);
        }

        //线程池 规定5条线程
        ExecutorService executorService= newFixedThreadPool(5);
        for(int i=0;i<3;i++){
            executorService.execute(p[i]);
        }
        for(int j=0;j<15;j++){
            executorService.execute(c[j]);
        }

        try {
            Thread.sleep(1000*20);
        }catch (InterruptedException e){
            e.printStackTrace();
        }



	}
}
