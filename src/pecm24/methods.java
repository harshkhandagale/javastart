package pecm24;

public class methods {
    public static void square(int a){
        int sq = a*a;
        System.out.println("square of "+a+" is "+sq);
    }
    public static void power(int base, int pow){
        int mult=1;
        for (int i=1;i<=pow;i++){
            mult*=base;
        }
        System.out.println(base+" to the power "+pow+ " is "+mult);
    }
    public static void factorial(int a){
        int mult=1;
        for (int i=1;i<=a;i++){
            mult*=i;
        }
        System.out.println("factorial of "+a+" is "+mult);
    }
    public static void main(String[] args) {
        square(2);
        power(2,4);
        factorial(5);
    }
}
