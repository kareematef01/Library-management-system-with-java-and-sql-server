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
public class BookFactory {
    public static Book getBook(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "software engineering":
                return new SoftwareEngineeringBook();
            case "management":
                return new ManagementBook();
            case "artificial intelligence":
                return new ArtificialIntelligenceBook();
            default:
                return null;
        }
    }
}
