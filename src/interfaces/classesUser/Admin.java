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
public class Admin implements users{
     @Override
     public void displayRole() {
        System.out.println("User Role: Admin");
    }
}
