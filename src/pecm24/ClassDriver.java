package pecm24;
class Engine1 {
    String fuel;
    int hp;
    int tor;

    Engine1() {

    }

    Engine1(String fuel, int hp, int tor) {
        this.fuel = fuel;
        this.hp = hp;
        this.tor = tor;
    }
    public void displayEngine(){
        System.out.println(fuel);
        System.out.println(hp);
        System.out.println(tor);
    }
}

class Car{
    String brand;
    String color;
    double price;
    Engine1 e1 = new Engine1("Petrol",1000,36);
    Car(){

    }
    Car(String brand, String colour, double cost){
        this.brand = brand;
        this.color=colour;
        price=cost;
    }
    public void displayCar(){
        System.out.println(brand);
        System.out.println(color);
        System.out.println(price);
    }

    public void price() {
        System.out.println(price);
    }
}
public class ClassDriver {
    public static void main(String[] args) {
        Car c1 = new Car("Tata","black",1200.00);
        Car c2 = new Car("Hyundai","White",1400.00);
        Car [] c3 = new Car[3];
        c3[0] = new Car("hero","blue",3000);
        c3[1] = new Car("herohonda","ble",2000);
        c3[2] = new Car("herohonda","ble",1000);
//        c1.displayCar();
//        c1.e1.displayEngine();
//        c1.price();
//        c2.price();
        int max =0;
        int i =0;
        for (i=0;i< c3.length-1;i++){
            if(c3[i].price>max){
                max=(int)c3[i].price;

            }
        }






    }
}
