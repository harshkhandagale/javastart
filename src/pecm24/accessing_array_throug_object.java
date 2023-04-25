package pecm24;
//sort the marks of student marks through the object
class Student{
    String name;
    int marks;
    Student(){};
    Student(String name, int marks){
        this.name= name;
        this.marks= marks;
    }
    public void display_Student(){
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }
}

public class accessing_array_throug_object {
    public static void main(String[] args) {
        //creating array type object
        Student s1 [] = new Student[4];
        s1[0] = new Student("sagar",90);
        s1[1] = new Student("harsh",50);
        s1[2] = new Student("kunal",11);
        s1[3] = new Student("hemant",9);

        Student sorted []= sort_student(s1);
        for (int i =0;i<sorted.length;i++){
            sorted[i].display_Student();
        }
    }
    public static Student[] sort_student(Student[] s1){  // static keyword is important very much
        Student temp;
        //bubble sorting method
        for (int i = 0;i< s1.length-1;i++){
            for (int j =0;j<s1.length-1-i;j++){
                if (s1[j].marks>s1[j+1].marks){
                    temp = s1[j];
                    s1[j] = s1[j+1];
                    s1[j+1] = temp ;
                }
            }
        }
        return s1;
    }


}

//        for (int i =0; i< s1.length-1;i++){
//        for (int j = 0;j<s1.length-1-i;j++){
//        if (s1[i].marks>s1[j+1].marks){
//        temp = s1[i];
//        s1[i] = s1[j+1];
//        s1[j+1] = temp;
//        }
//        }
//        }