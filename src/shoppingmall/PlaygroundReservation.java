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
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static shoppingmall.MainMenu.username;
import static shoppingmall.PlaygroundMenu.username;


/**
 *
 * @author MH
 */
public class PlaygroundReservation extends javax.swing.JFrame {
        public static String connectionUrl;
        public static Connection con = null;
        public static Statement stmt = null;
    /**
     * Creates new form PlaygroundReservation
     */
        
    public static String username=null;    
        
    public PlaygroundReservation() {
        initComponents();
        setSize(875,510);
        connectDb();
    }
    
    public PlaygroundReservation(String myusername) {
        username = myusername;
        System.out.println("This is PlaygroundReservation, your username is: "+username);
        initComponents();
        setSize(875,510);
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

        jLabel1 = new javax.swing.JLabel();
        eventtype = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        resdate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        totalhours = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kidsnb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        adultsnb = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationinfo_table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Event type");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(93, 133, 59, 16);
        getContentPane().add(eventtype);
        eventtype.setBounds(93, 156, 59, 22);

        jLabel2.setText("Reservation date (YYYY-MM-DD)");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(93, 70, 184, 16);
        getContentPane().add(resdate);
        resdate.setBounds(93, 93, 59, 22);

        jLabel3.setText("Total number of hours");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(93, 196, 128, 16);
        getContentPane().add(totalhours);
        totalhours.setBounds(93, 219, 138, 22);

        jLabel4.setText("Total number of kids");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(93, 259, 118, 16);
        getContentPane().add(kidsnb);
        kidsnb.setBounds(93, 282, 138, 22);

        jLabel5.setText("Total number of adults");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(93, 325, 130, 16);

        adultsnb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultsnbActionPerformed(evt);
            }
        });
        getContentPane().add(adultsnb);
        adultsnb.setBounds(93, 348, 138, 22);

        jButton1.setText("Reserve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(198, 388, 79, 25);

        reservationinfo_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Type", "Reservation Date", "Total Fee Paid"
            }
        ));
        jScrollPane1.setViewportView(reservationinfo_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(341, 135, 502, 140);

        jButton2.setText("Retrieve information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(694, 282, 149, 25);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(794, 426, 59, 25);

        jLabel6.setBackground(new java.awt.Color(255, 204, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setText("Welcome! For a reservation: fee per kid per hour is 5$, fee per adult per hour is 8$.");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 40, 760, 22);

        jLabel7.setBackground(new java.awt.Color(255, 204, 102));
        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("PLAYGROUND RESERVATION");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 10, 360, 33);

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoppingmall/38.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, -130, 870, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ReservePlayground();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ListReservationInfo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        PlaygroundMenu pmenu = new PlaygroundMenu(username);
        pmenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void adultsnbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultsnbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adultsnbActionPerformed

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
            java.util.logging.Logger.getLogger(PlaygroundReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaygroundReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaygroundReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaygroundReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaygroundReservation().setVisible(true);
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
    
    private void ReservePlayground() {
        try {
            String previousvisit=null, total_hours_str =null, kids_nb_str=null, adults_nb_str=null, mycash_str=null;
            int visit_id=-1;
            String event_type = eventtype.getText();
            String reservation_date = resdate.getText();
            total_hours_str = totalhours.getText();
            kids_nb_str = kidsnb.getText();
            adults_nb_str = adultsnb.getText();
            int total_hours = Integer.parseInt(total_hours_str);
            int kids_nb = Integer.parseInt(kids_nb_str);
            int adults_nb = Integer.parseInt(adults_nb_str);
            
            int payment_due = (kids_nb*5+adults_nb*8)*total_hours;
            
            String query = "SELECT visit_id " +
                           "FROM reservation " + 
                           "WHERE reservation_date = '" + reservation_date + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                previousvisit = rs.getString(1);
            }
            if (previousvisit != null) {
                JOptionPane optionPane = new JOptionPane("The playground is already reserved on this day.");
                JDialog dialog = optionPane.createDialog("WARNING!");
                dialog.setAlwaysOnTop(this.isAlwaysOnTopSupported());
                dialog.setVisible(true);
                return;
            }
            query = "SELECT cash_balance " +
                    "FROM visitor " + 
                    "WHERE visitor_username = '" + username + "'";
            rs = stmt.executeQuery(query);
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
                JOptionPane optionPane = new JOptionPane("You have successfuly reserved the playground!");
                JDialog dialog = optionPane.createDialog("SUCCESS!");
                dialog.setAlwaysOnTop(this.isAlwaysOnTopSupported());
                dialog.setVisible(true);
            }
            String update = "UPDATE visitor " +
                    "SET cash_balance = cash_balance - " + payment_due + " " +
                    "WHERE visitor_username = '" + username + "' AND cash_balance >= " + payment_due;
            int temp = stmt.executeUpdate(update);
            
            String insert = "INSERT INTO kids_playground (visit_type) VALUES ('reservation')";  
            temp = stmt.executeUpdate(insert);
            
            query = "SELECT visit_id " +
                    "FROM kids_playground";
            
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                visit_id = rs.getInt(1);
            }
            
            insert = "INSERT INTO reservation (visit_id, visitor_username, event_type, reservation_date, total_hours, kids_nb, adults_nb, totalfee) VALUES " +
                     "(" + visit_id + ", '" + username + "', '" + event_type + "', '" + reservation_date + "', " + total_hours + 
                     ", " + kids_nb + ", " + adults_nb + ", " + payment_due + ")";
            temp = stmt.executeUpdate(insert);
            
            ListReservationInfo();
    }
    catch (SQLException e){
        System.out.println("SQL Exception: "+ e.toString());
    }
}

private void ListReservationInfo() {
    try {
        DefaultTableModel model = (DefaultTableModel) reservationinfo_table.getModel();
        model.setRowCount(0);
        String query = "SELECT event_type, reservation_date, total_hours, kids_nb, adults_nb,  kid_hour_fee, adult_hour_fee " +
                            "FROM reservation " + 
                            "WHERE visitor_username = '" + username + "'";
            ResultSet rs = stmt.executeQuery(query);
             while (rs.next()) {
                String eventtype = rs.getString(1);
                String rsvdate = rs.getString(2);
                int totalhrs = rs.getInt(3);
                int kidsnb = rs.getInt(4);
                int adultsnb = rs.getInt(5);
                int feekid = rs.getInt(6);
                int feeadult = rs.getInt(7);
                int payment_due=((kidsnb*feekid)+(adultsnb*feeadult))*totalhrs;
                model = (DefaultTableModel) reservationinfo_table.getModel();
                model.addRow(new Object[]{eventtype, rsvdate, payment_due});
                reservationinfo_table.setModel(model);
        }
    }
        catch (SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adultsnb;
    private javax.swing.JTextField eventtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kidsnb;
    private javax.swing.JTextField resdate;
    private javax.swing.JTable reservationinfo_table;
    private javax.swing.JTextField totalhours;
    // End of variables declaration//GEN-END:variables
}