
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JOptionPane;


public class ReceptionFrame extends javax.swing.JFrame {

    public ReceptionFrame() {
        try{
            setIconImage(javax.imageio.ImageIO.read(getClass().getResource("images/logo.png")));
        }catch(Exception ex){ex.printStackTrace();}
        
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setFrameSize();
        dayDialog = new DayDialog(this, true);
        patientDialog = new PatientDialog(this, true);
        doctorDialog = new DoctorDialog(this, true);
        categoryDialog = new TestCategoryDialog(this, true);
        testEntryDialog = new TestEntryDialog(this, true);
        generateReceiptDialog = new GenerateReceiptDialog(this, true);
        dayClosingDialog = new DayClosingDialog(this, true);
        patientReportDialog = new PatientReportDialog(this, true);
        patientTestDetailsDialog = new PatientTestDetailsDialog(this, true);
//        reportUploadingDialog = new ReportUploadingDialog(this, true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picLabel = new javax.swing.JLabel();
        picLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        entriesMenu = new javax.swing.JMenu();
        dayEntryMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        patienEntrytMenuItem = new javax.swing.JMenuItem();
        doctorEntryMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        testCategoryEntryForm = new javax.swing.JMenuItem();
        testEntryForm = new javax.swing.JMenuItem();
        transactionMenu = new javax.swing.JMenu();
        generateReceiptMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        dayClosingMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        helpMenu2 = new javax.swing.JMenu();
        aboutMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reception - ADNANCE MRI & DIAGNOSTIC CENTER");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(870, 650));
        setResizable(false);
        getContentPane().setLayout(null);

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

        jMenuBar.setMinimumSize(new java.awt.Dimension(0, 5));
        jMenuBar.setPreferredSize(new java.awt.Dimension(306, 40));

        entriesMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        entriesMenu.setText("Entries");
        entriesMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        dayEntryMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        dayEntryMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dayEntryMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/date2.png"))); // NOI18N
        dayEntryMenuItem.setText("Day Entry");
        dayEntryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayEntryMenuItemActionPerformed(evt);
            }
        });
        entriesMenu.add(dayEntryMenuItem);
        entriesMenu.add(jSeparator2);

        patienEntrytMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        patienEntrytMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patienEntrytMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patient.png"))); // NOI18N
        patienEntrytMenuItem.setText("Patient Entry");
        patienEntrytMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patienEntrytMenuItemActionPerformed(evt);
            }
        });
        entriesMenu.add(patienEntrytMenuItem);

        doctorEntryMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        doctorEntryMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        doctorEntryMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Doc.png"))); // NOI18N
        doctorEntryMenuItem.setText("Doctor Entry");
        doctorEntryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorEntryMenuItemActionPerformed(evt);
            }
        });
        entriesMenu.add(doctorEntryMenuItem);
        entriesMenu.add(jSeparator1);

        testCategoryEntryForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        testCategoryEntryForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        testCategoryEntryForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/test_Cat.png"))); // NOI18N
        testCategoryEntryForm.setText("Test Category Entry");
        testCategoryEntryForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testCategoryEntryFormActionPerformed(evt);
            }
        });
        entriesMenu.add(testCategoryEntryForm);

        testEntryForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        testEntryForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        testEntryForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/test.png"))); // NOI18N
        testEntryForm.setText("Test Entry");
        testEntryForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testEntryFormActionPerformed(evt);
            }
        });
        entriesMenu.add(testEntryForm);

        jMenuBar.add(entriesMenu);

        transactionMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        transactionMenu.setText("Receipts");
        transactionMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        generateReceiptMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        generateReceiptMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        generateReceiptMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rec.png"))); // NOI18N
        generateReceiptMenuItem.setText("Generate Receipt");
        generateReceiptMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReceiptMenuItemActionPerformed(evt);
            }
        });
        transactionMenu.add(generateReceiptMenuItem);

        jMenuBar.add(transactionMenu);

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu1.setText("Reports");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report_2.png"))); // NOI18N
        jMenuItem1.setText("Print Reports");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar.add(jMenu1);

        helpMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        helpMenu.setText("Closing");
        helpMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        dayClosingMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        dayClosingMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dayClosingMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/date2.png"))); // NOI18N
        dayClosingMenuItem.setText("Day Closing");
        dayClosingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayClosingMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(dayClosingMenuItem);

        jMenuBar.add(helpMenu);

        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu2.setText("Summary");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem2.setText("Patient Test Summary");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar.add(jMenu2);

        helpMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        helpMenu2.setText("About");
        helpMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        aboutMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aboutMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abou.png"))); // NOI18N
        aboutMenuItem1.setText("Contact");
        aboutMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItem1ActionPerformed(evt);
            }
        });
        helpMenu2.add(aboutMenuItem1);

        jMenuBar.add(helpMenu2);

        setJMenuBar(jMenuBar);

        setSize(new java.awt.Dimension(1044, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dayEntryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayEntryMenuItemActionPerformed
        dayDialog.showDialog();
    }//GEN-LAST:event_dayEntryMenuItemActionPerformed

    private void patienEntrytMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patienEntrytMenuItemActionPerformed
        patientDialog.showDialog();
    }//GEN-LAST:event_patienEntrytMenuItemActionPerformed

    private void generateReceiptMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReceiptMenuItemActionPerformed
        generateReceiptDialog.showDialog();
    }//GEN-LAST:event_generateReceiptMenuItemActionPerformed

    private void testCategoryEntryFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testCategoryEntryFormActionPerformed
        categoryDialog.showDialog();
    }//GEN-LAST:event_testCategoryEntryFormActionPerformed

    private void doctorEntryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorEntryMenuItemActionPerformed
        doctorDialog.showDialog();
    }//GEN-LAST:event_doctorEntryMenuItemActionPerformed

    private void testEntryFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testEntryFormActionPerformed
        testEntryDialog.showDialog();
    }//GEN-LAST:event_testEntryFormActionPerformed

    private void dayClosingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayClosingMenuItemActionPerformed
        dayClosingDialog.showDialog();
    }//GEN-LAST:event_dayClosingMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        patientReportDialog.showDialog();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void aboutMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null,"Rajesh Kumar\n03332836705\nrajakumarlohano@gmail.com \n\n Jay Kumar\n03332836704\njay_tharwani1992@yahoo.com");
    }//GEN-LAST:event_aboutMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        patientTestDetailsDialog.showDialog();
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    private void setFrameSize(){
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        double width = d.getWidth();
        double height = d.getHeight();
        this.setBounds(1,3,(int)width-5, (int)height-45);
        setImage();
    }
    
    private void setImage(){
//        try {
//            picLabel2.setBounds(0, 0, this.getWidth(), this.getHeight());
//            Image img = new javax.swing.ImageIcon(javax.imageio.ImageIO.read(getClass().getResource("images/hospital.jpg"))).getImage().getScaledInstance(picLabel2.getWidth(), picLabel2.getHeight(), 1);
//            picLabel2.setIcon(new javax.swing.ImageIcon(img));
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        
        
    }
    
    private PatientTestDetailsDialog patientTestDetailsDialog;
    private DayDialog dayDialog;
    private PatientDialog patientDialog;
    private DoctorDialog doctorDialog;
    private TestCategoryDialog categoryDialog;
    private TestEntryDialog testEntryDialog;
    private GenerateReceiptDialog generateReceiptDialog;
    private DayClosingDialog dayClosingDialog;
    private PatientReportDialog patientReportDialog; 
   // private ReportUploadingDialog reportUploadingDialog;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem1;
    private javax.swing.JMenuItem dayClosingMenuItem;
    private javax.swing.JMenuItem dayEntryMenuItem;
    private javax.swing.JMenuItem doctorEntryMenuItem;
    private javax.swing.JMenu entriesMenu;
    private javax.swing.JMenuItem generateReceiptMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu helpMenu2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem patienEntrytMenuItem;
    private javax.swing.JLabel picLabel;
    private javax.swing.JLabel picLabel2;
    private javax.swing.JMenuItem testCategoryEntryForm;
    private javax.swing.JMenuItem testEntryForm;
    private javax.swing.JMenu transactionMenu;
    // End of variables declaration//GEN-END:variables
}
