/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay & Raja
 */

import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PatientDialog extends javax.swing.JDialog {

    public PatientDialog(JFrame parent, boolean modal){
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        ContactLabel = new javax.swing.JLabel();
        patientIdText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        contactText = new javax.swing.JTextField();
        patientIdLabel = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        StudentBorder = new javax.swing.JPanel();
        patientNameLabel1 = new javax.swing.JLabel();
        searchByIdText = new javax.swing.JTextField();
        patientNameLabel2 = new javax.swing.JLabel();
        searchByContactText = new javax.swing.JTextField();
        patientNameLabel3 = new javax.swing.JLabel();
        searchByNameText = new javax.swing.JTextField();
        StudentBorder1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        searchList = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksArea = new javax.swing.JTextArea();
        genderComboBox = new javax.swing.JComboBox();
        optionButton = new javax.swing.JButton();
        ageText = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Entry");
        setMinimumSize(new java.awt.Dimension(560, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        firstNameLabel.setText("First Name");
        getContentPane().add(firstNameLabel);
        firstNameLabel.setBounds(80, 60, 70, 30);

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lastNameLabel.setText("Last Name");
        getContentPane().add(lastNameLabel);
        lastNameLabel.setBounds(80, 100, 70, 30);

        genderLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        genderLabel.setText("Gender");
        getContentPane().add(genderLabel);
        genderLabel.setBounds(80, 140, 50, 30);

        ContactLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ContactLabel.setText("Contact");
        getContentPane().add(ContactLabel);
        ContactLabel.setBounds(80, 180, 60, 30);

        patientIdText.setEditable(false);
        getContentPane().add(patientIdText);
        patientIdText.setBounds(160, 20, 250, 30);
        getContentPane().add(lastNameText);
        lastNameText.setBounds(160, 100, 250, 30);
        getContentPane().add(contactText);
        contactText.setBounds(160, 180, 250, 30);

        patientIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientIdLabel.setText("Patient ID");
        getContentPane().add(patientIdLabel);
        patientIdLabel.setBounds(80, 20, 70, 30);
        getContentPane().add(firstNameText);
        firstNameText.setBounds(160, 60, 250, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "User Actions", 0, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, backButton, clearButton, deleteButton, updateButton});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 418, 534, 70);

        StudentBorder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        patientNameLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientNameLabel1.setText("Search by ID :");

        searchByIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIdTextActionPerformed(evt);
            }
        });

        patientNameLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientNameLabel2.setText("Search by Contact :");

        searchByContactText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByContactTextActionPerformed(evt);
            }
        });

        patientNameLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientNameLabel3.setText("Search by Name :");

        searchByNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNameTextActionPerformed(evt);
            }
        });

        StudentBorder1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Search Results", 0, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        searchList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                searchListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(searchList);

        javax.swing.GroupLayout StudentBorder1Layout = new javax.swing.GroupLayout(StudentBorder1);
        StudentBorder1.setLayout(StudentBorder1Layout);
        StudentBorder1Layout.setHorizontalGroup(
            StudentBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
            .addGroup(StudentBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(StudentBorder1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        StudentBorder1Layout.setVerticalGroup(
            StudentBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
            .addGroup(StudentBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentBorder1Layout.createSequentialGroup()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout StudentBorderLayout = new javax.swing.GroupLayout(StudentBorder);
        StudentBorder.setLayout(StudentBorderLayout);
        StudentBorderLayout.setHorizontalGroup(
            StudentBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentBorderLayout.createSequentialGroup()
                .addGroup(StudentBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentBorderLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(StudentBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchByIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchByContactText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchByNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(StudentBorderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(StudentBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        StudentBorderLayout.setVerticalGroup(
            StudentBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentBorderLayout.createSequentialGroup()
                .addComponent(patientNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(searchByIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(patientNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(searchByContactText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(searchByNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudentBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(StudentBorder);
        StudentBorder.setBounds(562, 11, 200, 470);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Remarks", 0, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        remarksArea.setColumns(20);
        remarksArea.setRows(5);
        jScrollPane1.setViewportView(remarksArea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(80, 260, 340, 155);

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male" }));
        getContentPane().add(genderComboBox);
        genderComboBox.setBounds(160, 140, 90, 30);

        optionButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        optionButton.setText(">");
        optionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(optionButton);
        optionButton.setBounds(503, 25, 40, 382);

        ageText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        getContentPane().add(ageText);
        ageText.setBounds(340, 140, 70, 30);

        ageLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ageLabel.setText("Age");
        getContentPane().add(ageLabel);
        ageLabel.setBounds(290, 140, 34, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showDialog(){
        setMaxPatId();
        setVisible(true);
    }
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
            String patId = patientIdText.getText();
            if(patId.isEmpty()){
                JOptionPane.showMessageDialog(this, "Patient ID is NOT Entered");
                return;
            }
            String firstName = firstNameText.getText();
            if(firstName.isEmpty()){
                JOptionPane.showMessageDialog(this, "Patient First Name is NOT Entered");
                return;
            }
            String lastName = lastNameText.getText();
            if(lastName.isEmpty()){
                JOptionPane.showMessageDialog(this, "Patient Last Name is NOT Entered");
                return;
            }
            
            String ag = ageText.getText();
            if(ag.isEmpty()){
                JOptionPane.showMessageDialog(this, "Enter Age");
                return;
            }
            int gender = Encoder.genderEncode((String)this.genderComboBox.getSelectedItem());
            
            String contact = contactText.getText();
            try{
               long con = Long.parseLong(contact.trim());
               if(contact.trim().length()<10){
                JOptionPane.showMessageDialog(this, "Invalid Contact No.");
                return;
            }
            }catch(NumberFormatException ex){JOptionPane.showMessageDialog(this, "NUMBER: Invalid Contact No."); return;}
            
            
            
            
            String remarks = remarksArea.getText();
            if(remarks.equals(""))
            remarks = " ";
            
            try{
            patId = patId.toUpperCase();
            int age = Integer.parseInt(ag);
            
            int rows = DatabaseManager.insertPatient(patId, firstName, lastName, age, gender,contact, 0, remarks);
            if(rows>0){
                JOptionPane.showMessageDialog(this, "Record is Successfully ADDED");
            }
        }catch(Exception ex){
            try{
                if(DatabaseManager.searchPatientById(patId) != null){
                    setMaxPatId();
                    int rows = DatabaseManager.insertPatient(patientIdText.getText(), firstName, lastName, Integer.parseInt(ag), gender,contact, 0, remarks);
                    if(rows>0){
                        JOptionPane.showMessageDialog(this, "Record is Successfully ADDED");
                        return;
                    }
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
                return;
            }
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
          
            String patId = patientIdText.getText();
            if(patId.isEmpty()){
                JOptionPane.showMessageDialog(this, "Patient ID is NOT Entered");
                return;
            }
            String firstName = firstNameText.getText();
            if(firstName.isEmpty()){
                JOptionPane.showMessageDialog(this, "Patient Name is NOT Entered");
                return;
            }
            String lastName = lastNameText.getText();
            String ag = ageText.getText();
            if(ag.isEmpty()){
                JOptionPane.showMessageDialog(this, "Enter Age");
                return;
            }
            int gender = Encoder.genderEncode((String)this.genderComboBox.getSelectedItem());
            String contact = contactText.getText();
            String remarks = remarksArea.getText();
            if(remarks.equals(""))
            remarks = " ";
            
            try{
            patId = patId.toUpperCase();
            int age = Integer.parseInt(ag);
            
            int rows = DatabaseManager.updatePatient(patId, firstName, lastName, age, gender,contact, 0, remarks);
            if(rows>0){
                clear();
                JOptionPane.showMessageDialog(this, "Record is Successfully UPDATED");
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }//GEN-LAST:event_updateButtonActionPerformed

    
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear(); 
    }//GEN-LAST:event_clearButtonActionPerformed

    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_searchListValueChanged
        PatientBean bean = (PatientBean)searchList.getSelectedValue();
        if(bean == null)
            return;
        patientIdText.setText(""+bean.getPatientId());
        firstNameText.setText(bean.getPatientFirstName());
        lastNameText.setText(bean.getPatientLastName());
        ageText.setText(""+bean.getAge());
        genderComboBox.setSelectedItem(Decoder.genderDecode(bean.getGender()));
        contactText.setText(bean.getContact());
        remarksArea.setText(bean.getRemarks());
    }//GEN-LAST:event_searchListValueChanged

    private void optionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButtonActionPerformed
        
        if(b){
            this.setSize(785, 520);
            optionButton.setText("<");            
        }
        else{
            this.setSize(550, 520);
            optionButton.setText(">");
        }
        b=!b;
    }//GEN-LAST:event_optionButtonActionPerformed

    private void searchByIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIdTextActionPerformed
       new Thread(){
           public void run(){
               searchPatientById();
           }
       }.start(); 
    }//GEN-LAST:event_searchByIdTextActionPerformed

    private void searchByContactTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByContactTextActionPerformed
       new Thread(){
           public void run(){
               searchPatientByContact();
           }
       }.start(); 
    }//GEN-LAST:event_searchByContactTextActionPerformed
    
    private void searchByNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNameTextActionPerformed
       new Thread(){
           public void run(){
               searchPatientByName();
           }
       }.start();
    }//GEN-LAST:event_searchByNameTextActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String id = patientIdText.getText();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Patient is Selected");
            return;
        }
        try{
            int rows = DatabaseManager.deletePatient(id);
            if(rows>0){
                clear();
                JOptionPane.showMessageDialog(this, "Record is Successfully DELETED");
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);} 
    }//GEN-LAST:event_deleteButtonActionPerformed
    
   private void searchPatientByName(){
        try {
            String name = searchByNameText.getText().toUpperCase();
            if(name.equals(""))
                return;
            Vector v = DatabaseManager.searchPatientByName(name);
            searchList.setListData(v);
        } catch (Exception ex) { ex.printStackTrace();}        
   }
   
   private void searchPatientByContact(){
        searchList.clearSelection();
        String contact = searchByContactText.getText();
        if(contact.equals(""))
            return;
        try{
            PatientBean bean = DatabaseManager.searchPatientByContact(contact);
            if(bean==null){
                JOptionPane.showMessageDialog(this ,"No Patient Found.");
                return;
            }
            patientIdText.setText(""+bean.getPatientId());
            firstNameText.setText(bean.getPatientFirstName());
            lastNameText.setText(bean.getPatientLastName());
            ageText.setText(""+bean.getAge());
            genderComboBox.setSelectedItem(Decoder.genderDecode(bean.getGender()));
            contactText.setText(bean.getContact());
            remarksArea.setText(bean.getRemarks());
       }catch(Exception ex){ JOptionPane.showMessageDialog(this, ex);}
   }
   
   private void searchPatientById(){
        searchList.clearSelection();
        String id = searchByIdText.getText().toUpperCase();
        if(id.equals(""))
            return;
        try{
            PatientBean bean = DatabaseManager.searchPatientById(id);
            if(bean==null){
                JOptionPane.showMessageDialog(this ,"No Patient Found.");
                return;
            }
            patientIdText.setText(""+bean.getPatientId());
            firstNameText.setText(bean.getPatientFirstName());
            lastNameText.setText(bean.getPatientLastName());
            ageText.setText(""+bean.getAge());
            genderComboBox.setSelectedItem(Decoder.genderDecode(bean.getGender()));
            contactText.setText(bean.getContact());
            remarksArea.setText(bean.getRemarks());
        }catch(Exception ex){ JOptionPane.showMessageDialog(this, ex);}
   }
   
   private void clear(){
        patientIdText.setText("");
        firstNameText.setText("");
        lastNameText.setText("");
        ageText.setText("");
        contactText.setText("");
        remarksArea.setText("");
        searchByNameText.setText("");
        searchByContactText.setText("");
        searchByIdText.setText("");
        searchList.clearSelection();
        setMaxPatId();
        clearSearchList();
   }    
   
   private void setMaxPatId(){
//       String patId = "PAT01";
//       try{
//           patId = DatabaseManager.getMaxPatId();
//           System.out.println(patId);
//           int id = Integer.parseInt(patId.substring(3));
//           System.out.println(id);
//           if(id<=8)
//               patId = "PAT0"+(id+1);
//           else
//               patId = "PAT"+(id+1);
//           patientIdText.setText(patId);
//           }catch(Exception ex){ex.printStackTrace();}
//       
       int id = 1;
       String patId = "PAT";
       String newPatId="";
       try{
           id = DatabaseManager.getMaxReceiptId();
           if(id==0)
               id++;
           PatientBean patientBean = null;
           do{
               newPatId = patId + id;
               patientBean = DatabaseManager.searchPatientById(newPatId);
               id++;
           }while(patientBean != null);
       }catch(Exception ex){ex.printStackTrace();}
       patientIdText.setText(newPatId);
   }
   
   private void clearSearchList(){
       searchList.setListData(new Vector());
   }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContactLabel;
    private javax.swing.JPanel StudentBorder;
    private javax.swing.JPanel StudentBorder1;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageText;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField contactText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JButton optionButton;
    private javax.swing.JLabel patientIdLabel;
    private javax.swing.JTextField patientIdText;
    private javax.swing.JLabel patientNameLabel1;
    private javax.swing.JLabel patientNameLabel2;
    private javax.swing.JLabel patientNameLabel3;
    private javax.swing.JTextArea remarksArea;
    private javax.swing.JTextField searchByContactText;
    private javax.swing.JTextField searchByIdText;
    private javax.swing.JTextField searchByNameText;
    private javax.swing.JList searchList;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
    private boolean b = true;
}
