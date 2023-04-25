package pecm24;

import java.util.Scanner;

public class after_mock_programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        //power of number
        System.out.println("enter base num");
        int base = sc.nextInt();
        System.out.println("enter power");
        int pow = sc.nextInt();
        int  mult = 1;
        for (int i =1;i<=pow;i++){
            mult*=base;
        }
        System.out.println(mult);
 */
/*
        //Factors of number
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.print("factors of "+num+" are :");
        for (int i = 1;i<=num;i++){
            if (num%i==0){
                System.out.print(i+" ");
            }
        }
 */
/*
        //Multiplication table
        System.out.println("enter which table you want ");
        int num = sc.nextInt();
        for (int i =1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
 */
 /*
        //LCM
        System.out.println("enter number 1");
        int num1= sc.nextInt();
        System.out.println("enter number 1");
        int num2= sc.nextInt();
        int lcm,i;
        //for optimizing the code start from big number as you have done in math
        int max = num1>num2 ? num1:num2;
        for (i = max;i<=num1*num2;i+=max){
            if (i%num1==0 && i%num2==0){
                break;
            }
        }
        lcm=i;
        System.out.println(lcm);
*/
/*
        //HCF highest common factor
        System.out.println("enter number 1");
        int num1= sc.nextInt();
        System.out.println("enter number 1");
        int num2= sc.nextInt();
        int min = num1<num2 ? num1:num2;
        int hcf=0;
        for (int i=1;i<=min;i++){
            if (num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);
 */
/*
        //Sum of square of digits
        int num = 1234;
        int sum =0;
        while (num>0){
            int rem = num%10;
            int mult=1;
            mult = mult*rem*rem;
            sum+=mult;
            num/=10;
        }
        System.out.println(sum);
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
        //Product of digits raise to power 5
        int num = 1234;
        int power=5;
        int product=1;
        while (num>0){
            int rem = num%10;
            int mult=1;
            for (int i = 1;i<=power;i++){
                mult*=rem;
            }
            product*=mult;
            num/=10;
        }
        System.out.println(product);
 */
/*
        //Fibonacci Number or not
        System.out.println("Enter a Number to Check weather it is present in Fibonacci seires :  ");
        int num = sc.nextInt();
        int a = 0;
        int b =1;
        int c =0;
        boolean bool = false;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=0;i<num;i++){
            c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            if (c==num){
                bool=true;
            }
        }
        System.out.println();
        if (bool==true){
            System.out.println(num+" is Present in Fibonacci series");
        }
        else {
            System.out.println(num+" is not present in Fibonacci series");
        }
 */
/*
        //Prime char or not
        System.out.println("Enter a char");
        char c = sc.next().charAt(0);
        int count=0;
        for (int i =2;i<=c;i++){
            if (c%i==0){
                count++;
            }
        }
        if (count==1){
            System.out.println("Prime Char");
        }
        else {
            System.out.println("Not a Prime Char");
        }
 */
//***********************************  PATTERNS  ****************************************
/*
        //Solid Square
        int n =4;
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

 */
 /*
        //hollow Rectangle
        int n =4;
        for (int i =1;i<=n;i++){
            for (int j =1;j<=n;j++){
                if (i==1||j==1||i==4||j==4){
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
        //Half Pyramid
        int n =4;
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

 */
/*
        //Inverse Pyramid
        int n= 4;
        for (int i =n;i>=1;i--){
            for (int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
 */
/*
        //Inverse Half Pyramid
        int n =4;
        for (int i=1;i<=n;i++){
            //Spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
/*
        //Floyds Trinagle
        int n =4;
        int num = 1;
        for (int i=1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

 */
/*
        //Inverted Half Pyramid with numbers
        int n =6;
        for (int i=1;i<=n;i++){
            for (int j =1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
 */
/*
        //0-1 Triangle
        int n= 4;
        int sum=0;
        for (int i =1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                sum=i+j;
                if (sum% 2 == 0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

 */
/*
        //ButterFly
        int n = 4;    //Given
        for (int i=1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            int spaces = 2*(n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //Again Star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Invert the statement to complete the Butterfly
        for (int i=n;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            int spaces = 2*(n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //Again Star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

 */
/*
        //Rhombus
        int n =4;
        for (int i=1;i<=n;i++){
            int spaces = n-i;
            for (int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
/*
        //Number Pyramid
        int n =5;
        for (int i =1;i<=n;i++){
            for (int j =0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
 */
/*
        //Palindrome Pattern
        int n =5;
        for (int i=1;i<=n;i++){
            for (int j =0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            for (int j =2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
 */
/*
        //Diamond
        int n =4;
        for (int i =1;i<=n;i++){
            for (int j =0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            for (int j =2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n;i>=1;i--){
            for (int j =0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            for (int j =2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
/*
        //Proper Triangle
        int n=4;
        for (int i =1;i<=n;i++){
            //Spaces
            for (int j =0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
/*
        //Hollow Trianlge
        int n =4;
        for (int i =1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            if (i==1 || i==n){
                for (int j =1;j<=i*2-1;j++){
                    System.out.print("*");
                }
            }
            else {
                for (int j=1;j<=i*2-1;j++){
                    if (j==1||j==i*2-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
 */
/*
        //Same but inverse hollow Triangle
        int n =4;
        for (int i =n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            if (i==1 || i==n){
                for (int j =1;j<=i*2-1;j++){
                    System.out.print("*");
                }
            }
            else {
                for (int j=1;j<=i*2-1;j++){
                    if (j==1||j==i*2-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
 */
/*
        //Half Diamond
        int n=4;
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
/*
        //Inverted Half Diamond
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n;i>=1;i--){
            for (int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */


























    }
}
