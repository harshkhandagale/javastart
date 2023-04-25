package pecm24;
 abstract class Pheonix{
     public int a;
     public int b;
        public abstract void shop(); // abstract method, no body
        public void BK(){
            System.out.println("provides burgers");
        }
        Pheonix(int a , int b){  // useless contructor
            this.a = a;
            this.b=b;
        }
 }
 class MD extends Pheonix{
     MD(int a, int b) {  // useless contructor
         super(a, b);
     }

     public void shop(){
         System.out.println("DO shopping");
     }
 }
public class abstract_demo {
    public static void main(String[] args) {
//        Pheonix p1 = new Pheonix(1,2); // cannot be instantiated
        int a =1;
        int b = 3;
        try{
            int c = a/b;
        }catch (ArrayIndexOutOfBoundsException  | ArithmeticException e  ){

        }//multiple exceptions in single catch block

    }
}