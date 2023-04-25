package com.company;
//*********************************  getter setter  ****************************

/*
//1.
class Employeep{
    String name;
    int salary;

    public int getSalaryp(){
        return salary;
    }
    public void setSalaryp(int salary){
        this.salary=salary;
    }
    public String getNamep(){
        return name;
    }
    public void setNamep(String name){
        this.name=name;
    }
}
*/
/*
//2.
class Cellphonep{
    public void print(){
        System.out.println("printing");
    }
    public void ring(){
        System.out.println("ringing");
    }
}
 */
/*
//3.
class Squarep{
    public int areap(int side){
        return side*side;
    }
    public int perimeterp(int side){
        return 4*side;
    }
}
 */
/*
//4.
class Cylinderp{
    private Cylinderp cylinderp;
    public int f, t,g;
    //constructor
    Cylinderp(int r, int h){
        this.r =r;
        this.h = h;
    }
    //Overloading a constructor
    Cylinderp(int f, int t, int g){
        this.f=f;
        this.t=t;
        this.g=g;
    }
    public int r;
    public  int h;
    public void setHeight(int h){
        this.h = h;
    }
    public void setRadius(int r){
        this.r=r;
    }
    public int getR(){
        return r;
    }
    public int getH(){
        return h;
    }
    public double volume(int r, int h){
        return Math.PI*r*r*h;
    }
    public double surface(int r, int h){
        return 2*Math.PI*r*h;
    }
}

 */

/*
class Rectanglep{
    public int area(int l, int b){
        return l*b;
    }
    public int perimetre(int l, int b){
        return 2*(l+b);
    }
}
 */

//      *************************  Inheritance  ********************************
/*
class Circlep{
    //constructor
    Circlep(int r){
        double area =Math.PI*r*r;
        System.out.println(area);
    }
    int r;
//    Circlep(int r){
//        this.r=r;
//    }
    public double area(){
        return Math.PI*r*r;
    }
    public double getArea(){
        return area();
    }
    // If I do not create a defualt construtor , it will an error in child class
    Circlep(){

    }

}
class Cylinderp1 extends Circlep{

    Cylinderp1(int radius, int height) {
        double volume = Math.PI*radius*radius*height;
        System.out.println(volume);
    }
}

 */

//***********************  Abtraction  ***********************************
//It can have final methods which will force the subclass not to change the body of the method.

abstract class Penp {
    abstract void write();
    abstract void refill();
}
class Fountain extends Penp{
    @Override
    void write() {
        System.out.println("writing");
    }

    @Override
    void refill() {
        System.out.println("refilling");
    }
}

//2.
interface BasicAnimalp{
    void eat();
    void sleep();
}
class Monkeyp{
    public void jump(){

    }
    public void bite(){

    }
}
class Humanp extends Monkeyp implements BasicAnimalp{

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping as usual");
    }
}



public class weekend2 {
    //        *******************************  RECURSION  ******************************************
/*
    //1.print 5-1
    public static void prin_num(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        prin_num(n-1);
    }
 */
/*
    //2.print 1-5
    public static void print1_num(int n){
        if (n==6){
            return;
        }
        System.out.println(n);
        print1_num(n+1);
    }
 */
/*
    //3.Sum of n natural numbers
    public static void print_sum(int i ,int n ,int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        print_sum(i+1, n,sum);
        //after printing sum it is returning step by step downwards and printing i value
        System.out.println(i);
    }
 */
/*
    //4.Factorial of n
    public static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }
        int fact_nm1 = fact(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }
 */
/*
    //5.Fibonacci series
    public static int fib(int n){
        if (n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
 */
/*
    //6.print x raise to power n
    public static int calPow(int x , int n){
        if (n==0){
            return 1;
        }
        else if (x==0){
            return 0;
        }
        //xPownm1  --> x to the power n-1
        int xPownm1 = calPow(x,n-1);

        //xPown  --> x to the power n
        int xPown =x * xPownm1;
        return xPown;
    }
 */



