package com.company;

public class number_Pattern {
    public static void main(String[] args) {
/*
        //Basic Sqaure
        int n =4;
        int t=1;
        for (int i =1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(t);
            }
            System.out.println();
        }
 */
/*
        //Basic Sqaure increament
        int n =4;

        for (int i =1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
 */
/*
        //Internal Varsity sqaure pattern
        int n=4;
        int num =1;
        for (int i=1;i<=n;i++){
            for (int j =1;j<=n-1;j++){
                if (j==1||j==3||i==1||i==4){
                    System.out.print("3");
                }
                else{
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
        }
 */
/*
        //right triangle pattern
        int n=4;
        int num =1;
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
 */
/*
        //Inverted
        int n=4;
        int num=10;
        for (int i =1;i<=n;i++){
            for (int j =0;j<=n-i;j++){
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
 */
/*
        //Basic increamenting triangle
        int n =4;
        int num=6;
        for (int i =1;i<=n;i++){
            for (int j =0;j<=n-i;j++){
                System.out.print(num);
            }
            num--;
            System.out.println();
        }
 */

//        //Print a,b,c,d... vertically
//        int n =4;
//        for (int i =1;i<=n;i++){
//            char ch='a';
//            for (int j=1;j<=n;j++){
//                System.out.print(ch);
//                ch+=4;
//            }
//            System.out.println();
//
//        }
/*
        //Basic Increament
        int n=4;
        int num =3;
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
 */
/*
        //Increament Diamond
        int n=4;
        int num =3;
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
        num--;
        for (int i =n;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print(num);
            }
            num--;
            System.out.println();
        }
 */

//        int n=4;
//        int num=3;
//        for (int i=1;i<=n;i++){
//            for (int j =1;j<=i;j++){
//                System.out.print(num);
//                num++;
//            }
//            System.out.println();
//        }

/*
        //Half diamond number pattern
        int n=7;
        int count = 0;
        int sum =2;
        int c1=1;
        for (int i=1;i<=n;i++){
            if (i<=4){
                sum+=c1;
                count++;
                int s =sum;
                for (int j =0;j<count;j++){
                    System.out.print(s--);
                }
                c1++;
            }
            else {
                c1--;
                sum-=c1;
                count--;
                int s = sum;
                for (int j =0;j<count;j++){
                    System.out.print(s--);
                }
            }
            System.out.println();
        }
 */
/*
        //abcd... pattern in vertical
        char ch ='a';
        int count=1;
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print(ch);
                ch+=4;
            }
            System.out.println();
            ch= (char) ('a'+count);
            count++;
        }
 */
/*
        int sum=2;
        int c1=0;
        int n =8;
        int count =0;
        for (int i =1;i<=n;i++){
            if (i<=4){
                sum+=c1;
                count++;
                int s=sum;
                for (int j =0;j<count;j++){
                    System.out.print(s++);
                }
                c1++;
            }
            else {
                c1--;
                count--;
                sum-=c1;
                int s = sum;
                for (int j =0;j<count;j++){
                    System.out.print(s++);
                }
            }
            System.out.println();
        }
 */
/*
        //Increament diamond
        int n=7;
        int sum =2;
        int c1 =0;
        int temp=0;
        int count = 0;
        for (int i =1;i<=n;i++){
            if (i<=4){
                sum+=c1;
                count++;
                int s = sum+temp++;
                for (int j =0;j<count;j++){
                    System.out.print(s--);
                }
                c1++;
            }
            else {
                c1--;
                sum-=c1;
                count--;
                int s = sum;
                for (int j =0;j<count; j++){
                    System.out.print(s--);
                }
            }
            System.out.println();
        }
 */
 /*
        //Squae pattern with number and star
        int num =1;
        for (int i =1;i<=4;i++){
            for (int j =1;j<=3;j++){
                System.out.print(num++ +"*");
            }
            System.out.println(num++);            //After printing 4 the cursor goes to the next line
        }
  */
/*
        //2.
        int n=4;
        int a=0;
        for (int i =n;i>=1;i--){
            a= i*(i-1)+1;               //These foramulas making is IMP************
            for (int j =1;j<n;j++){
                System.out.print(a++ +"*");
            }
            System.out.println(a++);
        }
 */
/*
        //3.
        int n =4;
        int a =1;
        int t=0;
        for (int i =1;i<=n;i++)
        {
            if (i%2==0){
                t=a+n;          //1st Iteration - 5+4 , 2nd iteration - 9+4
                for (int j =1;j<n;j++){
                    System.out.print(t++ +"*");
                }
                System.out.println(t++);
            }
            else {
                for (int j=1;j<n;j++){
                    System.out.print(a++ +"*");
                }
                System.out.println(a++);
            }
        }
 */
/*
        //Half pyramid with number and star
        int n =4;
        int num =1;
        for (int i =1;i<=4;i++){
            for (int j =1;j<i;j++){
                    System.out.print(num++ +"*");
            }
            System.out.println(num++);
        }
 */
/*
        //Inverse traiangle with decreamnt numbers
        int n =4;
        int a =0;
        for (int i =n;i>=1;i--){
            a= i*(i-1)/2+1;         //************************************  Formulae
            for (int j =1;j<i;j++){
                System.out.print(a++ +"*");
            }
            System.out.println(a++);
        }
 */
/*
        //Half pyramid with numbers decreament
        int n=4;
        int sum=0;
        int c1=1;
        for (int i =1;i<=n;i++){
            sum+=c1;
            int s =sum;
            for (int j =1;j<i;j++){
                System.out.print(s--+"*");
            }
            c1++;
            System.out.println(s--);
        }
 */
/*
        //decreament inverse pyramid
        int n=4;
        int num =10;
        for (int i=n;i>=1;i--){
            for (int j=1;j<i;j++){
                System.out.print(num-- +"*");
            }
            System.out.println(num--);
        }
 */
/*
        //Basic Diamond Pattern with number and star
        int n =4;
        int num =1;
        for (int i=1;i<=n;i++){
            for (int j =1;j<i;j++){
                System.out.print(i +"*");
            }
            System.out.println(i);
        }
        for (int i=3;i>=1;i--){
            for (int j =1;j<i;j++){
                System.out.print(i +"*");
            }
            System.out.println(i);
        }
 */
 /*
        //Diamond number-star
        int n =4;
        int num =1;
        for (int i=2;i<=n;i++){
            for (int j =2;j<i;j++){
                System.out.print(i +"*");
            }
            System.out.println(i);
        }
        for (int i=3;i>1;i--){
            for (int j =2;j<i;j++){
                System.out.print(i +"*");
            }
            System.out.println(i);
        }
  */



























    }
}
