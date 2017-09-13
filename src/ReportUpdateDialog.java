import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class ReportUpdateDialog extends javax.swing.JFrame {
   
    javax.swing.table.DefaultTableModel tableModel;
    public ReportUpdateDialog() {
        initComponents();
        setLocationRelativeTo(null);
	try{
            setIconImage(javax.imageio.ImageIO.read(getClass().getResource("images/logo.png")));
        }catch(Exception ex){ex.printStackTrace();}
	tableModel = (javax.swing.table.DefaultTableModel) this.table.getModel();
        
    }
    
    
    public void showDialog(){
         setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportIdLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        reportIdText = new javax.swing.JTextField();
        moveButton = new javax.swing.JButton();
        doctorBorder2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        testList = new javax.swing.JList();
        backButton = new javax.swing.JButton();
        clearAllButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Report Update Dialog");
        setMinimumSize(new java.awt.Dimension(870, 575));
        setResizable(false);

        reportIdLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reportIdLabel.setForeground(new java.awt.Color(0, 0, 255));
        reportIdLabel.setText("Report ID:");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parameters/Heading", "Results", "Normal Range"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(1).setPreferredWidth(30);
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);

        updateButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        reportIdText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reportIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportIdTextActionPerformed(evt);
            }
        });

        moveButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        moveButton.setText(">>>");
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        doctorBorder2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Tests", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jScrollPane4.setViewportView(testList);

        javax.swing.GroupLayout doctorBorder2Layout = new javax.swing.GroupLayout(doctorBorder2);
        doctorBorder2.setLayout(doctorBorder2Layout);
        doctorBorder2Layout.setHorizontalGroup(
            doctorBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doctorBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        doctorBorder2Layout.setVerticalGroup(
            doctorBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorBorder2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );

        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        clearAllButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearAllButton1.setText("Clear All");
        clearAllButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reportIdLabel)
                                .addGap(16, 16, 16)
                                .addComponent(reportIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(doctorBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(445, 445, 445)
                        .addComponent(clearAllButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reportIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reportIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(doctorBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearAllButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       String id = reportIdText.getText();
        if(id.equals(""))
            return;
        int totalRows = tableModel.getRowCount();
        if(totalRows==0){
            JOptionPane.showMessageDialog(this, "Report Table is Empty.");
            return;
        }
        for(int k=0 ; k<totalRows ; k++){
            TestsParamsBean testsParamsBean = (TestsParamsBean)tableModel.getValueAt(k, 0);
            if(testsParamsBean!=null){
                try{
                  
                    int reportDetailId = testsParamsBean.getReportDetailId();

                    String paramName = testsParamsBean.getTestParamsName();
                    if(paramName.startsWith("#") || paramName.startsWith("!") || paramName.startsWith("\\")){
                        DatabaseManager.updateReportRemarks(reportDetailId, paramName);
                    }

                    else{
                         String testResult = tableModel.getValueAt(k, 1).toString();
                        if(testResult.equals(""))
                            testResult = " ";
                        DatabaseManager.updateReportDetails(reportDetailId, testResult);
                    }
               
                }catch(Exception ex){ex.printStackTrace();}
            }
            
        }
      JOptionPane.showMessageDialog(this ,"Report is Successfully Updated!!");
      clearTable();
      
      if(generatedTests.size()==0)
          clearAll();
      
    }//GEN-LAST:event_updateButtonActionPerformed

    private void reportIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportIdTextActionPerformed
         try{
             int reportId = Integer.parseInt(reportIdText.getText());
             if(lastReportId==reportId)
                 return;
             
             generatedTests = new Vector();
             testList.setListData(generatedTests);
             Vector<TestsAtReportsBean> v = DatabaseManager.getAllTestsAtReports(reportId);

                for(int k=0 ; k<v.size() ; k++){
                    TestsAtReportsBean bean = v.elementAt(k);
                    if(bean.getGenerated()==Constants.GENERATED)
                        generatedTests.addElement(bean);
                }

                testList.setListData(generatedTests);
                lastReportId = reportId;
            }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }//GEN-LAST:event_reportIdTextActionPerformed

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed

        if(tableModel.getRowCount()!=0)
        return;

        TestsAtReportsBean testsAtReportsBean = (TestsAtReportsBean)testList.getSelectedValue();
        if(testsAtReportsBean == null) return;

        try{
          Vector<ReportDetailsBean> v = DatabaseManager.getAllReportDetails(testsAtReportsBean.getTestAtReportId());
          for(int k=0 ; k<v.size() ; k++){
              ReportDetailsBean reportDetailsBean = v.elementAt(k);

              int testParamId = reportDetailsBean.getTestParamId();
              if(testParamId==-1){
                  TestsParamsBean testsParamsBean = new TestsParamsBean();
                  testsParamsBean.setTestParamsId(-1);
                  testsParamsBean.setTestParamsName(reportDetailsBean.getManualHeading());
                  testsParamsBean.setReportDetailId(reportDetailsBean.getReportDetailId());
                  tableModel.addRow(new Object[]{testsParamsBean, "", ""});
              }
              else{
                    TestsParamsBean testsParamsBean = DatabaseManager.TestParamsBean(testParamId);
                    testsParamsBean.setReportDetailId(reportDetailsBean.getReportDetailId());
                    tableModel.addRow(new Object[]{testsParamsBean, reportDetailsBean.getTestResult(), testsParamsBean.getTestParamsRange()});
              }

          }
        }catch(Exception ex){ex.printStackTrace();}

        generatedTests.removeElement(testsAtReportsBean);
         testList.setListData(generatedTests);
 
    }//GEN-LAST:event_moveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        
    }//GEN-LAST:event_tableKeyPressed

    private void clearAllButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllButton1ActionPerformed
        clearAll();
    }//GEN-LAST:event_clearAllButton1ActionPerformed

    
  private int getMaxReportDetailId(){
        int id = 1;
        try{
            id = DatabaseManager.getMaxReportDetailId();
        }catch(Exception ex){ex.printStackTrace();}
        return id;
    }
    
    private void clearAll(){
        reportIdText.setText("");
        testList.clearSelection();
        generatedTests = new Vector();
        testList.setListData(generatedTests);
        clearTable();
        this.lastReportId = 0;
    }
    
    
    private void clearTable(){
        int totalRows = tableModel.getRowCount();
        for(int k=0 ; k<totalRows ; k++){
            tableModel.removeRow(0);
        }
    }

    
   private Vector<TestsAtReportsBean> generatedTests = new Vector();
   private int lastReportId=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearAllButton1;
    private javax.swing.JPanel doctorBorder2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton moveButton;
    private javax.swing.JLabel reportIdLabel;
    private javax.swing.JTextField reportIdText;
    private javax.swing.JTable table;
    private javax.swing.JList testList;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
