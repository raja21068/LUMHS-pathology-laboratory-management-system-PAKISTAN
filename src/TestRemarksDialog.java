
public class TestRemarksDialog extends javax.swing.JDialog {

    GenerateReportFrame generateReportFrame;
    public TestRemarksDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        generateReportFrame = (GenerateReportFrame)parent;
        initComponents();
        setLocationRelativeTo(null);
    }

    public void showDialog(){
        setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksArea = new javax.swing.JTextArea();
        saveRemarksButton = new javax.swing.JButton();
        clearAllButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Test Remarks");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Add Test Remarks :");

        remarksArea.setColumns(20);
        remarksArea.setRows(5);
        jScrollPane1.setViewportView(remarksArea);

        saveRemarksButton.setText("Save Remarks");
        saveRemarksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveRemarksButtonActionPerformed(evt);
            }
        });

        clearAllButton.setText("Clear All");
        clearAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllButtonActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 315, Short.MAX_VALUE)
                        .addComponent(clearAllButton)
                        .addGap(18, 18, 18)
                        .addComponent(saveRemarksButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveRemarksButton)
                    .addComponent(clearAllButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllButtonActionPerformed
        remarksArea.setText("");
    }//GEN-LAST:event_clearAllButtonActionPerformed

    private void saveRemarksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRemarksButtonActionPerformed
        String remarks = remarksArea.getText();
        if(remarks.equals(""))
            this.dispose();
        else{
            
            String line[] = remarks.split("\n");
            for(int k=0 ; k<line.length ; k++){
                if(!line[k].startsWith("#"))
                    line[k] = "!" + line[k];
                generateReportFrame.tableModel.addRow(new Object[]{line[k], "", ""});
            }
            this.dispose();
        }
    }//GEN-LAST:event_saveRemarksButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearAllButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea remarksArea;
    private javax.swing.JButton saveRemarksButton;
    // End of variables declaration//GEN-END:variables
}
