/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay & Raja
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JOptionPane;

public class AdministratorMainFrame extends javax.swing.JFrame {

    public AdministratorMainFrame() {
        try{
            setIconImage(javax.imageio.ImageIO.read(getClass().getResource("images/logo.png")));
        }catch(Exception ex){ex.printStackTrace();}
        initComponents();
        setFrameSize();
        getContentPane().setBackground(Color.WHITE);
        daySummaryDialog = new DaySummaryDialog(this, true);
        testSummaryDialog = new TestSummaryDialog(this, true);
        passwordSecurityDialog = new PasswordSecurityDialog(this, true);
        patientTestDetailsDialog = new PatientTestDetailsDialog(this, true);
        
        updateReceiptDialog = new UpdateReceiptDialog(this, true);
        reportUpdateDialog = new ReportUpdateDialog();
        newUserAccountDialog = new NewUserAccountDialog();
        dailySummarySheetDialog = new DailySummarySheetDialog();
        testUpdateDialog = new TestUpdateDialog(this);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picLabel = new javax.swing.JLabel();
        picLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        patientMenu = new javax.swing.JMenu();
        patientTestDetailsMenuItem = new javax.swing.JMenuItem();
        testMenu = new javax.swing.JMenu();
        testSummaryMenuItem = new javax.swing.JMenuItem();
        dayMenu = new javax.swing.JMenu();
        daySummaryMenuItem = new javax.swing.JMenuItem();
        accountsSummaryMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        updateReceiptMenuItem = new javax.swing.JMenuItem();
        updateReportDialog = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        securityMenu = new javax.swing.JMenu();
        passwordSecurityMenuItem = new javax.swing.JMenuItem();
        newUserAccountsMenuItem = new javax.swing.JMenuItem();
        securityMenu1 = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator - ADVANCE MRI & DIAGNOSTIC CENTER");
        setMinimumSize(new java.awt.Dimension(870, 650));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(picLabel);
        picLabel.setBounds(0, 0, 190, 140);

        picLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.jpg"))); // NOI18N
        getContentPane().add(picLabel2);
        picLabel2.setBounds(380, 260, 250, 280);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Advance MRI & Diagnostic Center");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 37, 840, 120);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Advance MRI & Diagnostic Center");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 40, 840, 120);

        patientMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        patientMenu.setText("Patient");

        patientTestDetailsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        patientTestDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/test_Cat.png"))); // NOI18N
        patientTestDetailsMenuItem.setText("Patient Test Details");
        patientTestDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientTestDetailsMenuItemActionPerformed(evt);
            }
        });
        patientMenu.add(patientTestDetailsMenuItem);

        jMenuBar.add(patientMenu);

        testMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        testMenu.setText("Test");

        testSummaryMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        testSummaryMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/test.png"))); // NOI18N
        testSummaryMenuItem.setText("Test Summary");
        testSummaryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testSummaryMenuItemActionPerformed(evt);
            }
        });
        testMenu.add(testSummaryMenuItem);

        jMenuBar.add(testMenu);

        dayMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dayMenu.setText("Day");

        daySummaryMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        daySummaryMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/date2.png"))); // NOI18N
        daySummaryMenuItem.setText("Day Summary");
        daySummaryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daySummaryMenuItemActionPerformed(evt);
            }
        });
        dayMenu.add(daySummaryMenuItem);

        accountsSummaryMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        accountsSummaryMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/date2.png"))); // NOI18N
        accountsSummaryMenuItem.setText("Accounts Summary");
        accountsSummaryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsSummaryMenuItemActionPerformed(evt);
            }
        });
        dayMenu.add(accountsSummaryMenuItem);

        jMenuBar.add(dayMenu);

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu1.setText("Update");

        updateReceiptMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        updateReceiptMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ca.png"))); // NOI18N
        updateReceiptMenuItem.setText("Update Receipt");
        updateReceiptMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateReceiptMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(updateReceiptMenuItem);

        updateReportDialog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        updateReportDialog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/document-arrow-up-icon.png"))); // NOI18N
        updateReportDialog.setText("Update Report");
        updateReportDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateReportDialogActionPerformed(evt);
            }
        });
        jMenu1.add(updateReportDialog);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/test.png"))); // NOI18N
        jMenuItem1.setText("Update Tests");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar.add(jMenu1);

        securityMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        securityMenu.setText("User Accounts");

        passwordSecurityMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        passwordSecurityMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rec.png"))); // NOI18N
        passwordSecurityMenuItem.setText("Password Security");
        passwordSecurityMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordSecurityMenuItemActionPerformed(evt);
            }
        });
        securityMenu.add(passwordSecurityMenuItem);

        newUserAccountsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        newUserAccountsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reseller-account-icon.png"))); // NOI18N
        newUserAccountsMenuItem.setText("New User Accounts");
        newUserAccountsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserAccountsMenuItemActionPerformed(evt);
            }
        });
        securityMenu.add(newUserAccountsMenuItem);

        jMenuBar.add(securityMenu);

        securityMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        securityMenu1.setText("About");

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abou.png"))); // NOI18N
        aboutMenuItem.setText("Contact Us");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        securityMenu1.add(aboutMenuItem);

        jMenuBar.add(securityMenu1);

        setJMenuBar(jMenuBar);

        setSize(new java.awt.Dimension(901, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void testSummaryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testSummaryMenuItemActionPerformed
        testSummaryDialog.showDialog();
    }//GEN-LAST:event_testSummaryMenuItemActionPerformed

    private void daySummaryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daySummaryMenuItemActionPerformed
        daySummaryDialog.showDialog();
    }//GEN-LAST:event_daySummaryMenuItemActionPerformed

    private void passwordSecurityMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordSecurityMenuItemActionPerformed
        passwordSecurityDialog.showDialog();
    }//GEN-LAST:event_passwordSecurityMenuItemActionPerformed

    private void patientTestDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientTestDetailsMenuItemActionPerformed
        patientTestDetailsDialog.showDialog();
    }//GEN-LAST:event_patientTestDetailsMenuItemActionPerformed

