//Here i was doing a mistake i.e i was putting the printing conditions in the loop itself and that is why it was printing for each iteration ...kep in mind
package com.company;
import java.util.Scanner;
import java.util.*;

public class practice6 {
    public static void main(String[] args) {
/*
        //Question 1
        float [] a = {12,13,14,15};
        System.out.println("length of array :"+a.length);
        float sum=0;
        for (int i =0; i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Sum of the array is ; "+sum);

 */

/*
        //Question 2
        //Number present in array or not
        int [] a = {12,13,14,15,16};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to search in array 'a'");
        int b = sc.nextInt();
        boolean isInArray = false;
        for (int element:a) {
            if (b == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("the number is present in array");
        }
        else {
            System.out.println("number is not present in the array");
        }

 */

/*
        //Question 3
        //Average of marks
        int [] marks = {45,56,67,78,89};
        int sum=0;
        for (int element : marks){
            sum+=element;
        }
        int c = sum/5;
        System.out.println("The average marks are : "+c);

 */

 /*
        //Question 4
        //Adding metrices
        int[][] mat1 = {{1,2,3},
                        {4,5,6}};
        int [][] mat2 = {{2,6,13},
                         {3,7,1}};
        int  [][] result = {{0,0,0},
                            {0,0,0}};
        for (int i =0; i<mat1.length;i++){
            for (int j=0; j<mat1[i].length; j++){     //mat1[i].length gives columns
                result[i][j]= mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
  */

/*
        //Question 5
        // reversing array
        //using swaping bt temp
        int [] arr = {1,2,3,4,5,6};
        int temp;
        int l=arr.length;
        int n = Math.floorDiv(l, 2);  //divide arr.length by 2 without giving decimal
        for (int i=0; i<n; i++){
            temp = arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1] =temp;
        }
        for (int element :arr){
            System.out.print(element+" ");
        }
 */

/*
        //Question 6
        //Finding max in the array
        int [] arr = {12,34,56,89,13,4,2};
        int max= 0;
        for (int element : arr){
            if (element>max){
                max=element;
            }
        }
        System.out.println("This is the max element in your array : "+max);

 */

/*
        //Question 7
        //Find the minimun in the array
        int [] arr = {12,56,2,67,98,34};
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("your minimun value is : "+min);

 */

/*
        //Question 8
        //Sorted array or not
        boolean is_Sorted=true;
        int [] arr = {12,56,2,67,98,34};
        for (int i=0; i<arr.length-1;i++){   //arr.length-1 because arr[i+1] will give error at element 34 since 5+1=6, but we do not have 6th element
            if (arr[i]>arr[i+1]){          //if 0th element is greater than its next element
                is_Sorted = false;
                break;
            }
        }
        if (is_Sorted){
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("array not sorted");
        }

 */

/*
        //Sorting in array

        int [] arr = {12,56,2,67,98,34};
        int temp;
        //Printing original array
        System.out.println("Original array ");
        for (int a = 0; a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }

        //sorting
        System.out.println("\nSorted array ");
        for (int i=0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
            System.out.print(arr[i]+" ");

        }

 */






    }
    }


