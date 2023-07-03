/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Software_Development;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author JingXuan
 */
public class Manager_Home extends javax.swing.JFrame {
    private int userId; // Add userId as an instance variable    


    /** Creates new form Manager_Home */
    public Manager_Home(int userId) {
        initComponents();
        this.userId = userId; // Set the value of userId from the constructor parameter
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpperWhiteBar = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LowerWhiteBar = new javax.swing.JPanel();
        Manager = new javax.swing.JButton();
        Account = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ViewPaymentRecord = new javax.swing.JButton();
        ViewForum = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UpperWhiteBar.setBackground(new java.awt.Color(255, 255, 255));
        UpperWhiteBar.setPreferredSize(new java.awt.Dimension(363, 65));

        Title.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Title.setText("Home");

        javax.swing.GroupLayout UpperWhiteBarLayout = new javax.swing.GroupLayout(UpperWhiteBar);
        UpperWhiteBar.setLayout(UpperWhiteBarLayout);
        UpperWhiteBarLayout.setHorizontalGroup(
            UpperWhiteBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperWhiteBarLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpperWhiteBarLayout.setVerticalGroup(
            UpperWhiteBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperWhiteBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        LowerWhiteBar.setBackground(new java.awt.Color(255, 255, 255));
        LowerWhiteBar.setPreferredSize(new java.awt.Dimension(0, 57));

        Manager.setBackground(new java.awt.Color(235, 235, 235));
        Manager.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Manager.setText("Manager");
        Manager.setPreferredSize(new java.awt.Dimension(83, 45));
        Manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerActionPerformed(evt);
            }
        });

        Account.setBackground(new java.awt.Color(235, 235, 235));
        Account.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Account.setText("Account");
        Account.setPreferredSize(new java.awt.Dimension(83, 45));
        Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountActionPerformed(evt);
            }
        });

        Search.setBackground(new java.awt.Color(235, 235, 235));
        Search.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Search.setText("Search");
        Search.setPreferredSize(new java.awt.Dimension(83, 45));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Home.setBackground(new java.awt.Color(153, 153, 153));
        Home.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Home.setText("Home");
        Home.setPreferredSize(new java.awt.Dimension(83, 45));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LowerWhiteBarLayout = new javax.swing.GroupLayout(LowerWhiteBar);
        LowerWhiteBar.setLayout(LowerWhiteBarLayout);
        LowerWhiteBarLayout.setHorizontalGroup(
            LowerWhiteBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LowerWhiteBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Manager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        LowerWhiteBarLayout.setVerticalGroup(
            LowerWhiteBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LowerWhiteBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LowerWhiteBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Manager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        ViewPaymentRecord.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ViewPaymentRecord.setText("View Payment Record");
        ViewPaymentRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPaymentRecordActionPerformed(evt);
            }
        });

        ViewForum.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ViewForum.setText("View Forum");
        ViewForum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewForumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewForum, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewPaymentRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(ViewPaymentRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(ViewForum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LowerWhiteBar, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(LowerWhiteBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpperWhiteBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(UpperWhiteBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManagerActionPerformed

    private void AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountActionPerformed
        Resident_Account account = new Resident_Account(userId);
        account.setVisible(true);
        dispose();
    }//GEN-LAST:event_AccountActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        Resident_Search search = new Resident_Search(userId);
        search.setVisible(true);
        dispose();
    }//GEN-LAST:event_SearchActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Manager_Home obj = new Manager_Home(userId);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void ViewPaymentRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPaymentRecordActionPerformed
        Resident_Payment payment = new Resident_Payment(userId);
        payment.setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewPaymentRecordActionPerformed

    private void ViewForumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewForumActionPerformed
        Manager_Forum2 obj = new Manager_Forum2(userId);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewForumActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        int userId = 2;
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_Home(userId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Account;
    private javax.swing.JButton Home;
    private javax.swing.JPanel LowerWhiteBar;
    private javax.swing.JButton Manager;
    private javax.swing.JButton Search;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel UpperWhiteBar;
    private javax.swing.JButton ViewForum;
    private javax.swing.JButton ViewPaymentRecord;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
