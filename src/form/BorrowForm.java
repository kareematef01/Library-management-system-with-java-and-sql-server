/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import classes.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Kimo
 */
public class BorrowForm extends javax.swing.JFrame {

    /**
     * Creates new form BorrowForm
     */
    String user;

    public BorrowForm(String name) {
        initComponents();
        user = name;
        //Connection Database
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        String query;
        Statement stmt = null;
        ResultSet result = null;
        ;
        try {

            stmt = connection.createStatement();
            query = "select title from book";
            result = stmt.executeQuery(query);

            while (result.next()) {
                cbxAvalibeBook.addItem(result.getString("title"));
            }

            stmt = connection.createStatement();
            query = "select title from borrow_book where userName ='" + user + "'";
            result = stmt.executeQuery(query);

            while (result.next()) {
                cbxBorrowBook.addItem(result.getString("title"));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ex) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception ex) {
                }
            }
            if (result != null) {
                try {
                    result.close();
                } catch (Exception ex) {
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxAvalibeBook = new javax.swing.JComboBox<>();
        cbxBorrowBook = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxAvalibeBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        cbxBorrowBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reading-35.png"))); // NOI18N
        jButton1.setText("Borrow");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Available Books");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Borrwed books");

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-return-35.png"))); // NOI18N
        jButton3.setText("Return");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reading-94.png"))); // NOI18N
        jLabel4.setText("Borrow book");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxAvalibeBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxBorrowBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addGap(96, 96, 96))))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxAvalibeBook, cbxBorrowBook});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxAvalibeBook, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxBorrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxAvalibeBook, cbxBorrowBook});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cbxavbook = (String) cbxAvalibeBook.getSelectedItem();
        String cbxborrow = (String) cbxBorrowBook.getSelectedItem();

        if (cbxavbook == null) {

            JOptionPane.showMessageDialog(this, " please select your book");

        }
        //Connection Database
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        String query;
        Statement stmt = null;
        ResultSet result = null;

        try {

            stmt = connection.createStatement();
            query = "select * from book where title='" + cbxavbook + "'";
            result = stmt.executeQuery(query);
            if (result.next()) {
                int id = result.getInt("id");
                String bookName = result.getString("title");
                String category = result.getString("category");
                JOptionPane.showMessageDialog(this, "select all done");

                stmt = connection.createStatement();
                query = "INSERT INTO borrow_book (title,category,userName) values ('" + bookName.trim() + "','" + category.trim() + "' , + '" + user.trim() + "')";
                int rowsAffected = stmt.executeUpdate(query);
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Successful borrow book");
                } else {
                    JOptionPane.showMessageDialog(this, "Borrow book failed");
                }

                stmt = connection.createStatement();
                query = "DELETE FROM book WHERE id = '" + id + "'";
                int rowsAffected3 = stmt.executeUpdate(query);
                if (rowsAffected3 > 0) {
                    JOptionPane.showMessageDialog(this, "Successful delete book");
                } else {
                    JOptionPane.showMessageDialog(this, "delete book failed");
                }

                stmt = connection.createStatement();
                query = "select title from book";
                result = stmt.executeQuery(query);
                cbxAvalibeBook.removeAllItems();
                while (result.next()) {
                    cbxAvalibeBook.addItem(result.getString("title"));
                }

                stmt = connection.createStatement();
                query = "select title from borrow_book where userName ='" + user + "'";
                result = stmt.executeQuery(query);
                cbxBorrowBook.removeAllItems();
                while (result.next()) {
                    cbxBorrowBook.addItem(result.getString("title"));
                }

                // observer and command (borrow)
                Book book = new Book(cbxavbook);
                Book2 book2 = new Book2(cbxavbook);
                UserObserver userObserver = new UserObserver(user);

                // Add observer to book2
                book2.addObserver(userObserver);

                // Create commands
                Command borrowCommand = new BorrowBookCommand(book);
               

                // Create librarian (Invoker)
                Librarian librarian = new Librarian();

                // Execute command (Borrow)
                librarian.executeCommand(borrowCommand);  // Borrow book using Command pattern
                book2.borrow();  // Notify observers using Observer pattern

              

            } else {
                JOptionPane.showMessageDialog(this, "no book selected");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ex) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception ex) {
                }
            }
            if (result != null) {
                try {
                    result.close();
                } catch (Exception ex) {
                }
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String cbxavbook = (String) cbxAvalibeBook.getSelectedItem();
        String cbxborrow = (String) cbxBorrowBook.getSelectedItem();

        if (cbxborrow == null) {

            JOptionPane.showMessageDialog(this, " please select borrow book");

        }
        //Connection Database
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        String query;
        Statement stmt = null;
        ResultSet result = null;

        try {

            stmt = connection.createStatement();
            query = "SELECT * FROM borrow_book WHERE title='" + cbxborrow + "' AND userName= '" + user + "'";
            result = stmt.executeQuery(query);
            if (result.next()) {
                int id = result.getInt("id");
                String bookName = result.getString("title");
                String category = result.getString("category");
                JOptionPane.showMessageDialog(this, "select all done");

                stmt = connection.createStatement();
                query = "INSERT INTO book (title,category) values ('" + bookName.trim() + "','" + category.trim() + "' )";
                int rowsAffected = stmt.executeUpdate(query);
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Successful return book");
                } else {
                    JOptionPane.showMessageDialog(this, "return book failed");
                }

                stmt = connection.createStatement();
                query = "DELETE FROM borrow_book WHERE id ='" + id + "'";
                rowsAffected = stmt.executeUpdate(query);
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Successful delete book");
                } else {
                    JOptionPane.showMessageDialog(this, "delete book failed");
                }

                stmt = connection.createStatement();
                query = "select title from book";
                result = stmt.executeQuery(query);
                cbxAvalibeBook.removeAllItems();
                while (result.next()) {
                    cbxAvalibeBook.addItem(result.getString("title"));
                }

                stmt = connection.createStatement();
                query = "select title from borrow_book where userName ='" + user + "'";
                result = stmt.executeQuery(query);
                cbxBorrowBook.removeAllItems();
                while (result.next()) {
                    cbxBorrowBook.addItem(result.getString("title"));
                }
                result.close();

                //  observer and Command ( return )
                 // Create book and observer
        Book book = new Book(cbxborrow);
        Book2 book2 = new Book2(cbxborrow);
        UserObserver userObserver = new UserObserver(user);

        // Add observer to book2
        book2.addObserver(userObserver);

        // Create commands
        Command returnCommand = new ReturnBookCommand(book);

        // Create librarian (Invoker)
        Librarian librarian = new Librarian();

        // Execute command (Return)
        librarian.executeCommand(returnCommand);  // Return book using Command pattern
        book2.returnBook();  // Notify observers using Observer pattern

            } else {
                JOptionPane.showMessageDialog(this, "no book selected");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ex) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception ex) {
                }
            }
            if (result != null) {
                try {
                    result.close();
                } catch (Exception ex) {
                }
            }
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BorrowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxAvalibeBook;
    private javax.swing.JComboBox<String> cbxBorrowBook;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
