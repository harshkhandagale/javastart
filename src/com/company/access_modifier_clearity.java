//NOTES*** chapter 12
package com.company;

class access_modifier{
    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    public void inSameClass(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
class C1 extends access_modifier{
    public void inSubClass(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        System.out.println(d);            // 'd' has private access in 'com.company.access_modifier'
    }
}
public class access_modifier_clearity {
    public static void main(String[] args) {
        access_modifier am = new access_modifier();
        am.inSameClass();       //this will show all a,b,c,d since all the access modifiers are in same class


        //inSamePackage but not in class
        System.out.println(am.a);
        System.out.println(am.b);
        System.out.println(am.c);
//        System.out.println(am.d);          //'d' has private access in 'com.company.access_modifier' therefor not run

        C1 subclass = new C1();
        System.out.println(subclass.a);
        System.out.println(subclass.b);
        System.out.println(subclass.c);
//        System.out.println(subclass.d);    //'d' has private access in 'com.company.access_modifier'

    }
}
