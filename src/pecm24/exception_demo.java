package pecm24;
class A{
    private int  x = 3;
    private int  y = 4;
}
//see more on geeks for geeks
public class exception_demo {
    private static int a = 1;
    private int b =2;
    public static void main(String[] args) throws InterruptedException  {
        for (int i =0;i<5;i++){
//            System.out.println("HI");
//            Thread.sleep(2000);
        }
        try{
            int a  = 10;
            int b = 0;
            int c = a/b;
        }catch (ArithmeticException e){
            System.out.println("Cannot divie number by zero"+e);
        }
        finally {
            System.out.println("thank you");
        }


        String s1 =  String.valueOf(100);
        System.out.println(s1);
        String s2 = "1234";
        int i = Integer.parseInt(s2);
        System.out.println(i);

        //System.out.println(A.x); //CTE since private access
        System.out.println(exception_demo.a); //here int a was made static to access it.






    }
}
