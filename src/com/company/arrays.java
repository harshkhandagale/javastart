//Arrays are collection of similar types of  data
//Acccessing is fast in arrays
//Array indexing starts from 0
//Array can be of string,int,float any data type
package com.company;

public class arrays {
    public static void main(String[] args) {
 /*
        int [] marks =new int [5];  //int [] marks is the refrence or array created and new int[] is the object of 5 elements
        marks[0]=50;
        marks[1]=60;
        marks[2]=70;
        marks[3]=80;
        marks[4]=90;
        System.out.println(marks[4]);

  */

/*
        //There are 3 ways to create array
        //1 way
        int [] marks =new int[5];

        //2 way   when you wnst to set the limit of array
        int[]marks;
        marks = new int[5];

        //3 way  //this element is more efficient
        int []marks={20,23,57,56}

 */



 /*
        String [] name ={"harsh","shantanu", "kunal"};
        System.out.println(name.length);

 */
        //For loop in array
        int [] marks = {50,60,70,80,90};
//        System.out.println(marks.length);
//        System.out.println(marks[4]);
//        System.out.println(marks); //does not work, you cannot display all array like this you have to use for each loop

        //there fore using for loop for printing all the values in the array
//        System.out.println("your array using for loop");
//        for (int i=0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }

        //reverse order printing
//        for (int i=marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }

        //for each loop
        //does the same work of printing bur more simple and efficient
        for (int element : marks){
            System.out.println(element);
        }




    }
}
