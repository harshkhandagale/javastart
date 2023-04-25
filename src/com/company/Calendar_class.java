//Check docs for more info
package com.company;
import java.awt.image.RasterOp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendar_class {
    public static void main(String[] args) {
//        Calendar c1 = Calendar.getInstance();    //gives full deatil
//        System.out.println(c1);
//        System.out.println(c1.getCalendarType());       //gregory
//        System.out.println(c1.getTimeZone());       //Asia/Calcutta  with other info

//        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        System.out.println(c2);         //get info about singapore
//        System.out.println(c2.getTimeZone().getID());   //Asia/Singapore is ID

//        Calendar c3 = Calendar.getInstance();
//        System.out.println(c3.get(Calendar.DATE));
//        System.out.println(c3.get(Calendar.SECOND));
//        System.out.println(c3.get(Calendar.HOUR));
//
//        //GregorianCalendar
//        GregorianCalendar c4 = new GregorianCalendar();
//        System.out.println(c4.isLeapYear(2020));    //returns true or false
//        System.out.println(TimeZone.getAvailableIDs()[0]);
//        System.out.println(TimeZone.getAvailableIDs()[1]);
//        System.out.println(TimeZone.getAvailableIDs()[7]);

        //Local Date Time are immutable, i.e we cannot set it
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        LocalTime t1 = LocalTime.now();
        System.out.println(t1);

        //Date+Time with nanoseconds
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);



    }
}
