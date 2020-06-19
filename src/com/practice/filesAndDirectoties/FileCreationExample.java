package com.practice.filesAndDirectoties;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\i318441\\Desktop\\NEWFILE.txt");
        try{
            boolean fileCreated = myFile.createNewFile();
            System.out.println(fileCreated);
        }
        catch(IOException e){

        }

    }
}
