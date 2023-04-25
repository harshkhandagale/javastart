package com.company;
class Circle1{
    int r;
    public void set_radius(int r){
        this.r = r;
    }
    public int get_radius(){
        return r;
    }
//    public double area(){
//        return Math.PI*r*r;
//    }
//    public double get_area(){
//        return area();
//    }
    Circle1(int r){
        int area = r*r;
        System.out.println(area);
    }
}
public class practice10 {
    public static void main(String[] args) {
//        Circle1 c1 = new Circle1();
//        c1.set_radius(2);
//        System.out.println(" radius is  "+c1.get_radius());
//        System.out.println(c1.area());;
        Circle1 c2 = new Circle1(2);

}
}
