
import java.util.Vector;

/**
 *
 * @author SalmanKhawaja
 */
public class WidalTestDialog extends javax.swing.JDialog {

    private GenerateReportFrame reportFrame;
    public WidalTestDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        reportFrame = (GenerateReportFrame)parent;
        initComponents();
        setLocationRelativeTo(null);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clearButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        remarksText = new javax.swing.JTextField();
        t20 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t16 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        t17 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t13 = new javax.swing.JTextField();
        t18 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t14 = new javax.swing.JTextField();
        t19 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t15 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Widal Test");
        setMinimumSize(new java.awt.Dimension(1120, 490));
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        clearButton.setFont(new java.awt.Font("Arial", 1, 12));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(680, 380, 180, 30);

        saveButton.setFont(new java.awt.Font("Arial", 1, 12));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton);
        saveButton.setBounds(880, 380, 180, 30);
        getContentPane().add(remarksText);
        remarksText.setBounds(230, 380, 210, 30);

        t20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t20.setText("+ve");
        getContentPane().add(t20);
        t20.setBounds(990, 280, 60, 30);

        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setText("+ve");
        getContentPane().add(t1);
        t1.setBounds(720, 160, 50, 30);

        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t6.setText("+ve");
        getContentPane().add(t6);
        t6.setBounds(720, 200, 50, 30);

        t11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t11.setText("+ve");
        getContentPane().add(t11);
        t11.setBounds(720, 240, 50, 30);

        t16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t16.setText("+ve");
        getContentPane().add(t16);
        t16.setBounds(720, 280, 50, 30);

        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.setText("+ve");
        getContentPane().add(t2);
        t2.setBounds(780, 160, 60, 30);

        t7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t7.setText("+ve");
        getContentPane().add(t7);
        t7.setBounds(780, 200, 60, 30);

        t12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t12.setText("+ve");
        getContentPane().add(t12);
        t12.setBounds(780, 240, 60, 30);

        t17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t17.setText("+ve");
        getContentPane().add(t17);
        t17.setBounds(780, 280, 60, 30);

        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.setText("+ve");
        getContentPane().add(t3);
        t3.setBounds(850, 160, 50, 30);

        t8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t8.setText("+ve");
        getContentPane().add(t8);
        t8.setBounds(850, 200, 50, 30);

        t13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t13.setText("+ve");
        getContentPane().add(t13);
        t13.setBounds(850, 240, 50, 30);

        t18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t18.setText("+ve");
        getContentPane().add(t18);
        t18.setBounds(850, 280, 50, 30);

        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.setText("+ve");
        getContentPane().add(t4);
        t4.setBounds(910, 160, 60, 30);

        t9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t9.setText("+ve");
        getContentPane().add(t9);
        t9.setBounds(910, 200, 60, 30);

        t14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t14.setText("+ve");
        getContentPane().add(t14);
        t14.setBounds(910, 240, 60, 30);

        t19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t19.setText("+ve");
        getContentPane().add(t19);
        t19.setBounds(910, 280, 60, 30);

        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5.setText("+ve");
        getContentPane().add(t5);
        t5.setBounds(990, 160, 60, 30);

        t10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t10.setText("+ve");
        getContentPane().add(t10);
        t10.setBounds(990, 200, 60, 30);

        t15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t15.setText("+ve");
        getContentPane().add(t15);
        t15.setBounds(990, 240, 60, 30);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Widal.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 450);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 0, 1090, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(t1.getText().isEmpty()&&t2.getText().isEmpty()&&t3.getText().isEmpty()&&t4.getText().isEmpty()&&t5.getText().isEmpty()&&t6.getText().isEmpty()&&t7.getText().isEmpty()&&t8.getText().isEmpty()&&t9.getText().isEmpty()&&t10.getText().isEmpty()&&t11.getText().isEmpty()&&t12.getText().isEmpty()&&t13.getText().isEmpty()&&t14.getText().isEmpty()&&t15.getText().isEmpty()&&t16.getText().isEmpty()&&t17.getText().isEmpty()&&t18.getText().isEmpty()&&t19.getText().isEmpty()&&t20.getText().isEmpty()){
            return;
        }
        
        try{
            String p[] = new String[4];
            p[0] = t1.getText() + ";" + t2.getText() + ";" + t3.getText() + ";" + t4.getText() + ";" + t5.getText();
            p[1] = t6.getText() + ";" + t7.getText() + ";" + t8.getText() + ";" + t9.getText() + ";" + t10.getText();
            p[2] = t11.getText() + ";" + t12.getText() + ";" + t13.getText() + ";" + t14.getText() + ";" + t15.getText();
            p[3] = t16.getText() + ";" + t17.getText() + ";" + t18.getText() + ";" + t19.getText() + ";" + t20.getText();
            String remarks = remarksText.getText();
            if(!remarks.isEmpty()){
                remarks = "#WIDAL TEST: "+remarks;
            }
            
            TestsBean testBean = DatabaseManager.getTestAtId(38);
            if(testBean!=null){
                Vector<TestsParamsBean> v = DatabaseManager.getAllTestsParams(testBean.getTestId());
                for(int k=-0 ; k<v.size() ; k++){
                    TestsParamsBean testsParamsBean = v.elementAt(k);
                    reportFrame.tableModel.addRow(new Object[]{testsParamsBean, p[k], testsParamsBean.getTestParamsRange()});
                }
                if(!remarks.isEmpty()){
                    reportFrame.tableModel.addRow(new Object[]{remarks, "", ""});
                }
            }
            
            this.dispose();
        }catch(Exception ex){ex.printStackTrace();}
    }//GEN-LAST:event_saveButtonActionPerformed

    
    private  void clear(){
    t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
    t5.setText("");
    t6.setText("");
    t7.setText("");
    t8.setText("");
    t9.setText("");
    t10.setText("");
    t11.setText("");
    t12.setText("");
    t13.setText("");
    t14.setText("");
    t15.setText("");
    t16.setText("");
    t17.setText("");
    t18.setText("");
    t19.setText("");
    t20.setText("");
    remarksText.setText("");
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField remarksText;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextField t17;
    private javax.swing.JTextField t18;
    private javax.swing.JTextField t19;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t20;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
