/* What if you a sum of numbers but in the method you just give statis void foo(int a, int b)
and you are having 3 numbers to sum, also after that you have 4,5,6,7 nuumbers to sum,
will you create a separate method for each and every calculation ?.
that is why we use var args , where the numbers are taken as array[]
 */

package com.company;

public class variable_arguments {
    static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
/*
    //if you want a compulsory variable i.e the array must not be empty
    static int sum(int x,int ...arr){
        int result=x;
        for(int a:arr){
            result+=a;
        }
        return result;
    }

 */

    public static void main(String[] args) {
//        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5,6));
    }
}
