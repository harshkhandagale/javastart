package pecm24;
 abstract class myInterface{
    public abstract void diplay();
}
class your_inter extends myInterface{
     // when you create an abstract method in the parent then you must ovverride the
    // same method in its child class as done here ...i.e display method overriden
    // if you remove the display method from my_inter then you will get error CTE
    @Override
    public void diplay() {

    }
}
public class interface_demo {
    public static void main(String[] args) {
        myInterface m1 = new your_inter() ;
    }
}