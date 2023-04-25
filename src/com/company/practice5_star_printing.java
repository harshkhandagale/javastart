//Apni Kaksha youtube
//while printing any pattern first create some insights or see the relations between i and j
//Written in pages stored in your blue document file also scanned and kept on mail
//rows --> Outer Loops i   ... outer loop tells you how many rows .
//columns --> Inner Loops j

package com.company;

public class practice5_star_printing {
    public static void main(String[] args) {

        //Solid rectangle
/*
        for(int i=1; i<=4; i++){
            for (int j=1; j<=5; j++){
            System.out.print("*");
            }
            System.out.println();
        }

 */

        //Hollow Rectangle
/*
        int n=4; //for rows
        int m=5; //for columns
        //first define the outline of the for loop i.e i and j, i.e rows and column
        for (int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();  //for start in the next line
        }

 */

        //Half Pyramid
/*
        int n=4;
        for(int i=1; i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

 */

        //Inverse Pyramid
/*
        int n=4;
        for (int i=n; i>=1;i--){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

 */

        //inverted half pyramid
/*
        int n=4;
        for (int i=1;i<=n;i++){
            //spaces loop
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }//scope of j is till here only
            for (int j=1; j<=i;j++){        //this is new j
                System.out.print("*");
            }
            System.out.println();
        }

 */

        //Half pyramid with numbers
/*
        int n=5;
        for (int i=1;i<=n ;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

 */


        //Inverted half pyramid with numbers
/*
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

 */


        //Floyd's Triangle
/*
        int n=5;
        int number=1;
        for (int i=1; i<=n;i++){
            for (int j=1; j<=i;j++){
                System.out.print(number+++" ");
            }
            System.out.println();
        }

 */


        //0-1 Triangle
/*
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if (sum%2==0){
                    System.out.print("1"+' ');
                }
                else {
                    System.out.print("0"+' ');
                }
            }
            System.out.println();
        }

 */



    }
}
