package pecm24;
//MULTIPLE INHERITANCE CANNOT HAPPEN IN ABSTRACT CLASS

abstract class AnimalEat{
    public void eat(){

        System.out.println("Eating");
    }  //it is a concrete method therefore body is needed
    abstract void play();
}
abstract class AnimalTravel{
    public void eat(){
        System.out.println("Eating animal");
    }
    public void travel(){
        System.out.println("travelling");
    }
}
//class Animal extends AnimalEat,AnimalTravel{     //error

//}
public class diamon_problem_abst {
    public static void main(String[] args) {

    }
}
