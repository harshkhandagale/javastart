package com.company;

public class star_printing_advance {
    public static void main(String[] args) {
/*
        //1.Butter fly ..given n=4
        int n=4;
        //upper half
        for (int i=1; i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }//scope of j is till here only
            //for spaces
            int spaces = 2*(n-i);
            for (int j =1;j<=spaces;j++){  //this is new int j
                System.out.print(" ");
            }
            //again printing star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i=n;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for (int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //again star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
/*
        //2.solid rhombus
        int n =5;
        for (int i=1;i<=n;i++){
            //spaces
            int spaces = n-i;
            for (int j=1; j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
/*
        //3.Number Pyramid
        int n=5;
        for (int i=1;i<=n;i++){
            //spaces
            int spaces =n-i;
            for (int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            //numbers printing
            for (int j =1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
 */
/*
        //4. Palindromic Pattern
        int n =5;
        for (int i=1; i<=n; i++){
            //spaces
            int spaces= n-i;
            for (int j=1; j<spaces;j++){
                System.out.print(" ");
            }
            //first half
            for (int j=i; j>=1;j--){
                System.out.print(j);
            }
            //second half
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
 */
/*
        //5.Diamond pattern
        int n=4;
        for (int i=1;i<=n;i++){
            //spaces
            int spaces= n-i;
            for (int j=1; j<=spaces;j++){
                System.out.print(" ");
            }
            //first half
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half/ lower half
        for (int i=n; i>=1;i--){
            int spaces = n-i;
            for (int j =1; j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
/*
        //Diamond Pattern Simple way
        int n=7;
        int spaces = n/2;
        int star = 1;
        for (int i=1;i<=n;i++){
            //spaces
            for (int j =1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j =1;j<=star;j++){
                System.out.print("*");
            }
            if (i<=n/2){
                spaces--;
                star+=2;
            }
            else {
                star-=2;
                spaces++;
            }
            System.out.println();
        }

 */

        /*
        //Hollow Trianlge
        int n =4;
        for (int i =1;i<=n;i++){
        //Spaces
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

