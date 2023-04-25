package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file {
    public static void main(String[] args) {

        //Code to create a new file
        File myFile = new File("myFile111");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
        }



        //Code to write in a file
        try {
            FileWriter fileWriter = new FileWriter("myFile111");
            fileWriter.write("This is a first file\n ok ");
            fileWriter.close();         //mandatory to close the file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



/*
        //Code for reading a file in the terminal -> (Scanner Class is Used)
        File myFile = new File("myFile111");
        try{
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("File not Found");
        }
 */

/*

        //Deleting the file
        File myFile = new File("myFile111");
        if (myFile.delete()){
            System.out.println("I have deleted the file");
        }
        else {
            System.out.println("Some error occured");
        }
 */



    }
}
