/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingmall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static shoppingmall.HireBabysitter.username;
import static shoppingmall.MainMenu.username;

/**
 *
 * @author MH
 */
public class OneTimeVisitor extends javax.swing.JFrame {
    public static String connectionUrl;
    public static Connection con = null;
    public static java.sql.Statement stmt = null;

    /**
     * Creates new form OneTimeVisitor
     */
    
    public static String username=null;
    
    public OneTimeVisitor() {
        initComponents();
        setSize(905,480);
        connectDb();
    }
    
    public OneTimeVisitor(String myusername) {
        username = myusername;
        System.out.println("This is OneTimeVisitor, your username is: "+username);
        initComponents();
        setSize(905,480);
        connectDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visitdate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        kidsnb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hourcame = new javax.swing.JTextField();
        mincame = new javax.swing.JTextField();
        hourleft = new javax.swing.JTextField();
        minleft = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        visit_table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(visitdate);
        visitdate.setBounds(60, 135, 166, 22);

        jLabel1.setText("Date (YYYY-MM-DD)");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 112, 114, 16);

        kidsnb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidsnbActionPerformed(evt);
            }
        });
        getContentPane().add(kidsnb);
        kidsnb.setBounds(60, 367, 63, 22);

        jLabel2.setText("Number of kids");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 344, 86, 16);

        hourcame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourcameActionPerformed(evt);
            }
        });
        getContentPane().add(hourcame);
        hourcame.setBounds(60, 221, 63, 22);
        getContentPane().add(mincame);
        mincame.setBounds(171, 221, 61, 22);
        getContentPane().add(hourleft);
        hourleft.setBounds(60, 304, 63, 22);
        getContentPane().add(minleft);
        minleft.setBounds(171, 304, 61, 22);

        jLabel3.setText("Check-in time");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 175, 78, 16);

        jLabel4.setText("MIN (MM)");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(171, 198, 56, 16);

        jLabel5.setText("HOUR (HH)");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 284, 63, 16);

        jLabel6.setText("MIN (MM)");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(171, 284, 56, 16);

        jButton1.setText("Visit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 396, 57, 25);

        visit_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Visit Date", "Total Number of Kids", "Total Number of Hours", "Total Fee Paid"
            }
        ));
        jScrollPane1.setViewportView(visit_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(351, 141, 540, 140);

        jButton2.setText("Retrieve information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(742, 304, 149, 25);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(832, 396, 59, 25);

        jLabel7.setBackground(new java.awt.Color(255, 204, 102));
        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("ONE TIME VISITOR");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(340, 10, 230, 33);

        jLabel8.setBackground(new java.awt.Color(255, 204, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setText("Welcome! The fee per kid per hour for a visit is 4$.");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 40, 460, 22);

        jLabel9.setText("HOUR (HH)");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 198, 63, 16);

        jLabel10.setText("Check-out time");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 261, 86, 16);

        jLabel11.setBackground(new java.awt.Color(255, 204, 102));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Your visits will show below:");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(350, 120, 170, 17);

        jLabel12.setBackground(new java.awt.Color(255, 204, 102));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Enter you information to visit the playground");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(60, 89, 280, 17);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\CMPS Images\\30.jpg")); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, -10, 910, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kidsnbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidsnbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kidsnbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VisitPlayground();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ListVisitInfo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        PlaygroundMenu pmenu = new PlaygroundMenu(username);
        pmenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void hourcameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourcameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hourcameActionPerformed

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
            java.util.logging.Logger.getLogger(OneTimeVisitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OneTimeVisitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OneTimeVisitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OneTimeVisitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OneTimeVisitor().setVisible(true);
            }
        });
    }
    
         private void connectDb () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //java.io.File file  = new java.io.File("UserPass.txt");
            //Scanner input = new Scanner (file);
            //String username = input.nextLine();
            //System.out.println(username);
            //String password = input.nextLine();
            //System.out.println(password);
            connectionUrl = "jdbc:mysql://localhost/shoppingmall?serverTimezone=UTC&" + "user=" + "root" + "&password=" + "root";
            con = DriverManager.getConnection(connectionUrl);
            stmt = con.createStatement();
        }
        catch (SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }
        catch (ClassNotFoundException cE) {
            System.out.println("Class Not Found Exception: "+ cE.toString());
        }
    }
    
    private void VisitPlayground() {
        try {
            String date=null, total_hours_str =null, kids_nb_str=null, adults_nb_str=null, mycash_str=null;
            int visit_id=-1;
            
            date = visitdate.getText();
            
            kids_nb_str = kidsnb.getText();
            int kids_nb = Integer.parseInt(kids_nb_str);
            
            String hour_came_str = hourcame.getText();
            int hour_came = Integer.parseInt(hour_came_str);
            String min_came_str = mincame.getText();
            int min_came = Integer.parseInt(min_came_str);
            String hour_left_str = hourleft.getText();
            int hour_left = Integer.parseInt(hour_left_str);
            String min_left_str = minleft.getText();
            int min_left = Integer.parseInt(min_left_str);

            int totaltime = (int)((hour_left - hour_came)*60 + min_came + min_left)/60;
            String checkintime=hour_came_str+":"+min_came_str+":00";
            String checkouttime=hour_left_str+":"+min_left_str+":00";
            
            float payment_due = (float) kids_nb*4*totaltime;
            
            String query = "SELECT cash_balance " +
                    "FROM visitor " + 
                    "WHERE visitor_username = '" + username + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                mycash_str = rs.getString(1);
            }  
            float mycash = Float.parseFloat(mycash_str);
            if (payment_due > mycash) {
                JOptionPane optionPane = new JOptionPane("You do not have enough cash to reserve the playground.");
                JDialog dialog = optionPane.createDialog("WARNING!");
                dialog.setAlwaysOnTop(this.isAlwaysOnTopSupported());
                dialog.setVisible(true);
                return;
            }
            else {
                JOptionPane optionPane = new JOptionPane("You have successfuly visited the playground!");
                JDialog dialog = optionPane.createDialog("SUCCESS!");
                dialog.setAlwaysOnTop(this.isAlwaysOnTopSupported());
                dialog.setVisible(true);
            }
            String update = "UPDATE visitor " +
                    "SET cash_balance = cash_balance - " + payment_due + " " +
                    "WHERE visitor_username = '" + username + "' AND cash_balance >= " + payment_due;
            int temp = stmt.executeUpdate(update);
            
            String insert = "INSERT INTO kids_playground (visit_type) VALUES ('visit')";  
            temp = stmt.executeUpdate(insert);
            
            query = "SELECT visit_id " +
                    "FROM kids_playground";
            
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                visit_id = rs.getInt(1);
            }
            
            insert = "INSERT INTO one_time_visitor (visit_id, visitor_username, visit_date, nb_of_kids, check_in_time, check_out_time, totalfee) VALUES " +
                     "(" + visit_id + ", '" + username + "', '" + date + "', " + kids_nb + ", '" + checkintime + 
                     "', '" + checkouttime + "', " + payment_due + ")";
            temp = stmt.executeUpdate(insert);
            
            ListVisitInfo();
    }
    catch (SQLException e){
        System.out.println("SQL Exception: "+ e.toString());
    }
}
    
    private void ListVisitInfo() {
    try {
        DefaultTableModel model = (DefaultTableModel) visit_table.getModel();
        model.setRowCount(0);
        String query = "SELECT visit_date, check_in_time, check_out_time, nb_of_kids " +
                            "FROM one_time_visitor " + 
                            "WHERE visitor_username = '" + username + "'";
            ResultSet rs = stmt.executeQuery(query);
             while (rs.next()) {
                String visitdate = rs.getString(1);
                String checkin_str = rs.getString(2);
                String checkout_str = rs.getString(3);
                int nbkids = rs.getInt(4);
                char[] starttemp = new char[8];
                char[] endtemp = new char[8];
                for (int i = 0; i <= 7; i++) { 
                    starttemp[i]=checkin_str.charAt(i);
                    endtemp[i]=checkout_str.charAt(i);
                    //System.out.println(i+ " "+starttemp[i]);
                }
                char[] checkin_char = new char[2]; 
                char[] checkout_char = new char[2];

                for (int i = 0; i <= 1; i++) { 
                    checkin_char[i] = starttemp[i]; 
                    checkout_char[i] = endtemp[i] ; 
                }

                float starttime = (float) Integer.parseInt(new String(checkin_char));
                float endtime = (float) Integer.parseInt(new String(checkout_char));

                float totalhours = endtime - starttime;
                
                float payment_due=(float) nbkids*totalhours*4;
                
                model = (DefaultTableModel) visit_table.getModel();
                model.addRow(new Object[]{visitdate, nbkids, totalhours, payment_due});
                visit_table.setModel(model);
        }
    }
        catch (SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hourcame;
    private javax.swing.JTextField hourleft;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kidsnb;
    private javax.swing.JTextField mincame;
    private javax.swing.JTextField minleft;
    private javax.swing.JTable visit_table;
    private javax.swing.JTextField visitdate;
    // End of variables declaration//GEN-END:variables
}
