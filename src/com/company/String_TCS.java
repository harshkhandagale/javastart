//Character.isUpperCase(st.charAt(i))
//Character.toUpperCase(st.charAt(i)
//Character.isDigit(st.charAt(i))
//Character.getNumericValue(st.charAt(i)

package com.company;

import java.util.Scanner;

public class String_TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        //check wheather vowel or consonant
        boolean IsLowVowel = false;
        boolean IsUppVowel = false;
        System.out.println("enter a char");
        char alpha = sc.next().charAt(0);
        if (alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' ||alpha=='u'){
            IsLowVowel = true;
        }
        if (alpha=='A' || alpha=='E' || alpha=='I' || alpha=='O' ||alpha=='U'){
            IsUppVowel = true;
        }
        if (alpha>='a'&&alpha<='z' || alpha>='A'&&alpha<='Z' ){
            System.out.println("Valid input");
            if (IsLowVowel==true || IsUppVowel==true){
                System.out.println("it is a vowel");
            }
            else {
                System.out.println("it is a consonant");
            }
        }
        else {
            System.out.println("Invalid input");
        }
 */

/*
        //check alphabet is char or not
        System.out.println("enter Something");
        char alp = sc.next().charAt(0);
        if (alp>='a' && alp<='z' || alp>='A' && alp<='Z'){
            System.out.println("it is alphabet");
        }
        else {
            System.out.println("not alphabet");
        }
 */

/*
        //Find ASCII value of a char
        System.out.println("enter alphabet to find its ascii value");
        char alp = sc.next().charAt(0);
        if (alp>='a' && alp<='z' || alp>='A' && alp<='Z'){
            System.out.println("ASCII value of "+alp+" is "+(int)alp);
        }
 */
/*
        //length of the string without str.len()
        String st = "Harsh";
        char[] d = st.toCharArray();        //converting to char Array type
        int length=0;
        for (int i =0;i<d.length;i++){
            length++;
        }
        System.out.println(length);
 */

/*
        //Toggle each char in String
        //i.e if uppercase make it lower and vise versa
        String st ="HarSh";
        String s = "";
        for (int i=0;i<st.length();i++){
            if (Character.isUpperCase(st.charAt(i))){
                s+= Character.toLowerCase(st.charAt(i));
            }
            else {
                s+=Character.toUpperCase(st.charAt(i));
            }
        }
        System.out.println(s);
 */

/*
        //count the number of vowels
        String st ="Aeronomous";
        String s =st.toLowerCase();
        int count =0;
        for (int i =0;i<s.length();i++){
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(st);
 */

/*
        //Remove vowels from String
         String st ="AeronomeuosHarsh";
        String s = "";
        s= st.replaceAll("[aeiuo]","");
        System.out.println(s);
 */
/*
        //check if String is Palindrom or not
        //first reverse the String and then check with the original one
        String st ="arora";
        String s ="";
        for (int i =st.length()-1;i>=0;i--){
            s+=st.charAt(i);
        }
        if (st.equals(s)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
 */

/*
        //Print String in reverse Order
        String st ="harsh";
        String s ="";
        for (int i=st.length()-1;i>=0;i--){
            s+=st.charAt(i);
        }
        System.out.println("Reversed String : "+s);
 */

/*
        //Remove all characters except Alphabet
        String st ="@Har9sh125";
        String s ="";
        for (int i =0;i<st.length();i++){
            if (st.charAt(i)>='a' && st.charAt(i)<='z'||st.charAt(i)>='A' && st.charAt(i)<='Z'){
                s+=st.charAt(i);
            }
        }
        System.out.println(s);
 */

/*
        //remove Spaces from String
        String st ="ha   rs  h";
        System.out.println("Old String : "+st);
        String s ="";
        s+=st.replace(" ",s);
        System.out.println("New String : "+s);
 */

/*
        //Remove brackets from algebraic expression
        String st = "{[a+b(e)]*[a-b(c*d)]}";
        String s ="";
        String s1 ="";
        String s2 ="";
        s+= st.replaceAll("[{}()]","");
        s1+=s.replace("[","");
        s2+=s1.replace("]","");
        System.out.println(s2);
 */

/*
        //Count Sum of numbers in string
        String st ="harsh12kha6nda1gle34";
        String s="";
        int sum =0;
        for (int i =0;i<st.length();i++){
            if (Character.isDigit(st.charAt(i))){
                sum+=Character.getNumericValue(st.charAt(i));
            }
        }
        System.out.println(sum);
 */
//*************************  SPLIT AND MAKING STRING --> ARRAY  ***************************
/*
        String str = "Hello:world:hello";
        String split[] = str.split("e", 2); //here the string will be shown 2 times and e will be gone if we put 3, the string will be shown 3 time on after other har time spliting from e, max limit here will be 3, because there are 3 e in this sentence
        for (String s: split)
            System.out.println(s);
 */
//********************************** DONE IT  *************************

/*
        //Make First and Last letter capital
        String str="hi my name is harsh";
        int count =0;
        String [] strArr = str.split(" ");
        for (int i =0;i< strArr.length;i++){
            String sub = strArr[i].substring(1);
            char ch = strArr[i].charAt(0);
            System.out.print((char)(ch-32) + sub+" ");
        }
*/


/*
        //Frequency of characters
        System.out.println("Enter a String");
        String st = sc.nextLine();
        String s = st.toLowerCase();

        for (char ch ='a'; ch<='z';ch++){
            int count =0;
            for (int i=0;i<s.length();i++){
                if (ch == s.charAt(i)){
                    count++;
                }
            }
            //We dont want char occuring zero times
            if (count>=1){
                System.out.println(ch+"\t"+count);
            }
        }
 */

//*************************  CONVERTING STRING TO ARRAY ***********************************
/*
        //1--> by split method
        String str = "My name is harsh";
        String [] strArray = str.split(" "); //spliting , where there are spaces
        for (int i =0;i< strArray.length;i++){
            System.out.println(strArray[i]);
        }
 */
/*
        //2-->Arrays method
        String str = "My name is harsh";
        String[] strArray = new String[] {str};
        System.out.println(Arrays.toString(strArray));
        for (int i =0;i< strArray.length;i++){
            System.out.println(strArray[i]);
        }
 */

/*
        //Repalce a substring and print new string
        System.out.println("enter a string");
        String s1 =sc.nextLine();
        System.out.println("enter string to replace");
        String oldString = sc.nextLine();
        System.out.println("enter what to put instead of that ");
        String newString = sc.nextLine();
        String replaceString = s1.replace(oldString,newString);
        System.out.println("Your new string is : "+replaceString);
 */
/*
        //Anagram or not............Arrays.sort method
        String st = "prep";
        String sy = "repp";
        char [] charArr = st.toCharArray();
        char [] charArr1 = sy.toCharArray();
        Arrays.sort(charArr);
        Arrays.sort(charArr1);
        if (Arrays.equals(charArr,charArr1)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
 */
/*
        //Replace Substring in a String
        String str = "my name is harsh";
        System.out.println(str);
        System.out.println("Enter what you want to replace in above string");
        String st = sc.nextLine();
        System.out.println("enter new text");
        String sy = sc.nextLine();
        String sw = str.replace(st,sy);
        System.out.println(sw);
 */











    }
}
