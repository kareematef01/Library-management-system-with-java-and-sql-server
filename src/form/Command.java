/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package form;

/**
 *
 * @author Kimo
 */
// Command Interface
interface Command {
    void execute();
}

// Receiver
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void borrow() {
        System.out.println("The book '" + title + "' has been borrowed.");
    }

    public void returnBook() {
        System.out.println("The book '" + title + "' has been returned.");
    }
}

// Concrete Commands
class BorrowBookCommand implements Command {
    private Book book;

    public BorrowBookCommand(Book book) {
        this.book = book;
    }

    @Override
    public void execute() {
        book.borrow();
    }
}

class ReturnBookCommand implements Command {
    private Book book;

    public ReturnBookCommand(Book book) {
        this.book = book;
    }

    @Override
    public void execute() {
        book.returnBook();
    }
}

// Invoker
class Librarian {
    public void executeCommand(Command command) {
        command.execute();
    }
}

// Main Class
//public class Library {
//    public static void main(String[] args) {
//        Book book = new Book("Clean Code");
//
//        Command borrowCommand = new BorrowBookCommand(book);
//        Command returnCommand = new ReturnBookCommand(book);
//
//        Librarian librarian = new Librarian();
//        librarian.executeCommand(borrowCommand);
//        librarian.executeCommand(returnCommand);
//    }
//}
