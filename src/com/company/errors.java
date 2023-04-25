//Here errors are thrown by the programmers
//this can be used to validate the programme for eg:- validating age of user

//try{ } block can be used without catch{ }, if finally is block used after try{}
package com.company;
import java.util.Scanner;


class MyException extends Exception{
 /*
    Returns a short description of this throwable. The result is the concatenation of:
    the name of the class of this object
": " (a colon and a space)
    the result of invoking this object's getLocalizedMessage method
 */
    @Override
    public String toString(){
        return "I am toString()";
    }

//    Returns the detail message string of this throwable.
    @Override
    public String getMessage(){
        return "I am get Message";
    }
}

public class errors {
    public static void main(String[] args) {
//       int [] marks = new int[3];
//       marks[0] = 34;
//       marks[1] = 44;
//       marks[2] = 54;
//       Scanner sc = new Scanner(System.in);
//       System.out.println("enter index value");
//       int num = sc.nextInt();
 /*
        //nested try catch
       try {
           System.out.println("welcome to errors");
           try{
               System.out.println(marks[num]);
           }
           catch (Exception e){
               System.out.println("this is level 2");
               System.out.println(e);
           }
       }
       catch (Exception e){
           System.out.println("this is level 1");
           System.out.println(e);
       }
*/
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<9){
            try{
                throw new ArithmeticException("this is exception");
            }catch (Exception e){
                System.out.println(e);
                MyException m2 = new MyException();
                System.out.println(m2.getMessage());
//                ******************IMP*******************
                e.printStackTrace(); //we get the line where error is there
            }
        }


    }
}
