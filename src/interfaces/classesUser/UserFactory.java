/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces.classesUser;

import interfaces.users;

/**
 *
 * @author Kimo
 */
public class UserFactory {
    public static users getUser(String role) {
        if (role == null) {
            return null;
        }
        switch (role.toLowerCase()) {
            case "admin":
                return new Admin();
                case "user":
                return new user();
            case "regular":
                return new Regular();
            default:
                return null;
        }
    }
}
