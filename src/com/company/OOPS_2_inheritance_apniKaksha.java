//Inheritance --> when a class wants to inherite properties of other class
package com.company;
class Shape{
    public void area(){
        System.out.println("display area");
    }
}
//Single inheritance
class Triangle extends Shape{
    int l;
    int h;
    public void area(int l1 , int h1){
        this.l = l1;
        this.h = h1;
        float ans =(float)1/2 *l1*h1;
        System.out.println(ans);
    }

}

//Multilevel inheritance
//class Equilateral extends Triangle{
//    public void area(int l, int h){
//        System.out.println(1/2*l*h);
//    }
//}

//hierarchical inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
//for dynamic method dispatch
class Sphere extends Shape{
    public void area(){
        System.out.println("display area of Sphere");
    }
    public void volume(){
        System.out.println("Volume of the sphere");
    }
}


public class OOPS_2_inheritance_apniKaksha {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
//        t1.color = "red";  //inhering property of other class
        t1.area(2,4);

        Circle c1 = new Circle();
        c1.area(3);

        //creating object of triangle with refrence of shape
        Shape s1 = new Sphere();

//        Triangle t1 = new Shape(); //this cannot be done

        //when  method names are same
        //this will print "display area of Sphere" beacause obj of sphere is created, this is called dynamic method dispatch
        //s1.area();

        //but if there are different methods in parent and child class, then
        //the method of the parent  class will be called
//        s1.volume();  //will give error


    }
}
