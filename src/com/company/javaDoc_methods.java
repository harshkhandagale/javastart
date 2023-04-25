package com.company;

/**
 *
 */
public class javaDoc_methods {
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     *This is add method
     * @param a this takes integer a
     * @param b this takes integer b
     * @return  adds a and b
     * @throws Exception if a==0
     * @deprecated This method is depricated plese use + operator
     */
    public int add(int a , int b) throws Exception{
        if (a==0){
            throw new Exception();
        }
        int c;
        c=a+b;
        return c;
    }
}
