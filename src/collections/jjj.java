package collections;

import java.util.Scanner;

public class jjj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 1;
        System.out.println("enter end N number");
        int end = sc.nextInt();
        int count = 1;
        int temp = 0;
        for (int i = start; i<=end;i++){
            for (int j=2;j<=i;j++){
                if (i%j==0){
                    temp++;
                }
            }
            if (temp==1){
                count++;
            }else {
                temp=0;
            }
        }
        System.out.println("count of prime numbers : "+count);

    }
}
