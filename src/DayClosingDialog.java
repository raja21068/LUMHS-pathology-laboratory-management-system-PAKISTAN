
import java.util.Vector;
import javax.swing.JOptionPane;

public class DayClosingDialog extends javax.swing.JDialog {

    public DayClosingDialog(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void showDialog(){
        setDays();
        setVisible(true);
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalBalanceLabel = new javax.swing.JLabel();
        totalBalanceText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        closeDayButton = new javax.swing.JButton();
        dayLabel = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Day Closing");
        setMinimumSize(new java.awt.Dimension(660, 267));
        setResizable(false);

        totalBalanceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalBalanceLabel.setText("Total Balance");

        totalBalanceText.setEditable(false);
        totalBalanceText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalBalanceText.setForeground(new java.awt.Color(0, 0, 255));
        totalBalanceText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        totalBalanceText.setText("0");

        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        closeDayButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        closeDayButton.setText("Close Day");
        closeDayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeDayButtonActionPerformed(evt);
            }
        });

        dayLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dayLabel.setText("Day");

        dayComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dayComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(totalBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(totalBalanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(closeDayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeDayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(totalBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalBalanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    private void closeDayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeDayButtonActionPerformed
     DaysBean daysBean = (DaysBean)dayComboBox.getSelectedItem();
      if(daysBean==null)    return;
      
      int day_id=daysBean.getDayId();
      String day=DateFormatter.dateToString(daysBean.getDay());
      int balance=daysBean.getBalance();
      int closed=Constants.CLOSED;
      String remarks=daysBean.getRemarks();
      try {
        int r = DatabaseManager.updateDays(day_id,day,daysBean.getDues(), daysBean.getDiscount(), balance,closed,remarks);
        if(r>0){
            setDays();
            JOptionPane.showMessageDialog(this, "Day successfully closed.");
        }
      }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
      }
    }//GEN-LAST:event_closeDayButtonActionPerformed

    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void dayComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dayComboBoxItemStateChanged
        DaysBean daysBean = (DaysBean)dayComboBox.getSelectedItem();
        if(daysBean==null)  return;
        
        this.totalBalanceText.setText(""+daysBean.getBalance());
        
        if(Constants.CLOSED==daysBean.getClosed())
            this.closeDayButton.setEnabled(false);
        else
            this.closeDayButton.setEnabled(true); 
        
    }//GEN-LAST:event_dayComboBoxItemStateChanged
  private void setDays(){
        try{
            Vector<DaysBean> v = DatabaseManager.getAllDays();
            int totalDays = 30;
            if(v.size()<30)
                totalDays = v.size();
            dayComboBox.removeAllItems();
            for(int k=0 ; k<totalDays ; k++){
                dayComboBox.addItem(v.elementAt(k));
            }
            }catch(Exception ex){JOptionPane.showMessageDialog(null,ex);}
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton closeDayButton;
    private javax.swing.JComboBox dayComboBox;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel totalBalanceLabel;
    private javax.swing.JTextField totalBalanceText;
    // End of variables declaration//GEN-END:variables

}
