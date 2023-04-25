package pecm24;

import java.util.Scanner;

public class arrays_arrays_with_oops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        //Largest Element in array
        int [] arr = {1,2,3,34,4};
        int max = 0;
        for(int i =0; i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
 */
/*
        //smallest element in array
        int [] arr = {1,2,3,34,4};
        int min = arr[0];
        for(int i =1; i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
 */
/*
        //SUm of the array
        int [] arr = {1,2,3,34,4};
        int sum =0;
        for (int i =0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
 */
/*
        //Reverse the array
        int [] arr = {1,2,3,34,4};
        int n = arr.length;
        int []arr1 = new int [arr.length];
        for (int i =0;i<n;i++){
            arr1[i] = arr[n-i-1];
        }
        for (int i =0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
 */
/*
        //Array element present or not
        int [] arr = {1,2,3,34,4};
        boolean flag = false;
        System.out.println("Enter a key to search");

        int key = sc.nextInt();
        for (int i = 0;i<arr.length;i++){
            if (key==arr[i]) {
                flag=true;
            }
        }
        if (flag == true){
            System.out.println("FOund");
        }
        else {
            System.out.println("Not found");
        }
 */
/*
        //Finding element by binary search
        int [] arr = {1,2,3,34,4,5,6,73,99};
        System.out.println("Enter key to search");
        int key = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        boolean found = false;

        for ( int i = 0;i<arr.length;i++){
            if (key == arr[mid]){
                found = true;
                break;
            }
            else if (key<arr[mid]) {
                end = mid-1;
            }
            else if (key>arr[mid]){
                start = mid+1;
            }
            mid = (start+end)/2;
        }
        if (found==true){
            System.out.println("Key found at "+(mid+1));
        }
        else{
            System.out.println("Not Found");
        }
 */

/*
        //Reapeting element or not  (Naive appraoch)
        int [] arr = {1,2,3,2,34,4,3,1};
        int i,j;
        for (i=0;i< arr.length-1;i++){
            for (j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
 */
/*
        //Palindrome array or not
        int [] arr = {1,2,3,2,1};
        int [] arr1 = new int[arr.length];
        int j = arr.length-1;
        //for putting reverse values in arr1
        for (int i =0;i<arr.length;i++){
            arr1[i] = arr[j];
            j--;
        }
        int count = 0;
        for (int i =0; i< arr.length; i++){
            if (arr[i]==arr1[i]){
                count++;
            }
        }
        if (count == arr.length){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrme");
        }
 */
/*
            //Merging 2 arrays one by one
        int [] arr = {1,2,3,2,1};
        int [] arr1 = {4,7,2,4,5};
        int j = arr.length+ arr1.length;
        int [] arr2 = new int [j];
        for (int i = 0;i< arr.length;i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0;i< arr1.length;i++) {
            arr2[arr.length+i] = arr1[i];
        }
        for (int i =0 ; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
 */
 /*
        //Shifting to the right (array rotating to the right)
        int []arr = {1,2,3,4,5,6,7,8,9};
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("ENter how many times you want to shift");
        int n = sc.nextInt();
        for (int i =0;i<n;i++){
            //first sore the last element
            int first_element = arr[arr.length-1];
            for (int j =arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = first_element;
        }
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
 */
/*
        //Shifting or rotating to left --array
        int []arr = {1,2,3,4,5,6,7,8,9};
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("enter how many shift you want");
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            int last_element = arr[0];
            for (int j = 0; j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = last_element;
        }
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
 */
 /*
        //second largest element in array
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
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The second largest element is ");
        for (int i =0;i<arr.length;i++){
            if (arr[i] == arr[arr.length-2]){
                System.out.print(arr[i]);
            }
        }
  */
        //Second smallest element in array
        int [] arr = {1,5,2,8,4,71};
        int min = arr[0];
















    }
}
