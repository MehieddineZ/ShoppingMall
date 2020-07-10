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
import static shoppingmall.MovieSearch.stmt;
import static shoppingmall.MovieSearch.username;
import static shoppingmall.SeasonalEvents.con;
import static shoppingmall.SeasonalEvents.connectionUrl;
import static shoppingmall.SeasonalEvents.stmt;
import static shoppingmall.SeasonalEvents.username;

/**
 *
 * @author MH
 */
public class EventRecommendation extends javax.swing.JFrame {
    public static String connectionUrl;
    public static Connection con = null;
    public static java.sql.Statement stmt = null;
    
    

    /**
     * Creates new form EventRecommendation
     */
    
    public static String username=null;
    
    public EventRecommendation() {
        initComponents();
        setSize(960,550);
        connectDb();
        ListEventVisitor();
        ListRecommendations();
    }
    
    public EventRecommendation(String myusername) {
        username = myusername;
        System.out.println("This is EventRecommendation, your username is: "+username);
        initComponents();
        setSize(960,550);
        connectDb();
        ListEventVisitor();
        ListRecommendations();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        eventname_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        visitor_table = new javax.swing.JTable();
        recommendationtext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        recomm_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        eventname_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name"
            }
        ));
        jScrollPane1.setViewportView(eventname_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 95, 155, 366);

        visitor_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Visitor Username"
            }
        ));
        jScrollPane2.setViewportView(visitor_table);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(205, 95, 165, 366);
        getContentPane().add(recommendationtext);
        recommendationtext.setBounds(388, 161, 539, 35);

        jLabel1.setText("Recommendation");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(388, 138, 99, 16);

        recomm_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Recommended By", "Recommended To", "Event Name", "Recommendation"
            }
        ));
        jScrollPane3.setViewportView(recomm_table);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(388, 273, 539, 162);

        jButton1.setText("Recommend");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(824, 214, 103, 25);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(887, 474, 59, 25);

        jLabel2.setBackground(new java.awt.Color(255, 204, 102));
        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("EVENT RECOMMENDATION FORUM");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 30, 440, 33);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoppingmall/21.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -10, 960, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Recommend();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SeasonalEventMenu semenu = new SeasonalEventMenu(username);
        semenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EventRecommendation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventRecommendation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventRecommendation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventRecommendation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventRecommendation().setVisible(true);
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
    
    private void ListEventVisitor(){
        try{
            DefaultTableModel model = (DefaultTableModel) eventname_table.getModel();
            model.setRowCount(0);
            String query = "SELECT event_name FROM seasonal_event ORDER BY event_name";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String eventname = rs.getString(1);
                model = (DefaultTableModel) eventname_table.getModel();
                model.addRow(new Object[]{eventname});
                eventname_table.setModel(model);
            }
            
            DefaultTableModel model2 = (DefaultTableModel) visitor_table.getModel();
            model2.setRowCount(0);
            query = "SELECT visitor_username FROM visitor ORDER BY visitor_username";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String visitor = rs.getString(1);
                model2 = (DefaultTableModel) visitor_table.getModel();
                model2.addRow(new Object[]{visitor});
                visitor_table.setModel(model2);
            }
            
        }
        catch (SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }
    }
    
    private void Recommend(){
        try{
            int row = eventname_table.getSelectedRow();
            String eventchosen = eventname_table.getModel().getValueAt(row, 0).toString();
            row = visitor_table.getSelectedRow();
            String recommended = visitor_table.getModel().getValueAt(row, 0).toString();
            String recommendation=recommendationtext.getText();
            
            String query = "SELECT visitor_username " +
                        "FROM event_recommendation " + 
                        "WHERE recommender_user = '" + username + "' AND recommended_user = '" + recommended +"' AND event_name = '" + eventchosen + "'";
                ResultSet rs = stmt.executeQuery(query);
                int count2=0;
                String hasbought=null;
                while (rs.next()) {
                    hasbought = rs.getString(1);
                    
                    if (hasbought.equals(username))
                    {
                        count2++;
                    }
                }

            if (count2==1) {
                JOptionPane optionPane = new JOptionPane("You cannot recommend the same event to the same user twice.");
                JDialog dialog = optionPane.createDialog("WARNING!");
                dialog.setAlwaysOnTop(this.isAlwaysOnTopSupported());
                dialog.setVisible(true);
                return;
            }
            
            String insert = "INSERT INTO event_recommendation (recommender_user, recommended_user, event_name, recommendation) VALUES " +
                            "('" + username + "', '" + recommended + "', '" + eventchosen + "', '" + recommendation + "')";
            stmt.executeUpdate(insert); 
            
            ListRecommendations();
        }
        catch (SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }
    }
    
        private void ListRecommendations(){
        try{
            DefaultTableModel model = (DefaultTableModel) recomm_table.getModel();
            model.setRowCount(0);
            String query = "SELECT recommender_user, recommended_user, event_name, recommendation FROM event_recommendation ORDER BY event_name";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String recommender = rs.getString(1);
                String recommended = rs.getString(2);
                String eventname = rs.getString(3);
                String recommendation = rs.getString(4);
                model = (DefaultTableModel) recomm_table.getModel();
                model.addRow(new Object[]{recommender, recommended, eventname, recommendation});
                recomm_table.setModel(model);
            }           
        }
        catch (SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable eventname_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable recomm_table;
    private javax.swing.JTextField recommendationtext;
    private javax.swing.JTable visitor_table;
    // End of variables declaration//GEN-END:variables
}