package new_start;

public class pattern {
    public static void main(String[] args) {
/*
        //Half pyramid
        for (int i =0;i<4;i++){
            for (int j = 0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
 /*
        //inverse pyramid
        int n = 4;
        for (int i = n;i>0;i--){
            for (int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
  */
 /*
        int n = 4;
        for (int i =0;i<=n;i++){
            for (int j = 0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
  */

        //Diamond pattern
        int n = 7;
        int space = n/2;
        int star = 1;
        for (int i = 1; i<=n;i++){
            for (int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=star;j++){
                System.out.print("*");
            }
            if (i<=n/2){
                star = star +2;
                space --;
            }
            else {
                star = star -2;
                space++;
            }
            System.out.println();
        }



    }
}
