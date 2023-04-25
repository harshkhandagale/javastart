package com.company;

import java.util.Scanner;

public class Getting_started_TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        //1. positive or negative number

        System.out.println("enter no.");
        int a  = sc.nextInt();
        if (a==0){
            System.out.println("neither positive or negative");
        }
        if (a<0 && a!=0){
            System.out.println("negative ");
        }
        else if (a>0 && a!=0){
            System.out.println("positive");
        }
 */

/*
        //even or odd

        System.out.println("enter no.");
        int a  = sc.nextInt();
        if (a%2==0 && a>0){
            System.out.println("even");
        }
        else if (a%2!=0 && a>0){
            System.out.println("odd");
        }
        else {
            System.out.println("enter only positive integers");
        }
 */

/*
        //sum of n natural number:

        System.out.println("enter no.");
        int a  = sc.nextInt();
        int sum =0;
        for (int i =0;i<=a;i++) {
            sum += i;
        }
        System.out.println(sum);
 */

/*
        //sum of numbers given in range

        System.out.println("enter no.");
        int start  = sc.nextInt();
        System.out.println("enter no.");
        int end  = sc.nextInt();
        int sum =0;
        for (int i =start;i<=end;i++) {
            sum += i;
        }
        System.out.println(sum);
 */

/*
        //greatest of 2 numbers

        int a =10;
        int b =11;
        int ans = a>b ? a:b;        //using conditional operator
        System.out.println(ans);
 */

/*
        //greatest of 3 numbers
        int a =10;
        int b =11;
        int c =12;
        int ans = a>b ? a:b;        //using conditional operator, here ans will store 11, qspiders notes
        int result = ans>c ? ans:c;
        System.out.println(result);
 */

/*
        //leap year or not

        int year = sc.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0){ //***************  IMP
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
       }
 */

/*
        // number
        //in 1 ka table and in thier own table, eg:2,3,7,11,13......
        System.out.println("enter no.");
        int a  = sc.nextInt();
        int count =0;
        for (int i =1;i<=a;i++){
            if (a%i==0){
                count++;
            }
        }
        if (count>2){
            System.out.println("not a prime number");
        }
        else if (a==1){
            System.out.println("Not a prime");
        }
        else {
            System.out.println("prime");
        }
 */

/*
        //prime numbers with given range
        System.out.println("enter no.");
        int start  = sc.nextInt();
        System.out.println("enter no.");
        int end= sc.nextInt();
        int temp =0;
        for (int i =start; i<=end;i++){
            for (int j =2;j<=i;j++){    //j<=i  eg: 7, it will go up to 7 and at 7 it will do temp++ .. we are starting from j=2; therefore for prime numbers the temp will be 1
                if (i%j==0){
                    temp++;
                }
            }
            if (temp == 1){
                System.out.println(i);      //printing prime numbers
            }
            else{
                temp=0;                 //we should update temp again
            }
        }
 */

/*
        //Reverse a number
        int num = 1234;
        int reverse =0;
        while (num>0){
            int rem = num%10;           // %10 will give last number as the remainder
            reverse=(reverse*10)+rem;
            num/=10;                    // /10 will give 123 as the num, num updated
        }
        System.out.println(reverse);
 */

/*
        //Sum of digits of a number
        //first we have to traverse the number from back ...just as above
        int num = 9876789;
        int sum =0;
        while (num>0){
            int remainder = num%10;
            sum += remainder;
            num/=10;            //update num leaving the last digit
        }
        System.out.println(sum);

 */

/*
        //Palindrome number
        //first reverse the number as done above and then check with the og number
        System.out.println("enter a numner");
        int num =sc.nextInt();
        int temp = num;       //num will get updated in the code so storing og num in temp;
        int reverse = 0;
        while (num>0){
            int rem = num%10;
            reverse = (reverse*10)+rem;
            num/=10;
        }
        if (temp==reverse){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrom");
        }
 */

