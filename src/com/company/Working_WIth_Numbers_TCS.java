package com.company;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Working_WIth_Numbers_TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        //HCF - Highest common factor
        //Here we need min number in both numbers
        System.out.println("enter number1");
        int num1= sc.nextInt();
        System.out.println("enter number2");
        int num2= sc.nextInt();
        int min = num1<num2 ? num1:num2;
        int hcf= 0;
        for (int i = 1;i<=min;i++){
            if (num1%i==0 && num2%i==0){
                hcf = i;
            }
        }
        System.out.println("The highest common factor of "+num1+" and "+num2+" is "+hcf);
 */
/*
        //LCM - Lowest common multiple
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();
        int max = num1>num2 ? num1:num2;
        int lcm ,i;
        for (i = max; i<=num1*num2;i+=max){     //to optimize the code
            if (i%num1==0 && i%num2==0){
                break;
            }
        }
        lcm=i;
        System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
 */
/*
        //Binary to decimal conversion ...see yutube for revision
        //Decimal number has base 10
        //Binary number has base 2
        // i.e 2 raise to 0,1,2,3,4........

        int num = 10011;
        int temp =num;
        int sum=0;
        int i =0;
        while (num>0){
            int rem = num%10;
            sum=sum+rem*(int)Math.pow(2,i++);
            num/=10;
        }
        System.out.println("decimal value of "+temp+" is "+sum);
 */
/*
        //Octal to decimal
        // mult by 8 raise to 0,1,2,3...

        int num = 1234;
        int temp = num;
        int sum =0;
        int i =0;
        while (num>0){
            int rem = num%10;
            sum = sum +rem*(int)Math.pow(8,i++);        //return double value thats why i gave int typecasting
            num/=10;
        }
        System.out.println("Octal value of "+temp+" is "+sum);
 */
/*
        //Hexadecimal to decimal
        // hexadecimal has 16 values - > 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
        // decimal has 0,1,2,3,4,5,6,7,8,9 and extending 10,11,12,13,14,15 for A,B,C,D,E,F respectively

        String hexa = "1AC" ;
        char [] charArr = hexa.toCharArray();
        int sum =0;
        int j=0;
        for (int i =charArr.length-1;i>=0 ;i--){
            if (charArr[i]>='A' && charArr[i]<='F'){
                sum= sum + ((int)charArr[i]-55)*(int)Math.pow(16,j++);
            }
            else if (charArr[i]>='0' && charArr[i]<='9'){
                sum = sum + (charArr[i]-48)*(int)Math.pow(16,j++);
            }
        }
        System.out.println(sum);
 */
/*
        //Decimal to binary
        int  num = 10;
        int rem=0;
        String b ="";
        for (int i = num; i>0;i/=2){
            rem=i%2;
            b= rem+b;                                   b+rem will print in right order but we want in reverse order
        }
        System.out.println(b);
 */

/*
        //Decimal to octal
        int num =668;
        int rem = 0;
        String b="";
        for (int i = num; i>0;i/=8){
            rem=i%8;
            b= rem+b;
        }
        System.out.println(b);
 */
/*
        //Decimal to Hexadecimal
        int num = 428;
        int rem =0;
        char [] charArr = new char[100];
        int j =0;
        while (num>0){
            rem = num % 16;
            if (rem<10){
                charArr[j++] = (char)(48+rem);  //because if we get 1 , then 1+48=49 i.e ASCII value for 1
            }
            else {
                charArr[j++]= (char)(55+rem);   //because if we 10 , then 10+55=65 i.e ASCII value for A
            }
            num/=16;
        }
        //because we post-increamented the value of j is j-1, printing in reverse order
        for (int i=j-1;i>=0;i--){
            System.out.print(charArr[i]+" ");
        }
 */
/*
        //Binary to Octal
        // 1st - Binary -> Decimal then Decimal ->Octal
        int num = 10011;
        System.out.println("Original Number - "+num);
        int sum = 0;
        int i =0;
        while (num>0){
            int rem = num%10;
            sum = sum + rem*(int)Math.pow(2,i++);
            num/=10;
        }
        System.out.println("Binary to Decimal - "+sum);
        String b ="";
        int decimal = sum;
        while (decimal>0){
            int rem = decimal%8;
            b=rem+b;
            decimal/=8;
        }
        System.out.println("Decimal to Octal - "+b);
 */
