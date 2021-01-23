package com.company;
public class Main {
    public static void main(String[] args) throws Exception {
        Thread t1=new Thread(()->{
            for (int i=0;i<5;i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        },"Hi Thread");
        Thread t2=new Thread(()->{
            for (int i=0;i<5;i++)
            {
                System.out.println("Hello");
                try {Thread.sleep(1000); } catch(Exception e){}
            }
        },"Hello Thread");
        t1.start();
        try {Thread.sleep(10); } catch(Exception e){}
        t2.start();

        System.out.println(t1.isAlive());

        t1.join();

        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Byeee");

        //Name ofthe Threads
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        //changing names of the thread
        t1.setName("Hi");
        t2.setName("Hello");
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        //priority
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());



    }
}
