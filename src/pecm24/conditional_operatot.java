package pecm24;

public class conditional_operatot {
    public static void main(String[] args) {
        //finding largest number
        int a = 6;
        int b = 1;
        int c = 2;
        int result = a>b ? a:b;
        int result1 = result>c ? result:c;
        System.out.println(result1);
    }
}
