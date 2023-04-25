package com.company;
import java.util.Scanner;
//4.Custom Exception
class MaxRetries extends Exception{
    @Override
    public String getMessage(){
        return "Maximum retries exceeded";
    }
}

public class practice_14 {
    public static void main(String[] args) {
//        boolean flag = true;
        int [] arr = {12,23,34,45};
        int i = 0;


        while (i<5){
            try{
                System.out.println("enter Index value");
                Scanner sc = new Scanner(System.in);
                int idx = sc.nextInt();
                System.out.println("value at index is :"+ arr[idx]);
                break;
            }
            catch (Exception e){
                System.out.println("invalid index");
                e.printStackTrace();
                i++;
            }
        }
        //5.
        if (i>=5)  {
            try {
                throw new MaxRetries();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        }


    }