/*
        //Amstrong number
        //Sum of cube of single digits  if 3 number ,,adding up the number, is the same as the number itself.
        //ie 153 = 1 + 125 + 27 = 153
        //if 4 numbers then -> eg: 1234 -> 1*1*1*1 + 2*2*2*2 + 3*3*3*3 + 4*4*4*4

        System.out.println("enter a number");
        int num = sc.nextInt();
        int length = 0;
        int t1=num;
        //first fing lenght of  the number
        while (t1>0){
            t1/=10;
            length++;
        }
        System.out.println("Length of number is : "+length);
        System.out.println("original num is : "+num);
        System.out.println("t1 becomes : "+t1);         //0
        //for multipling
        int t2=num;

        int armstrong =0;
        while (t2>0){
            int mult=1;
            int rem = t2%10;
            for (int i =1;i<=length;i++){
                mult*=rem;                  //multipling lenght times
            }
            armstrong+=mult;                //adding multiplied number to armstrong
            t2/=10;
        }
        System.out.println("t2 becomes : " + t2);       //0
        if (armstrong==num){
            System.out.println(num+" : is armstrong");
        }
        else {
            System.out.println(num+" : is not a armstrong");
        }
 */
/*
        //Amstrong number in given range
        // 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        int start = 1;

        int end = 1000;
        int sum =0;
        for (int i=start; i<=end;i++){
            int temp=i;
            while (temp>0){
                int rem = temp%10;
                sum= sum+(rem*rem*rem);
                temp/=10;
            }
            if (sum==i){
                System.out.println(i+" ");
            }
            sum=0;
        }
 */


/*
        //Fibonacci series.....0,1,1,2,3,5,8
        //declare 0 and 1;
        int a = 0;
        int b =1;

        System.out.println("enter number till you want the fibonnacci series");
        int num = sc.nextInt();
        System.out.print(a+""+" "+b+" ");       //printing 0 and 1 first
        for (int i =2; i<num;i++){
            int c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
 */

/*
        //factorial
        System.out.println("enter a number ");
        int a =sc.nextInt();
        int fact =1;
        for (int i =1;i<=a;i++){
            fact*=i;
        }
        System.out.println("factorial of "+a+" is "+fact);
 */
/*
        //Factorial of digits and sum
        int num = 1234;
        int sum =0;
        while (num>0){
            int rem = num%10;
            int mult = 1;
            for (int i =1;i<=rem;i++){
                mult*=i;
            }
            sum+=mult;
            num/=10;
        }
        System.out.println(sum);
 */

/*
        //finding power of the number

        System.out.println("enter num");
        int num = sc.nextInt();
        System.out.println("enter power");
        int pow = sc.nextInt();
        int mult=1;
        for (int i =1;i<=pow;i++){
            mult*=num;
        }
        System.out.println(num +" to the power "+ pow +" is " +mult);
 */

/*
        //Factors of number
        // kis kis ke table me vo number aata hai
        System.out.println("enter a number : ");
        int a = sc.nextInt();
        for (int i=2; i<a;i++){
            if (a%i==0){
                System.out.print(i+" ");
            }

        }
        System.out.print("--> are the factors of "+a);
 */

/*
        //Strong number or not
        // original num --> 145
        // sum = 1! + 4! + 5!  --> 1 + 24 + 120 = 145
        // 1-1000   only 1,2 and 145 are strong numbers

        System.out.println("enter number");
        int num = sc.nextInt();
        int temp =num;
        int sum =0;
        while (temp>0){
            int rem = temp%10;
            int fact=1;
            for (int i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            temp/=10;

        }
        if (num==sum){
            System.out.println("strong number");
        }
        else {
            System.out.println("not a strong number");
        }
 */

/*
        //Perfect number or not
        // sum of divisors excluding itself should be the number
        // eg: 6 --> 1,2,3 are its divisor, it comes in 1,2 and 3 tables, now 1+2+3 =6 therefore its a perfect number
        //eg: 8 --> 1,2,4   --> 1+2+4 = 7 , therefore 8 is not a perfect number

        System.out.println("enter a number");
        int num = sc.nextInt();
        int sum =0;
        for (int i =1;i<num;i++){
            if (num%i==0){
                sum+=i;
            }
        }
        if (num==sum){
            System.out.println("Its a perfect number");
        }
        else {
            System.out.println("not a perfect number");
        }
 */


        //Automorphic numbers
        //eg: 5 square is 25  --> 5 and 5 same
        //eg2: 6 sqare is 36  -->6 same in 6 and 36
        //eg3: 76 square 5776  --> 76 same in both

