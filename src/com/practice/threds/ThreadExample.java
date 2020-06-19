package com.practice.threds;

public class ThreadExample extends Thread {
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i+" "+this.getName());
        }
    }
}
