/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package favoritesites;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author honorr
 */
public class ShareVisit extends javax.swing.JFrame {
    String username;
    /**
     * Creates new form ShareVisit
     */
    private void newFrame() {
        dispose();
        DisplayVisits displayVisits = new DisplayVisits(username);
        displayVisits.setVisible(true);
    }
    
    public ShareVisit(String username) {
        initComponents();
        this.username = username;
    }

    private ShareVisit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        displaySharedVisit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        visit_information = new javax.swing.JTextArea();
        share = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Share Visit");

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("SHARE VISITS AND DISPLAY SHARED VISITS");

        jLabel2.setText("Visit ID that you want share:");

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("<-");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        displaySharedVisit.setText("Display Shared Visits");
        displaySharedVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaySharedVisitActionPerformed(evt);
            }
        });

        jLabel3.setText("Username of your friend :");

        visit_information.setColumns(20);
        visit_information.setRows(5);
        jScrollPane1.setViewportView(visit_information);

        share.setText("SHARE");
        share.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(IDfield, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(share))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(displaySharedVisit)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IDfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(share))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(displaySharedVisit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        newFrame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void shareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shareActionPerformed
        String id_string = IDfield.getText();
        int id_int = Integer.parseInt(id_string);
        String friendUsername = usernameField.getText();
        Connection databaseConn = Database.connectingDatabase();
        if(databaseConn !=null){
           if(id_string.isEmpty() || friendUsername.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill the blanks");
        }else{
            try{
                PreparedStatement st = (PreparedStatement)databaseConn.prepareStatement("INSERT INTO sharedvisits (friend_username,visit_id,username) VALUES(?,?,?)");
                st.setString(1, friendUsername);
                st.setInt(2, id_int);
                st.setString(3,username);
                PreparedStatement st1 = (PreparedStatement)databaseConn.prepareStatement("SELECT * from visits where id=?");
                st1.setInt(1, id_int);
                PreparedStatement st2 = (PreparedStatement)databaseConn.prepareStatement("SELECT * from userinfo where username=?");
                st2.setString(1, friendUsername);
                ResultSet res1= st1.executeQuery();
                ResultSet res2= st2.executeQuery();
                if(res1.next() && res2.next()){
                   int res = st.executeUpdate(); 
                   JOptionPane.showMessageDialog(this, "Sharing is successful.");
                }else{
                    JOptionPane.showMessageDialog(this, "Please write valid visit ID or valid username");
                }
                
                
            }catch(Exception e){

            }
           } 
        } 
    }//GEN-LAST:event_shareActionPerformed

    private void displaySharedVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaySharedVisitActionPerformed
        Connection databaseConn = Database.connectingDatabase();
        ArrayList<String> countries = new ArrayList<>();
        visit_information.setText("");
        if(databaseConn != null){
            try{
                PreparedStatement st = (PreparedStatement)databaseConn.prepareStatement("Select * from sharedvisits,visits where visits.id=sharedvisits.visit_id and friend_username=?");
                st.setString(1, username);
                ResultSet res = st.executeQuery();
                while(res.next()){
                   String countryName = res.getString("country_name");
                   String cityName = res.getString("city_name");
                   int yearVisited = res.getInt("year_visited");
                   String seasonVisited = res.getString("season_visited");
                   String bestFeature = res.getString("feature");
                   String visitComment = res.getString("comment");
                   int visitRating = res.getInt("rating");
                   countries.add(countryName);
                   countries.add(cityName);
                   countries.add(""+yearVisited);
                   countries.add(seasonVisited);
                   countries.add(bestFeature);
                   countries.add(visitComment);
                   countries.add(""+visitRating);
                }
                if(countries.size()>0){
                    StringBuilder countries_string = new StringBuilder();
                    for (int i = 0; i < countries.size(); i++) {
                        countries_string.append(countries.get(i)).append(", ");
                        if(i!=0 && (i+1)%7==0){
                            countries_string.append("\n");
                        }
                    }
                    visit_information.append(countries_string.toString());
                }
                else{
                    JOptionPane.showMessageDialog(this, "There is no visit shared with you.");
                }
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_displaySharedVisitActionPerformed

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
            java.util.logging.Logger.getLogger(ShareVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShareVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShareVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShareVisit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShareVisit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDfield;
    private javax.swing.JButton displaySharedVisit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton share;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextArea visit_information;
    // End of variables declaration//GEN-END:variables
}