    public static void main(String[] args) {
        //*****************************  ARRAYS PracticeSetS->6  ********************************
/*
        //1.
        //sum of no.s in array
        float [] arr = {12,34,5,56,56};
        float sum =0;
        for (int i =0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of arr is :"+sum);
 */
/*
        //2.
        //no. present or not in the array
        int [] arr = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to search in array");
        int a = sc.nextInt();
        boolean IsInArray = false;
        for (int element : arr) {
            if (element == a){
                IsInArray = true;
                break;
            }
        }
        if (IsInArray){
                System.out.println("number is present");
            }
        else {
             System.out.println("not present");
         }
 */
/*
        //3.
        //average marks
        int [] arr = {45,67,78,98,90};
        int sum =0;
        for (int element:arr) {
           sum+=element;
        }
        int c = sum/arr.length;
        System.out.println(c);
 */
/*
        //4.
        //Adding metrices
        int  [][] arr1 = {{1,2,3},{4,5,6}};
        int  [][] arr2 = {{1,2,3},{4,5,6}};
        int  [][] result = {{0,0,0},{0,0,0}};
        for (int i =0 ; i< arr1.length;i++){
            for (int j=0; j<arr1[i].length;j++){
                result[i][j] = arr1[i][j]+ arr2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
 */
/*
        //5.
        // reversing array
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp = 0;
        for (int i =0; i<n; i++){
            temp= arr[i] ;
            arr[i]=arr[l-i-1] ;
            arr[l-i-1]=temp;
        }
        for (int e: arr) {
            System.out.println(e);
        }
 */
/*
        //6.
        //Max in array
        int [] arr = {1,2,43,6,7};
        int max=0;
        for (int element : arr){
            if (element>max){
                max = element;
            }
        }
        System.out.println("Max is "+ max);
 */
/*
        //7.
        //Min in array
        int [] arr = {5,1,3,8,9,4};
        int min = arr[0];
        for (int i = 0; i< arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min in array is : "+min);
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
        //9.
        //Sorting array
        int [] arr={5,2,1,3,9,7,8};
        //print OG array
        System.out.print("OG array : ");
        for (int a= 0; a<arr.length;a++){
            System.out.print(arr[a]);
        }
        System.out.println("\n");

            for (int i =0;i<arr.length;i++){
                for (int j=i+1;j< arr.length;j++){
                    if (arr[i]>arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted array : ");
        for (int e:arr) {
            System.out.print(e);
        }
 */



        // ****************************  STAR PRINTING  *****************************************
//Remember int i =1 , int j =1
/*
        //1.Hollow rectangle
        int n = 4;
        for (int i =1; i<=n;i++){
            for (int j=1; j<=5;j++){
                if (i==1 || i==4 || j==1 || j==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
 */
/*
        //2. solid rectangle
        int n =4;
        int m =5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
/*
        //3.Half Pyramid
        for (int i =1; i<=4;i++){
            for (int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
/*
        //4.Inverse pyramid
        for (int i =4; i>=1;i--){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
/*
        //5.Inverse half pyramid
        int n=4;
        for (int i=1;i<=n;i++){
            //spaces loop
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
/*
        //6.Half pyramid number pattern
        int n =5;
        int m =5;
        for (int i =1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
 */
 /*
        //7.Inverted half pyramid with no.s
        int n=5;
        int m=5;
        for (int i=n ;i>=1; i--){
            for (int j=1 ; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
  */
/*
        //8.Floyds triangle
        int n =5;
        int number =1;
        for (int i=1 ; i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(number);
                number++;
            }
            System.out.println();

        }
 */
/*
        //9. 0-1 Traingle
        int n=5;
        int m=5;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                int sum =i+j;
                if (sum%2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
 */

//        *******************************  RECURSION  ******************************************

//          Recursion methods are created in class ^ upside
/*
        //1.print 5-1
        prin_num(5);
 */
/*
        //2.print 1-5
        print1_num(1);
 */
/*
        //3.Sum of n natural numbers
        print_sum(1,5,0);
 */
/*
        //4.Factorial of n
        int a =fact(5);
        System.out.println(a);
 */
/*
        //Fibonacci series
        for (int i=0;i<10;i++){
            System.out.println(fib(i));
        }
 */
 /*
        //x^n
        calPow(2,5)

  */



//*********************************  getter setter  ****************************

/*
        //1.
        Employeep h1 = new Employeep();
        h1.setNamep("harsh");
        h1.setSalaryp(12345);
        System.out.println(h1.getNamep());
        System.out.println(h1.getSalaryp());
 */
/*
        //2.
        Cellphonep c1 = new Cellphonep();
        c1.print();
 */
/*
        //3.
        Squarep s1 = new Squarep();
        System.out.println(s1.areap(2));
        System.out.println(s1.perimeterp(2));
 */
/*
        //4.
        Rectanglep r1 = new Rectanglep();
        System.out.println(r1.area(2,2));
        System.out.println(r1.perimetre(2,2));
 */
/*
        //5.
//        Cylinderp c1 = new Cylinderp();
        //if constructor is made , but above object doesnot work
        Cylinderp c1 = new Cylinderp(2,4);

        //constructor overloading
//        Cylinderp c2 = new Cylinderp(1,2,3);
//        c1.setHeight(2);
//        c1.setRadius(2);
        System.out.println(c1.getH());
        System.out.println(c1.getR());
        System.out.println(c1.surface(2,2));
        System.out.println(c1.volume(2,2));

 */

//        *********************  Inheritance  ********************************

/*
        //1.
        Circlep c1 = new Circlep(4);
//        c1.area();
//        System.out.println(c1.getArea());
        Cylinderp1 cy1 = new Cylinderp1(5,6);
 */

        Humanp h1 =  new Humanp();
        h1.eat();

    }
}
