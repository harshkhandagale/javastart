package new_start;
class Car{
    String brand;
    double price;
    Car(){}
    Car(String brand , double price) {
        this.brand = brand;
        this.price = price;
    }
    public void display_Car(){
        System.out.println("brand : "+brand);
        System.out.println("price : "+price);
    }
}
public class sorting_objects {
    //Method for sorting price of cars
    public static Car[] sort_price(Car [] c1){
        Car temp;
        for (int i =0;i<c1.length;i++){
            for (int j = i+1;j<c1.length;j++){
                if (c1[i].price>c1[j].price){
                    temp = c1[i];
                    c1[i] = c1[j];
                    c1[j] = temp;
                }
            }
        }
        return c1;
    }
    public static void main(String[] args) {
        Car[] c1 = new Car[5];
        c1[0] = new Car("BMW",560000);
        c1[1] = new Car("Mercedes",660000);
        c1[2] = new Car("volks",560700);
        c1[3] = new Car("intru",780000);
        c1[4] = new Car("thar",900000);

        System.out.println("Sorted prices of cars are ");
        Car sorted_price[] = sort_price(c1);
        for (int i =0;i<sorted_price.length;i++){
            sorted_price[i].display_Car();
        }
    }
}
