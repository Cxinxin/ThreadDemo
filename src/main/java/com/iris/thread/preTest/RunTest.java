package com.iris.thread.preTest;

public class RunTest {

    public static void main(String args[]){
       /* MyThread a=new MyThread("A");
        MyThread b=new MyThread("B");
        MyThread c=new MyThread("c");
        a.run();
        b.run();
        c.run();*/
      /*  MyThread mythread=new MyThread();
        //下列线程都是通过mythread对象创建的
        Thread a=new Thread(mythread,"A");
        Thread b=new Thread(mythread,"B");
        Thread c=new Thread(mythread,"C");
        Thread d=new Thread(mythread,"D");
        Thread e=new Thread(mythread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();*/
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
