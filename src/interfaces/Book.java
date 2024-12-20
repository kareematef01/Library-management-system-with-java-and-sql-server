package interfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Kimo
 */
public interface Book {
     void displayDetails();
}


// class SoftwareEngineeringBook implements Book {
//    @Override
//    public void displayDetails() {
//        System.out.println("Book: Software Engineering");
//    }
//}
//
//class ManagementBook implements Book {
//    @Override
//    public void displayDetails() {
//        System.out.println("Book: Management");
//    }
//}
//
//public class ArtificialIntelligenceBook implements Book {
//    @Override
//    public void displayDetails() {
//        System.out.println("Book: Artificial Intelligence");
//    }
//}
//
//
// class BookFactory {
//    public static Book getBook(String type) {
//        if (type == null) {
//            return null;
//        }
//        switch (type.toLowerCase()) {
//            case "software engineering":
//                return new SoftwareEngineeringBook();
//            case "management":
//                return new ManagementBook();
//            case "artificial intelligence":
//                return new ArtificialIntelligenceBook();
//            default:
//                return null;
//        }
//    }
//}