private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
    JOptionPane.showMessageDialog(null,"Rajesh Kumar\n03332836705\nrajakumarlohano@gmail.com \n\n Jay Kumar\n03332836704\njay_tharwani1992@yahoo.com");
    
}//GEN-LAST:event_aboutMenuItemActionPerformed

    private void updateReceiptMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateReceiptMenuItemActionPerformed
       updateReceiptDialog.showDialog();       
    }//GEN-LAST:event_updateReceiptMenuItemActionPerformed

    private void updateReportDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateReportDialogActionPerformed
        reportUpdateDialog.setVisible(true);
    }//GEN-LAST:event_updateReportDialogActionPerformed

    private void newUserAccountsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserAccountsMenuItemActionPerformed
        newUserAccountDialog.showDialog();
    }//GEN-LAST:event_newUserAccountsMenuItemActionPerformed

    private void accountsSummaryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsSummaryMenuItemActionPerformed
        dailySummarySheetDialog.showDialog();
    }//GEN-LAST:event_accountsSummaryMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        testUpdateDialog.showDialog();
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    private void setFrameSize(){
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        double width = d.getWidth();
        double height = d.getHeight();
        this.setBounds(1,3,(int)width-5, (int)height-45);
        setImage();
    }
    
    private void setImage(){
//        try {
//            picLabel.setBounds(0, 0, this.getWidth(), this.getHeight());
//            Image img = new javax.swing.ImageIcon(javax.imageio.ImageIO.read(getClass().getResource("images/hospital.jpg"))).getImage().getScaledInstance(picLabel.getWidth(), picLabel.getHeight(), 1);
//            picLabel.setIcon(new javax.swing.ImageIcon(img));
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
    }
    
    private DaySummaryDialog daySummaryDialog; 
    private TestSummaryDialog testSummaryDialog; 
    private PasswordSecurityDialog passwordSecurityDialog; 
    private PatientTestDetailsDialog patientTestDetailsDialog;
    private UpdateReceiptDialog updateReceiptDialog;
    private ReportUpdateDialog reportUpdateDialog;
    private NewUserAccountDialog newUserAccountDialog;
    private DailySummarySheetDialog dailySummarySheetDialog;
    private TestUpdateDialog testUpdateDialog;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem accountsSummaryMenuItem;
    private javax.swing.JMenu dayMenu;
    private javax.swing.JMenuItem daySummaryMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem newUserAccountsMenuItem;
    private javax.swing.JMenuItem passwordSecurityMenuItem;
    private javax.swing.JMenu patientMenu;
    private javax.swing.JMenuItem patientTestDetailsMenuItem;
    private javax.swing.JLabel picLabel;
    private javax.swing.JLabel picLabel2;
    private javax.swing.JMenu securityMenu;
    private javax.swing.JMenu securityMenu1;
    private javax.swing.JMenu testMenu;
    private javax.swing.JMenuItem testSummaryMenuItem;
    private javax.swing.JMenuItem updateReceiptMenuItem;
    private javax.swing.JMenuItem updateReportDialog;
    // End of variables declaration//GEN-END:variables
}
