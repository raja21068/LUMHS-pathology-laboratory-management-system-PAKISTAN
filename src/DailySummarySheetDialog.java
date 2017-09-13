/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay & Raja
 */

import java.awt.Font;
import java.text.*;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.DefaultTableModel;

public class DailySummarySheetDialog extends javax.swing.JDialog {
    
    javax.swing.table.DefaultTableModel tableModel;
    public DailySummarySheetDialog() {
        super();
        initComponents();
        this.setLocationRelativeTo(null);
	try{
            setIconImage(javax.imageio.ImageIO.read(getClass().getResource("images/rep.png")));
        }catch(Exception ex){ex.printStackTrace();}
        defaultTableModel = (DefaultTableModel)table.getModel();
	tableModel = (javax.swing.table.DefaultTableModel) this.table.getModel();
        table.setFillsViewportHeight(true);
        table.setRowHeight(25);
        //table.setFont(new Font("arial", Font.PLAIN, 20));
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("arial", Font.BOLD, 17));
        table.setTableHeader(header);
    }

   public void showDialog(){
         setVisible(true);
         dateText.setText(DateFormatter.dateToString(new Date()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientIdLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        dailySummaryBorder = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        dateText = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Daily Summary Sheet");
        setResizable(false);

        patientIdLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        patientIdLabel.setForeground(new java.awt.Color(0, 0, 255));
        patientIdLabel.setText("Enter Date:");

        backButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        dailySummaryBorder.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Daily Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N
        dailySummaryBorder.setForeground(new java.awt.Color(0, 0, 255));

        table.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rec ID", "M-Rec ID", "Patient Name", "Test", "Discount", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(1).setPreferredWidth(50);
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setResizable(false);
        table.getColumnModel().getColumn(3).setPreferredWidth(250);
        table.getColumnModel().getColumn(4).setResizable(false);
        table.getColumnModel().getColumn(4).setPreferredWidth(50);
        table.getColumnModel().getColumn(5).setResizable(false);
        table.getColumnModel().getColumn(5).setPreferredWidth(50);

        javax.swing.GroupLayout dailySummaryBorderLayout = new javax.swing.GroupLayout(dailySummaryBorder);
        dailySummaryBorder.setLayout(dailySummaryBorderLayout);
        dailySummaryBorderLayout.setHorizontalGroup(
            dailySummaryBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dailySummaryBorderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dailySummaryBorderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        dailySummaryBorderLayout.setVerticalGroup(
            dailySummaryBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dailySummaryBorderLayout.createSequentialGroup()
                .addGroup(dailySummaryBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dailySummaryBorderLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dailySummaryBorderLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        clearButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearButton.setText("Clear All");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        printButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        try {
            dateText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-ULL-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(patientIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dailySummaryBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(dailySummaryBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        
    }//GEN-LAST:event_tableKeyPressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
    }//GEN-LAST:event_tableMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       clearAll();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        MessageFormat header = new MessageFormat("Account Summary for " + dateText.getText());
        MessageFormat footer = new MessageFormat("Page {0}");
        
        try {
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
       } catch (java.awt.print.PrinterException e) {
              System.err.format("Cannot print %s%n" + e.getMessage());
       }
    }//GEN-LAST:event_printButtonActionPerformed

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextActionPerformed
        try {
                String date=this.dateText.getText();
                clearTable();


            int theDiscount=0;
            int theTotal=0;

            Vector v = DatabaseManager.getSummary(date);


            for(int k=0 ; k<v.size() ; k++){
                ReciptsBean bean  = (ReciptsBean)v.elementAt(k);
                int reciptid =bean.getReciptId();
                //String patId= bean.getPatId();
                int manualRecieptId = bean.getManualRecId();
                int total = bean.getTotal();
                int discount = bean.getDiscounts();
                
                //int grandTotal=bean.getTotal();
                //int dues=bean.getDues();
                //int discount=bean.getDiscounts();
                //int total=grandTotal+dues+discount;

                theTotal += total;
                theDiscount += discount;

                PatientBean patBean = DatabaseManager.searchPatientById(bean.getPatId());
                String patName = patBean.getPatientFirstName() + " " + patBean.getPatientLastName();

                String tests="";

                Vector v2 = DatabaseManager.getAllTestAtRecipt(reciptid);
                for(int l=0 ; l<v2.size() ; l++){
                TestAtReciptBean beans  = (TestAtReciptBean)v2.elementAt(l);
                String test = beans.toString();
                tests = tests + test;
                if(l!=v2.size()-1)
                    tests += ",";
                }
                
                String str[] = tests.split(",");
                if(str.length==1){
                    defaultTableModel.addRow(new Object[]{reciptid,manualRecieptId,patName,str[0], discount,total});
                }
                else{
                    defaultTableModel.addRow(new Object[]{reciptid,manualRecieptId,patName,str[0], discount, total});
                    for(int a=1 ; a<str.length ; a++){
                        defaultTableModel.addRow(new Object[]{"","","",str[a],"","","",""});
                    }
                }
                
                /*
                
                int length = tests.length();
                boolean isFirst = true;
                boolean isLast = false;
                
                if(length>28){
                    String str[] = tests.split(",");
                    String testColumn = str[0];
                    for(int i=1 ; i<str.length ; i++){
                        testColumn += ", " + str[i];
                        if(testColumn.length()<28 && i<str.length-1)
                            continue;
                            
                        else{
                            if(testColumn.length()>28){
                                testColumn = testColumn.substring(0, testColumn.lastIndexOf(","));
                                if(i==str.length-1)
                                  isLast = true;
                            }
                            if(isFirst){
                                defaultTableModel.addRow(new Object[]{reciptid,manualRecieptId,patName,testColumn,total,dues,discount,grandTotal});
                                testColumn = str[i];
                                isFirst=false;
                                if(isLast){
                                    defaultTableModel.addRow(new Object[]{"","","",testColumn,"","","",""});
                                }
                            }
                            else{
                                defaultTableModel.addRow(new Object[]{"","","",testColumn,"","","",""});
                                testColumn = str[i];
                                if(isLast){
                                    defaultTableModel.addRow(new Object[]{"","","",testColumn,"","","",""});
                                }
                                   
                            }
                        }

                    }
                }
                else
                    defaultTableModel.addRow(new Object[]{reciptid,manualRecieptId,patName,tests,total,dues,discount,grandTotal});
                    */
            }

            defaultTableModel.addRow(new Object[]{"","","","","","","",""});
            defaultTableModel.addRow(new Object[]{"", "", "", "Day Account Summary:", theDiscount, theTotal});
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,ex);
       }
    }//GEN-LAST:event_dateTextActionPerformed

    
      private void clearTable(){
          int totalRows = defaultTableModel.getRowCount();
          for(int k=0 ; k<totalRows ; k++)
              defaultTableModel.removeRow(0);
      }

      private void clearAll(){
          clearTable();
      }
      private DefaultTableModel defaultTableModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel dailySummaryBorder;
    private javax.swing.JFormattedTextField dateText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel patientIdLabel;
    private javax.swing.JButton printButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
