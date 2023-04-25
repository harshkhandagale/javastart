//IMP* -> overloading can be done by changing the parametres and not the return type
//eg:- void int foo() <----  is not allowed, watch below
package com.company;

public class method_overloading {

    //Method Overloading
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a) //this is a parametre -> (int a)
    {
        System.out.println("good Morning "+a+" Bro!");
    }
    static  int foo(int a, int b) //this is allowed but static void int foo not allowed
    {
        System.out.println("good Morning "+a+" "+b+" Bro!");
        return b;
    }



 /*
        //When you want noting in the output for eg: a int or string ; you use void
        static void tellJoke(){
        System.out.println("It is a joke , Laugh");
    }
    static void  change(int a){
        a=98;
    }
    static  void change2(int [] arr){
        arr[0]=98;
    }

  */


    public static void main(String[] args) {

//        tellJoke();
/*
        int x=45;
        change(x);
        System.out.println("Unchanged values : "+x); //this will not change the value of x, since it is just a copy

        int [] arr= {1,2,3,4};
        change2(arr);
        System.out.println("Changed value : "+arr[0]); //this craetes a refrence

 */

        //Method Overloading
        foo();
        foo(11);  //this is a argument -> (11)
        foo(11,12);

    }
}
