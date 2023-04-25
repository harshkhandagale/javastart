//Books Library
//methos:-
//addBook , issueBooks , returnBook , showAvailableBooks.
//properties :-
//array to store available books    , array to store issued books
package com.company;
class Library{
    String [] books;
    int no_of_books;
    Library(){
        this.books = new String[100]; //100 books it can store
        this.no_of_books = 0;        //initializing no.of.books from 0
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
//        System.out.println(book+"  has been added!");
    }
    void showAvailableBooks(){
        for (String book: this.books) {
            if (book == null){              //beacuse the string is of 100 and it will show null for all other values other than the books
                continue;
            }
            System.out.println("* "+book);
        }
    }
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
        System.out.println(book + " : book has been returned");
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("rich dad poor dad");
        centralLibrary.addBook("Jumanji");
        centralLibrary.addBook("titanic");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("Jumanji");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("Jumanji");
        centralLibrary.showAvailableBooks();

    }
}
