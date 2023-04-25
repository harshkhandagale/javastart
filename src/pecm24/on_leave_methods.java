package pecm24;

import java.util.Scanner;

public class on_leave_methods {
/*
    //Decimal to binary
    public static void toBinary(int num){
        String b ="";
        while (num>0){
            int rem = num%2;
            b=rem+b;
            num/=2;
        }
        System.out.println(b);
    }
 */
/*
    //Division
    public static void div(double n1 , double n2){
        double ans = n1/n2;
        System.out.println(ans);
    }
 */
/*
    //sum between given range
    public static void sum(int n1,int n2){
        int sum =0;
        for (int i=n1;i<=n2;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
 */
/*
    //accept ascii value and display char
    public static void ascii(int n1){
        char ans = (char)n1;
        System.out.println(ans);
    }
 */
/*
    //full name
    public static void fullName(String n1, String n2){
        String f1 = n1+" "+n2;
        System.out.println(f1);
    }
 */
/*
    //Sum of squares of all digits in number
    public static int square(int a){
        int sq = a*a;
        return sq;
    }
    public static  void sum(int n1){
        int sum1 =0;
        while (n1>0){
            int rem = n1%10;
            sum1+=square(rem);
            n1/=10;
        }
        System.out.println(sum1);
    }
*/
/*   *********** GOOD ONE*************
    //Prime numbers between range
    public static boolean prime(int a){
        int i;
        for (i = 2;i<a;i++){
            if (a%i==0){
                break;
            }
        }
        if (i==a){
            return true;
        }
        else {
            return false;
        }
    }
 */
/*
    //Buzz number
    //if num is divisible by 7 or ends with 7
    public static boolean buzz(int num){
        if (num%10==7 || num%7==0){
            return true;
        }
        else return false;
    }
 */
/*
    //Amstrong number
    public static int length(int num){
        int length = 0;
        while (num>0){
            num/=10;
            length++;
        }
        return length;
    }
    public static int power(int base , int power){          //base will be rem
        int mult=1;
        for (int i =1;i<=power;i++){        //here power is length
            mult*=base;
        }
        return mult;
    }
 */

/*
    //Duck number
    //number containing zero in it but not at the start
    public static boolean Duck(int num){
        while (num>0){      //The catch is here , because we are putting condition num>0....while num/10 comes to the first digit and if it is zero the it does not enter the while loop and returns false
            int rem = num%10;
            if (rem==0){
                return true;
            }
            num/=10;
        }
        return false;
    }
 */
/*
    //Neon number
    //sum of the digits after squaring is the og num
    //eg: 9 --> 9*9 = 81.....8+1=9....therefore it is a neon number
    public static int sum(int num){
        int sum =0;
        int square = num*num;
        while (square>0){
            int rem = square%10;
            sum+=rem;
            square/=10;
        }
        return sum;
    }
    public static boolean Neon(int num){
        if (num==sum(num)){
            return true;
        }
        else return false;
    }
 */
/*
    //Strong number
//    145 --> 1! + 4! + 5! = 145
    public static int factorial(int num){
        int sum =0;
        int temp =num;
        while (num>0)
        {
            int rem = num%10;
            sum+=fact(rem);
            num/=10;
        }
        return sum;
    }
    public static boolean CheckStrong(int num){
        if (factorial(num)==num){
            return true;
        }
        else return false;
    }
    public static int fact(int n1){
        int mult =1;
        for (int i =1;i<=n1;i++){
            mult*=i;
        }
        return mult;
    }
*/
/*
    //Factors of Entered Number
    public static void Factors(int num){
        for (int i =1;i<=num;i++){
            if (num%i==0){
                System.out.println(i);
            }
        }
    }
 */

/*
    //Automorphic
    public static boolean automorphic(int num){
        int sq= num * num;
        while (num>0){
            if (sq%10==num%10){
                num/=10;
                sq/=10;
                return true;

            }
            else return false;
        }
        return true;
    }
*/
/*
    //LCM
    public static boolean lcm(int low, int high, int max){
        if (max%low==0 && max%high==0){
            return true;
        }
        else return false;
    }
*/
/*
    //HCF
    public static boolean hcf(int low, int high, int min){
        if (low%min==0 && high%min==0){
            return true;
        }
        else return false;
    }
*/

/*
    //SPY number
    //1124
//    1+1+2+4 = 8
//    1*1*2*4 = 8
    public static int addition(int num){
        int sum =0;
        while (num>0){
            int rem = num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
    public static int multiplication(int num){
        int mult=1;
        while (num>0){
            int rem = num%10;
            mult*=rem;
            num/=10;
        }
        return mult;
    }
    public static boolean isSpy(int num){
        if (addition(num)==multiplication(num)){
            return true;
        }
        else return false;
    }
 */

/*
    //Perfect number or not
    // sum of divisors excluding itself should be the number
    // eg: 6 --> 1,2,3 are its divisor, it comes in 1,2 and 3 tables, now 1+2+3 =6 therefore its a perfect number
    public static int sum1(int num){
        int sum=0;
        for (int i =1;i<num;i++){
            if (num%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static boolean isPerfect(int num){
        if (sum1(num)==num){
            return true;
        }
        else return false;
    }
*/
/*
    //Ugly number
    //whose factors are only 2 or 3 or 5
    public static boolean ugly(int num){
        for (int i =1;i<=num;i++){
            if (num%i==0){
                if (i==2 || i ==3 || i==5){
                    return true;
                }
            }
        }
        return false;
    }
*/
/*
    //Pronic number
//    6 --> 2 * 3 ....two consecutive
//    12 --> 3 * 4
    public static boolean isPronic(int num){
        int i =1;
        int j =i+1;
        while (i<=num/2){
            if (i*j==num){
                return true;
            }
            i++;
        }
        return false;
    }
*/
/*
    //Harshad number/Niven number
//    21 = 2+1 =3
//    21%3==0
    public static int sum(int num){
        int sum =0;
        while (num>0){
            int rem = num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
    public static boolean harshad(int num){
        if (num % sum(num)==0){
            return true;
        }
        else return false;
    }
*/

/*
    //Magic number
//    sum the number of digits , then again sum the result until you get 1
    public static boolean magic(int num){
        int sum =0;
        while (num>0){
            int rem = num%10;
            sum+=rem;
            num/=10;
        }
        if (sum==1){
            return true;
        }
        else return false;
    }
*/
/*
    //Happy and Unhappy number
//    97 = 9^2 + 7^2 = 130
//    130 = 1^2 +  3^2 +  0^2 = 10
//    10 = 1^2 + 0^2 = 1........therefore Happy number if sum is 1
//
//    similarly is sum = 4....it is Unhappy number

    public static int sumOfSqaure(int num){
        int sq =0;
        while (num>0){
            int rem = num%10;
            sq += rem*rem;
            num /=10;
        }
        return sq;
    }
*/
/*
    //Coprime
    // 2 numbers having 1(one) as their common factor
    public static void coPrime(int num1, int num2){
        int count =0;
        for (int i =1;i<=num1 && i<=num2;i++){
            if (num1%i==0 && num2%i==0){
                count=i;
            }
        }
        if (count==1){
            System.out.println("Coprime numbers");
        }
        else {
            System.out.println("Not Coprime");
        }
    }
*/

/*
    //Twin Prime
    // difference between two prime numbers is 2
    public static boolean prime(int num){
        int i;
        for (i =2;i<num;i++){
            if (num%i==0){
                break;
            }
        }
        if (i==num){
            return true;
        }
        else return false;
    }
    public static void twinPrime(int num){
        if (prime(num)){
            if (prime(num+2) || prime(num-2)){
                System.out.println("Twin Prime");
            }
            else {
                System.out.println("Not twin Prime");
            }
        }
        else {
            System.out.println("Enter Prime number only");
        }
    }
*/










    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        System.out.println("Enter a num");
        int num = sc.nextInt();
        toBinary(num);
 */

//        div(2.2,7.9);
/*
        System.out.println("Enter a number");
        int n1 = sc.nextInt();
        System.out.println("Enter a number");
        int n2 = sc.nextInt();
        sum(n1,n2);
 */
/*
        System.out.println("Enter a number");
        int n1 = sc.nextInt();
        ascii(n1);
 */
/*
        System.out.println("enter first name");
        String n1 = sc.nextLine();
        System.out.println("enter last name");
        String n2 = sc.nextLine();
        fullName(n1,n2);
 */
/*
        System.out.println("Enter a num");
        int num = sc.nextInt();
        sum(num);
 */
/*
        System.out.println("Enter a number");
        int start = sc.nextInt();
        System.out.println("Enter a number");
        int end = sc.nextInt();
        for (int i =start;i<=end;i++){
            if (prime(i)){
                System.out.println(i);
            }
        }
*/
/*
        System.out.println("Enter a num");
        int num = sc.nextInt();
        if (buzz(num)){
            System.out.println("It is a buzz");
        }
        else {
            System.out.println("Not buzz");
        }
 */
/*
        System.out.println("Enter a num");
        int num = sc.nextInt();
        int temp = num;
        int sum =0;
        int length = length(num);
        while (num>0){
            int rem = num%10;
            sum+=power(rem,length);
            num/=10;
        }
        if (temp==sum){
            System.out.println("Amstrong");
        }
        else {
            System.out.println("NOt amstrong");
        }
 */

/*
        System.out.println("Enter a num");
        int num = sc.nextInt();
        if (Duck(num)){
            System.out.println("it is a Duck num");
        }
        else {
            System.out.println("It is not a Duck num");
        }
 */
/*
        System.out.println("Enter a num");
        int num = sc.nextInt();
        if (Neon(num)){
            System.out.println("Neon");
        }
        else {
            System.out.println("Not Neon");
        }
 */
/*
        int num =3;
        if (CheckStrong(num)){
            System.out.println("Strong");
        }
        else {
            System.out.println("Not Strong");
        }
 */
/*
        System.out.println("Enter a num");
        int num = sc.nextInt();
        Factors(num);
 */
/*
        System.out.println("Enter a num");
        int num = sc.nextInt();
        if ( automorphic(num)){
            System.out.println("Automorphic");
        }
        else {
            System.out.println("Not Automorphic");
        }
 */
/*
        //lcm
        int num1= 3;
        int num2= 7;
        int max = num1>num2 ? num1 : num2;
        while (true){
            if (lcm(num1, num2,max)){
                System.out.println("LCM is "+ max);
                break;
            }
            max++;
        }
*/
/*
        //hcf
        int num1= 3;
        int num2= 7;
        int min = num1<num2 ? num1 : num2;
        while (min>0){
            if (hcf(num1, num2, min)){
                System.out.println("HCF is "+ min);
                break;
            }
            min--;
        }
*/
/*
        //spy
        System.out.println("Enter a num");
        int num = sc.nextInt();
        if (isSpy(num)){
            System.out.println("SPY num");
        }
        else {
            System.out.println("Not a Spy number");
        }
 */
/*
        //perfect number
        System.out.println("Enter a num");
        int num = sc.nextInt();
        if (isPerfect(num)){
            System.out.println("Perfect number");
        }
        else {
            System.out.println("Not perfect");
        }
 */
/*
        //ugly
        System.out.println("Enter a num");
        int num = sc.nextInt();
        if (ugly(num)){
            System.out.println("UGLY");
        }
        else {
            System.out.println("NOT UGLY");
        }
 */
/*
        //pronic
        System.out.println("Enter a num");
        int num = sc.nextInt();
        if(isPronic(num)){
            System.out.println("Pronic");
        }
        else {
            System.out.println("Not Pronic");
        }
 */
/*
        //harshad
        System.out.println("Enter a num");
        int num = sc.nextInt();
        if (harshad(num)){
            System.out.println("Harshad number");
        }
        else {
            System.out.println("Not harshad");
        }
 */
/*
        //magic
        int num = sc.nextInt();
        int sum =0;
        while (num>0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        if (magic(sum)){
            System.out.println("MAGIC");
        }
        else {
            System.out.println("NO magic");
        }
 */
/*
        //Happy Unhappy
        System.out.println("Enter a num");
        int num = sc.nextInt();
        num = sumOfSqaure(num);
        while (true) {
            if (num != 4 && num != 1) {
                num = sumOfSqaure(num);
            }
            else {
                break;
            }
        }
        if (num==1){
            System.out.println("Happy");

        }
        else {
            System.out.println("Unhappy");

        }
*/
/*
        //Coprime
        System.out.println("Enter a num");
        int num1 = sc.nextInt();
        System.out.println("Enter a num");
        int num2 = sc.nextInt();
        coPrime(num1,num2);
 */
/*
        //Twin prime
        System.out.println("Enter a num");
        int num = sc.nextInt();
        twinPrime(num);
 */





















    }
}
