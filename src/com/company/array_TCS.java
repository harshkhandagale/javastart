package com.company;

import java.util.Scanner;

public class array_TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ARRAY
/*
        //Largest Element in array
        int [] arr = {1,2,3,34,4};
        int max=0;
        for (int i =0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

 */
/*
        //**********  Second smallest element element in array  **********
        int []arr ={1,3,2,4,5,6};
        int a = 1000;
        int min = arr[0];
        for (int e : arr){
            if (e<min){
                min=e;
            }
        }
        System.out.println(min);
        for (int i =0;i<arr.length;i++){
            if (arr[i]!=min && arr[i]<a){
                a=arr[i];           //NOTE* here value of a is updated , i.e  a= 3->2->no_value_to_update
            }
        }
        System.out.println(a);

 /*
        //Sorting
        int [] arr = {1,5,2,8,4,71};
        for (int i=0;i<arr.length;i++){
            for (int j =0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int e : arr){
            System.out.println(e);
        }
 */
/*
        //********  First half in ascending and second half descending order  **********
        int [] arr ={111,22,35,4,5,56,78,89,6,7,844,945};
        for (int i=0;i<arr.length;i++){
            for (int j = 0;j<arr.length/2;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for (int j = arr.length/2;j< arr.length-1;j++){
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int e: arr){
            System.out.print(e+" ");
        }
 */
/*
        //******* Occurence of an element in the array  { frequency of element }  ********
        //Firstr sorting and then finding the occurence
        int [] arr = {1,2,1,3,4,2,5,3,1};

        for (int i=0;i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" " );
        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            int count =1;
            while (i< arr.length-1 && arr[i]==arr[i+1]){
                i++;
                count++;
            }
            System.out.println(arr[i]+" has occured-> "+count+" times");
        }
 */
 /*
        //Reversing array
        int [] arr = {1,2,3,4};
        for (int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
 */

        /*
                //palindrom in array as a whole
        int[] arr = {1,2,3,2,3};
        int n = arr.length;
        int flag = 0;
        for (int i =0;i<arr.length-1;i++){
            if (arr[i]!=arr[n-i-1]){
                flag = 1;
                break;
            }
        }
        if (flag==1){
            System.out.println("not palindrome");
        }
        else {
            System.out.println("Palimdrome");
        }
         */

/*
        //**********Printing Palindrom numbers..checking only first and last digit**********
        int[] arr = {1,2,222,303,454,555,12021};
        for (int e :arr){
            String num = String.valueOf(e);     //converting elements of array to String
            int i =0;                           //starting from 0, eg: 303 -> will get 3
            int j =num.length()-1;            //starting from back eg: 303 -> 3
            while (i<j){
                if (num.charAt(i)==num.charAt(j)){
                    System.out.println("Palindrom "+num);
                    i++;j--;
                    break;
                }
            }
        }
 */


/*
        //**********  Finding Repeating element in array  (using flag)  **********
        int[] arr = {10, 30, 30, 20, 10, 20, 50, 10};
        for (int i =0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i =0;i<arr.length;i++){
            int flag =0;
            while (i<arr.length-1 && arr[i]==arr[i+1]){
                flag =1;
                i++;
            }
            if (flag == 1){     //we will flags at two same number i.e in sorted arrays
                System.out.println(arr[i-1]);   //where flag ==1; print i-1
            }
        }

 */
/*
        //**********  finding Non-Repeating element in array (using flag)  **********
        int[] arr = {10, 30, 30, 20, 10, 20, 60,50, 10,10,50,50,10};
        for (int i =0;i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //for distinct element
        for (int i = 0;i<arr.length;i++){
            int flag =0;
            while (i< arr.length-1 && arr[i]==arr[i+1]){
                flag=1;
                i++;
            }
            if (flag==0){
                System.out.println("Distinct element : "+ arr[i]);
            }
        }
 */
/*
        //**********  Removing duplicate elements from array  **********
            int[] arr = {5,1,2,6,4,4,5,4,8,2,9};
            for (int i =0;i<arr.length;i++){
                for (int j =i+1;j<arr.length;j++){
                    if (arr[i]>arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
//        sorted array -> [1 2 4 4 5 5 6]
        int j =0;
        for (int i =0;i<arr.length-1;i++){
            if (arr[i]!=arr[i+1]){
                arr[j++] = arr[i];  //storing unique element in j when arr[i] !=arr[i+1]
            }
        }
        //Last element remains untouched so..
        arr[j++] = arr[arr.length-1];
//        now we have 1, 2, 4, 5, 6
         for (int i =0;i<j;i++){
             System.out.println(arr[i]);
         }
 */
