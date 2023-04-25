//Write class name first letter in capital --> class Pen{}
package com.company;

class Pen{
    String color;
    String type;  //ball or gel

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);  //this. --> tells the class that which obj is trying to access it
    }



}

class Student{
    String name;
    int age;

    public void prinInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

    //Polymorphism --> many functions, method overloading
    public void displayInfo(String name){
        System.out.println(name);
    }
    public void displayInfo(int age){
        System.out.println(age);
    }
    public void displayInfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

    //Non parameterized constructor
//    Student(){
//        System.out.println("Constructor called");
//    }

    //parameterized constructor
//    Student(String name, int age){
//        System.out.println("Parameterized Constructor called");
//        this.name = name;  //this.name --> name from object and name ---> for the parameter
//        this.age = age;

    }

    //copy constructor
//   Student(Student s4){
//       this.name =name;
//       this.age = age;
//   }

    //for copy constructor we need empty construtor calling
//    Student(){
//
//    }



public class OOPS_apniKaksha {

    public static void main(String[] args) {
/*
        //Defining the object 1
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        //calling the method
        pen1.write();

        //Defining the object 2
        Pen pen2 = new Pen();
        pen2.color = "balck";
        pen2.type = "ball";

        pen2.printColor();
        pen1.printColor();

 */

        //defining object1 for class Student
        Student s1 = new Student();
        s1.name = "harsh";
        s1.age = 21;

        //parameterized constructor
//        Student s3 = new Student("Shantanu", 23);

        //copy constructor
//        Student s4 = new Student(s3);
//        s3.prinInfo();

        //defining object2 for class Student
//        Student s2 = new Student();
//        s2.name = "kunal";
//        s2.age = 17;

        //calling method
//        s1.prinInfo();
//        s2.prinInfo();
//        s3.prinInfo();
        s1.displayInfo(s1.name,s1.age);

    }
}
