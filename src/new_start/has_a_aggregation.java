//This is Lazy instantiation , or lazy binding
package new_start;
class Pendrive{
    String brand;
    double price;
    Pendrive(String brand, double price){
        this.brand=brand;
        this.price=price;
    }
    public void display_pen(){
        System.out.println(brand);
        System.out.println(price);
    }
}
class Laptop{
    String brand;
    double price;
    String color;
    Laptop(){ };
    public Laptop(String brand, double price, String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }
    Pendrive p1 = null;
    public void insert_pendrive(String brand, double price){
        p1 = new Pendrive("sandisk",500.34);
        System.out.println("Pendrive inserted");
    }
    public void display_Laptop(){
        System.out.println(brand);
        System.out.println(price);
        System.out.println(color);
    }
}
public class has_a_aggregation {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("hp",89088,"black");
        l1.insert_pendrive("sandisk",455);
        l1.display_Laptop();
        System.out.println();
        l1.p1.display_pen();
    }
}
