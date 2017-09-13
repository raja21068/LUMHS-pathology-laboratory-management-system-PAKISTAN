
import java.util.Date;
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

public class DaySummaryDialog extends javax.swing.JDialog {

    public DaySummaryDialog(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
	try{
            setIconImage(javax.imageio.ImageIO.read(getClass().getResource("images/date.png")));
        }catch(Exception ex){ex.printStackTrace();}
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalBalanceLabel = new javax.swing.JLabel();
        totalBalanceText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        toDateLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        toDateText = new javax.swing.JFormattedTextField();
        fromDateText = new javax.swing.JFormattedTextField();
        fromDateLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Day Summary");
        setResizable(false);

        totalBalanceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalBalanceLabel.setText("Total Balance");

        totalBalanceText.setEditable(false);

        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        toDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        toDateLabel.setText("To Date");

        try {
            toDateText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-ULL-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        toDateText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDateTextActionPerformed(evt);
            }
        });

        try {
            fromDateText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-ULL-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fromDateText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fromDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromDateTextActionPerformed(evt);
            }
        });

        fromDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fromDateLabel.setText("From Date");

        clearButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(totalBalanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fromDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(toDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fromDateText, toDateText});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(toDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fromDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fromDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalBalanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showDialog(){
        setDate();
        setVisible(true);
    }   
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void toDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDateTextActionPerformed
       getDaySummaryDatewise();
    }//GEN-LAST:event_toDateTextActionPerformed

    private void fromDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromDateTextActionPerformed
       getDaySummaryDatewise();
    }//GEN-LAST:event_fromDateTextActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void getDaySummaryDatewise(){
        String fromDate = fromDateText.getText().trim();
        String toDate = toDateText.getText().trim();
        if(fromDate.trim().length()!=11 || toDate.trim().length()!=11)
            return;
        int totalBalance = 0;
        try{
            Vector<DaysBean> v = DatabaseManager.daySummaryDatewise(fromDate, toDate);
            if(v.size()==0){
                    clear();
                    return;
            }
                
            for(int i=0; i<v.size(); i++){
                DaysBean bean = v.elementAt(i); 
                totalBalance += bean.getBalance();
            }
                
           }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
            
         totalBalanceText.setText(""+totalBalance);
    } 
    
     private void setDate(){
        fromDateText.setText(DateFormatter.dateToString(new Date()));
        toDateText.setText(DateFormatter.dateToString(new Date()));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel fromDateLabel;
    private javax.swing.JFormattedTextField fromDateText;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel toDateLabel;
    private javax.swing.JFormattedTextField toDateText;
    private javax.swing.JLabel totalBalanceLabel;
    private javax.swing.JTextField totalBalanceText;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        totalBalanceText.setText("");
    }

}
