package com.practice.threds;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new ThreadExample();
        t1.setName("Thread t1");
        t1.start();
        t1.join();
        Thread t2 = new ThreadExample();
        t2.setName("Thread t2");
        t2.start();


        System.out.println(Thread.activeCount());
    }
}
