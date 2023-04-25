package com.company;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "Invalid input by the user";
    }
    public String getMessage(){
        return "Invalid input ";
    }
}

class CannotDivideByZero extends Exception{
    @Override
    public String getMessage(){
        return "Cannot divide by zero";
    }
}

class MaxInputException extends Exception{
    @Override
    public String getMessage(){
        return "too large number";
    }
}

class CustomCalculator {
    double add(double a , double b) throws MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a+b;
    }
    double subtract(double a, double b)throws MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiple(double a, double b) throws MaxInputException{
            if (a>100000 || b>100000){
                throw new MaxInputException();
            }
        return a*b;
    }
    double divide(double a, double b) throws CannotDivideByZero,MaxInputException{
        if (a>100000 || b>100000){
            throw new MaxInputException();
        }
        if (b==0){
            throw new CannotDivideByZero();
        }
        return a/b;
    }

}
public class exercise6 {
    public static void main(String[] args) throws MaxInputException,CannotDivideByZero,InvalidInputException{
        CustomCalculator c1 =new CustomCalculator();
        System.out.println(c1.add(1,2));
        System.out.println(c1.add(1,2000000));  //too large number exception
        System.out.println(c1.multiple(1,2));
        System.out.println(c1.divide(1,2));
//        System.out.println(c1.divide(1,0)); //will throw error
        System.out.println(c1.subtract(1,9));


    }
}
