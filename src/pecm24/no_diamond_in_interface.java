package pecm24;
interface AnimalEatin{
     void eat();
}
interface AnimalTravelin{
    void eat();
     void travel();
}
class Animali implements AnimalEatin,AnimalTravelin{
        public void eat(){
            System.out.println("Animal eating");
        }
        public void travel(){
            System.out.println("Traveling");
        }
}
public class no_diamond_in_interface {
    public static void main(String[] args) {
        Animali a1 = new Animali();
        a1.eat();
        a1.travel();
    }
}
