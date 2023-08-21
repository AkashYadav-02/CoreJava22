package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileInput {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\akash.yadav\\Desktop\\Country.txt");
        
        final String filepath="C:\\Users\\akash.yadav\\Desktop\\Country.txt";
//        
//        try (FileReader fileReader = new FileReader(file);
//                BufferedReader bufferedReader = new BufferedReader(fileReader)) {
//
//               String line;
//
//               // Read lines from the file until the end is reached (null)
//               while ((line = bufferedReader.readLine()) != null) {
//                   // Process the line read, e.g., print it
//                   System.out.println(line);
//               }
//           } catch (IOException e) {
//               e.printStackTrace();
//           }
    	 
//    	        try (FileInputStream input
//    	             = new FileInputStream(file)) {
//    	            int character;
//    	          
//    	 
//    	            while ((character = input.read()) != -1) {
//    	                System.out.print((char)character);
//    	            }
//    	        }
//    	        catch (Exception e) {
//    	            e.printStackTrace();
//    	        }
        
        
        try {
            Path path = Paths.get(filepath);
            Stream<String> lines = Files.lines(path);
            
            lines.forEach(System.out::println);

            lines.close(); // Don't forget to close the stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
