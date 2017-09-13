
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Jay & Raja
 */
public class PatientReportDialog extends javax.swing.JDialog {

    public PatientReportDialog(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public void showDialog(){
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        receiptNoText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        patientNameText = new javax.swing.JTextField();
        patientIdText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        printReportButton = new javax.swing.JButton();
        clearAllButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ungeneratedTestList = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        generatedTestList = new javax.swing.JList();
        moveButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        toPrintTestList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Print Report");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Receipt No");

        receiptNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptNoTextActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Details", 0, 0, new java.awt.Font("Times New Roman", 1, 18), java.awt.Color.blue)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Patient ID");

        patientNameText.setEditable(false);

        patientIdText.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Patient Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(patientIdText))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(patientIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(patientNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {patientIdText, patientNameText});

        printReportButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        printReportButton.setText("Print Report");
        printReportButton.setEnabled(false);
        printReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReportButtonActionPerformed(evt);
            }
        });

        clearAllButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearAllButton.setText("Clear All");
        clearAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Un-Generated", 0, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jScrollPane1.setViewportView(ungeneratedTestList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Generated", 0, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jScrollPane2.setViewportView(generatedTestList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        moveButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        moveButton.setText(">>");
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "To Print", 0, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        toPrintTestList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                toPrintTestListKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(toPrintTestList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearAllButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(receiptNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receiptNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clearAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void receiptNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptNoTextActionPerformed

        String receipt = receiptNoText.getText();
        if(receipt.isEmpty()){
            clearAll();
            return;
        }
        
        int receiptNo = 0;
        try{
            receiptNo = Integer.parseInt(receipt);
        }catch(NumberFormatException e){ clearAll(); JOptionPane.showMessageDialog(this, "The receipt No. enetered is not correct."); return;}
        
        try {
            if(receiptNo>0){
                ReciptsBean reciptBean = DatabaseManager.getReceiptAtId(receiptNo);
                if(reciptBean==null){
                    JOptionPane.showMessageDialog(this, "Invalid receipt number.");
                    clearAll();
                    return;
                }
                
                ReportsBean reportBean = DatabaseManager.getReportAtReceipt(receiptNo);
                if(reportBean == null){
                    JOptionPane.showMessageDialog(this, "Invalid receipt number.");
                    clearAll();
                    return;
                }
                
                String patId = reciptBean.getPatId();
                PatientBean patientBean = DatabaseManager.searchPatientById(patId);
                if(patientBean==null) return;

                String patName = patientBean.getPatientFirstName()+" "+patientBean.getPatientLastName();
                int dues = patientBean.getDues();

                patientIdText.setText(patId);
                patientNameText.setText(patName);
                
                
                Vector<TestsAtReportsBean> v = DatabaseManager.getAllTestsAtReports(reportBean.getReportId());
                Vector<TestsAtReportsBean> ungeneratedTests = new Vector();
                Vector<TestsAtReportsBean> generatedTests = new Vector();
                
                for(int k=0 ; k<v.size() ; k++){
                    TestsAtReportsBean bean = v.elementAt(k);
                    if(bean.getGenerated()==Constants.GENERATED)
                        generatedTests.addElement(bean);
                    else
                        ungeneratedTests.addElement(bean);
                }
                ungeneratedTestList.setListData(ungeneratedTests);
                generatedTestList.setListData(generatedTests);    
            }

        } catch (Exception ex) { JOptionPane.showMessageDialog(this, ex); }
    }//GEN-LAST:event_receiptNoTextActionPerformed

    private void clearAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllButtonActionPerformed
        clearAll();
    }//GEN-LAST:event_clearAllButtonActionPerformed

    private void printReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReportButtonActionPerformed
        new Thread(){
            @Override
            public void run(){
                printReport();
            }
        }.start();
    }//GEN-LAST:event_printReportButtonActionPerformed

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed
        TestsAtReportsBean testAtReportBean = (TestsAtReportsBean)generatedTestList.getSelectedValue();
        if(testAtReportBean==null)  return;
        
        toPrintTest.addElement(testAtReportBean);
        toPrintTestList.setListData(toPrintTest);
        
        setButtonStatus(true);
    }//GEN-LAST:event_moveButtonActionPerformed

    private void toPrintTestListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toPrintTestListKeyReleased
        if(evt.getKeyCode()==evt.VK_DELETE){
            TestsAtReportsBean bean = (TestsAtReportsBean)toPrintTestList.getSelectedValue();
            if(bean==null)  return;
            
            toPrintTest.remove(bean);
            toPrintTestList.setListData(toPrintTest);
        }
    }//GEN-LAST:event_toPrintTestListKeyReleased

    private void clearAll(){
        receiptNoText.setText("");
        patientIdText.setText("");
        patientNameText.setText("");
        ungeneratedTestList.setListData(new Vector());
        generatedTestList.setListData(new Vector());
        toPrintTest.removeAllElements();
        toPrintTestList.setListData(new Vector());
        setButtonStatus(false);
        
    }
    
    private void setButtonStatus(boolean b){
        printReportButton.setEnabled(b);
    }
    
    private void printReport(){
        String id = receiptNoText.getText();
        if(id.isEmpty())    return;
        int receiptId = 0;
        try{
            receiptId = Integer.parseInt(id);
        }catch(NumberFormatException ex){JOptionPane.showMessageDialog(this, "Invalid Receipt No."); return;}
        
        if(toPrintTest.size()<=0){
            JOptionPane.showMessageDialog(this, "No Test(s) selected to print.");
            return;
        }
        
        
        try{
            ReportsBean reportBean = DatabaseManager.getReportAtReceipt(receiptId);
            if(reportBean==null)
                return;
            
            Vector<String> tempVector = new Vector();
            
            for(int i=0 ; i<toPrintTest.size(); i++){
                
                    TestsAtReportsBean testAtReportBean = (TestsAtReportsBean)toPrintTest.elementAt(i);
                    if(testAtReportBean!=null){

                    Vector<ReportDetailsBean> v = DatabaseManager.getAllReportDetails(testAtReportBean.getTestAtReportId());
                    for(int k=0 ; k<v.size() ; k++){

                    ReportDetailsBean reportDetailsBean = v.elementAt(k);
                    int testParamId = reportDetailsBean.getTestParamId();

                    // -1 denoted that its NOT param, its Heading OR SimpleText OR URL 
                    if(testParamId==-1){
                        String manualHeading = reportDetailsBean.getManualHeading();
                        // If starts with #, than its heading
                        if(manualHeading.startsWith("#")){
                            if(tempVector.size()!=0)
                                tempVector.addElement("");
                            tempVector.addElement(manualHeading);

                        }
                        else if(manualHeading.startsWith("!")){
                            manualHeading = manualHeading.substring(1);
                            tempVector.addElement(manualHeading);
                        }
                        // if not starts with #, than its url
                        else{
                            String str = getFileStuff(manualHeading);
                            String s[] = str.split("&&");
                            for(int l=0 ; l<s.length ; l++){
                                tempVector.addElement(s[l]);
                            }
                        }
                    }


                    // Its Param
                    else{
                        TestsParamsBean testParamBean = DatabaseManager.getTestParamAtId(testParamId);
                        if(testParamBean!=null){

                            // If its Widal
                            if(testParamBean.getTestId()==Constants.WIDAL){
                                itsWidal(reportBean, v);
                                return;
                            }

                            String paramName = testParamBean.getTestParamsName();
                            String paramRange = testParamBean.getTestParamsRange();
                            if(paramRange==null)
                                paramRange = "";

                            // if Test name is large it contains semi-colon.
                            if(paramName.contains(";")){
                                String s[] = paramName.split(";");
                                String line = s[0] + ";" + reportDetailsBean.getTestResult() + ";" + testParamBean.getTestParamsRange();
                                tempVector.addElement(line);
                                line = s[1] + ";" + ";";
                                tempVector.addElement(line);
                            }


                            else if(paramRange.contains(";")){
                                String s[] = paramRange.split(";");
                                String line = paramName + ";" + reportDetailsBean.getTestResult() + ";" + s[0];
                                tempVector.addElement(line);
                                for(int m=1 ; m<s.length ; m++){
                                    line = ";"+";"+s[m];
                                    tempVector.addElement(line);
                                }
                            }

                            else{
                                String line = paramName + ";" + reportDetailsBean.getTestResult() + ";" + paramRange;
                                tempVector.addElement(line);
                            }
                        }
                    }
                }
                    
                }
                
            }
            PageFormat pageFormat = PrintReport.getReportPageFormat();
            Book book = new Book();
            BackupReport b1 = null;
            BackupReport b2 = null;
            BackupReport b3 = null;
            
            if(tempVector.size()<=32){
                PrintReport report = new PrintReport(reportBean, tempVector);
                book.append(report, pageFormat);
                // Backup
                b1 = new BackupReport(reportBean, tempVector);
            }
            
            else{
                int counter = 0;
                int total = tempVector.size();
                total = total - 32;
                
                Vector<String> v1 = new Vector();
                for(int k=0 ; k<32 ; k++){
                    v1.addElement(tempVector.elementAt(counter));
                    counter++;
                }
                PrintReport r1 = new PrintReport(reportBean, v1);
                book.append(r1, pageFormat);
                // Backup
                b1 = new BackupReport(reportBean, v1);
                
                int pages = total / 50;
                int remaining = total % 50;
                
                for(int k=0 ; k<pages ; k++){
                    Vector<String> v2 = new Vector();
                    for(int l=0 ; l<50 ; l++){
                        v2.addElement(tempVector.elementAt(counter));
                        counter++;
                    }
                    PrintReport r2 = new PrintReport(reportBean, v2);
                    book.append(r2, pageFormat);
                    // Backup
                    b2 = new BackupReport(reportBean, v2);
                }
                
                Vector<String> v3 = new Vector();
                for(int k=0 ; k<remaining ; k++){
                    v3.addElement(tempVector.elementAt(counter));
                    counter++;
                }
                if(v3.size()>0){
                    PrintReport r3 = new PrintReport(reportBean, v3);
                    book.append(r3, pageFormat);
                    // Backup
                    b3 = new BackupReport(reportBean, v3);
                }
            }
            
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            printerJob.setPageable(book);
            if(printerJob.printDialog()){
                printerJob.print();
            }
            
            if(b1!=null)
                b1.backup(0);
            if(b2!=null)
                b2.backup(1);
            if(b3!=null)
                b3.backup(2);
        }catch(Exception ex){ex.printStackTrace();}
        
    }
    
    private String getFileStuff(String url){
            String str="";
            try{
                DataInputStream in = new DataInputStream(new FileInputStream(url));
                String line = "";
                while((line=in.readLine()) != null){
                    if(line.contains("#")){
                        str += "&&";
                    }
                    str = str + line + "&&";
                }
                str += " && ";
            }catch(Exception ex){ex.printStackTrace();}
            return str;
    }
    
    private void itsWidal(ReportsBean reportBean, Vector<ReportDetailsBean> v){
        Vector<String> tempVector = new Vector();
        tempVector.addElement(""+Constants.WIDAL);
        for(int k=0 ; k<v.size() ; k++){
            ReportDetailsBean bean = v.elementAt(k);
            String result = bean.getTestResult();
            if(result.trim().equals("")){
                String manualHeading = bean.getManualHeading();
                tempVector.addElement(manualHeading.substring(1));
            }
            else
                tempVector.addElement(result);
        }
        
        PageFormat pageFormat = PrintReport.getReportPageFormat();
        Book book = new Book();
        PrintReport report = new PrintReport(reportBean, tempVector);
        book.append(report, pageFormat);
        PrinterJob printerJob = PrinterJob.getPrinterJob();
            printerJob.setPageable(book);
            if(printerJob.printDialog()){
                try{
                printerJob.print();
                }catch(Exception ex){ex.printStackTrace();}
        }
    }
    
    private Vector<TestsAtReportsBean> toPrintTest = new Vector();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearAllButton;
    private javax.swing.JList generatedTestList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton moveButton;
    private javax.swing.JTextField patientIdText;
    private javax.swing.JTextField patientNameText;
    private javax.swing.JButton printReportButton;
    private javax.swing.JTextField receiptNoText;
    private javax.swing.JList toPrintTestList;
    private javax.swing.JList ungeneratedTestList;
    // End of variables declaration//GEN-END:variables
}
