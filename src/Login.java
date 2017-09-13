
/**
 *
 * @author Jay & Raja
 */

import java.io.IOException;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JDialog {

    public Login() {
        try{
            setIconImage(javax.imageio.ImageIO.read(getClass().getResource("images/logo.png")));
        }catch(Exception ex){ex.printStackTrace();}
        initComponents();
        this.setLocationRelativeTo(null);
        setUsers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentInfoLabel = new javax.swing.JLabel();
        pictureLabel = new javax.swing.JLabel();
        categoryBorder = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox();
        passwordText = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login - LIAQUAT UNIVERSITY HOSPITAL HYDERABAD");

        studentInfoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        studentInfoLabel.setForeground(new java.awt.Color(0, 0, 255));
        studentInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentInfoLabel.setText("LIAQUAT UNIVERSITY HOSPITAL HYDERABAD");

        pictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administrator.png"))); // NOI18N

        categoryBorder.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2), "Login", 0, 0, new java.awt.Font("Bauhaus 93", 1, 24), new java.awt.Color(153, 153, 0))); // NOI18N
        categoryBorder.setForeground(new java.awt.Color(51, 204, 0));
        categoryBorder.setLayout(null);

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginButon.png"))); // NOI18N
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        categoryBorder.add(loginButton);
        loginButton.setBounds(250, 150, 78, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("User Type : ");
        categoryBorder.add(jLabel1);
        jLabel1.setBounds(20, 30, 82, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Username :");
        categoryBorder.add(jLabel2);
        jLabel2.setBounds(20, 70, 90, 30);

        typeComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        typeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeComboBoxItemStateChanged(evt);
            }
        });
        categoryBorder.add(typeComboBox);
        typeComboBox.setBounds(120, 30, 210, 30);

        passwordText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        categoryBorder.add(passwordText);
        passwordText.setBounds(120, 110, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Password :");
        categoryBorder.add(jLabel3);
        jLabel3.setBounds(20, 110, 76, 30);
        categoryBorder.add(usernameText);
        usernameText.setBounds(120, 70, 210, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryBorder, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(studentInfoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(studentInfoLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        new Login().setVisible(true);
    }
    

    
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        login();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void typeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeComboBoxItemStateChanged
        try {
            TypeBean bean = (TypeBean)typeComboBox.getSelectedItem();
            if(bean==null)  return;
            
            ImageIcon img = new javax.swing.ImageIcon(javax.imageio.ImageIO.read(getClass().getResource("images/"+bean.getTypeName()+".png")));
            pictureLabel.setIcon(img);
            passwordText.setText("");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_typeComboBoxItemStateChanged

private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
    login();
}//GEN-LAST:event_passwordTextActionPerformed

        
    private void setUsers(){
       try{
           Vector v = DatabaseManager.getAllTypes();
           typeComboBox.removeAllItems();
           for(int k=0 ; k<v.size() ; k++){
               typeComboBox.addItem(v.elementAt(k));
           }
       }catch(Exception ex){JOptionPane.showMessageDialog(this, ex); ex.printStackTrace();}
   }
    
    private void login(){
        TypeBean bean = (TypeBean)typeComboBox.getSelectedItem();
        if(bean==null)  return;
        
        String username = usernameText.getText();
        if(username.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Username");
            return;
        }
        
        String password = String.valueOf(passwordText.getPassword());
        if(password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Password");
            return;
        }
        
        try{
            if(DatabaseManager.loginUser(bean.getTypeId(), username, password)){
                if(bean.getTypeName().equals("ADMINISTRATOR")){
                    new AdministratorMainFrame().setVisible(true);
                    this.dispose();
                }
                
                else if(bean.getTypeName().equals("RECEPTIONIST")){
                    new ReceptionFrame().setVisible(true);
                    this.dispose();
                }
                
                else if(bean.getTypeName().equals("LABORATORY")){
                    new GenerateReportFrame().showFrame();
                    this.dispose();
                }
                
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Incorrect Username/Password");
            }
        }catch(Exception ex){ex.printStackTrace();}
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel categoryBorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JLabel studentInfoLabel;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables

}
