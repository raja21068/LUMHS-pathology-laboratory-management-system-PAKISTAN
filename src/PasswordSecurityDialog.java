import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay & Raja
 */

public class PasswordSecurityDialog extends javax.swing.JDialog {

    public PasswordSecurityDialog(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
	try{
            setIconImage(javax.imageio.ImageIO.read(getClass().getResource("images/key.png")));
        }catch(Exception ex){ex.printStackTrace();}
        this.setLocationRelativeTo(null);
    }

    public void showDialog(){
        setUsers();
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oldPasswordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        saveChangesButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        usernameLabel = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox();
        newPasswordText = new javax.swing.JPasswordField();
        oldPasswordText = new javax.swing.JPasswordField();
        oldPasswordLabel1 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Password Security");
        setPreferredSize(new java.awt.Dimension(400, 275));
        setResizable(false);

        oldPasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oldPasswordLabel.setText("Old Password :");

        newPasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newPasswordLabel.setText("New Password :");

        saveChangesButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        saveChangesButton.setText("Apply Changes");
        saveChangesButton.setPreferredSize(new java.awt.Dimension(143, 40));
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usernameLabel.setText("User Type :");

        typeComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        oldPasswordLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oldPasswordLabel1.setText("Username :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(oldPasswordLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(oldPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(oldPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(newPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(saveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldPasswordLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oldPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(saveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
    private void saveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonActionPerformed
        try{
            TypeBean typeBean = (TypeBean)typeComboBox.getSelectedItem();
            if(typeBean==null)  return;
            String username = usernameText.getText();
            String oldPassword = String.valueOf(oldPasswordText.getPassword());
            String newPassword = String.valueOf(newPasswordText.getPassword());
            
            if(!oldPassword.equals("") && !newPassword.equals("")){
            
                if(DatabaseManager.login(typeBean.getTypeId(), username, oldPassword)){
                        int rows = DatabaseManager.updatePassword(username, newPassword);
                        if(rows>0){
                             clear();
                             setUsers();
                             JOptionPane.showMessageDialog(this, "Password has been UPDATED");
                        }
                        else
                        JOptionPane.showMessageDialog(null, "UNSUCCESSFUL");
                 }
                 else
                 JOptionPane.showMessageDialog(null, "Incorrect USERNAME and PASSWORD");
            }
            else
            JOptionPane.showMessageDialog(null, "Please enter USERNAME and PASSWORD");
          }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    
    
    }//GEN-LAST:event_saveChangesButtonActionPerformed

      private void clear(){
        oldPasswordText.setText("");
        newPasswordText.setText("");
   } 
    
   private void setUsers(){
       try{
           Vector v = DatabaseManager.getAllTypes();
           typeComboBox.removeAllItems();
           for(int k=0 ; k<v.size() ; k++){
               typeComboBox.addItem(v.elementAt(k));
           }
       }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
   } 
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPasswordField newPasswordText;
    private javax.swing.JLabel oldPasswordLabel;
    private javax.swing.JLabel oldPasswordLabel1;
    private javax.swing.JPasswordField oldPasswordText;
    private javax.swing.JButton saveChangesButton;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables

}
