package com.iris.thread;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 生产者 生产食物
 */
public class Producer implements Runnable{
    private boolean working=true;
    //阻塞队列
    private BlockingQueue<Food> queue;
    //保证id 唯一性，原子化自增操作
    private static AtomicInteger count=new AtomicInteger();


    public Producer(BlockingQueue<Food> queue){
        this.queue=queue;
    }


    @Override
    public void run() {
        while (working){
            int id=count.incrementAndGet();
            Food food=new Food(id);

            if (queue.offer(food)){
                System.out.println(Thread.currentThread().getId()+"号员工将"+food.getId()+"号食物放到餐桌上。");
            }else {
                System.out.println("餐桌已满，"+food.getId()+"号食物无法加入！");
            }
            try{
                Thread.sleep(1000*3);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
    public void stop(){
        working=false;
    }
}
