package com.company;

import java.util.Scanner;

public class weekend_1 {
    public static void main(String[] args) {

        //Star printing
/*
        //1. solid rectangle
        for (int i=1; i<=4;i++){
            for (int j=1;j<=5;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

 */
/*
        //2.hollow rectangle
        int n=4;
        int m =5;
        for (int i=1;i<=4;i++){
            for (int j=1;j<=5;j++){
                if (i==1||i==4||j==1||j==5){
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

 */

/*        //3.Half pyramid
        int n=4;
        for (int i= 1; i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
 */
/*
        //4.Inverse pyramid
        int n=4;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
 */
/*
        //Inverse half pyramid
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

 */
/*
        //6.Half pyramid numbers
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

 */
/*
        //7.inverted hallf pyramid with numbers
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
 */
/*
        //8.Floyds triangle
        //same like half pyramid , only here you have to insert int number
        int n=4;
        int number=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
 */
/*
        //9.1-0 triangle
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if (sum%2==0){
                    System.out.print("1"+" ");
                }
                else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
 */





        //practice 5
/*
        //1:
        int i=1;
        int n=10;
        int sum=0;
        while(i<=n){
            if (i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
 */
/*
        //2. table
        int n = 5;
        int i=1;
        int mult=1;
        while(i<=10){
            mult= i*n;
            System.out.format("%d * %d = %d",n,i,mult);
            System.out.println();
            i++;
        }
 */
/*
        //3.factorial
        int i =1;
        int n=5;
        int fact=1;
        while(i<=n){
            fact*=i;
            i++;
        }
        System.out.println(fact);
 */
/*
        //Repeat 5 infinite loop
        int i=1;
        int n=2;
        while(i<n){
            System.out.println("5");
        }
 */
/*
        //sum of table
        int n=10;
        int mult=1;
        int sum=0;
        for (int i=1;i<=n;i++){
            mult =i*8;
            sum+=mult;
            System.out.println(mult);
        }
        System.out.println(sum);
 */
/*
        //practice_Set_4
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter yur m1 marks");
        int a = sc.nextInt();
        System.out.println("Enter yur m2 marks");
        int b = sc.nextInt();
        System.out.println("Enter yur m3 marks");
        int c = sc.nextInt();
        int avg=40;
        if (avg>=40 && a>33 && b>33 && c>33){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
 */
/*
        //day of week
        System.out.println("Enter the day number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesdat");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday|");
                break;
            default:
                System.out.println("week only has 7 days");
        }
 */
/*
        //Leap year
        System.out.println("Enter a year");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%4==0){
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a Leap year");
        }

 */
/*
        System.out.println("enter a wesite ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (a.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if (a.endsWith(".org")){
            System.out.println("commercial");
        }
        else if (a.endsWith(".in")){
            System.out.println("indain website");
        }
        else {
            System.out.println("unrecognized website");
        }
 */

        //Strings

        //1
 /*
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st.toLowerCase());
        System.out.println(st.replace(" ","_"));

  */
/*
        //2.
        System.out.println("Enter your name ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String lt = "Dear <name> thank you ";
        System.out.println(lt.replace("<name>",st));
 */

        //3.
/*
        char grade = 'B';
        if (grade!='A' ){
            --grade;
        }
        System.out.println(grade);
 */


        //ARRAYS

/*      //1
        //Sum of array
        float [] arr = {1.5f,5.6f,7.8f,8.9f};
        float sum =0;
        for (int i =0; i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

 */
 /*
        //number presenr or not
        System.out.println("Enter a numbr to check");
        boolean isInArray=false;
        int [] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int a = sc. nextInt();
        for (int i =0; i<arr.length;i++){
            if (a==arr[i]){
                isInArray=true;
                break;
            }
        }
        if (isInArray==true){
            System.out.println("present");
        }
        else {
            System.out.println("not in array");
        }
  */
/*
        //Average
        int [] marks ={12,56,89};
        int avg=0;
        int sum=0;
        for (int i =0; i<marks.length;i++){
            sum+=marks[i];
            avg=sum/3;
        }
        System.out.println(avg);

 */
/*
        int [][] mat1={{1,2,3},{4,5,6}};
        int [][] mat2={{6,7,8},{1,2,3}};
        int [][] result = {{0,0,0},{0,0,0}};
        for (int i=0; i<mat1.length;i++){
            for (int j=0; j<mat1[i].length;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
 */
/*
        //reversing the array
        int [] arr= {1,2,3,4,5,6};
        int temp;
        int l= arr.length;
        int n= Math.floorDiv(l,2);  //gives value without decimal point i.e l/2
        for (int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

 */
/*
        //Maximum in array
        int []arr = {1,2,3,4,5,7};
        int max=0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

 */
/*
        //Minimum in array
        int [] arr ={1,2,3,4,5,6};
        int min= arr[0];
        for (int i =0;i<arr.length;i++){
            if (arr[i]<min){
                   min=arr[i];
            }
        }
        System.out.println(min);
 */
/*
        //sorting in array
        int temp=0;
        int [] arr ={9,8,7,6,5,4};
        for (int i =0; i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]);
        }

 */

    }
}
