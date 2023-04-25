package com.company;

import java.util.Scanner;

public class practice5_harryBhai {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);

/*
                //Question 1
                //sum of first n natural numbers
                System.out.println("Enter a number");
                int n= sc.nextInt();
                int a=1;
                while (a<=n){
                        System.out.println((n+1)*n/2);
                        break;
                }

 */

/*
                //Question 2
                //table of a given number
                System.out.println("Enter Which table you Want");
                int a = sc.nextInt();
                int b=1;
                for (int i=1;i<=10;i++){
                        System.out.printf("%d X %d =%d ",a,i, a*i);
                        System.out.println();
                }

 */

/*
                //foactorial of 5
                int n=5;
                int factorial=1;
                for (int i =1; i<=5;i++){
                       factorial*=i;

                }
                System.out.println(factorial);

 */



                //Factorial of given number
                System.out.println("Enter the number you want factorial of  ");
                int a = sc.nextInt();
                int fact =1;
                for (int i=1; i<=a;i++){
                        fact *=i;
                }
                System.out.println(fact);




        }
        }
