package com.iris.thread;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 生产者 生产食物
 */
public class Producer {
    private boolean working=true;
    //阻塞队列
    private BlockingQueue<Food> queue;
    //保证id 唯一性，原子化自增操作
    private static AtomicInteger count=new AtomicInteger();

}
