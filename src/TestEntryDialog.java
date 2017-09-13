import java.awt.event.KeyEvent;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TestEntryDialog extends javax.swing.JDialog {


    public TestEntryDialog(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        defaultTableModel = (DefaultTableModel)table.getModel();
        setLocationRelativeTo(null);

    }

    public void showDialog(){
        setTestCategories();
        setNewTestId();
        setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        constants1 = new Constants();
        dateLabel = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox();
        accountsLabel = new javax.swing.JLabel();
        testChargesText = new javax.swing.JTextField();
        productsLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        testNameText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        testIdText = new javax.swing.JTextField();
        doctorBorder = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        testList = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        accountsLabel1 = new javax.swing.JLabel();
        headingText = new javax.swing.JTextField();
        parameterText = new javax.swing.JTextField();
        rangeText = new javax.swing.JTextField();
        quantityLabel1 = new javax.swing.JLabel();
        productsLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateTestButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        remarksText = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Test Entry");
        setMinimumSize(new java.awt.Dimension(790, 710));
        setResizable(false);

        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        dateLabel.setText("Test Category");

        categoryComboBox.setFont(new java.awt.Font("Tahoma", 1, 14));
        categoryComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryComboBoxItemStateChanged(evt);
            }
        });

        accountsLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        accountsLabel.setText("Test ID");

        testChargesText.setFont(new java.awt.Font("Tahoma", 0, 12));
        testChargesText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        testChargesText.setText("0");

        productsLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        productsLabel.setText("Test Name");

        quantityLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        quantityLabel.setText("Test Charges");

        testNameText.setFont(new java.awt.Font("Tahoma", 0, 12));

        table.setFont(new java.awt.Font("Tahoma", 1, 12));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Heading / Parameter", "Ranges"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(0).setPreferredWidth(70);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(1).setPreferredWidth(30);

        testIdText.setEditable(false);
        testIdText.setFont(new java.awt.Font("Tahoma", 0, 12));

        doctorBorder.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2), "Tests", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        testList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                testListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(testList);

        javax.swing.GroupLayout doctorBorderLayout = new javax.swing.GroupLayout(doctorBorder);
        doctorBorder.setLayout(doctorBorderLayout);
        doctorBorderLayout.setHorizontalGroup(
            doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        doctorBorderLayout.setVerticalGroup(
            doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doctorBorderLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        accountsLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        accountsLabel1.setText("Heading ");

        headingText.setFont(new java.awt.Font("Tahoma", 0, 12));
        headingText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headingTextActionPerformed(evt);
            }
        });

        parameterText.setFont(new java.awt.Font("Tahoma", 0, 12));

        rangeText.setFont(new java.awt.Font("Tahoma", 0, 12));
        rangeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangeTextActionPerformed(evt);
            }
        });

        quantityLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        quantityLabel1.setText("Ranges");

        productsLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        productsLabel1.setText("Parameters");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "User Actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        backButton.setFont(new java.awt.Font("Arial", 1, 12));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Arial", 1, 12));
        deleteButton.setText("Delete Test");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateTestButton.setFont(new java.awt.Font("Arial", 1, 12));
        updateTestButton.setText("Update Test");
        updateTestButton.setToolTipText("Update Test Name, Charges, and Remarks");
        updateTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTestButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addButton.setText("Add Test");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Arial", 1, 12));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addGap(18, 18, 18)
                .addComponent(updateTestButton)
                .addGap(18, 18, 18)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, backButton, clearButton, deleteButton, updateTestButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Remarks: ");

        remarksText.setEditable(false);

        jButton3.setText("Browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(productsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(parameterText))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(quantityLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(rangeText))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(accountsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(48, 48, 48)
                                            .addComponent(headingText, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(testChargesText))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(productsLabel)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(testNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(accountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(testIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(30, 30, 30))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(remarksText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                            .addComponent(doctorBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accountsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testChargesText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accountsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(headingText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parameterText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rangeText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(doctorBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(remarksText, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DELETE){
            int row = table.getSelectedRow();
            if(row>=0)
            defaultTableModel.removeRow(row);
        }
    }//GEN-LAST:event_tableKeyPressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
      
    }//GEN-LAST:event_tableMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        TestCategoriesBean testCategoriesBean = (TestCategoriesBean)categoryComboBox.getSelectedItem();
        if(testCategoriesBean==null)    return;
        
        String id = testIdText.getText();
        if(id.isEmpty())    return;
        
        String testName = testNameText.getText();
        if(testName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Test Name.");
            return;
        }
        String charges = testChargesText.getText();
        if(charges.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Test Charges.");
            return;
        }
        int totalRows = defaultTableModel.getRowCount();
        if(totalRows<1){
            JOptionPane.showMessageDialog(this, "Atleast one parameter should be Entered.");
            return;
        }
        String remarks = remarksText.getText();
        try{
            int testCharges = Integer.parseInt(charges);
            int testId = Integer.parseInt(id);
            int r = DatabaseManager.addTests(testId, testCategoriesBean.getTestCategoryId(), testName, testCharges, remarks);
            if(r>0){
                r = 0;
                for(int k=0 ; k<totalRows ; k++){
                    String param = (String)defaultTableModel.getValueAt(k, 0);
                    String range = (String)defaultTableModel.getValueAt(k, 1);
                    int testParamId = DatabaseManager.getMaxTextParamId()+1;
                    r += DatabaseManager.addTestsParams(testParamId, testId, param, range);
                }
            }
            setTests(testCategoriesBean.getTestCategoryId());
            clearAll();
            JOptionPane.showMessageDialog(this, "Test alog with "+r+" parameters are successfully Added.");
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void testListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_testListValueChanged
      if(!evt.getValueIsAdjusting()){
        TestsBean bean = (TestsBean)this.testList.getSelectedValue();
        if(bean==null) return;

        int testId = bean.getTestId();
        testIdText.setText(""+testId);
        testNameText.setText(bean.getTestName());
        testChargesText.setText(""+bean.getTestCharges());
        
         try {
             Vector v = DatabaseManager.getAllTestsParams(testId);
             clearTable();
             for(int i=0; i<v.size(); i++){
                 TestsParamsBean testParamBean = (TestsParamsBean)v.elementAt(i);
                 defaultTableModel.addRow(new Object[]{testParamBean.getTestParamsName(), testParamBean.getTestParamsRange()});
             }

         remarksText.setText(bean.getRemarks());
         } catch (Exception ex) { JOptionPane.showMessageDialog(this, ex); }
    }
   }//GEN-LAST:event_testListValueChanged

    private void headingTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headingTextActionPerformed
        String heading = headingText.getText();
        if(!heading.isEmpty()){
            defaultTableModel.addRow(new Object[]{"#"+heading, ""});
            headingText.setText("");
            parameterText.setText("");
            rangeText.setText("");
        }
    }//GEN-LAST:event_headingTextActionPerformed

    private void rangeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangeTextActionPerformed
        String paramName = parameterText.getText();
        if(paramName.equals(""))
            return;
        String range = rangeText.getText();
        if(range.equals(""))
            range = "-";
        
        defaultTableModel.addRow(new Object[]{paramName, range});
        headingText.setText("");
        parameterText.setText("");
        rangeText.setText("");
        
    }//GEN-LAST:event_rangeTextActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearAll();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void categoryComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryComboBoxItemStateChanged
        if(evt.getStateChange()==evt.SELECTED){
            TestCategoriesBean bean = (TestCategoriesBean)categoryComboBox.getSelectedItem();
            if(bean == null)    return;
            setTests(bean.getTestCategoryId());
        }
    }//GEN-LAST:event_categoryComboBoxItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i=chooser.showOpenDialog(this);
        if(i==JFileChooser.APPROVE_OPTION){
            String filepath=chooser.getSelectedFile().getAbsolutePath();
            if(filepath.endsWith(".txt"))
                remarksText.setText(filepath);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        TestCategoriesBean testCategoriesBean = (TestCategoriesBean)categoryComboBox.getSelectedItem();
        if(testCategoriesBean==null)    return;
        String id = testIdText.getText();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Test is selected.");
            return;
        }
        try{
            int testId = Integer.parseInt(id);
            int r = DatabaseManager.deleteTests(testId);
            if(r>0){
                setTests(testCategoriesBean.getTestCategoryId());
                clearAll();
                JOptionPane.showMessageDialog(this, "Test Successfully Deleted.");
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTestButtonActionPerformed
        TestCategoriesBean testCategoriesBean = (TestCategoriesBean)categoryComboBox.getSelectedItem();
        if(testCategoriesBean==null)    return;
        
        String id = testIdText.getText();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Test is selected.");
            return;
        }
        
        String testName = testNameText.getText();
        if(testName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Test Name.");
            return;
        }
        String charges = testChargesText.getText();
        if(charges.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Test Charges.");
            return;
        }
        String remarks = remarksText.getText();
        
        try{
            int testId = Integer.parseInt(id);
            int testCharges = Integer.parseInt(charges);
            int r = DatabaseManager.updateTests(testId, testCategoriesBean.getTestCategoryId(), testName, testCharges, remarks);
            if(r>0){
                setTests(testCategoriesBean.getTestCategoryId());
                clearAll();
                JOptionPane.showMessageDialog(this, "Test Successfully Updated.");
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
        
    }//GEN-LAST:event_updateTestButtonActionPerformed

    private void setTestCategories(){
        try{
            Vector<TestCategoriesBean> v = DatabaseManager.getAllTestCategories();
            categoryComboBox.removeAllItems();
            for(int k=0 ; k<v.size() ; k++){
                categoryComboBox.addItem(v.elementAt(k));
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }
    
    private void setTests(int testCategoryId){
       try{
            Vector<TestsBean> v = DatabaseManager.getAllTests(testCategoryId);
                testList.setListData(v);
            
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }
    
    private void setNewTestId(){
        try{
            int id = DatabaseManager.getMaxTestId();
            testIdText.setText(""+(id+1));
        }catch(Exception ex){ex.printStackTrace();}
    }
    
    private void clearAll(){
        setNewTestId();
        testNameText.setText("");
        testChargesText.setText("0");
        headingText.setText("");
        parameterText.setText("");
        rangeText.setText("");
        remarksText.setText("");
        clearTable();
    }
    
    private void clearTable(){
        int total = table.getRowCount();
        for(int k=0 ; k<total ; k++)
            defaultTableModel.removeRow(0);
    }
    
    private DefaultTableModel defaultTableModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountsLabel;
    private javax.swing.JLabel accountsLabel1;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox categoryComboBox;
    private javax.swing.JButton clearButton;
    private Constants constants1;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel doctorBorder;
    private javax.swing.JTextField headingText;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField parameterText;
    private javax.swing.JLabel productsLabel;
    private javax.swing.JLabel productsLabel1;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel quantityLabel1;
    private javax.swing.JTextField rangeText;
    private javax.swing.JTextField remarksText;
    private javax.swing.JTable table;
    private javax.swing.JTextField testChargesText;
    private javax.swing.JTextField testIdText;
    private javax.swing.JList testList;
    private javax.swing.JTextField testNameText;
    private javax.swing.JButton updateTestButton;
    // End of variables declaration//GEN-END:variables
}
