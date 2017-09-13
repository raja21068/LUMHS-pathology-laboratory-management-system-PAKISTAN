
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Danyal
 */
public class TestUpdateDialog extends javax.swing.JDialog {

    public TestUpdateDialog(javax.swing.JFrame parent){
        super(parent, true);
        initComponents();
        setLocationRelativeTo(null);
    }


    public void showDialog(){
        setTestCategories();
        setNewTestParamId();
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        testParamNameText = new javax.swing.JTextField();
        Border1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        testList = new javax.swing.JList();
        Border2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        testParamList = new javax.swing.JList();
        testParamIdText = new javax.swing.JTextField();
        testParamRangeText = new javax.swing.JTextField();
        deleteTestParamButton = new javax.swing.JButton();
        deleteTestButton = new javax.swing.JButton();
        testCategoriesComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Border1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Tests", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        testList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                testListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(testList);

        javax.swing.GroupLayout Border1Layout = new javax.swing.GroupLayout(Border1);
        Border1.setLayout(Border1Layout);
        Border1Layout.setHorizontalGroup(
            Border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Border1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        Border1Layout.setVerticalGroup(
            Border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Border1Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );

        Border2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Test Parameters", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        testParamList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                testParamListValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(testParamList);

        javax.swing.GroupLayout Border2Layout = new javax.swing.GroupLayout(Border2);
        Border2.setLayout(Border2Layout);
        Border2Layout.setHorizontalGroup(
            Border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Border2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        Border2Layout.setVerticalGroup(
            Border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Border2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );

        testParamIdText.setEditable(false);
        testParamIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testParamIdTextActionPerformed(evt);
            }
        });

        deleteTestParamButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        deleteTestParamButton.setText("Delete Test Parameter");
        deleteTestParamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTestParamButtonActionPerformed(evt);
            }
        });

        deleteTestButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        deleteTestButton.setText("Delete Test");
        deleteTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTestButtonActionPerformed(evt);
            }
        });

        testCategoriesComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                testCategoriesComboBoxItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Test Param Range :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Test Param ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Test Param Name :");

        updateButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        updateButton.setText("Update ");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addButton.setText("Add ");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearButton.setText("Clear All");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Test Categories :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(testCategoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Border1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Border2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(testParamIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(testParamNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(testParamRangeText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(deleteTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(deleteTestParamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testCategoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Border1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Border2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(testParamIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(testParamNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(testParamRangeText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteTestParamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void testCategoriesComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_testCategoriesComboBoxItemStateChanged

         if(evt.getStateChange()==evt.SELECTED){
            TestCategoriesBean bean = (TestCategoriesBean)testCategoriesComboBox.getSelectedItem();
            if(bean == null)    return;
            setTests(bean.getTestCategoryId());
        }
    }//GEN-LAST:event_testCategoriesComboBoxItemStateChanged

    private void testListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_testListValueChanged

        if(!evt.getValueIsAdjusting()){
        TestsBean bean = (TestsBean)this.testList.getSelectedValue();
        if(bean==null) return;

         try {
             Vector v = DatabaseManager.getAllTestsParams(bean.getTestId());
             testParamList.setListData(v);

         } catch (Exception ex) { JOptionPane.showMessageDialog(this, ex); }
    }
    }//GEN-LAST:event_testListValueChanged

    private void testParamListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_testParamListValueChanged

        if(!evt.getValueIsAdjusting()){
            TestsParamsBean bean = (TestsParamsBean)this.testParamList.getSelectedValue();
            if(bean==null) return;
            
            this.testParamIdText.setText(""+bean.getTestParamsId());
            this.testParamNameText.setText(bean.getTestParamsName());
            this.testParamRangeText.setText(bean.getTestParamsRange());
            
        }
    }//GEN-LAST:event_testParamListValueChanged

    private void testParamIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testParamIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testParamIdTextActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearAll();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        if(testParamNameText.getText().isEmpty() || testParamRangeText.getText().isEmpty())
            return;
        
        try {
            TestsBean bean = (TestsBean)this.testList.getSelectedValue();
            if(bean==null) return;

            int testId = bean.getTestId();
            int testParamId = Integer.parseInt(testParamIdText.getText());
            String testParamName = testParamNameText.getText();
            String testParamRange = testParamRangeText.getText();

            DatabaseManager.addTestsParams(testParamId, testId, testParamName, testParamRange);
            JOptionPane.showMessageDialog(this, "New Test Parameter Added.");
            clearAll();
            testParamList.setListData(new Vector());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        if(testParamNameText.getText().isEmpty() || testParamRangeText.getText().isEmpty())
            return;
        
        try {
            int testParamId = Integer.parseInt(testParamIdText.getText());
            String testParamName = testParamNameText.getText();
            String testParamRange = testParamRangeText.getText();

            DatabaseManager.updateTestParams(testParamId, testParamName, testParamRange);
            JOptionPane.showMessageDialog(this, "Test Parameters Updated.");
            clearAll();
            testParamList.setListData(new Vector());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTestButtonActionPerformed

        TestsBean bean = (TestsBean)this.testList.getSelectedValue();
            if(bean==null) return;

        try {
            DatabaseManager.deleteTests(bean.getTestId());
            JOptionPane.showMessageDialog(this, "Test Deleted Successfully.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_deleteTestButtonActionPerformed

    private void deleteTestParamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTestParamButtonActionPerformed

        TestsParamsBean bean = (TestsParamsBean)this.testParamList.getSelectedValue();
            if(bean==null) return;

        try {
            if(DatabaseManager.containReports(bean.getTestParamsId())){
                JOptionPane.showMessageDialog(this, "Child record are present in Database, cannot be deleted.");
                return;
            }
            DatabaseManager.deleteTestParam(bean.getTestParamsId());
            JOptionPane.showMessageDialog(this, "Test Deleted Successfully.");
            clearAll();
            testParamList.setListData(new Vector());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_deleteTestParamButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Border1;
    private javax.swing.JPanel Border2;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteTestButton;
    private javax.swing.JButton deleteTestParamButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JComboBox testCategoriesComboBox;
    private javax.swing.JList testList;
    private javax.swing.JTextField testParamIdText;
    private javax.swing.JList testParamList;
    private javax.swing.JTextField testParamNameText;
    private javax.swing.JTextField testParamRangeText;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void setTestCategories(){
        try{
            Vector<TestCategoriesBean> v = DatabaseManager.getAllTestCategories();
            testCategoriesComboBox.removeAllItems();
            for(int k=0 ; k<v.size() ; k++){
                testCategoriesComboBox.addItem(v.elementAt(k));
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }

    private void setNewTestParamId(){
        try{
            int id = DatabaseManager.getMaxTextParamId();
            testParamIdText.setText(""+(id+1));
        }catch(Exception ex){ex.printStackTrace();}
    }

    private void setTests(int testCategoryId){
       try{
            Vector<TestsBean> v = DatabaseManager.getAllTests(testCategoryId);
                testList.setListData(v);

        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }

    
    private void clearAll(){
        this.testParamNameText.setText("");
        this.testParamRangeText.setText("");
        this.testList.clearSelection();
        this.testParamList.clearSelection();
        setNewTestParamId();
    }
}
