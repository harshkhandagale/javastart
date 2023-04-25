//Strings are immutable , but you can make and then change the content
//yes you create a new string and store changes in it as new String...
//Index starts from zero 0
//String always it double quotes " "
//In String to compare never  use String1 == String 2   ***** x *****
//Instead use String1.eqauls(String)
package com.company;

public class chw_14_string_methods {
    public static void main(String[] args) {
        String name = "Harsh";
/*      System.out.println(name);
        int value = name.length();
        System.out.println("Length of the string is : "+value);
        String lstring =  name.toLowerCase();
        System.out.println("to lower case : "+lstring);
        String ustring = name.toUpperCase();
        System.out.println("to upper case : "+ustring);
        System.out.println("Immutable Sting : "+name);  //Doesnt change after so many change because strings are immutable

 */
/*
        String untrimmed = "   harsh    khandgale";
        System.out.println(untrimmed); //this will display with the spaces
        String trimmed = untrimmed.trim();  //Trims only Spaces at the starting
        System.out.println(trimmed);


 */
        //Index starts from zero 0
 /*       String substring = name.substring(2);
        System.out.println("From 2nd letter till last letter : "+substring);
        String substring1 = name.substring(0,4);
        System.out.println(substring1); //here first is included but last is excluded read notes
  */

  /*
        //Replace
        String new_name =  name.replace('h', 'y');
        System.out.println(new_name);
        System.out.println("Immutable : "+name);

  */
   /*
        System.out.println(name.startsWith("har")); //will return false since it starts with Har
        System.out.println(name.endsWith("sh"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('r'));
        String modified = "harryrry";
        System.out.println(modified.indexOf("rry", 4));
        System.out.println(modified.lastIndexOf("r"));
        System.out.println(name.equals("harsh")); //will give false since it is Harsh
        //to ignore the case use name.equalsIgnorecase("harsh")
        System.out.println(name.equalsIgnoreCase("hArSh"));

    */

        //Escape Sequence for double quotes and back slash
 /*
        System.out.println("my name is \"harsh\" ");
        System.out.println("marks are 79\\100");
        System.out.println("hi there\nmy name is harsh bhai\nthank you");
        System.out.println("hi there\tmy name is harsh bhai");


  */



    }
}
