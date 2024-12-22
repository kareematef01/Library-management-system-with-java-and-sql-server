/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagement;



import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kimo
 */
public interface Observer {

    void update(String message);
}

class UserObserver implements Observer {

    private String userName;

    public UserObserver(String userName) {
        this.userName = userName;
    }

    public void update(String message) {
        System.out.println("User " + userName + " notified: " + message);
    }
}

class Book {

    private String title;
    private List<Observer> observers = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void borrow() {
        notifyObservers("The book " + title + " has been borrowed.");
    }

    public void returnBook() {
        notifyObservers("The book " + title + " has been returned.");
    }
}
