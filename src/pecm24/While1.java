package pecm24;

public class While1 {
    public static void main(String[] args) {
//        int i ='a';
//        do {
//            System.out.println((char)i);
//            i++;
//        }
//        while (i<='z');

        //Reverse the number as a hole
        int num = 1234;
        String b = "";
        while (num>0){
            int rem = num%10;
            b= b+rem;
            num/=10;
        }
        System.out.println(b);


    }
}
