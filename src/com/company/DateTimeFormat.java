//Not running
package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);


//
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String myDate = dt.format(df);  //dt in formate of df
//        System.out.println(myDate);

        DateTimeFormatter df2 = DateTimeFormatter.BASIC_ISO_DATE;
        String myDate1 = dt.format(df2);
        System.out.println(myDate1);




    }

}
