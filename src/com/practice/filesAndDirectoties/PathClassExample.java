package com.practice.filesAndDirectoties;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassExample {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\i318441\\Desktop\\NEWFILE.txt");
        try {
            Files.deleteIfExists(path);
        }
        catch(IOException io){

        }
    }
}
