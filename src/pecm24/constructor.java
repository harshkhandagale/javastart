package pecm24;
class Forms{
    String name;
    int age;
    long mob;
    int tel;
    Forms(String name1, int age, long mob){
        this.name=name1;
        this.age=age;
        this.mob=mob;
        System.out.println("Loaded");
    }
    Forms(String name, int age, long mob, int tel){
        this(name, age, mob);
        this.tel=tel;
        System.out.println("Loaded");
    }
    public void displayForms(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(mob);
        System.out.println(tel);
    }
}
public class constructor {
    public static void main(String[] args) {
        Forms f1 = new Forms("Harsh", 33,657565756,7676);
        f1.displayForms();
    }
}
