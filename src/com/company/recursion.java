package com.company;

public class recursion {
    //Fibonacci series
    static int factorial(int n){
        if (n==0||n==1){
            return 1;
        }
        else {
            return n* factorial(n-1);
        }
    }
    static int factorial_iterative(int a){
        if (a==0||a==1){
            return 1;
        }
        else {
            int result=1;
            for (int n=1; n<=a;n++){
                result*=n;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial_iterative(5));
        //both are recursion

    }
}
