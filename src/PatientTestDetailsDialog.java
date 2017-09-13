/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay & Raja
 */

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PatientTestDetailsDialog extends javax.swing.JDialog {
    
    javax.swing.table.DefaultTableModel tableModel;
    public PatientTestDetailsDialog(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
	try{
            setIconImage(javax.imageio.ImageIO.read(getClass().getResource("images/rep.png")));
        }catch(Exception ex){ex.printStackTrace();}
        defaultTableModel = (DefaultTableModel)table.getModel();
	tableModel = (javax.swing.table.DefaultTableModel) this.table.getModel();
    }

    public void showDialog(){
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientIdLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        doctorBorder = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        patientIdText = new javax.swing.JTextField();
        doctorBorder1 = new javax.swing.JPanel();
        lastNameLabel1 = new javax.swing.JLabel();
        ageLabel1 = new javax.swing.JLabel();
        genderLabel1 = new javax.swing.JLabel();
        genderComboBox1 = new javax.swing.JComboBox();
        firstNameLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        contactLabel1 = new javax.swing.JLabel();
        contactText1 = new javax.swing.JTextField();
        lastNameText1 = new javax.swing.JTextField();
        firstNameText1 = new javax.swing.JTextField();
        ageNameText1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Test Details");
        setMinimumSize(new java.awt.Dimension(500, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        patientIdLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientIdLabel.setForeground(new java.awt.Color(0, 0, 255));
        patientIdLabel.setText("Enter Patient's ID");
        getContentPane().add(patientIdLabel);
        patientIdLabel.setBounds(30, 10, 140, 30);

        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(360, 530, 110, 30);

        doctorBorder.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Test Records", 0, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        doctorBorder.setForeground(new java.awt.Color(0, 0, 255));
        doctorBorder.setLayout(null);
        doctorBorder.add(jSeparator1);
        jSeparator1.setBounds(30, 140, 320, 0);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receipt #", "Test", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(0).setPreferredWidth(40);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);

        doctorBorder.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 430, 270);

        getContentPane().add(doctorBorder);
        doctorBorder.setBounds(20, 210, 450, 310);

        clearButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearButton.setText("Clear All");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(240, 530, 111, 30);

        patientIdText.setText("PAT");
        patientIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdTextActionPerformed(evt);
            }
        });
        getContentPane().add(patientIdText);
        patientIdText.setBounds(180, 10, 270, 30);

        doctorBorder1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Personal Details", 0, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        doctorBorder1.setForeground(new java.awt.Color(0, 0, 255));
        doctorBorder1.setLayout(null);

        lastNameLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lastNameLabel1.setText("Last Name");
        doctorBorder1.add(lastNameLabel1);
        lastNameLabel1.setBounds(220, 30, 80, 30);

        ageLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ageLabel1.setText("Age ");
        doctorBorder1.add(ageLabel1);
        ageLabel1.setBounds(10, 70, 90, 30);

        genderLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        genderLabel1.setText("Gender");
        doctorBorder1.add(genderLabel1);
        genderLabel1.setBounds(220, 70, 50, 30);

        genderComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        genderComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        doctorBorder1.add(genderComboBox1);
        genderComboBox1.setBounds(290, 70, 140, 30);

        firstNameLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        firstNameLabel1.setText("First Name");
        doctorBorder1.add(firstNameLabel1);
        firstNameLabel1.setBounds(10, 30, 90, 30);
        doctorBorder1.add(jSeparator2);
        jSeparator2.setBounds(30, 140, 320, 0);

        contactLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contactLabel1.setText("Contact");
        doctorBorder1.add(contactLabel1);
        contactLabel1.setBounds(10, 110, 100, 30);

        contactText1.setEditable(false);
        doctorBorder1.add(contactText1);
        contactText1.setBounds(90, 110, 340, 30);

        lastNameText1.setEditable(false);
        doctorBorder1.add(lastNameText1);
        lastNameText1.setBounds(290, 30, 140, 30);

        firstNameText1.setEditable(false);
        doctorBorder1.add(firstNameText1);
        firstNameText1.setBounds(90, 30, 120, 30);

        ageNameText1.setEditable(false);
        doctorBorder1.add(ageNameText1);
        ageNameText1.setBounds(90, 70, 120, 30);

        getContentPane().add(doctorBorder1);
        doctorBorder1.setBounds(22, 50, 450, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        
    }//GEN-LAST:event_tableKeyPressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
    }//GEN-LAST:event_tableMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       clearAll();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void patientIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdTextActionPerformed
    try {
          String pat_id=this.patientIdText.getText().toUpperCase();
          PatientBean pb=DatabaseManager.searchPatientById(pat_id);
          if(pb==null){JOptionPane.showMessageDialog(null, "Invalid Patient ID");clearAll(); return;}
          String firstname=pb.getPatientFirstName();
          String contact=pb.getContact();
          String lastname=pb.getPatientLastName();
          String gender= Decoder.genderDecode(pb.getGender());
          int age=pb.getAge();
                          
          this.firstNameText1.setText(firstname);
          this.lastNameText1.setText(lastname);
          this.contactText1.setText(contact);
          this.ageNameText1.setText(""+age);
          this.genderComboBox1.setSelectedItem(gender);
          
          clearTable();
         
        
            Vector<ReciptsBean> v = DatabaseManager.getPatientTests(pat_id);

            for(int k=0 ; k<v.size() ; k++){
                ReciptsBean bean  = (ReciptsBean)v.elementAt(k);
                
              int reciptid =bean.getReciptId();
              String testname= bean.getTestName();
              String date= DateFormatter.dateToString(bean.getExpectedDate());
              defaultTableModel.addRow(new Object[]{reciptid,testname,date});
            }
        
          
               
      
     } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,ex);
        }  
    }//GEN-LAST:event_patientIdTextActionPerformed

    
      private void clearTable(){
          int totalRows = defaultTableModel.getRowCount();
          for(int k=0 ; k<totalRows ; k++)
              defaultTableModel.removeRow(0);
      }

      private void clearAll(){
          this.patientIdText.setText("PAT");
          this.firstNameText1.setText("");
          this.lastNameText1.setText("");
          this.contactText1.setText("");
          this.ageNameText1.setText("");
          clearTable();
      }
      private DefaultTableModel defaultTableModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel1;
    private javax.swing.JTextField ageNameText1;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel contactLabel1;
    private javax.swing.JTextField contactText1;
    private javax.swing.JPanel doctorBorder;
    private javax.swing.JPanel doctorBorder1;
    private javax.swing.JLabel firstNameLabel1;
    private javax.swing.JTextField firstNameText1;
    private javax.swing.JComboBox genderComboBox1;
    private javax.swing.JLabel genderLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lastNameLabel1;
    private javax.swing.JTextField lastNameText1;
    private javax.swing.JLabel patientIdLabel;
    private javax.swing.JTextField patientIdText;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
