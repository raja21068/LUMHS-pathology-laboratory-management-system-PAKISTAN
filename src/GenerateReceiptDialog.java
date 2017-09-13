
import java.awt.event.KeyEvent;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class GenerateReceiptDialog extends javax.swing.JDialog {
    
    
    public GenerateReceiptDialog(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
	try{
            setIconImage(javax.imageio.ImageIO.read(getClass().getResource("images/test.png")));
        }catch(Exception ex){ex.printStackTrace();}
	defaultTableModel = (javax.swing.table.DefaultTableModel) this.table.getModel();
        setMaxReceiptId();
        
    }

    public void showDialog(){
        setDay();
        setTestCategories();
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientNameLabel = new javax.swing.JLabel();
        doctorNameLabel = new javax.swing.JLabel();
        todaysDateLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clearAllButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        totalLabel = new javax.swing.JLabel();
        totalText = new javax.swing.JTextField();
        discountText = new javax.swing.JTextField();
        grandTotalText = new javax.swing.JTextField();
        grandTotalLabel = new javax.swing.JLabel();
        discountLabel = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();
        receiptNoLabel = new javax.swing.JLabel();
        doctorIdText = new javax.swing.JTextField();
        patientIdLabel = new javax.swing.JLabel();
        doctorIdLabel = new javax.swing.JLabel();
        patientIdText = new javax.swing.JTextField();
        receiptNoText = new javax.swing.JTextField();
        dayIdLabel = new javax.swing.JLabel();
        dayIdText = new javax.swing.JTextField();
        testCategoryLabel = new javax.swing.JLabel();
        testCategoryComboBox = new javax.swing.JComboBox();
        testComboBox = new javax.swing.JComboBox();
        testNameLabel = new javax.swing.JLabel();
        generateReceiptButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        exceptedDateLabel = new javax.swing.JLabel();
        expectedDateText = new javax.swing.JFormattedTextField();
        todaysDateText = new javax.swing.JFormattedTextField();
        patientNameText = new javax.swing.JTextField();
        doctorNameText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        patientIdLabel1 = new javax.swing.JLabel();
        manualReceiptNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        paymentCombo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generate Receipt");
        setMinimumSize(new java.awt.Dimension(600, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        patientNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientNameLabel.setText("Patient Name");
        getContentPane().add(patientNameLabel);
        patientNameLabel.setBounds(20, 50, 100, 30);

        doctorNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        doctorNameLabel.setText("Doctor Name");
        getContentPane().add(doctorNameLabel);
        doctorNameLabel.setBounds(20, 90, 100, 30);

        todaysDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        todaysDateLabel.setText("Today's Date");
        getContentPane().add(todaysDateLabel);
        todaysDateLabel.setBounds(20, 130, 90, 30);

        table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test Name", "Charges"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
        table.getColumnModel().getColumn(0).setPreferredWidth(250);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(1).setPreferredWidth(50);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 320, 550, 180);

        clearAllButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearAllButton.setText("Clear All");
        clearAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearAllButton);
        clearAllButton.setBounds(10, 640, 110, 30);

        enterButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(enterButton);
        enterButton.setBounds(470, 270, 90, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 630, 550, 10);

        totalLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalLabel.setText("Total");
        getContentPane().add(totalLabel);
        totalLabel.setBounds(380, 510, 80, 30);

        totalText.setEditable(false);
        totalText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        totalText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        totalText.setText("0");
        totalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTextActionPerformed(evt);
            }
        });
        getContentPane().add(totalText);
        totalText.setBounds(430, 510, 130, 30);

        discountText.setEditable(false);
        discountText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        discountText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        discountText.setText("0");
        discountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountTextActionPerformed(evt);
            }
        });
        getContentPane().add(discountText);
        discountText.setBounds(430, 550, 130, 30);

        grandTotalText.setEditable(false);
        grandTotalText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        grandTotalText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        grandTotalText.setText("0");
        grandTotalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grandTotalTextActionPerformed(evt);
            }
        });
        getContentPane().add(grandTotalText);
        grandTotalText.setBounds(430, 590, 130, 30);

        grandTotalLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        grandTotalLabel.setText("Grand Total");
        getContentPane().add(grandTotalLabel);
        grandTotalLabel.setBounds(340, 590, 130, 30);

        discountLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        discountLabel.setText("Discount");
        getContentPane().add(discountLabel);
        discountLabel.setBounds(360, 550, 130, 30);

        printButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        getContentPane().add(printButton);
        printButton.setBounds(270, 640, 110, 30);

        receiptNoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        receiptNoLabel.setText("Receipt No.");
        getContentPane().add(receiptNoLabel);
        receiptNoLabel.setBounds(20, 10, 80, 30);

        doctorIdText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        doctorIdText.setText("DOC01");
        doctorIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorIdTextActionPerformed(evt);
            }
        });
        getContentPane().add(doctorIdText);
        doctorIdText.setBounds(450, 90, 120, 30);

        patientIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientIdLabel.setText("Manual Rec. No.");
        getContentPane().add(patientIdLabel);
        patientIdLabel.setBounds(370, 10, 110, 30);

        doctorIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        doctorIdLabel.setText("Doctor ID");
        getContentPane().add(doctorIdLabel);
        doctorIdLabel.setBounds(370, 90, 100, 30);

        patientIdText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        patientIdText.setText("PAT");
        patientIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdTextActionPerformed(evt);
            }
        });
        getContentPane().add(patientIdText);
        patientIdText.setBounds(450, 50, 120, 30);

        receiptNoText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        receiptNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptNoTextActionPerformed(evt);
            }
        });
        getContentPane().add(receiptNoText);
        receiptNoText.setBounds(120, 10, 140, 30);

        dayIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dayIdLabel.setText("Day ID");
        getContentPane().add(dayIdLabel);
        dayIdLabel.setBounds(370, 130, 100, 30);

        dayIdText.setEditable(false);
        dayIdText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dayIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayIdTextActionPerformed(evt);
            }
        });
        getContentPane().add(dayIdText);
        dayIdText.setBounds(450, 130, 120, 30);

        testCategoryLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        testCategoryLabel.setText("Test Category");
        getContentPane().add(testCategoryLabel);
        testCategoryLabel.setBounds(20, 190, 100, 30);

        testCategoryComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        testCategoryComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                testCategoryComboBoxItemStateChanged(evt);
            }
        });
        testCategoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testCategoryComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(testCategoryComboBox);
        testCategoryComboBox.setBounds(120, 190, 300, 30);

        testComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(testComboBox);
        testComboBox.setBounds(120, 230, 300, 30);

        testNameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        testNameLabel.setText("Test Name");
        getContentPane().add(testNameLabel);
        testNameLabel.setBounds(20, 230, 80, 30);

        generateReceiptButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        generateReceiptButton.setText("Generate Receipt");
        generateReceiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReceiptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(generateReceiptButton);
        generateReceiptButton.setBounds(400, 640, 160, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 180, 560, 10);

        exceptedDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exceptedDateLabel.setText("Excepted Date");
        getContentPane().add(exceptedDateLabel);
        exceptedDateLabel.setBounds(30, 510, 100, 30);

        try {
            expectedDateText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-ULL-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        expectedDateText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        expectedDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expectedDateTextActionPerformed(evt);
            }
        });
        getContentPane().add(expectedDateText);
        expectedDateText.setBounds(130, 510, 130, 30);

        todaysDateText.setEditable(false);
        try {
            todaysDateText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-ULL-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        todaysDateText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        todaysDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todaysDateTextActionPerformed(evt);
            }
        });
        getContentPane().add(todaysDateText);
        todaysDateText.setBounds(120, 130, 240, 30);

        patientNameText.setEditable(false);
        getContentPane().add(patientNameText);
        patientNameText.setBounds(120, 50, 240, 30);

        doctorNameText.setEditable(false);
        doctorNameText.setText("Dr. Khalid Sheikh");
        getContentPane().add(doctorNameText);
        doctorNameText.setBounds(120, 90, 240, 30);

        updateButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton);
        updateButton.setBounds(130, 640, 100, 30);

        patientIdLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientIdLabel1.setText("Patient ID");
        getContentPane().add(patientIdLabel1);
        patientIdLabel1.setBounds(370, 50, 90, 30);
        getContentPane().add(manualReceiptNo);
        manualReceiptNo.setBounds(480, 10, 90, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Payment:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 270, 80, 30);

        paymentCombo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        paymentCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FULL", "50%", "FREE" }));
        getContentPane().add(paymentCombo);
        paymentCombo.setBounds(120, 272, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DELETE){
            int row = table.getSelectedRow();
            if(row>=0){
                TestsBean b = (TestsBean)defaultTableModel.getValueAt(row, 0);
                int charges = ((Integer)defaultTableModel.getValueAt(row, 1)).intValue();
                int discount = b.getTestCharges() - charges;
                discountText.setText("" + (Integer.parseInt(discountText.getText())-discount));
                defaultTableModel.removeRow(row);
                calculateTotal();
            }
        }
    }//GEN-LAST:event_tableKeyPressed

    private void clearAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllButtonActionPerformed
        clearAll();
    }//GEN-LAST:event_clearAllButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        TestsBean testBean = (TestsBean)testComboBox.getSelectedItem();
        if(testBean==null)  return;
        
        if(defaultTableModel.getRowCount()>0){
            TestsBean firstTest = (TestsBean)defaultTableModel.getValueAt(0, 0);
            if(firstTest.getTestCategoryId()!=testBean.getTestCategoryId()){
                JOptionPane.showMessageDialog(this, "Cannot enter this test, please enter test of same category.");
                return;
            }
        }
        
        int charges = testBean.getTestCharges();
        int discount = 0;
        
        if(paymentCombo.getSelectedIndex()==1){
            discount = charges / 2;
        }
        else if(paymentCombo.getSelectedIndex()==2){
            discount = charges;
            
        }
        
        discountText.setText("" + (Integer.parseInt(discountText.getText()) + discount));
        defaultTableModel.addRow(new Object[]{testBean, charges-discount});
        calculateTotal();
    }//GEN-LAST:event_enterButtonActionPerformed

    private void totalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTextActionPerformed

    private void discountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountTextActionPerformed
        String dis = discountText.getText();
        if(dis.isEmpty()){
            discountText.setText("0");
            dis = "0";
        }
        int discount = 0;
        try{
            discount = Integer.parseInt(dis);
        }catch(NumberFormatException ex){discountText.setText("0"); discount=0;}
        
        int total = Integer.parseInt(totalText.getText());
        grandTotalText.setText(""+(total-discount));   
    }//GEN-LAST:event_discountTextActionPerformed

    private void grandTotalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grandTotalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grandTotalTextActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        new Thread(){
            @Override
            public void run(){
                printReceipt();
            }
        }.start();
    }//GEN-LAST:event_printButtonActionPerformed

    private void doctorIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorIdTextActionPerformed
        String docId = doctorIdText.getText();
        if(docId.isEmpty())
            return;
        
        try{
            DoctorBean bean = DatabaseManager.searchDoctorById(docId);
            if(bean==null){
                JOptionPane.showMessageDialog(this, "No Doctor at this ID.");
                return;
            }
            doctorNameText.setText(bean.getDoctorName());
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }//GEN-LAST:event_doctorIdTextActionPerformed

    private void patientIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdTextActionPerformed
        String patId = patientIdText.getText().toUpperCase();
        if(patId.isEmpty())
            return;
        
        try{
            PatientBean patBean = DatabaseManager.searchPatientById(patId);
            if(patBean==null){
                JOptionPane.showMessageDialog(this, "No Patient at this ID");
                return;
            }
            
            patientNameText.setText(patBean.getPatientFirstName() + " " + patBean.getPatientLastName());
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }//GEN-LAST:event_patientIdTextActionPerformed

    private void receiptNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptNoTextActionPerformed
        new Thread(){
            @Override
            public void run(){
                setGeneratedRecipt();
            }
        }.start();
    }//GEN-LAST:event_receiptNoTextActionPerformed

    private void dayIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayIdTextActionPerformed

    private void generateReceiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReceiptButtonActionPerformed
        new Thread(){
            @Override
            public void run(){
                generateReceipt();
            }
        }.start();
    }//GEN-LAST:event_generateReceiptButtonActionPerformed

    private void expectedDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expectedDateTextActionPerformed

   }//GEN-LAST:event_expectedDateTextActionPerformed

    private void todaysDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todaysDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_todaysDateTextActionPerformed

    private void testCategoryComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_testCategoryComboBoxItemStateChanged
        TestCategoriesBean bean = (TestCategoriesBean)testCategoryComboBox.getSelectedItem();
        if(bean==null)  return;
        setTests(bean.getTestCategoryId());
    }//GEN-LAST:event_testCategoryComboBoxItemStateChanged

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        new Thread(){
            @Override
            public void run(){
                deleteReceipt();
                addReceipt();
            }
        }.start();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void testCategoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testCategoryComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testCategoryComboBoxActionPerformed

    private void setMaxReceiptId(){
        try{
            int id = DatabaseManager.getMaxReceiptId()+1;
            receiptNoText.setText(""+id);
        }catch(Exception ex){ex.printStackTrace();}
    }
    
    private void setDay(){
//        try{
//            Vector<DaysBean> v = DatabaseManager.getAllDays();
//            if(v.size()>0){
//                DaysBean bean = v.elementAt(0);
//                if(bean!=null){
//                    todaysDateText.setText(DateFormatter.dateToString(bean.getDay()));
//                    dayIdText.setText(""+bean.getDayId());
//                    
//                    expectedDateText.setText(DateFormatter.dateToString(bean.getDay()));
//                }
//            }
//        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
        
        try{
            DaysBean dayBean = DatabaseManager.getDayAtId(DatabaseManager.getMaxDayId());
            if(dayBean==null)
                return;
            todaysDateText.setText(DateFormatter.dateToString(dayBean.getDay()));
                    dayIdText.setText(""+dayBean.getDayId());
                    
            expectedDateText.setText(DateFormatter.dateToString(dayBean.getDay()));
        }catch(Exception ex){ex.printStackTrace();}
    }
    
    private void setTestCategories(){
        try{
            Vector<TestCategoriesBean> v = DatabaseManager.getAllTestCategories();
            testCategoryComboBox.removeAllItems();
            for(int k=0 ; k<v.size() ; k++)
                testCategoryComboBox.addItem(v.elementAt(k));
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }
    
    private void setTests(int getTestCategoryId){
        try{
            Vector<TestsBean> v = DatabaseManager.getAllTests(getTestCategoryId);
            testComboBox.removeAllItems();
            for(int k=0 ; k<v.size() ; k++)
                testComboBox.addItem(v.elementAt(k));
        }catch(Exception ex){ex.printStackTrace();}
    }
    
    private void calculateTotal(){
        int charges = 0;
        for(int k=0 ; k<defaultTableModel.getRowCount() ; k++){
            charges += ((TestsBean)defaultTableModel.getValueAt(k, 0)).getTestCharges();
        }
        
        totalText.setText(""+charges);
        
        String dis = discountText.getText();
        if(dis.isEmpty()){
            discountText.setText("0");
            dis = "0";
        }
        int discount = 0;
        try{
            discount = Integer.parseInt(dis);
        }catch(NumberFormatException ex){ discountText.setText("0"); discount=0;}
        
        grandTotalText.setText(""+(charges-discount));
        
    }

    
    private void clearAll(){
        setMaxReceiptId();
        patientNameText.setText("");
        patientIdText.setText("PAT");
        doctorNameText.setText("");
        manualReceiptNo.setText("");
        doctorIdText.setText("DOC01");
        setDay();
        totalText.setText("0");
        discountText.setText("0");
        grandTotalText.setText("0");
        clearTable();
        setTestCategories();
        
    }
    
    private void clearTable(){
        int total = defaultTableModel.getRowCount();
        for(int k=0 ; k<total ; k++)
            defaultTableModel.removeRow(0);
    }
    
    private void generateReceipt(){
        String manualRecId = manualReceiptNo.getText();
        if(manualRecId.isEmpty()){
            JOptionPane.showMessageDialog(this, "Manual Receipt No is NOT Entered.");
            return;
        }
        
        String rec = receiptNoText.getText();
        if(rec.isEmpty()){
            JOptionPane.showMessageDialog(this, "Receipt No is NOT Entered.");
            return;
        }
        int receiptNo = 0;
        int manualRecNo = 0;
        
        try{
            manualRecNo = Integer.parseInt(manualRecId);
        }catch(NumberFormatException ex){JOptionPane.showMessageDialog(this, "Enter valid Manual Receipt No."); return;}
        
        
        try{
            receiptNo = Integer.parseInt(rec);
        }catch(NumberFormatException ex){JOptionPane.showMessageDialog(this, "Enter valid Receipt No."); return;}
        
        try{
            ReciptsBean reciptBean = DatabaseManager.getReceiptAtId(receiptNo);
        if(reciptBean != null){
            receiptNo++;
            reciptBean = DatabaseManager.getReceiptAtId(receiptNo);
            if(reciptBean!=null){
                JOptionPane.showMessageDialog(this, "Recipt already in use, enter new Receipt No.");
                return;
            }
            receiptNoText.setText("" + receiptNo);
        }
        
        String patId = patientIdText.getText().toUpperCase();
        if(patId.isEmpty()){
            JOptionPane.showMessageDialog(this, "Patient ID is not Entered.");
            return;
        }
            
        PatientBean patientBean = DatabaseManager.searchPatientById(patId);
        if(patientBean==null){
            JOptionPane.showMessageDialog(this, "Patient ID is not Valid.");
            return;
        }
        
        String docId = doctorIdText.getText();
        if(docId.isEmpty()){
            JOptionPane.showMessageDialog(this, "Doctor ID is not Entered.");
            return;
        }
        DoctorBean doctorBean = DatabaseManager.searchDoctorById(docId);
        if(doctorBean == null){
            JOptionPane.showMessageDialog(this, "Doctor ID is not Valid.");
            return;
        }
        
        
        String dId = dayIdText.getText();
        if(dId.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Day Present, Please Make Day Entry.");
            return;
        }
        int dayId = Integer.parseInt(dId);
        DaysBean dayBean = DatabaseManager.getDayAtId(dayId);
        if(dayBean.getClosed()==Constants.CLOSED){
            JOptionPane.showMessageDialog(this, "Day is already closed, cannot make any receipt.");
            return;
        }
        
        int totalRow = defaultTableModel.getRowCount();
        if(totalRow==0){
            JOptionPane.showMessageDialog(this, "No Tests are Entered, cannot generate receipt.");
            return;
        }
        
        calculateTotal();
        int total = Integer.parseInt(totalText.getText());
        int grandTotal = Integer.parseInt(grandTotalText.getText());
        
        
        String dis = discountText.getText();
        if(dis.isEmpty()){
            discountText.setText("0");
            dis = "0";
        }
        int discount = 0;
        try{
            discount = Integer.parseInt(dis);
        }catch(NumberFormatException ex){discountText.setText("0"); discount=0;}
        
        
        String date = expectedDateText.getText();
        if(date.length() != 11){
            JOptionPane.showMessageDialog(this, "Date is Invalid.");
            return;
        }
        
        
        // Adding Recipts, Test_At_Recipt, Report AND Test_At_Report
        int r = DatabaseManager.addRecipts(receiptNo, manualRecNo, patId.toUpperCase(), docId.toUpperCase(), dayId, date, 0, discount, grandTotal);
        if(r>0){
            r = DatabaseManager.addReports(receiptNo, receiptNo, date, "", "", Constants.NOTGENERATED);
            if(r>0){
                r = 0;
                for(int k=0 ; k<defaultTableModel.getRowCount() ; k++){
                    TestsBean bean = (TestsBean)defaultTableModel.getValueAt(k, 0);

                    // Adding Recipt
                    int charges = ((Integer)defaultTableModel.getValueAt(k, 1)).intValue();
                    int testAtReciptId = DatabaseManager.getMaxTestAtReciptId() + 1;
                    r += DatabaseManager.addTestAtRecipt(testAtReciptId, receiptNo, bean.getTestId(), charges);

                    // Adding Report
                    int testAtReportId = DatabaseManager.getMaxTestAtReportId() + 1;
                    r += DatabaseManager.addTestAtReport(testAtReportId, receiptNo, bean.getTestId(), Constants.NOTGENERATED);

                }
            }
        }
        
        // Updating Day...
        r += DatabaseManager.updateDays(dayBean.getDayId(), DateFormatter.dateToString(dayBean.getDay()), dayBean.getDues(), dayBean.getDiscount()+discount, dayBean.getBalance()+grandTotal, dayBean.getClosed(), dayBean.getRemarks());
        
        JOptionPane.showMessageDialog(this, "Receipt is Successfully Added");
        
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }
    
    
    private void setGeneratedRecipt(){
        String id = receiptNoText.getText();
        if(id.isEmpty())    return;
        try{
            int receiptId = Integer.parseInt(id);
            ReciptsBean bean = DatabaseManager.getReceiptAtId(receiptId);
            if(bean==null){
                JOptionPane.showMessageDialog(this, "No Record at this recipt.");
                return;
            }
            
            String patId = bean.getPatId();
            PatientBean patBean = DatabaseManager.searchPatientById(patId);
            patientIdText.setText(patId);
            patientNameText.setText(patBean.getPatientFirstName()+" "+patBean.getPatientLastName());
            manualReceiptNo.setText(""+bean.getManualRecId());
            
            String docId = bean.getDoctorId();
            DoctorBean docBean = DatabaseManager.searchDoctorById(docId);
            doctorIdText.setText(docId);
            doctorNameText.setText(docBean.getDoctorName());
            
            int dayId = bean.getDayId();
            DaysBean dayBean = DatabaseManager.getDayAtId(dayId);
            dayIdText.setText(""+dayId);
            todaysDateText.setText(DateFormatter.dateToString(dayBean.getDay()));
            
            int dis = bean.getDiscounts();
            discountText.setText(""+dis);
            
            int grandTotal = bean.getTotal();
            grandTotalText.setText(""+grandTotal);
                       
            String expectedDate = DateFormatter.dateToString(bean.getExpectedDate());
            this.expectedDateText.setText(expectedDate);
            
            clearTable();
            // retereving tests at receipts..
            Vector<TestAtReciptBean> v = DatabaseManager.getAllTestAtRecipt(receiptId);
            for(int k=0 ; k<v.size() ; k++){
                TestAtReciptBean testAtReciptBean = v.elementAt(k);
                TestsBean testBean = DatabaseManager.getTestAtId(testAtReciptBean.getTestId());
                int charges = testAtReciptBean.getCharges();
                defaultTableModel.addRow(new Object[]{testBean, charges});
            }
            calculateTotal();
            
        }catch(NumberFormatException ex){JOptionPane.showMessageDialog(this, "Wrong Nunber Format!!"); setMaxReceiptId();}
        catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }
    
    
    private void printReceipt(){
        String id = receiptNoText.getText();
        if(id.isEmpty())    return;
        int receiptId = 0;
        try{
            receiptId = Integer.parseInt(id);
        }catch(NumberFormatException ex){JOptionPane.showMessageDialog(this, "Invalid Receipt No."); return;}
        
        PageFormat pageFormat = PrintReceipt.getReceiptPageFormat();
        Book book = new Book();
        try{
            ReciptsBean reciptBean = DatabaseManager.getReceiptAtId(receiptId);
            if(reciptBean==null)    return;
            PrintReceipt receipt = new PrintReceipt(reciptBean);
            book.append(receipt, pageFormat);
            
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            printerJob.setPageable(book);
            if(printerJob.printDialog()){
                printerJob.print();
                new BackupReceipt(reciptBean).backup();
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
        
    }
    
 
    private int deleteReceipt(){
        int success = 1;
        try{
            int receiptId = Integer.parseInt(receiptNoText.getText());
            ReciptsBean reciptsBean = DatabaseManager.getReceiptAtId(receiptId);
            PatientBean patientBean = DatabaseManager.searchPatientById(reciptsBean.getPatId());
            int patDues = patientBean.getDues();
            if(patDues>0){
                DatabaseManager.updateDayDues(reciptsBean.getDayId(), patDues);
                DatabaseManager.updatePatientDues(reciptsBean.getPatId(), patDues);
            }
            
            DatabaseManager.updateDayBalanaceAndDiscount(reciptsBean.getDayId(), reciptsBean.getDiscounts(), reciptsBean.getTotal());
            
            Vector v = DatabaseManager.getTestsAtReportIds(receiptId);
            for(int i=0; i<v.size(); i++){
                DatabaseManager.deleteReportDetails((Integer)v.elementAt(i));
            }
            DatabaseManager.deleteTestAtReport(receiptId);
            DatabaseManager.deleteReport(receiptId);
            DatabaseManager.deleteTestAtReceipt(receiptId);
            DatabaseManager.deleteReceipt(receiptId);
             
        }catch(NumberFormatException e) { 
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Invalid Receipt No.");
            success = 0;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
            success = 0;
        }
        
        return success;
    }

    private void addReceipt(){
        String manualRecId = manualReceiptNo.getText();
        if(manualRecId.isEmpty()){
            JOptionPane.showMessageDialog(this, "Manual Receipt No is NOT Entered.");
            return;
        }
        
        String rec = receiptNoText.getText();
        if(rec.isEmpty()){
            JOptionPane.showMessageDialog(this, "Receipt No is NOT Entered.");
            return;
        }
        int receiptNo = 0;
        try{
            receiptNo = Integer.parseInt(rec);
        }catch(NumberFormatException ex){JOptionPane.showMessageDialog(this, "Enter valid Receipt No."); return;}
        
        int manualRecNo = 0;
        
        try{
            manualRecNo = Integer.parseInt(manualRecId);
        }catch(NumberFormatException ex){JOptionPane.showMessageDialog(this, "Enter valid Manual Receipt No."); return;}
        
        
        try{
        ReciptsBean reciptBean = DatabaseManager.getReceiptAtId(receiptNo);
        if(reciptBean != null){
            JOptionPane.showMessageDialog(this, "Recipt already in use, enter new Receipt No.");
            return;
        }
        
        String patId = patientIdText.getText().toUpperCase();
        if(patId.isEmpty()){
            JOptionPane.showMessageDialog(this, "Patient ID is not Entered.");
            return;
        }
            
        PatientBean patientBean = DatabaseManager.searchPatientById(patId);
        if(patientBean==null){
            JOptionPane.showMessageDialog(this, "Patient ID is not Valid.");
            return;
        }
        
        String docId = doctorIdText.getText();
        if(docId.isEmpty()){
            JOptionPane.showMessageDialog(this, "Doctor ID is not Entered.");
            return;
        }
        DoctorBean doctorBean = DatabaseManager.searchDoctorById(docId);
        if(doctorBean == null){
            JOptionPane.showMessageDialog(this, "Doctor ID is not Valid.");
            return;
        }
        
        
        String dId = dayIdText.getText();
        if(dId.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Day Present, Please Make Day Entry.");
            return;
        }
        int dayId = Integer.parseInt(dId);
        DaysBean dayBean = DatabaseManager.getDayAtId(dayId);
        
        int totalRow = defaultTableModel.getRowCount();
        if(totalRow==0){
            JOptionPane.showMessageDialog(this, "No Tests are Entered, cannot generate receipt.");
            return;
        }
        
        calculateTotal();
        int total = Integer.parseInt(totalText.getText());
        int grandTotal = Integer.parseInt(grandTotalText.getText());
        
        
        String dis = discountText.getText();
        if(dis.isEmpty()){
            discountText.setText("0");
            dis = "0";
        }
        int discount = 0;
        try{
            discount = Integer.parseInt(dis);
        }catch(NumberFormatException ex){discountText.setText("0"); discount=0;}
        
        
        String date = expectedDateText.getText();
        if(date.length() != 11){
            JOptionPane.showMessageDialog(this, "Date is Invalid.");
            return;
        }
        
        
        // Adding Recipts, Test_At_Recipt, Report AND Test_At_Report
        int r = DatabaseManager.addRecipts(receiptNo, manualRecNo, patId.toUpperCase(), docId.toUpperCase(), dayId, date, 0, discount, grandTotal);
        if(r>0){
            r = DatabaseManager.addReports(receiptNo, receiptNo, date, "", "", Constants.NOTGENERATED);
            if(r>0){
                r = 0;
                for(int k=0 ; k<defaultTableModel.getRowCount() ; k++){
                    TestsBean bean = (TestsBean)defaultTableModel.getValueAt(k, 0);

                    // Adding Recipt
                    int charges = ((Integer)defaultTableModel.getValueAt(k, 1)).intValue();
                    int testAtReciptId = DatabaseManager.getMaxTestAtReciptId() + 1;
                    r += DatabaseManager.addTestAtRecipt(testAtReciptId, receiptNo, bean.getTestId(), charges);

                    // Adding Report
                    int testAtReportId = DatabaseManager.getMaxTestAtReportId() + 1;
                    r += DatabaseManager.addTestAtReport(testAtReportId, receiptNo, bean.getTestId(), Constants.NOTGENERATED);

                }
            }
        }
        

        
        
        
        // Updating Day...
        r += DatabaseManager.updateDays(dayBean.getDayId(), DateFormatter.dateToString(dayBean.getDay()), dayBean.getDues(), dayBean.getDiscount()+discount, dayBean.getBalance()+grandTotal, dayBean.getClosed(), dayBean.getRemarks());
        
        JOptionPane.showMessageDialog(this, "Receipt is Successfully Updated");
        
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }

    
    private javax.swing.table.DefaultTableModel defaultTableModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearAllButton;
    private javax.swing.JLabel dayIdLabel;
    private javax.swing.JTextField dayIdText;
    private javax.swing.JLabel discountLabel;
    private javax.swing.JTextField discountText;
    private javax.swing.JLabel doctorIdLabel;
    private javax.swing.JTextField doctorIdText;
    private javax.swing.JLabel doctorNameLabel;
    private javax.swing.JTextField doctorNameText;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel exceptedDateLabel;
    private javax.swing.JFormattedTextField expectedDateText;
    private javax.swing.JButton generateReceiptButton;
    private javax.swing.JLabel grandTotalLabel;
    private javax.swing.JTextField grandTotalText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField manualReceiptNo;
    private javax.swing.JLabel patientIdLabel;
    private javax.swing.JLabel patientIdLabel1;
    private javax.swing.JTextField patientIdText;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JTextField patientNameText;
    private javax.swing.JComboBox paymentCombo;
    private javax.swing.JButton printButton;
    private javax.swing.JLabel receiptNoLabel;
    private javax.swing.JTextField receiptNoText;
    private javax.swing.JTable table;
    private javax.swing.JComboBox testCategoryComboBox;
    private javax.swing.JLabel testCategoryLabel;
    private javax.swing.JComboBox testComboBox;
    private javax.swing.JLabel testNameLabel;
    private javax.swing.JLabel todaysDateLabel;
    private javax.swing.JFormattedTextField todaysDateText;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalText;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
