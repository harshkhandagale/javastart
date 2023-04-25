//When we are defining a "throws" in a function then, while using it again or calling it , you must put it in try and catch block
//DIfference in throw and throws is that throw -> throws error at the execution
//and throws-> gives a warning to the user that the function may throw error
package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString()    {
        return "Negative radius not allowed";
    }
    @Override
    public String getMessage(){
        return "Negative radius not allowed";
    }
}

public class throw_throws {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    //function created
    public static int divide(int a, int b) throws ArithmeticException {
        int c = a / b;
        return c;
    }
    //finally block representation
    public static int greed(){
        try{
            int a=22;
            int b=33;
            int s= a/b;
            return s;   //even we are return after getting the desired output, it will not terminate until the finally block is executed
        }catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("cleaning th resorces");
        }
        return 0;
    }

    public static void main(String[] args) {
        //trying to access the above function but with wrong or invalid input
        try {
            int result = divide(6, 0);        //6/0 is not defined
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }


        //area
        try {
            double ar = area(-4);       //this will print "Negative radius not allowed"
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println(e);
        }

        //finally
        int k =greed();
        System.out.println(k);

    }
}
