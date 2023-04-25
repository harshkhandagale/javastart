package new_start;

import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        //Frequency of digits

        System.out.println("enter a number");
        int num = sc.nextInt();
        for (int i = 0;i<=9;i++){
            int count = 0;
            int temp =num;
            while (temp>0){
                int rem = temp%10;
                if (rem==i){
                    count++;
                }
                temp/=10;
            }
            if (count>0){
                System.out.println(i + " count is  "+ count);
            }
        }
 */
/*
      //Frequency of elements in array
        int arr [] = {12,3,1,1,2,2,1,13,2,34,2,12,33,13};
        for (int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i= 0;i<arr.length;i++){
            int count = 1;
            while (i<arr.length-1 && arr[i]==arr[i+1]){
                i++;
                count++;
            }
            System.out.println(arr[i]+" occurs "+ count + " times ");
        }
 */

        int a = 15;
        a = a>>>3;
        System.out.println(a);



















































































    }
}
