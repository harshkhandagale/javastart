package com.company;
import java.util.Scanner;

public class percentagecalculator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maths marks");
        int a = sc.nextInt();
        System.out.println("Enter Science marks");
        int a1 = sc.nextInt();
        System.out.println("Enter Phs marks");
        int a2 = sc.nextInt();
        System.out.println("Enter Bio marks");
        int a3 = sc.nextInt();
        System.out.println("Enter DB marks");
        int a4 = sc.nextInt();
        System.out.println("Enter total Marks");
        int b = sc.nextInt();
        System.out.println("Your Percentage is ");
        int perc = ((a+a1+a2+a3+a4)*100)/b;
        System.out.println(perc+"%");
    }
}
