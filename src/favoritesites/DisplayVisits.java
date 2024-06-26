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
public class DisplayVisits extends javax.swing.JFrame {
    String username;
    private void shareVisitFrame(){
        dispose();
        ShareVisit shareVisit = new ShareVisit(username);
        shareVisit.setVisible(true);
    }
    private void displayImage() {
        dispose();
        DisplayImage displayImage = new DisplayImage(username);
        displayImage.setVisible(true);
    }
    private void newFrame() {
        dispose();
        MainFrame mainFrame = new MainFrame(username);
        mainFrame.setVisible(true);
    }
    /**
     * Creates new form VisitInformation
     */
    public DisplayVisits(String username) {
        initComponents();
        this.username = username;
    }

    private DisplayVisits() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        year_button = new javax.swing.JButton();
        year_input = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        year_output = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        visit_information = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        most_visited_country = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        visitedinSpring = new javax.swing.JTextArea();
        shareVisit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Display Visits");

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("OPTIONS");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setText("Sort Countries With Food");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        year_button.setText("Display");
        year_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year_buttonActionPerformed(evt);
            }
        });

        jLabel3.setText("Visited Year :");

        jButton2.setText("Most Visited Country");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Visits Only Visited in Spring");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Display Image Of Visit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 204, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("<-");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(year_button))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)
                                .addGap(0, 46, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(year_input, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(31, 31, 31))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(year_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(year_button, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton2)
                .addGap(47, 47, 47)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(39, 39, 39))
        );

        year_output.setColumns(20);
        year_output.setRows(5);
        jScrollPane1.setViewportView(year_output);

        visit_information.setColumns(20);
        visit_information.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        visit_information.setRows(5);
        jScrollPane2.setViewportView(visit_information);

        most_visited_country.setColumns(20);
        most_visited_country.setRows(3);
        jScrollPane3.setViewportView(most_visited_country);

        visitedinSpring.setColumns(20);
        visitedinSpring.setRows(3);
        jScrollPane4.setViewportView(visitedinSpring);

        shareVisit.setText("SHARE VİSİTS");
        shareVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shareVisitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(shareVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(shareVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection databaseConn = Database.connectingDatabase();
        ArrayList<String> countries = new ArrayList<>();
        visit_information.setText("");
        if(databaseConn != null){
            try{
                PreparedStatement st = (PreparedStatement)databaseConn.prepareStatement("Select * from visits where feature='Food'and username=? order by rating desc");
                st.setString(1, username);
                ResultSet res = st.executeQuery();
                while(res.next()){
                    String countryName = res.getString("country_name");
                    countries.add(countryName);
                }
                if(countries.size()>0){
                    StringBuilder countries_string = new StringBuilder();
                    for (int i = 0; i < countries.size(); i++) {
                        if(i!=countries.size()-1){
                            countries_string.append(countries.get(i)).append(", ");
                        }else{
                            countries_string.append(countries.get(i));
                        }
                     
                    }
                    visit_information.append(countries_string.toString());
                }
                else{
                    JOptionPane.showMessageDialog(this, "There is no visit with best feature is food.");
                }
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void year_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year_buttonActionPerformed
        Connection databaseConn = Database.connectingDatabase();
        String year_visited_input = year_input.getText();
        int visitedYear = Integer.parseInt(year_visited_input);
        ArrayList<String> country_infos = new ArrayList<>();
        year_output.setText("");
        if(databaseConn != null){
            try{
                PreparedStatement st = (PreparedStatement)databaseConn.prepareStatement("Select * from visits where year_visited=? and username=?");
                st.setInt(1, visitedYear);
                st.setString(2, username);
                ResultSet res = st.executeQuery();
                while(res.next()){
                   String countryName = res.getString("country_name");
                   String cityName = res.getString("city_name");
                   int yearVisited = res.getInt("year_visited");
                   String seasonVisited = res.getString("season_visited");
                   String bestFeature = res.getString("feature");
                   String visitComment = res.getString("comment");
                   int visitRating = res.getInt("rating");
                   country_infos.add(countryName);
                   country_infos.add(cityName);
                   country_infos.add(""+yearVisited);
                   country_infos.add(seasonVisited);
                   country_infos.add(bestFeature);
                   country_infos.add(visitComment);
                   country_infos.add(""+visitRating);
                }
                if(country_infos.size()>0){
                    StringBuilder countries_string = new StringBuilder();
                    for (int i = 0; i < country_infos.size(); i++) {
                        countries_string.append(country_infos.get(i)).append(", ");
                        if(i!=0 && (i+1)%7==0){
                            countries_string.append("\n");
                        }
                    }
                    year_output.append(countries_string.toString());
                }
                else{
                    JOptionPane.showMessageDialog(this, "There is no visit with this year visited.");
                }
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_year_buttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection databaseConn = Database.connectingDatabase();
        ArrayList<String> visitedCountries = new ArrayList<>();
        most_visited_country.setText("");
        if(databaseConn != null){
            try{
                PreparedStatement st = (PreparedStatement)databaseConn.prepareStatement("Select distinct country_name from visits group by country_name having count(*)=(select max(visit_count) from (select count(*) as visit_count from visits group by country_name) as subQuery) ");
                ResultSet res = st.executeQuery();
                while(res.next()){
                    String countryName = res.getString("country_name");
                    visitedCountries.add(countryName);
                }
                if(visitedCountries.size()>0){
                    StringBuilder countries_string = new StringBuilder();
                    for (int i = 0; i < visitedCountries.size(); i++) {
                        if(i!=visitedCountries.size()-1){
                            countries_string.append(visitedCountries.get(i)).append(" ");
                        }else{
                            countries_string.append(visitedCountries.get(i));
                        }
                     
                    }
                    most_visited_country.append(countries_string.toString());
                }
                else{
                    JOptionPane.showMessageDialog(this, "There is no visit.");
                }
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection databaseConn = Database.connectingDatabase();
        ArrayList<String> visited_in_spring = new ArrayList<>();
        visitedinSpring.setText("");
        if(databaseConn != null){
            try{
                PreparedStatement st = (PreparedStatement)databaseConn.prepareStatement("Select distinct country_name from visits where username=? and season_visited='Spring' and country_name not in (select country_name from visits where season_visited='Autumn' or season_visited='Winter' or season_visited='Summer') ");
                st.setString(1, username);
                ResultSet res = st.executeQuery();
                while(res.next()){
                    String countryName = res.getString("country_name");
                    visited_in_spring.add(countryName);
                }
                if(visited_in_spring.size()>0){
                    StringBuilder countries_string = new StringBuilder();
                    for (int i = 0; i < visited_in_spring.size(); i++) {
                        if(i!=visited_in_spring.size()-1){
                            countries_string.append(visited_in_spring.get(i)).append(" ");
                        }else{
                            countries_string.append(visited_in_spring.get(i));
                        }
                     
                    }
                    visitedinSpring.append(countries_string.toString());
                }
                else{
                    JOptionPane.showMessageDialog(this, "There is no visit that visited in Spring.");
                }
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        displayImage();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        newFrame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void shareVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shareVisitActionPerformed
        shareVisitFrame();
    }//GEN-LAST:event_shareVisitActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayVisits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayVisits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea most_visited_country;
    private javax.swing.JButton shareVisit;
    private javax.swing.JTextArea visit_information;
    private javax.swing.JTextArea visitedinSpring;
    private javax.swing.JButton year_button;
    private javax.swing.JTextField year_input;
    private javax.swing.JTextArea year_output;
    // End of variables declaration//GEN-END:variables

    
}
