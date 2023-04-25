package com.company;
import java.util.Scanner;

public class chw_18_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("you are young");
                break;
            case 23:
                System.out.println("Go to job");
                break;
            default:
                System.out.println("GoodBy");
        }

//Enhanced switch *****  here we do not require any beark statement  *************
/*
        switch (age) {
            case 18 -> System.out.println("you are young");
            case 23 -> System.out.println("Go to job");
            default -> System.out.println("GoodBy");
        }
*/

    }
}
