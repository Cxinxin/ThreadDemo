package com.iris.thread;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private boolean working=true;
    private BlockingQueue<Food> queue;

    public Consumer(BlockingQueue<Food> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                // take()方式，若队列中没有元素则线程被阻塞
                Food food=queue.take();
                System.out.println(food.getId()+"号食物已经被"+Thread.currentThread().getId()+"号顾客拿走了");
                Thread.sleep(1000*2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
