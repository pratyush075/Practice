package com.practice.threds;

public class RunnableMain {

    public static void main(String[] args) {

        Thread t1 = new Thread(new RunnableExample());
        t1.start();

        Thread t2 = new Thread( ()->{
            for(int i=0;i<100;i++)
            {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        });
        t2.start();
    }
}
