package com.iris.thread.preTest;

public class MyThread extends Thread {

    /*private int count=5;



    @Override
    public synchronized void  run() {
        while (count>0){
            count--;
            System.out.println("The "+ MyThread.currentThread().getName()+" is Counting,count="+count);
        }
    }*/

    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 1000000; i++) {
            if (interrupted()) {
                System.out.println("i am quitting !");
                return;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("yocadan------");
        }
    }

