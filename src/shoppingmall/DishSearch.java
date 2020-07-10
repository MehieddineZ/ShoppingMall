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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static shoppingmall.CheckinFeedback.username;
import static shoppingmall.MainMenu.username;
import static shoppingmall.Restaurant.stmt;

/**
 *
 * @author MH
 */
public class DishSearch extends javax.swing.JFrame {
    public static String connectionUrl;
    public static Connection con = null;
    public static java.sql.Statement stmt = null;

    /**
     * Creates new form DishSearch
     */
    
    public static String username=null;
    
    public DishSearch() {
        initComponents();
        setSize(1050,640);
        connectDb();
        RestaurantListbyName();
    }
    
    public DishSearch(String myusername) {
        username = myusername;
        System.out.println("This is DishSearch, your username is: "+username);
        initComponents();
        setSize(1050,640);
        connectDb();
        RestaurantListbyName();
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
        restaurantinfo_table = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dishinfo_table = new javax.swing.JTable();
        YEAR = new javax.swing.JComboBox<>();
        MONTH = new javax.swing.JComboBox<>();
        DAY = new javax.swing.JComboBox<>();
        Current = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ratinginfo_table = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        restaurantinfo_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Cuisine Type"
            }
        ));
        restaurantinfo_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restaurantinfo_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(restaurantinfo_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 130, 375, 156);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "American", "Italian", "Japanese", "French", "Lebanese", "Mexican", "Chinese" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(50, 330, 81, 22);

        jButton1.setText("Choose");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 330, 75, 25);

        dishinfo_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Dish Name", "Dish Type", "Price"
            }
        ));
        jScrollPane2.setViewportView(dishinfo_table);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 420, 452, 177);

        YEAR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010" }));
        YEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YEARActionPerformed(evt);
            }
        });
        getContentPane().add(YEAR);
        YEAR.setBounds(590, 170, 70, 22);

        MONTH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        getContentPane().add(MONTH);
        MONTH.setBounds(760, 170, 60, 22);

        DAY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        DAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DAYActionPerformed(evt);
            }
        });
        getContentPane().add(DAY);
        DAY.setBounds(890, 170, 60, 22);

        Current.setText("Current Date");
        getContentPane().add(Current);
        Current.setBounds(540, 210, 101, 25);

        jLabel2.setText("Year:");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 170, 40, 20);

        jLabel3.setText("Month:");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(700, 170, 50, 20);

        jLabel4.setText("Day:");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(850, 170, 30, 20);

        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(5);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jSlider1);
        jSlider1.setBounds(540, 290, 200, 52);

        jButton2.setText("Rate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(770, 310, 59, 25);

        ratinginfo_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Dish Name", "Average Dish Rating"
            }
        ));
        jScrollPane3.setViewportView(ratinginfo_table);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(540, 410, 419, 121);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(900, 560, 59, 25);

        jLabel5.setText("MENU CATALOGUE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1158, 34, 107, 16);

        jLabel6.setBackground(new java.awt.Color(255, 204, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Select a restaurant name to open its menu.");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 100, 280, 17);

        jLabel7.setBackground(new java.awt.Color(255, 204, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("You can also filter restaurants by the cuisine type of your choice:");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 300, 396, 17);

        jLabel8.setBackground(new java.awt.Color(255, 204, 102));
        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("RATE A DISH!");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(680, 30, 170, 33);

        jLabel9.setText("Enter the date of your visit:");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(540, 140, 156, 16);

        jLabel10.setBackground(new java.awt.Color(255, 204, 102));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("You can rate a dish if you visit the restaurant on the same day!");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(540, 100, 384, 20);

        jLabel11.setBackground(new java.awt.Color(255, 204, 102));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("First select a dish, then RATE IT!");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(540, 260, 195, 17);

        jLabel13.setBackground(new java.awt.Color(255, 204, 102));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Dish ratings appear below.");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(540, 380, 160, 17);

        jLabel12.setBackground(new java.awt.Color(255, 204, 102));
        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setText("MENU");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(230, 390, 60, 22);

        jLabel14.setBackground(new java.awt.Color(255, 204, 102));
        jLabel14.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("RESTAURANTS MENU");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(100, 30, 270, 33);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoppingmall/4.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1067, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RestaurantListByCuisine();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void restaurantinfo_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurantinfo_tableMouseClicked
        // TODO add your handling code here:
        DishList();
    }//GEN-LAST:event_restaurantinfo_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        RateDishes();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        RestaurantMenu restmen = new RestaurantMenu(username);
        restmen.setVisible(true);
        setVisible(false); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void YEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YEARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YEARActionPerformed

    private void DAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DAYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DAYActionPerformed

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
            java.util.logging.Logger.getLogger(DishSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DishSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DishSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DishSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DishSearch().setVisible(true);
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
    
    private void RestaurantListbyName(){
        try{
            DefaultTableModel model = (DefaultTableModel) restaurantinfo_table.getModel();
            model.setRowCount(0);
            String query = "SELECT restaurant_name, cuisine_type FROM restaurant ORDER BY restaurant_name";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                String shop_name = rs.getString(1);
                String cuisine_type = rs.getString(2);
                model = (DefaultTableModel) restaurantinfo_table.getModel();
                model.addRow(new Object[]{shop_name, cuisine_type});
                restaurantinfo_table.setModel(model);
            }
        }
        catch (SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }
    }
    
    private void RestaurantListByCuisine() {
        try{
            DefaultTableModel model = (DefaultTableModel) restaurantinfo_table.getModel();
            model.setRowCount(0);
            String chosencat=null;
            Object selectedItem = jComboBox1.getSelectedItem();
            if (selectedItem != null) 
                chosencat = selectedItem.toString();
            String query = "SELECT restaurant_name, cuisine_type FROM restaurant WHERE cuisine_type = '" + chosencat + "' ORDER BY restaurant_name";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String shop_name = rs.getString(1);
                String category = rs.getString(2);
                model = (DefaultTableModel) restaurantinfo_table.getModel();
                model.addRow(new Object[]{shop_name, category});
                restaurantinfo_table.setModel(model);
            }
        }
        catch (SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }
    }
    
      private void DishList() {
        try{
            DefaultTableModel model = (DefaultTableModel) dishinfo_table.getModel();
            model.setRowCount(0);
            int row =restaurantinfo_table.getSelectedRow();
            String restchosen = restaurantinfo_table.getModel().getValueAt(row, 0).toString();
            
            String query = "SELECT restaurant_name, dish_name, dish_type, price FROM dishes WHERE restaurant_name='"+restchosen+"' ORDER BY dish_type, price ASC";
            
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String rest_name = rs.getString(1);
                String dish_name = rs.getString(2);
                String dish_type = rs.getString(3);
                String price = rs.getString(4);
                model = (DefaultTableModel) dishinfo_table.getModel();
                model.addRow(new Object[]{rest_name, dish_name, dish_type, price});
                dishinfo_table.setModel(model);
            }
            DishesAvgRating();
        }
        catch (SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }
    }
      
    private void RateDishes() {
         try {
            String hasrated=null;
            String Date="";
            String Time="";
            if (!(Current.isSelected())&&(YEAR.getSelectedIndex()==0||MONTH.getSelectedIndex()==0||DAY.getSelectedIndex()==0)) {
                JOptionPane.showMessageDialog(null, "Please make sure to enter a date!");
            } else if (jComboBox1.getSelectedIndex()==-1) {
                JOptionPane.showMessageDialog(null, "Please make sure to select a dish!");
            }
            else {
                if(Current.isSelected()) {
                   Date=java.time.LocalDate.now().toString(); 
                   Time=java.time.LocalTime.now().toString().substring(0, 5);
                }
                else {
                 Date=YEAR.getSelectedItem().toString()+"-"+MONTH.getSelectedItem().toString()+"-"+DAY.getSelectedItem().toString();
                }
               //System.out.println(Date);
               //System.out.println(Time);
               
               int row =dishinfo_table.getSelectedRow();
               String restchosen = dishinfo_table.getModel().getValueAt(row, 0).toString();
               String dishchosen = dishinfo_table.getModel().getValueAt(row, 1).toString();
               int count=0;
               String query="Select COUNT(*) from check_in_restaurant where visitor_username='"+username+"'and restaurant_name='"+restchosen+"' and check_in_date = '"+Date+"'";
               //System.out.println(querry1+"///////");
               ResultSet rs = stmt.executeQuery(query);
               if(rs.next())
               {
                    count = Integer.parseInt(rs.getString(1));
                    //System.out.println(rs.getString(1));
                    //System.out.println(rs.getString(1));
               }
               if (count==0)
               {
                   JOptionPane.showMessageDialog(null, "Dear "+username+", you can't rate "+restchosen+"'s "+dishchosen+". Make sure to visit the restaurant same day.");
               }else
               {
               query = "SELECT visitor_username " +
                        "FROM dish_rating " + 
                        "WHERE visitor_username = '" + username + "' AND restaurant_name = '" + restchosen + "' AND dish_name = '" + dishchosen + "'";
                rs = stmt.executeQuery(query);
                int count2=0;
                while (rs.next()) {
                    hasrated = rs.getString(1);
                    System.out.println(hasrated);
                    if (hasrated.equals(username))
                    {
                        count2++;
                    }
                }

            if (count2==1) {
                JOptionPane optionPane = new JOptionPane("You cannot rate a dish more than once.");
                JDialog dialog = optionPane.createDialog("WARNING!");
                dialog.setAlwaysOnTop(this.isAlwaysOnTopSupported());
                dialog.setVisible(true);
                return;
            }
                String insert= "INSERT INTO DISH_RATING (visitor_username, restaurant_name, dish_name, star_rating) VALUES " +
                        "('"+username+"','"+restchosen+"','"+dishchosen+"',"+Integer.toString(jSlider1.getValue())+")";
                stmt.executeUpdate(insert);
                JOptionPane.showMessageDialog(null,"Thank you "+username+" for your rating!");
  
                   }
               DishesAvgRating();
                 }        
        } catch (SQLException ex) {
            Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    private void DishesAvgRating() {
        try{
            DefaultTableModel model = (DefaultTableModel) ratinginfo_table.getModel();
            model.setRowCount(0);
            String query = "SELECT restaurant_name, dish_name, AVG(star_rating) FROM dish_rating GROUP BY dish_name";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String rest = rs.getString(1);
                String dish = rs.getString(2);
                double avgrating = rs.getDouble(3);
                model = (DefaultTableModel) ratinginfo_table.getModel();
                model.addRow(new Object[]{rest, dish, avgrating});
                ratinginfo_table.setModel(model);
            }

        }
        catch (SQLException e){
            System.out.println("SQL Exception: "+ e.toString());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Current;
    private javax.swing.JComboBox<String> DAY;
    private javax.swing.JComboBox<String> MONTH;
    private javax.swing.JComboBox<String> YEAR;
    private javax.swing.JTable dishinfo_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable ratinginfo_table;
    private javax.swing.JTable restaurantinfo_table;
    // End of variables declaration//GEN-END:variables
}
