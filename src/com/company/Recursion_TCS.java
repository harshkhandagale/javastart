package com.company;

//*********************  See notes pdf for dry runs  ***************************

import java.util.Scanner;

public class Recursion_TCS {
/*
    //Power of a Number
    public static int power(int base , int pow){
        if (pow==0){
            return 1;
        }
        int pow_nm1 = power(base,pow-1);    //this will go till pow==0
        int ans = base*pow_nm1;
        return ans;
    }
 */
/*
    //Prime or not
    public static int i=2;
    public static boolean isPrime(int n){

        if (i==n/2+1){
            return true;
        }
        if (n%i==0){
            return false;
        }
        else {
            i++;
            return isPrime(n);
        }
    }
 */
/*
    //Largest element in the Array
    public static int maxEle(int arr[],int idx ){
        if (idx==arr.length-1){
            return arr[idx];
        }else {
            return  Math.max(arr[idx], maxEle(arr,idx+1));
        }
    }
 */
/*
    //Smallest element in the Array
    public static int minEle(int arr[],int idx ){
        if (idx==arr.length-1){
            return arr[idx];
        }else {
            return  Math.min(arr[idx], minEle(arr,idx+1));
        }
    }
 */
/*
    //Reverse a Number
    public static void rev(int num){
        if (num<10){
            System.out.print(num);
        }
        else {
            System.out.print(num%10);
            rev(num/10);
        }
    }
*/
/*
    //HCF
    public static int hcf(int num1, int num2){
        if (num1==0){
            return num2;
        }
        else {
            return hcf(num2%num1,num1);
        }
    }
*/
/*
    //LCM ...by euclidiens formula
    //here we will first fing the hcf
    //and then multiply num1 and num2 and then divide by the hcf
    public static int hcf(int num1 , int num2){
        if (num1==0){
            return num2;
        }
        else {
            return hcf(num2%num1,num1);
        }
    }
    public static int lcm(int num1,int num2){
        return (num1/hcf(num1,num2)*num2);
    }
 */
/*
    //Length of String
    public static int strLenght(String str){
        if (str.equals("")){
            return 0;
        }
        else {
            return 1 + strLenght(str.substring(1));
        }
    }
 */
/*
    //Palindrome String or not //time comlexity is O(n) because we are traversing each character only once
    public static boolean isPalin(String str, int l, int r){

        if (l>=r){
            return true;
        }
        else if (str.charAt(l)!=str.charAt(r)){
            return false;
        }
        else {
            return isPalin(str,l+1,r-1);
        }
    }
    public static boolean isPalindrome(String str){
        int n = str.length();
        if (n==0){
            return true;
        }
        else {
            return isPalin(str,0,n-1);        }
    }
 */
/*
    //Powerset of String, i.e Substring
    //Time complexity - 0(2 raise to n)
    static void powerSet(String str, int index, String curr)

    {
        int n = str.length();

        // base case
        if (index == n) {
            System.out.println(curr);
            return;
        }

        // Two cases for every character
        // (i) We consider the character
        // as part of current subset
        // (ii) We do not consider current
        // character as part of current
        // subset
        powerSet(str, index + 1, curr + str.charAt(index));
        powerSet(str, index + 1, curr);
    }
 */

    //Permutations of String.. BackTracking...Time complexity - 0(n*n!)
        //Function for swapping the characters at position I with character at position j
        public static String swapString(String str, int i, int j) {
            char[] b =str.toCharArray();
            char ch;
            ch = b[i];
            b[i] = b[j];
            b[j] = ch;
            return String.valueOf(b);
        }
        //Function for generating different permutations of the string
        public static void generatePermutation(String str, int l, int r)
        {
            //Prints the permutations
            if (l == r)
                System.out.println(str);
            else
            {
                for (int i = l; i <=r; i++)
                {
                    //Swapping the string by fixing a character
                    str = swapString(str,l,i);
                    //Recursively calling function generatePermutation() for rest of the characters
                    generatePermutation(str,l+1,r);
                    //Backtracking and swapping the characters again.
                    str = swapString(str,l,i);
                }
            }
        }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Power
//        System.out.println(power(3,4));
/*
        //Prime or not
        System.out.println("Enter a number");
        int a =sc.nextInt();
        if (isPrime(a)){
            System.out.println(a+" is Prime");
        }
        else {
            System.out.println(a+" is not Prime");
        }
 */
/*
        //Largest element in array
        int arr[] = {21,4,1,6,54,2};
        int max = maxEle(arr,0);
        System.out.println(max);
 */
/*
        //Smallest Element in array
        int arr[] = {21,4,1,6,54,2};
        int max = minEle(arr,0);
        System.out.println(max);
 */
/*
        //Reversing a number
        rev(123);
*/
        //HCF
//        System.out.println(hcf(8,12));

        //LCM
//        System.out.println(lcm(7,6));

        //Length of String
//        System.out.println(strLenght("Harsh"));
/*
        //Palindrome
        String str="abcbvfga";
        if (isPalindrome(str)){
            System.out.println("Plaindrome");
        }
        else {
            System.out.println("Not Palindrom");
        }
 */
/*
        //Powerset, subsets of String
        String str = "abc";
        int index = 0;
        String curr = "";
        powerSet(str, index, curr);
 */

        String str = "ABC";
        int len = str.length()-1;
        System.out.println("All the permutations of the string are: ");
        generatePermutation(str, 0, len);






    }
}





