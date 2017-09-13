
import java.util.Vector;
import javax.swing.JOptionPane;


public class NewUserAccountDialog extends javax.swing.JDialog {

    
    public NewUserAccountDialog() {
        initComponents();
        this.setLocationRelativeTo(null);
        setAllTypes();
    }

   public void showDialog(){
         setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        doctorBorder = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userIdText = new javax.swing.JTextField();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JTextField();
        retypePasswordText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Account dialog");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(580, 410));

        typeComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        typeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeComboBoxItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("User Type : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Username :");

        doctorBorder.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Usernames", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        list.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(list);

        javax.swing.GroupLayout doctorBorderLayout = new javax.swing.GroupLayout(doctorBorder);
        doctorBorder.setLayout(doctorBorderLayout);
        doctorBorderLayout.setHorizontalGroup(
            doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(doctorBorderLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        doctorBorderLayout.setVerticalGroup(
            doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(doctorBorderLayout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "User Actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setLayout(null);

        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton);
        backButton.setBounds(420, 27, 84, 32);

        clearButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel2.add(clearButton);
        clearButton.setBounds(330, 27, 78, 32);

        updateButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(updateButton);
        updateButton.setBounds(220, 27, 90, 32);

        addButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addButton);
        addButton.setBounds(20, 27, 80, 32);

        deleteButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setPreferredSize(new java.awt.Dimension(51, 23));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(deleteButton);
        deleteButton.setBounds(120, 27, 86, 32);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Re-Type Password :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("User ID :");

        userIdText.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(retypePasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(doctorBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctorBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(userIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(retypePasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeComboBoxItemStateChanged
        TypeBean bean = (TypeBean)typeComboBox.getSelectedItem();
        if(bean == null)
            return;
        setList(bean);
}//GEN-LAST:event_typeComboBoxItemStateChanged

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
        UsersBean bean = (UsersBean)list.getSelectedValue();
        if(bean == null)
            return;
        userIdText.setText(""+bean.getUserId());
        usernameText.setText(bean.getUserName());
        passwordText.setText(bean.getUserPassword());
        retypePasswordText.setText(bean.getUserPassword());
        
}//GEN-LAST:event_listValueChanged

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
}//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       clear();
}//GEN-LAST:event_clearButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        int typeID = ((TypeBean)typeComboBox.getSelectedItem()).getTypeId();

         int active=0;
        
        String username = usernameText.getText();
        if(username.isEmpty()){
            JOptionPane.showMessageDialog(this, "Username is not ENTERED");
            return;
        }
        String password = passwordText.getText();
        if(password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Password is not ENTERED");
            return;
        }
        String retypePassword = retypePasswordText.getText();
        if(retypePassword.isEmpty()){
            JOptionPane.showMessageDialog(this, "Re-Type Password is not ENTERED");
            return;
        }

        if(!password.equals(retypePassword)){
            JOptionPane.showMessageDialog(this, "Password do not MATCHED");
            return;
        }

        try{
            int userId = Integer.parseInt(userIdText.getText());
            int rows = DatabaseManager.updateUser(userId,username, password, typeID, active);
            if(rows>0){
                clear();
                JOptionPane.showMessageDialog(this, "USER is Successfully UPDATED");
                setList((TypeBean)typeComboBox.getSelectedItem());
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
}//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

       int typeID = ((TypeBean)typeComboBox.getSelectedItem()).getTypeId();

       String username = usernameText.getText();
        if(username.isEmpty()){
            JOptionPane.showMessageDialog(this, "Username is not ENTERED");
            return;
        }
         String password = passwordText.getText();
        if(password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Password is not ENTERED");
            return;
        }
        String retypePassword = retypePasswordText.getText();
        if(retypePassword.isEmpty()){
            JOptionPane.showMessageDialog(this, "Re-Type Password is not ENTERED");
            return;
        }

       if(!password.equals(retypePassword)){
            JOptionPane.showMessageDialog(this, "Password do not MATCHED");
            return;
        }

        int active=0;
       
        try{
            int userId = DatabaseManager.getMaxUserId();
            int rows = DatabaseManager.insertUser(userId+1,username, password, typeID, active);
            if(rows>0){
                clear();
                JOptionPane.showMessageDialog(this, "USER is Successfully ADDED");
                setList((TypeBean)typeComboBox.getSelectedItem());
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
}//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        try{
            int userId = DatabaseManager.getMaxUserId();
            int rows = DatabaseManager.deleteUser(userId);
            if(rows>0){
                clear();
                JOptionPane.showMessageDialog(this, "Record is Successfully DELETED");
                setList((TypeBean)typeComboBox.getSelectedItem());
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
}//GEN-LAST:event_deleteButtonActionPerformed

    private void setAllTypes(){
        Vector<TypeBean> v = new Vector();
        try{
            v = DatabaseManager.getAllTypes();
            typeComboBox.removeAllItems();
            for(int k=0 ; k<v.size() ;k ++)
                typeComboBox.addItem(v.elementAt(k));
        }catch(Exception ex){ex.printStackTrace();}
    }

    private void clear(){
        userIdText.setText("");
        usernameText.setText("");
        passwordText.setText("");
        retypePasswordText.setText("");
    }

    private void setList(TypeBean bean){
        try{
        Vector v = DatabaseManager.getAllUsers(bean.getTypeId());
        if(v != null){
            list.setListData(v);
            list.setSelectedIndex(0);
        }
        }catch(Exception ex){ex.printStackTrace();}
    }

     private void setUsers(){
        try{
        Vector v = DatabaseManager.getAllUsers();
        if(v != null){
            list.setListData(v);
            list.setSelectedIndex(0);
        }
        }catch(Exception ex){ex.printStackTrace();}
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel doctorBorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList list;
    private javax.swing.JTextField passwordText;
    private javax.swing.JTextField retypePasswordText;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField userIdText;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables

}
