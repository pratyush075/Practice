package com.practice.filesAndDirectoties;

import java.io.File;

public class DirectoriesExample {

    public static void main(String[] args) {

        new File("myDirectory").mkdir();

        String contents[] =  new File(".").list();
        for(String content: contents){
            System.out.println(content);
        }


    }
}
