package com.abhishek.java.exceptions;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
                FileReader reader = new FileReader(file);  // This can throw FileNotFoundException (checked exception)
                int character;

                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }

                reader.close();  // This can throw IOException (checked exception)
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }
    }

}
