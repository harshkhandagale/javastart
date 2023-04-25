package com.company;
import java.util.Scanner;

public class chw_16_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You can drive");
        }
        else if(age==18){
            System.out.println("Wait for one year bhai");
        }
        else{
            System.out.println("Under age");
        }

    }
}
