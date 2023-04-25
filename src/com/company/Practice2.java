package com.company;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        //Question1
        //float a = 7/4 * 9/2;
        //System.out.println(a);
        //this above equation gives wrong output since 7,4,9,2 are integers and they result
        //in integer value only i.e 4
        //but if you use:-
        //float b = 7/4f * 9/2f;
        //System.out.println(b);
        //this is giving me correct value i.e 7.8

 //        Question 2
 //        encrypting and decrypting the grade
 //        char grade = 'B';
 //        since int and char gives you int value therefore use char ...see in notes
        //This is typcasting
//         grade = (char)(grade-1);     //related to the ascii value
/*         if (grade!='A'){
            --grade;
        }
        System.out.println(grade);

 */

        //Question 3
        /*int b=50;  //given number
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in); //to take keyboeard input, this is object
        int a = sc.nextInt(); //for user
        if(a>b){
            System.out.println("number is greater");
        }
        else if(a==b){
            System.out.println("equal numbers");
        }
        else{
            System.out.println("number is small");
        }*/

        //Question 4
        /*
        float v=3;
        float u=2;
        float a=1;
        float s=6;
        float b= v*v-u*u ;
        float c = 2*a*s;
        float z = b/c;
        System.out.println(z);*/
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter v");
        float v= sc.nextFloat();
        System.out.println("Enter u");
        float u= sc.nextFloat();
        System.out.println("Enter a");
        float a= sc.nextFloat();
        System.out.println("Enter s");
        float s= sc.nextFloat();
        float z =(v*v -u*u);
        float w = 2f*a*s;
        System.out.println(z/w);
        */

        int x= 7;
        int a = (7*49/7) + (35/7);
        System.out.println(a);







    }
}
