package com.company;

import java.io.FileWriter;
import java.io.IOException;

class MyDepricated{
    @Deprecated
    void meth1(){
        System.out.println("I am meth 1");
    }
}
// 3: Create an interface and generate an instance from it
interface MyInter{
    void display();
}

public class AdJavaPrac_2 {
    //2.
    @SuppressWarnings({"deprecation"})
    public static void main(String[] args) {
         //1.Create a class and a method with deprecated annotation.
        //What is its effect on program execution?
        MyDepricated my = new MyDepricated();
        my.meth1();

        //Ans --. it will execute in terminal

        //4.
        //using Lambda
        MyInter m1 = () -> {System.out.println("I am instance directly");};

//5.Write program to generate multiplication table of given number and write it to file
        int i =5;
        String table = "";
        for (int j =1; j<=10; j++){
            table += i+ "X" + j + "=" + (i*j);
            table+="\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("Multiplication_table.txt");
            fileWriter.write(table);
            fileWriter.close();         //mandatory to close the file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