//        int num = 127;
//        int temp = num;
//        int flag=1;
//        int square = num * num;
//        while (num > 0) {
//            if (num % 10 == square % 10) {
//                num /= 10;
//                square /= 10;
//            }
//            else {
//                System.out.println("not ");
//            }
//
//        }
//        flag=1;
//        if (flag==1){
//            System.out.println("yyy");
//        }


/*
        //Swapping numbers without using third variable
        int a = 3;
        int b = 4;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
 */

        /*
        //Count digits of a number
        int num = 1234;
        int count = 0;
        while (num>0){
            int rem = num %10;
            count++;
            num/=10;
        }
        System.out.println(count);
 */
/*
        //Check if number contains Zero
        int num = 1234;
        int i;
        for (i = num; i>0;i/=10){
            int rem = i%10;
            if (rem==0) {
                System.out.println("contains zero");
                break;
            }
        }
        if (i==0){
            System.out.println("no does not contain zero");
        }
*/
/*
        //Repeated Digits
        int num = 1533472;
        System.out.println("enter the digit you want to find");
        int digit = sc.nextInt();
        int count =0;
        for (int i=num;i>0;i/=10){
            int rem = i%10;
            if (digit==rem){
                count++;
            }
        }
        if (count>1){
            System.out.println("repeated "+count+" times");
        }
        else {
            System.out.println("not repeated");
        }
 */

/*
        //Lowercase to Uppercase.... diffrence between 97(Lowercase starts from) and 65(uppercase starts from) is 32
        String lower = "absdvj";
        //converting to char array
        char [] charArr = lower.toCharArray();
        for (int i =0;i< charArr.length;i++){
            if (charArr[i]>='a' && charArr[i]<='z'){
                charArr[i] = (char)((int)charArr[i]-32); //every lowecase char-32 gives Uppercase char
            }
        }
        System.out.println("Uppercase");
        for (int i = 0;i<charArr.length;i++){
            System.out.print(charArr[i]);
        }
 */
/*
        //Uppercase to Lowercase
        String upper = "HARSH";
        char [] charUpp = upper.toCharArray();
        for (int i =0;i< charUpp.length;i++){
            if (charUpp[i]>='A' && charUpp[i]<='Z'){
                charUpp[i] = (char)((int)charUpp[i]+32);
            }
        }
        System.out.println("LowerCase");
        for (int i = 0;i<charUpp.length;i++){
            System.out.print(charUpp[i]);
        }
 */

/*
        //Swapping numbers without third variable
        // using addition and subtraction
        int x = 20;
        int y = 30;
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("int x : "+x);
        System.out.println("int y : "+y);
 */
/*
        //Swapping numbers without third variable
        // using multiplication and division
        int x = 20;
        int y = 30;
        x = x*y;
        y = x/y;
        x = x/y;
        System.out.println("int x : "+x);
        System.out.println("int y : "+y);
 */
/*
        //Checking odd or even without modulus
        int num = 5;
        int quotient = num/2;
        if (quotient*2==num){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
 */

/*
        //Abundant number
        // eg: int num= 18;
        // factors of 18 are 1,2,3,6,9 excluding itself
        //addition of factors 1+2+3+6+9 = 21
        // 21 > 18 therefore abundant
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                sum+=i;
            }
        }
        System.out.println("Sum of factors is : "+sum);
        System.out.print("Therefore : ");
        if (sum>temp){
            System.out.println("Abundant number");
        }
        else {
            System.out.println("not abundant");
        }
 */
/*
        //Friendly Pair
        //eg: 6 and 28  - > factors are 1,2,3  and 1,2,4,7,14  excluding the number itself
        // adding them we get 6 and 28 again i.t thier ratio is 1:1
        System.out.println("Emter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Emter num2 : ");
        int num2 = sc.nextInt();
        int sum1=0;
        int sum2=0;
        for (int i =1;i<num1;i++){
            if (num1%i==0){
                sum1+=i;
            }
        }
        System.out.println("Sum of factors of "+num1+" are : "+sum1);
        for (int i =1;i<num2;i++){
            if (num2%i==0){
                sum2+=i;
            }
        }
        System.out.println("Sum of factors of "+num2+" are : "+sum2);
        System.out.print("therefore : ");
        if (sum1==num1 && sum2==num2){
            System.out.println("friendly Pair ");
        }
        else {
            System.out.println("not friendly pair");
        }
 */









    }
}