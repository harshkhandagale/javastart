//Create a class Game, which allows a user to play "Guess the Number" game once.
//
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!


package com.company;
import java.util.Scanner;
import java.util.Random;

class Game{
    int number;
    int input_number;
    public int noOfGuesses=0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        this.input_number = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses ++;
        if (input_number==number){
            System.out.format("you guessed it right it was %d, you guessed in %d attepmts", number, noOfGuesses);
            return true;
        }
        else if (input_number<number){
            System.out.println("to Small number\n");
        }
        else if (input_number>number){
            System.out.println("to big number\n");
        }
        return false;
    }
}

public class Exersice3 {
    public static void main(String[] args) {
        Game g1 = new Game();
        boolean b = false;
        while(!b){
            g1.takeUserInput();
            b = g1.isCorrectNumber();  //unless the b becomes true, takeUserInput...jo paryant b madhi true store hot nahi to paryant takeUserInput
        }

    }
}
