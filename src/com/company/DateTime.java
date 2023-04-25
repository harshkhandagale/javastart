//System.currentTimeMillis() -> gives currentTime from 1st Jan 1970 till now
//if you want the seconds->hours->days->years   use your mathematical logic given below
//For more details see the jdk 18 docs

package com.company;
import java.util.Date;
public class DateTime {
    public static void main(String[] args) {
/*
        //we can store the milliseconds in lon because
        System.out.println("Long can store upto : "+Long.MAX_VALUE);
        System.out.println("Number of milliseconds passed");
        System.out.println(System.currentTimeMillis());
        System.out.println("Number of minutes passed");
        System.out.println(System.currentTimeMillis()/1000);
        System.out.println("Number of hours passed");
        System.out.println(System.currentTimeMillis()/1000/3600);
        System.out.println("Number of days passed");
        System.out.println(System.currentTimeMillis()/1000/3600/24);
        System.out.println("Number of years passed");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
 */

        //Date
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println(d1.getTime());
        System.out.println(d1.getYear());

    }
}
