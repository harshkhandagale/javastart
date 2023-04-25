//Creating java doc
package com.company;
import java.util.Scanner;
// Below is shown how you write the java doc i.e/**  */

/**
 * This is my java doc that will be displayed on original jdk site
 * @author Harsh
 * @since 2001
 * @version 2.0
 * @see <a href = "https://docs.oracle.com/en/java/javase/18/docs/api/index.html" target = "_blank">javaDoc</a>
 */


public class javaDoc {
    public static void main(String[] args) {
        //while loop

        int a =100;
        while (a<=200){
            System.out.println(a);
            a++;
        }



        //do while loop
        //Do will execute atleast once at the starting , then check the while condition
/*
        int b =10;
        do{
            System.out.println(b);
            b++;
        }while(b<6);
        //this code above will print 10 as said "atleast once "

 */

        //print n natural number
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number upto which u wanna print");
        int c= sc.nextInt();
        int d=1;
        do{
            System.out.println(d);
            d++;
        }while(d<=c);

 */


        //For loop
        //2n --> Even number
        //2n+1 --> Odd number
 /*
        for(int i=0; i<=10;i++){
            System.out.println(i);
        }


  */
        //first n odd numbers
/*
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        for(int i=0; i<=a; i++){
            System.out.println(2*i+1);
        };

 */

        //Decreament for loop
/*
        for(int i=7; i>0; i--){
            System.out.println(i);
        }

 */

        //Break
        for(int i=7; i>0; i--){
            System.out.println(i);
            if (i==3){
                System.out.println("ending the loop");
                break;
            }
        }

        //continue
        for(int i=0; i<10;i++){
            if(i==2){
//                System.out.println("ending the loop");
                continue;   //continue statement skips the current statement and continues next
            }
            System.out.println(i);
            System.out.println("Java is great");
        }

    }
}
