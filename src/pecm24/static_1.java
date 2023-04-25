package pecm24;
class Chair{
    String name = "Qspider";
    int leg;

    {
        System.out.println("FROM non-static block");
    }

    public void displayChair(){
        System.out.println(name);
        System.out.println(leg);

    }
}

public class static_1 {
    public static void main(String[] args) {

        Chair c1 = new Chair();
        c1.displayChair();

    }


}