/*
        //Octal to Binary
        // Octal-> Decimal-> Binary
        int num = 1234;
        int sum =0;
        int i =0;
        while (num>0){
            int rem =num%10;
            sum = sum +rem*(int)Math.pow(8,i++);
            num/=10;
        }
        System.out.println("Octal to Decimal - "+sum);
        int decimal = sum;
        String b="";
        while (decimal>0){
            int rem = decimal%2;
            b= rem+b;
            decimal/=2;
        }
        System.out.println("Decimal to Binary - "+b);
 */
/*
        //Which quadrant x and y lies
        System.out.println("enter x value");
        int x = sc.nextInt();
        System.out.println("enter x value");
        int y = sc.nextInt();
        if (x>0&&y>0){
            System.out.println("First Quadrant");
        }
        if (x<0&&y>0){
            System.out.println("Second Quadrant");
        }
        if (x>0&&y>0){
            System.out.println("First Quadrant");
        }
        if (x<0&&y<0){
            System.out.println("Third Quadrant");
        }
        if (x>0&&y<0){
            System.out.println("Fourth Quadrant");
        }
        if (x==0&&y!=0){
            System.out.println("On Y-Axis");
        }
        if (x!=0&&y==0){
            System.out.println("On X-Axis");
        }
 */
/*
        //Maximum no. of handshakes....not understood just the learned the formula
        // num*(num-1)/2
        System.out.println("Enter no. of people");
        int num = sc.nextInt();
        int total = num*(num-1)/2;
        System.out.println("for "+num+" people "+" there will be "+total+" handshakes ");
 */
/*
        //Addition of 2 Fractions
        int n1=2;
        int n2=4;
        int d1=5;
        int d2=6;
        int min,sum,d;
        if (d1==d2){
            sum=n1+n2;
            d=d1;
        }
        else {
            d=d1*d2;
            d1=d/d1;
            d2=d/d2;
            n1=n1*d1;
            n2=n2*d2;
            sum=n1+n2;
            //check if the number can be futher minimized
            min=sum<d?sum:d;
            for (int i =1;i<=min;i++){
                if (sum%i==0 && d%i==0){
                    sum/=i;
                    d/=i;
                }
            }
        }
        if (sum%d==0){
            sum/=d;
            System.out.println(sum);
        }
        else {
            System.out.println(sum+"/"+d);
        }

 */
/*
        //Replace 0 with 1 in a number
        int num = 203040506;
        String st= Integer.toString(num);
        String sy = st.replace("0","1");
        System.out.println(sy);
 */
 /*
        //convert Number to Word
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        if (num<0 || num>9999){
            System.out.println("Only four Digits allowed");
        }
        else {
            int utPlace = num%10;
            int tt= num/10;
            int tensPlace = tt%10;      //tens place ka digit
            int hPlace = num/100;       //hundreds digit
            int thous = num/1000;       // thousands place ka digit
            String ut[] = {"","One", "two", "three", "four", "five", "six", "seven",
                    "eight","nine" ,"eleven", "twelve", "thirteen", "fourteen",
                    "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
            String tp[] = {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty",
                    "Seventy","Eighty","Ninety"};
            String ht = "Hundred";
            String th = "Thousand";
            if (num<20){
                System.out.println(ut[num]);
            }
            else if (num<100){
                System.out.println(tp[tensPlace]+" "+ut[utPlace]);
            }
            else if(num>=100 && num<1000){
                System.out.println(ut[hPlace]+" "+ht+" "+tp[tensPlace]+" "+ut[utPlace]);
            }
            else if (num>=1000 && num<9999){
                while (num>thous){
                    hPlace = (num%10);
                    num/=10;
                }
                System.out.println(ut[thous]+th+" "+ut[hPlace]+" "+ht+" "+tp[tensPlace]+" "+ut[utPlace]);
            }
        }
  */
/*
        //Counting Number of Days by given Month and Year
        System.out.println("enter Month");
        int month = sc.nextInt();
        System.out.println("enter year");
        int year = sc.nextInt();

        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
            System.out.println("No. of days is 31");
        }
        else if (month==2 && ((year%4==0&&year%100!=0)||(year%400==0))){
            System.out.println("No. of days is 29, Since it is a Leap Year");
        }
        else if (month==2){
            System.out.println("No. of days is 28");
        }
        else{
            System.out.println("No. of days is 30");
        }
 */
/*
        //Repeated Digits in a Number
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        System.out.println("Enter a Digit to Find");
        int digit = sc.nextInt();
        int count =0;
        while (num>0){
            int rem = num%10;
            if (rem==digit){
                count++;
            }
            num/=10;
        }
        if (count>1){
            System.out.println(digit+" has occured "+count+" times ");
        }
        else {
            System.out.println("Not repeated ");
        }
 */
























    }
}
