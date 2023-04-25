//*************************  EXERCISE 4  ***********************************
//Books Library
//methos:-
//addBook , issueBooks , returnBook , showAvailableBooks.
//properties :-
//array to store available books    , array to store issued books

//**************************** EXERCISE 3  *********************************
//Create a class Game, which allows a user to play "Guess the Number" game once.
//
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!


package com.company;
/*
//*************************  EXERCISE 4  ***********************************
class LibraryP{
    //books are storing in this i.e this.books
    String [] books;
    int no_of_books;

    //constructor
    LibraryP(){
        this.books = new String[100];
        no_of_books=0;
    }
    //add book...
    void addBook(String book){
        //this book will store in this.books[with that it will be assigned value or index]
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+"  has been added!");
    }
    //showAvailable books
    void showAvailableBooks(){
        //for each book in this.books
        for (String book : this.books) {
            if (book == null){              //beacuse the string is of 100 and it will show null for all other values other than the books
                continue;
            }
            System.out.println("* "+book);
        }
    }
    //issueBook
    void issueBook(String book){
        for (int i =0 ; i<this.books.length; i++){
            if (this.books[i]==book){
                System.out.println("The book has been issued!");
                this.books[i] = null;    //to empty the book from the shelf
                return;
            }
        }
        System.out.println("this book does not exist!");
    }
    void returnBook(String book){
        addBook(book);
        System.out.println("the book has been returned");

    }
}
 */

import java.util.Random;
import java.util.Scanner;

//**************************** EXERCISE 3  *********************************
class GameP{
    int number;
    int input_number;
    int no_of_guesses=0;
    public int getNoOfGuesses(){
           return no_of_guesses;
    }
    //constructor
    GameP(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number ");
        Scanner sc = new Scanner(System.in);
        this.input_number = sc.nextInt();
    }
    boolean isCorrectNumber(){
        no_of_guesses++;
        if (number==input_number){
            System.out.format("you guessed it right it was %d, you guessed in %d attepmts", number, no_of_guesses);
            return true;
        }
        else if (input_number<number){
            System.out.println("too Samll number\n");
        }
        else if (input_number>number){
            System.out.println("too big number\n");
        }
        return false;
    }

}


public class weekend_excercise_practice {
    public static void main(String[] args) {
/*
        //*************************  EXERCISE 4  ***********************************
        LibraryP l1 = new LibraryP();
        l1.addBook("Harry Potter");
        l1.addBook("Shaolin master");
        l1.addBook("Titanic");
        l1.addBook("Peter parker");
        l1.showAvailableBooks();
        l1.issueBook("Harry Potter");
        l1.showAvailableBooks();
        l1.returnBook("Harry potter");
        l1.showAvailableBooks();
 */
        //**************************** EXERCISE 3  *********************************

        GameP g1 = new GameP();
        boolean b = false;
        while (!b){
            g1.takeUserInput();
            b = g1.isCorrectNumber();
        }






    }

}
