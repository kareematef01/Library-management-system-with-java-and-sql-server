/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces.classesBook;

import interfaces.Book;

/**
 *
 * @author Kimo
 */
public class SoftwareEngineeringBook implements Book {
    @Override
    public void displayDetails() {
        System.out.println("Book: Software Engineering");
    }
}
