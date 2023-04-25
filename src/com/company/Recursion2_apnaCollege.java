package com.company;

import java.util.HashSet;
import java.util.SplittableRandom;

public class Recursion2_apnaCollege {
/*
    //Tower of hanoi
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n==1){
            System.out.println("transfered disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);           //for n-1 disk helper become destination
        System.out.println("transfered disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
 */
/*
    //Print reverse string
    public static void printRev(String str, int index){
        if (index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printRev(str, index-1);
    }
 */
/*
    //First and last occurence
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int index, char element){
        if (index== str.length()){
            System.out.println("First occurence of "+element+" is at "+first+"th  position");
            System.out.println("First occurence of "+element+" is at "+last+"th  position");
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == element){
            if (first == -1){                   //if first character is unknown or uninitialized
                first = index;
            }
            else {
                last = index;
            }
        }
        findOccurence(str, index+1,element);
    }
 */

/*
    //Is sorted or not (Strictly ascending)
    public static boolean isSorted(int arr[], int index){
        if (index==arr.length-1){
            return true;
        }

        if (arr[index]<arr[index+1]){
            //array is sorted till now ...
            return isSorted(arr, index+1);      //return is used for other calls
        }
        else {
            return false;
        }
    }
 */
/*
    //Move all 'x' to the end of the string
    public static void moveAllX(String str, int idx, int count, String newStr){
        if (idx == str.length()){
            for (int i =0; i<count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newStr);
        }
        else {
            newStr += currChar;
            moveAllX(str, idx+1, count, newStr);
        }
    }
 */
/*
    //Remove duplicates
    public static boolean [] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newStr){
        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar -'a'] == true){        //true -> repeated value
                                                //false -> new value
            removeDuplicates(str, idx+1, newStr);
        }
        else {
            newStr += currChar;
            map[currChar - 'a'] = true;  // store true in new value now, for other simlar values hence forth
            removeDuplicates(str, idx+1, newStr);
        }
    }
 */
/*
    //Print Subsequence **************IMP****************
    public static void subSequence(String str, int idx, String newStr){
        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);

        //to be
        subSequence(str, idx+1, newStr+currChar);    //willreturn with added new char

        //not to be
        subSequence(str, idx+1, newStr);
    }
 */
/*
    //Print UNIQUE Subsequence **************IMP****************
    public static void subSequence(String str, int idx, String newStr, HashSet<String>set){
        if (idx == str.length()){
            if (set.contains(newStr)){
                return;
            }
            else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);

        //to be
        subSequence(str, idx+1, newStr+currChar, set);    //willreturn with added new char

        //not to be
        subSequence(str, idx+1, newStr, set);
    }
 */
/*
    //Keypad combination
    public static String[] keyPad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    //Here String str in the number string
    public static void printCombination(String str, int idx, String combination){
        if (idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);  //here 23 therefore at 0th index -> 2...remeber numbers are string here
        String mapping = keyPad[currChar - '0'];  //eg:- 2-0=2 i.e it will give "def"....mapping is storing the alphabets

        for (int i =0; i<mapping.length();i++){
            printCombination(str, idx+1, combination+mapping.charAt(i));
        }
    }
 */






    public static void main(String[] args) {

/*
        //Tower of hanoi
        int n =2;
        towerOfHanoi(n,"S","H", "D");
 */
/*
        //Print reverse string
        String str = "abcd";
        printRev(str,str.length()-1);
 */
/*
        //First and last occurence
        String str = "abaacdaefaah";
        findOccurence(str, 0, 'a');
 */
/*
        //Is sorted or not (Strictly ascending)
        int arr [] = {1,3,3,5};
        System.out.println( isSorted(arr, 0));;
 */
/*
        //Move all 'x' to the end of the string
        String str = "axbcxxd";
        moveAllX(str, 0,0,"");
 */
/*
        //Remove duplicates
        String str = "abbccda";
        removeDuplicates(str, 0,"");
 */
/*
        //Print Subsequence
        subSequence("abc", 0, "");
 */
/*
        //Print UNIQUE Subsequence  -->here used hashset
        String str ="aaa";
        HashSet<String> set = new HashSet<>();  //takes only unqiue values
        subSequence(str, 0, "", set);
 */
/*
        //Keypad combination
        String str = "23";
        printCombination(str, 0,"");
 */








    }
}
