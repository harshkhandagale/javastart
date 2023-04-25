//Keep in mind that a method is never inside the public static void main(String[] args)

package com.company;

public class methods {
    static int sum(int a,int b){
        int z=a+b;
        return z;
    }



    //if you dont want to use static , you have to create ojects
    public static void main(String[] args) {
        int c=2;
        int d=3;
        int e = sum(c,d);
        System.out.println(e);
//          Method invocation using object
//        methods obj = new methods();
//        int e= obj.sum(c,d);

        //tellJoke();



    }
}