
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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

public class TestSummaryDialog extends javax.swing.JDialog {

    public TestSummaryDialog(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
	try{
            setIconImage(javax.imageio.ImageIO.read(getClass().getResource("images/test_Cat.png")));
        }catch(Exception ex){ex.printStackTrace();}
        this.setLocationRelativeTo(null);
    }

    public void showDialog(){
        clear();
        setDate();
        setTestCategories();
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalTestsLabel = new javax.swing.JLabel();
        totalTestsText = new javax.swing.JTextField();
        toDateLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        toDateText = new javax.swing.JFormattedTextField();
        fromDateText = new javax.swing.JFormattedTextField();
        testNamesLabel = new javax.swing.JLabel();
        fromDateLabel = new javax.swing.JLabel();
        testComboBox = new javax.swing.JComboBox();
        testNamesLabel1 = new javax.swing.JLabel();
        testCategoriesComboBox = new javax.swing.JComboBox();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Test Summary");
        setResizable(false);

        totalTestsLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        totalTestsLabel.setText("Total # Of Tests");

        totalTestsText.setEditable(false);
        totalTestsText.setFont(new java.awt.Font("Tahoma", 1, 16));
        totalTestsText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        toDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        toDateLabel.setText("To Date");

        try {
            toDateText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-ULL-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        toDateText.setFont(new java.awt.Font("Tahoma", 1, 14));
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
        fromDateText.setFont(new java.awt.Font("Tahoma", 1, 14));
        fromDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromDateTextActionPerformed(evt);
            }
        });

        testNamesLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        testNamesLabel.setText("Test Names");

        fromDateLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        fromDateLabel.setText("From Date");

        testComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                testComboBoxItemStateChanged(evt);
            }
        });

        testNamesLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        testNamesLabel1.setText("Test Categories");

        testCategoriesComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                testCategoriesComboBoxItemStateChanged(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Arial", 1, 12));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(fromDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(toDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(toDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(totalTestsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(totalTestsText)
                        .addGap(38, 38, 38)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(testNamesLabel1))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(testNamesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(120, 120, 120)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(testComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(testCategoriesComboBox, 0, 212, Short.MAX_VALUE))))
                            .addGap(94, 94, 94))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fromDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fromDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(toDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testNamesLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testCategoriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testNamesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalTestsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTestsText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void toDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toDateTextActionPerformed
        getTotalTestsDatewise();
    }//GEN-LAST:event_toDateTextActionPerformed

    private void fromDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromDateTextActionPerformed
        getTotalTestsDatewise();
    }//GEN-LAST:event_fromDateTextActionPerformed

    private void testComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_testComboBoxItemStateChanged
        TestsBean bean = (TestsBean)testComboBox.getSelectedItem();
        if(bean == null)
            return;
        getTotalTestsDatewise();
    }//GEN-LAST:event_testComboBoxItemStateChanged

    private void testCategoriesComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_testCategoriesComboBoxItemStateChanged

        if(evt.getStateChange()==evt.SELECTED){
            TestCategoriesBean bean = (TestCategoriesBean)testCategoriesComboBox.getSelectedItem();
            if(bean == null)    return;
            setTests(bean.getTestCategoryId());
        }
    }//GEN-LAST:event_testCategoriesComboBoxItemStateChanged

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void setTests(int testCategoryId){
       try{
            Vector<TestsBean> v = DatabaseManager.getAllTests(testCategoryId);
             testComboBox.removeAllItems();
            for(int k=0 ; k<v.size() ; k++){
                testComboBox.addItem(v.elementAt(k));
            }   
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }
    
    private void setTestCategories(){
        try{
            Vector<TestCategoriesBean> v = DatabaseManager.getAllTestCategories();
            testCategoriesComboBox.removeAllItems();
            for(int k=0 ; k<v.size() ; k++){
                testCategoriesComboBox.addItem(v.elementAt(k));
            }
        }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
    }
    
    private void getTotalTestsDatewise(){
        TestsBean Bean= (TestsBean)testComboBox.getSelectedItem();
        if(Bean==null)
            return;
        
        String fromDate = fromDateText.getText().trim();
        String toDate = toDateText.getText().trim();
        if(fromDate.length()==5 || toDate.length()==5)
            return;
        int t =0;
        try{
            t = DatabaseManager.getTotalTestsDatewise(Bean.getTestId(), fromDate, toDate);
            }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
            
            totalTestsText.setText(""+t);
    }
     
    private void clear(){
        totalTestsText.setText("");
    }
    
    private void setDate(){
        fromDateText.setText(DateFormatter.dateToString(new Date()));
        toDateText.setText(DateFormatter.dateToString(new Date()));
    }
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel fromDateLabel;
    private javax.swing.JFormattedTextField fromDateText;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox testCategoriesComboBox;
    private javax.swing.JComboBox testComboBox;
    private javax.swing.JLabel testNamesLabel;
    private javax.swing.JLabel testNamesLabel1;
    private javax.swing.JLabel toDateLabel;
    private javax.swing.JFormattedTextField toDateText;
    private javax.swing.JLabel totalTestsLabel;
    private javax.swing.JTextField totalTestsText;
    // End of variables declaration//GEN-END:variables

}