/*
        //**********  Minimum scalar product of two vectors  **********
        int [] arr1 = {10,30,40,20};
        int [] arr2 = {2,4,5,1};
        //arr In ascending order
        System.out.print("arr1 --> ");
        for (int i =0;i<arr1.length;i++){
            for (int j=i+1;j<arr1.length;j++){
                if (arr1[i]>arr1[j]){
                    int temp = arr1[i];
                    arr1[i] =arr1[j];
                    arr1[j] = temp;
                }
            }
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //arr2 In descending order
        System.out.print("arr2 --> ");
        for (int i =0;i<arr2.length;i++){
            for (int j=i+1;j<arr2.length;j++){
                if (arr2[i]<arr2[j]){
                    int temp = arr2[i];
                    arr2[i] =arr2[j];
                    arr2[j] = temp;
                }
            }
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        int product = 0;
        for (int i =0;i< arr1.length;i++){
            product+= arr1[i]*arr2[i];
        }
        System.out.print("minimun scaler product -> ");
        System.out.println(product);

 */

/*
        //**********  Maximum scalar product of two vectors  **********
        //here max so both the arrays should be ascending so bigger num in arr1 multiplies with bigger num in arr2
        int [] arr1 = {10,30,40,20};
        int [] arr2 = {2,4,5,1};
        //arr In ascending order
        System.out.print("arr1 --> ");
        for (int i =0;i<arr1.length;i++){
            for (int j=i+1;j<arr1.length;j++){
                if (arr1[i]>arr1[j]){
                    int temp = arr1[i];
                    arr1[i] =arr1[j];
                    arr1[j] = temp;
                }
            }
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //arr2 In ascending order
        System.out.print("arr2 --> ");
        for (int i =0;i<arr2.length;i++){
            for (int j=i+1;j<arr2.length;j++){
                if (arr2[i]>arr2[j]){
                    int temp = arr2[i];
                    arr2[i] =arr2[j];
                    arr2[j] = temp;
                }
            }
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        int product =0;
        for (int i =0;i< arr1.length;i++){
            product+= arr1[i]*arr2[i];
        }
        System.out.print("Maximum scaler product -> ");
        System.out.println(product);

 */
/*
        //Count even and odd in array
        int [] arr ={10,3,67,22,1,6,23,77,90};
        int evenCount=0;
        int oddCount=0;
        for (int i=0;i<arr.length;i++){

            if (arr[i]%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Even_Count-> "+evenCount);
        System.out.println("Odd_Count-> "+oddCount);
 */

/*
        //Disjoint or not
            int [] arr1 = {1,2,3,4,5};
            int [] arr2 = {6,7,8,9};
        boolean disjoint = true;
        for (int i =0;i< arr1.length;i++){
            for (int j =0;j< arr2.length;j++){
                if (arr1[i] == arr2[j]){
                    disjoint=false;
                }
            }
        }
        if (disjoint==false){
            System.out.println("Arrays are not disjoint");
        }
        else {
            System.out.println("Disjoint array");
        }
*/

/*
        //Subset or not
        //find if arr2 is subset of arr1 or not
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {3,4,5};
        boolean b =false;
        boolean b1 =false;
        for (int i =0;i<arr1.length;i++){
            for (int j =0;j<arr2.length;j++){
                if (arr1[i] == arr2[j]){
                    b = true;
                }
            }
            //here i was having problem with last element
            //Checking for last element
            for (int j = arr2.length-1; j< arr2.length;j++){
                if (arr1[i] == arr2[j]){
                    b1 = true;
                }
            }
        }
        if (b==true && b1==true){
            System.out.println("yes arr2 is a subset of arr1");
        }
        else {
            System.out.println("no arr2 is not a subset of arr1");
        }
 */
/*
        //Equlibirum point
        //left sum of the point and right sum must be equal
        //Yutube gfg
        // if rightsum != left sum then keep subtracting fro right sum and keeo adding in left sum
        int[] arr = {-7,1,5,2,-4,3,0};
        int rightsum=0;
        int leftSum = 0;
        int sum = 0;
        int i =0;
        for (i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for (i=0;i<arr.length;i++){
            rightsum-=arr[i];
            if (leftSum==rightsum){
                System.out.println(arr[i]+" is th equilibrium point");
            }
            else {
                leftSum+=arr[i];
            }
        }

 */

/*
        //Left shifting elements of array (rotating) according to user input
        int []arr = {1,2,3,4,5,6,7,8,9};
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter how many times you want to shift");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int firstElement = arr[0];
            for (int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            //First element will go to the last
            arr[arr.length-1]=firstElement;
        }

        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
 */
/*
        //Shifting to the right (array rotating to the right)
        int []arr = {1,2,3,4,5,6,7,8,9};
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter how many times you want to shift");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int firstElement = arr[arr.length-1];
            for (int j= arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            //last will come to first
            arr[0]=firstElement;
        }

        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
 */
 /*
        //Binary search (finding an element)
        int arr [] = {5,16,19,22,52,93,150,310};
        for (int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("Enter key to search");
        int key = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        boolean found = false;
        for (int i =0;i<arr.length-1;i++) {


            if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("key found at " + mid +"th  position");
                break;
            } else {
                end = mid - 1;
            }
            mid=(start+end)/2;
        }
 */











    }
}
