package com.company;
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public  String getName(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }


}

class Cellphone{
    public void ring(){
        System.out.println("ringing");
    }
    public void vibrate(){
        System.out.println("vibrating");
    }
}

class Square{
    public int area(int side){
        return side*side;
    }
    public int perimetre(int side){
        return 4*side;
    }
}

class Rect{
    public int area(int s1, int s2){
        return s1*s2;
    }
    public int perimetre(int s1 , int s2 ){
        return 2*(s1+s2);
    }
}


public class practice8 {
    public static void main(String[] args) {
/*
        //employee class
        Employee harsh = new Employee();
//        harsh.name = "harsh";
        harsh.setname("Harsh");
        System.out.println(harsh.getName());
        harsh.setSalary(500000);
        System.out.println(harsh.getSalary());
 */
/*
        //cellphone class
        Cellphone cp = new Cellphone();
        cp.ring();
        cp.vibrate();
 */
/*
        //Square class
        Square s4 = new Square();
        System.out.println(s4.area(3));
        System.out.println(s4.perimetre(3));
 */
/*
        //Rect class
        Rect r1 = new Rect();
        System.out.println(r1.area(2,3));
        System.out.println(r1.perimetre(2,3));
 */


    }
}
