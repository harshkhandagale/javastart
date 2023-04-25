package com.company;

public class solve {
    public static void main(String[] args) {
        System.out.println(1%3);
        for (int i=2;i<=15;i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizzBuzz");
            }
            else if (i%3==0){
                System.out.println("fizz");
            }
            else if (i%5==0){
                System.out.println("buzz");
            }

            else {
                System.out.println(i);
            }
        }
    }
}
