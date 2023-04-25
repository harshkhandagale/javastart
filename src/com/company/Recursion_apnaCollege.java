//refer notes in the folder name - > recursionApnaCollege
package com.company;

public class Recursion_apnaCollege {
 /*
    //Print 5-1
    public static void print_num(int n){
        if (n==0)       //base condition
            return;
        System.out.println(n);      //at start print
        print_num(n-1);         //recursive function
    }

 */

/*
    //print 1-5
    public static void print_num2(int m){
        if (m==6) {
            return;
        }
        System.out.println(m);
        print_num2(m+1);
    }

*/
/*
    //Sum of n natural numbers
    public static void print_sum(int i ,int n ,int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        print_sum(i+1, n,sum);
        //after printing sum it is returning step by step downwards and printing i value
        System.out.println(i);
    }
 */
/*
    //print factorial
    public static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }

        int fact_nm1 = fact(n-1);  //factorial of n-1
        int fact_n = n*fact_nm1;      //storing n*n-1 value
        return fact_n;
    }

 */
/*
    //print fibonaccci series of given n numbers****************simple way is given check fibonacci simple.pdf****************************
    public static void printFib(int a , int b, int n){
        if (n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b,c,n-1);
    }

 */
/*
    //print x raise to power n
    //like fibonacci series
    public static int calPow(int x , int n){
        if (n==0){
            return 1;
        }
        else if (x==0){
            return 0;
        }
        //xPownm1  --> x to the power n-1
        int xPownm1 = calPow(x,n-1);

        //xPown  --> x to the power n
        int xPown =x * xPownm1;
        return xPown;
    }
 */

    //print x raise to power n  by log n ...this saves th memory
    //like fibonacci series
    public static int calPow(int x , int n){
        if (n==0){
            return 1;
        }
        else if (x==0){
            return 0;
        }
        //if n is even
        if (n%2==0){
            return calPow(x,n/2) * calPow(x, n/2);
        }
        //if n is odd
        else {
            return calPow(x,n/2) * calPow(x,n/2) * x;
        }

    }



    public static void main(String[] args) {
//        print_num(5);
//        print_num2(1);
//        print_sum(1,5,0);|
//        int ans =fact(5);
//        System.out.println(ans);
/*
          int a = 0;
          int b =1;
        System.out.println(a);
        System.out.println(b);
        int n =7;
        printFib(a,b,n-2);
 */
/*
        int x =2;
        int n =5;
        int ans = calPow(x,n);
        System.out.println(ans);

 */
/*
        int x =2;
        int n =5;
        int ans = calPow(x,n);
        System.out.println(ans);  //same answer

 */










    }
}
