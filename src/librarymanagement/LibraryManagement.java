/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagement;

import classes.Logger;
import form.login_form;

/**
 *
 * @author Kimo
 */
public class LibraryManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login_form f1 = new login_form();
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        
        
         // Logger
        Logger logger = Logger.getInstance();
        logger.log("Library Management System Started.");
      

    }
}


