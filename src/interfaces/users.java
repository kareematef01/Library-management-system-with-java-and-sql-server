/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author Kimo
 */
public interface users {
      void displayRole();
}


//class Admin implements users {
//    public void displayRole() {
//        System.out.println("User Role: Admin");
//    }
//}

//class Regular implements users {
//    public void displayRole() {
//        System.out.println("User Role: Regular ");
//    }
//}

//class user implements users {
//    public void displayRole() {
//        System.out.println("User Role: user ");
//    }
//}

// User Factory
//class UserFactory {
//    public static users getUser(String role) {
//        if (role == null) {
//            return null;
//        }
//        switch (role.toLowerCase()) {
//            case "admin":
//                return new Admin();
//                case "user":
//                return new user();
//            case "regular":
//                return new Regular();
//            default:
//                return null;
//        }
//    }
//}
