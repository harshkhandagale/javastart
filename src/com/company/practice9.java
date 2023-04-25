package com.company;

class Cylinder{
    private int radius ;
    private int height ;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double area(int radius, int height){
        this.radius = radius;
        this.height = height;
        return Math.PI*radius*radius*height;
    }

    //constructor
    Cylinder(int radius, int height){
        this.radius = radius;
        this.height=height;
    }
}

class Rectangle{
    int lenght;
    int breadth;

    public Rectangle(){
       this.lenght = 4;
       this.breadth = 7;
    }
    //constructor overloading
    public Rectangle(int lenght, int breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }
    //get method for showing the output
    public void getlength_breadth(){
        System.out.println(this.lenght);
        System.out.println(this.breadth);
    }


}

public class practice9 {
    public static void main(String[] args) {
//        Cylinder cy = new Cylinder();
//        cy.setRadius(2);
//        cy.setHeight(4);
//        System.out.println(cy.getRadius());
//        System.out.println(cy.getHeight());
//        System.out.println(cy.area(2,4));

        //using constructor
//        Cylinder cy1 = new Cylinder(4,7);
//        System.out.println(cy1.getRadius());
//        System.out.println(cy1.getHeight());

        //rectangle class
        Rectangle r1 = new Rectangle(3,7); //this will print 3,7 beacuse 4,7 are for default
        r1.getlength_breadth();


    }
}
