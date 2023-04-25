package com.company;

//Refer the notes ...associativity and operators
public class chw_09_op_pre {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        System.out.println(a);


        //increament and decreament
        int i = 2;
        /*below, first it will print original i value and then increatment, this will not print
        3 , only the value 3 will be stored unless you sout(i) ...in short first used than increament*/
        System.out.println(i++);
        /*below, it will first increament and then print the value i.e it will print here 4...inshort
         first increamnet then used*/
        System.out.println(++i);
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);
        int x1 = y++ * 8;
        System.out.println(x1);

    }
}
