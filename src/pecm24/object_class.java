package pecm24;
class Students {
    String name;
    int roll_no;
    public Students(){
    }
    public Students(String name , int roll_no){
        super();
        this.name=name;
        this.roll_no=roll_no;
    }
    public void display_students(){
        System.out.println("Name: "+name);
        System.out.println("roll_no: "+roll_no);
    }
    //tostring method by programmer
    @Override
    public String toString(){
        return "name: "+name+" roll_no: "+roll_no;
    }
}
public class object_class {
    public static void main(String[] args) {
        Students s1 = new Students("HArsh",23);
        Students s2 = new Students("Kunal",25);
        System.out.println("Student 1 : " +s1);
        System.out.println("Student 2 : " +s2);
        //above line wil give us student info in string format like described in toString
        // method

    }
}
