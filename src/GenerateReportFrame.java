import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class GenerateReportFrame extends javax.swing.JFrame {

    
    javax.swing.table.DefaultTableModel tableModel;
    private TestRemarksDialog testRemarksDialog;
    public GenerateReportFrame() {
        initComponents();
        setLocationRelativeTo(null);
	try{
            setIconImage(javax.imageio.ImageIO.read(getClass().getResource("images/logo.png")));
        }catch(Exception ex){ex.printStackTrace();}
	tableModel = (javax.swing.table.DefaultTableModel) this.table.getModel();
        testRemarksDialog = new TestRemarksDialog(this, true);
    }

    public void showFrame(){
        populateCategories();
        setDate();
        setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        generateButton = new javax.swing.JButton();
        clearAllButton = new javax.swing.JButton();
        headingText = new javax.swing.JTextField();
        moveButton = new javax.swing.JButton();
        doctorBorder1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pendingReportList = new javax.swing.JList();
        doctorBorder2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        testList = new javax.swing.JList();
        doctorBorder = new javax.swing.JPanel();
        accountsLabel1 = new javax.swing.JLabel();
        patientNameText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        productsLabel1 = new javax.swing.JLabel();
        quantityLabel1 = new javax.swing.JLabel();
        doctorText = new javax.swing.JTextField();
        productsLabel2 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox();
        patientIdText = new javax.swing.JTextField();
        productsLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        laboratoryNoText = new javax.swing.JTextField();
        productsLabel4 = new javax.swing.JLabel();
        productsLabel5 = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        specimenText = new javax.swing.JTextField();
        quantityLabel2 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        addRemarksButton = new javax.swing.JButton();
        deleteSelectedReportButton = new javax.swing.JButton();
        testAtReportIdText = new javax.swing.JTextField();
        categoryCombo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Laboratory - ADVANCE MRI & DIAGNOSTIC CENTER");
        setMinimumSize(new java.awt.Dimension(1085, 560));
        setResizable(false);

        headingLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(0, 0, 255));
        headingLabel.setText("Heading :");

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

        generateButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        generateButton.setText("Generate Report");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        clearAllButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearAllButton.setText("Clear All");
        clearAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllButtonActionPerformed(evt);
            }
        });

        headingText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        headingText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headingTextActionPerformed(evt);
            }
        });

        moveButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        moveButton.setText(">>>");
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        doctorBorder1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Pending Reports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        pendingReportList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                pendingReportListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(pendingReportList);

        javax.swing.GroupLayout doctorBorder1Layout = new javax.swing.GroupLayout(doctorBorder1);
        doctorBorder1.setLayout(doctorBorder1Layout);
        doctorBorder1Layout.setHorizontalGroup(
            doctorBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorBorder1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        doctorBorder1Layout.setVerticalGroup(
            doctorBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorBorder1Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        doctorBorder2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Tests", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jScrollPane4.setViewportView(testList);

        javax.swing.GroupLayout doctorBorder2Layout = new javax.swing.GroupLayout(doctorBorder2);
        doctorBorder2.setLayout(doctorBorder2Layout);
        doctorBorder2Layout.setHorizontalGroup(
            doctorBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doctorBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addContainerGap())
        );
        doctorBorder2Layout.setVerticalGroup(
            doctorBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorBorder2Layout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        doctorBorder.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        accountsLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        accountsLabel1.setText("Patient Name");

        patientNameText.setEditable(false);
        patientNameText.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        ageText.setEditable(false);
        ageText.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        productsLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        productsLabel1.setText("Age ");

        quantityLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        quantityLabel1.setText("Reffered By");

        doctorText.setEditable(false);
        doctorText.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        productsLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        productsLabel2.setText("Gender");

        genderComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        patientIdText.setEditable(false);
        patientIdText.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        productsLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        productsLabel3.setText("Patients ID");

        laboratoryNoText.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        productsLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        productsLabel4.setText("Laboratory #");

        productsLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        productsLabel5.setText("Date");

        dateText.setEditable(false);
        dateText.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        specimenText.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        quantityLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        quantityLabel2.setText("Specimen");

        javax.swing.GroupLayout doctorBorderLayout = new javax.swing.GroupLayout(doctorBorder);
        doctorBorder.setLayout(doctorBorderLayout);
        doctorBorderLayout.setHorizontalGroup(
            doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorBorderLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(doctorBorderLayout.createSequentialGroup()
                        .addComponent(quantityLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(doctorText))
                    .addGroup(doctorBorderLayout.createSequentialGroup()
                        .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(doctorBorderLayout.createSequentialGroup()
                                .addComponent(productsLabel3)
                                .addGap(11, 11, 11)
                                .addComponent(patientIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(accountsLabel1))
                            .addGroup(doctorBorderLayout.createSequentialGroup()
                                .addComponent(productsLabel1)
                                .addGap(52, 52, 52)
                                .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(productsLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patientNameText)
                            .addComponent(genderComboBox, 0, 123, Short.MAX_VALUE)))))
            .addGroup(doctorBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, doctorBorderLayout.createSequentialGroup()
                        .addComponent(productsLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, doctorBorderLayout.createSequentialGroup()
                        .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(doctorBorderLayout.createSequentialGroup()
                                .addComponent(productsLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doctorBorderLayout.createSequentialGroup()
                                .addComponent(quantityLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(specimenText, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(laboratoryNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(doctorBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        doctorBorderLayout.setVerticalGroup(
            doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorBorderLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productsLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(patientNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productsLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(laboratoryNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productsLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productsLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(doctorBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specimenText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        refreshButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        addRemarksButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addRemarksButton.setText("Add Remarks");
        addRemarksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRemarksButtonActionPerformed(evt);
            }
        });

        deleteSelectedReportButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        deleteSelectedReportButton.setText("Remove Report");
        deleteSelectedReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelectedReportButtonActionPerformed(evt);
            }
        });

        testAtReportIdText.setEditable(false);
        testAtReportIdText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        categoryCombo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        categoryCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryComboItemStateChanged(evt);
            }
        });
        categoryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(categoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doctorBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(doctorBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteSelectedReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addRemarksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(headingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(headingText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(testAtReportIdText)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(headingText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testAtReportIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(doctorBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(doctorBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctorBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteSelectedReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addRemarksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populateCategories(){
        try{
            Vector v = DatabaseManager.getAllTestCategories();
            categoryCombo.removeAllItems();
            for(int k=0 ; k<v.size() ; k++)
                categoryCombo.addItem(v.elementAt(k));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    
    
    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        String id = testAtReportIdText.getText();
        if(id.equals(""))
            return;
        int testAtReportId = Integer.parseInt(id);
        
        String labNo = laboratoryNoText.getText();
        if(labNo.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Lab No.");
            return;
        }
        
        String specimen = specimenText.getText();
        if(specimen.isEmpty()){
            JOptionPane.showMessageDialog(this, "Specify Specimen.");
            return;
        }
        
        String date = dateText.getText();
        
        int totalRows = tableModel.getRowCount();
        if(totalRows==0){
            JOptionPane.showMessageDialog(this, "Report Table is Empty.");
            return;
        }
        
        ReportsBean reportBean = (ReportsBean)pendingReportList.getSelectedValue();
        if(reportBean==null){
            JOptionPane.showMessageDialog(this, "No Report Selected.");
            return;
        }
        
        
        int reportId = reportBean.getReportId();
        for(int k=0 ; k<totalRows ; k++){
            try{
            TestsParamsBean testsParamsBean = (TestsParamsBean)tableModel.getValueAt(k, 0);
            if(testsParamsBean!=null){
                try{
                    int reportDetailId = getMaxReportDetailId()+1;
                    int testParamId = testsParamsBean.getTestParamsId();
                    String testResult = "";
                    if(!testsParamsBean.getTestParamsName().startsWith("#"))
                        testResult = tableModel.getValueAt(k, 1).toString();
                    if(testResult.equals(""))
                        testResult = " ";
                    DatabaseManager.addReportDetails(reportDetailId, testAtReportId, testParamId, testResult, " ");
                }catch(Exception ex){ex.printStackTrace();}
            }
            }catch(ClassCastException ex){
                String manualHeading = tableModel.getValueAt(k, 0).toString();
                try{
                    int reportDetailId = getMaxReportDetailId()+1;
                    DatabaseManager.addReportDetails(reportDetailId, testAtReportId, -1, " ", manualHeading);
                }catch(Exception e){e.printStackTrace();}
            }
        }
        
        if(ungeneratedTestsVector.size()==0){
            try{
                int r = DatabaseManager.updateTestAtReport(testAtReportId, Constants.GENERATED);
                r = DatabaseManager.updateReports(reportId, reportId, date, labNo, specimen, Constants.GENERATED);
                if(r>0){
                    clearAll();
                    TestCategoriesBean b = (TestCategoriesBean)categoryCombo.getSelectedItem();
                    if(b == null)
                            return;
                    setUngeneratedReports(b.getTestCategoryId());
                    JOptionPane.showMessageDialog(this ,"Report is Successfully Generated!!");
                }
            }catch(Exception ex){ex.printStackTrace();}
        }
        
        else{
            try{
                int r = DatabaseManager.updateTestAtReport(testAtReportId, Constants.GENERATED);
                r = DatabaseManager.updateReports(reportId, reportId, date, labNo, specimen, Constants.NOTGENERATED);
                if(r>0){
                    clearTable();
                    testAtReportIdText.setText("");
                    JOptionPane.showMessageDialog(this ,"Report is Successfully Generated!!");
                }
            }catch(Exception ex){ex.printStackTrace();}
        }
        
    }//GEN-LAST:event_generateButtonActionPerformed

    private void clearAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllButtonActionPerformed
        clearAll();
    }//GEN-LAST:event_clearAllButtonActionPerformed

    private void headingTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headingTextActionPerformed

        String heading  = headingText.getText();
        tableModel.addRow(new Object[] {"#"+heading,"",""});
        headingText.setText("");
    }//GEN-LAST:event_headingTextActionPerformed

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed

        TestsAtReportsBean testsAtReportsBean = (TestsAtReportsBean)testList.getSelectedValue();
        if(testsAtReportsBean == null) return;
        
        if(!testAtReportIdText.getText().isEmpty())
            return;
        
        testAtReportIdText.setText("" + testsAtReportsBean.getTestAtReportId());
        
        // Widal Test Id 38 in Access but will be change in Oracle..
        if(testsAtReportsBean.getTestId()==Constants.WIDAL){
            new WidalTestDialog(this, true).setVisible(true);
            ungeneratedTestsVector.removeElement(testsAtReportsBean);
            testList.setListData(ungeneratedTestsVector);
            return;
        }
        
        try {
            Vector v = DatabaseManager.getAllTestsParams(testsAtReportsBean.getTestId());
            String testName = testsAtReportsBean.toString();
            tableModel.addRow(new Object[]{"#"+testName,"",""});
            
            for(int i=0; i<v.size(); i++){
                TestsParamsBean testParamBean = (TestsParamsBean)v.elementAt(i);
                tableModel.addRow(new Object[] {testParamBean, "" ,testParamBean.getTestParamsRange()});
                if(i==(v.size()-1)){
                    TestsBean testBean = DatabaseManager.getTestAtId(testParamBean.getTestId());
                    if(testBean.getRemarks()!=null)
                        if(!testBean.getRemarks().isEmpty())
                            tableModel.addRow(new Object[]{testBean.getRemarks(),"",""});  
                }
            }
            
         ungeneratedTestsVector.removeElement(testsAtReportsBean);
         testList.setListData(ungeneratedTestsVector);
            
        } catch (Exception e) { JOptionPane.showMessageDialog(this, e);
        e.printStackTrace();
        }
    }//GEN-LAST:event_moveButtonActionPerformed

    private void pendingReportListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_pendingReportListValueChanged
        if(!evt.getValueIsAdjusting()){
            ReportsBean reportBean = (ReportsBean)pendingReportList.getSelectedValue();
            if(reportBean==null)  return;
            
            try{
                int reciptId = reportBean.getReciptId();
                ReciptsBean reciptBean = DatabaseManager.getReceiptAtId(reciptId);
                if(reciptBean==null)   return;
                PatientBean patBean = DatabaseManager.searchPatientById(reciptBean.getPatId());
                if(patBean == null) return;
                DoctorBean docBean = DatabaseManager.searchDoctorById(reciptBean.getDoctorId());
                if(docBean == null) return;
                
                patientIdText.setText(patBean.getPatientId());
                patientNameText.setText(patBean.getPatientFirstName() + " " + patBean.getPatientLastName());
                ageText.setText(""+patBean.getAge());
                genderComboBox.setSelectedItem(Decoder.genderDecode(patBean.getGender()));
                doctorText.setText(docBean.getDoctorName());
                laboratoryNoText.setText("GG" + getReportNumber(reciptId) + " / " + (new java.util.Date()).getDate());
                String specimen = reportBean.getSpecimen();
                if(specimen==null)
                    specimenText.setText("");
                else
                    specimenText.setText(specimen);
                
                Vector<TestsAtReportsBean> v = DatabaseManager.getAllTestsAtReports(reciptId);
                ungeneratedTestsVector.removeAllElements();
                for(int k=0 ; k<v.size() ; k++){
                    TestsAtReportsBean bean = v.elementAt(k);
                    if(bean.getGenerated() == Constants.NOTGENERATED)
                        ungeneratedTestsVector.addElement(bean);
                }
                testList.setListData(ungeneratedTestsVector);
                
            }catch(Exception ex){JOptionPane.showMessageDialog(this, ex);}
        }
    }//GEN-LAST:event_pendingReportListValueChanged

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        TestCategoriesBean b = (TestCategoriesBean)categoryCombo.getSelectedItem();
        if(b == null)
                return;
        setUngeneratedReports(b.getTestCategoryId());
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        if(evt.getKeyCode() == evt.VK_DELETE){
            int row = table.getSelectedRow();
            if(row != -1){
                tableModel.removeRow(row);
            }
        }
    }//GEN-LAST:event_tableKeyPressed

    private void addRemarksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRemarksButtonActionPerformed
        testRemarksDialog.showDialog();
    }//GEN-LAST:event_addRemarksButtonActionPerformed

    private void deleteSelectedReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelectedReportButtonActionPerformed
        ReportsBean reportBean = (ReportsBean)pendingReportList.getSelectedValue();
        if(reportBean==null)    return;
        
        try{
            int r = DatabaseManager.updateReports(reportBean.getReportId(), reportBean.getReciptId(), DateFormatter.dateToString(reportBean.getDay()), reportBean.getLabNo(), reportBean.getSpecimen(), Constants.GENERATED);
            if(r>0){
                clearAll();
                TestCategoriesBean b = (TestCategoriesBean)categoryCombo.getSelectedItem();
                if(b == null)
                    return;
                setUngeneratedReports(b.getTestCategoryId());
                JOptionPane.showMessageDialog(this ,"Report is Successfully Removed!!");
            }
        }catch(Exception ex){ex.printStackTrace();}
    }//GEN-LAST:event_deleteSelectedReportButtonActionPerformed

    private void categoryComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryComboActionPerformed

    private void categoryComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryComboItemStateChanged
        TestCategoriesBean b = (TestCategoriesBean)categoryCombo.getSelectedItem();
        if(b == null)
                return;
        setUngeneratedReports(b.getTestCategoryId());
    }//GEN-LAST:event_categoryComboItemStateChanged

    
    private void setUngeneratedReports(int categoryId){
        try{
            Vector<ReportsBean> v = DatabaseManager.getUngeneratedReports(categoryId);
            this.pendingReportList.setListData(v);
        }catch(Exception ex){ex.printStackTrace();}
    }

    private void setDate(){
        dateText.setText(DateFormatter.dateToString(new java.util.Date()));
    }
    
    private void clearAll(){
        patientIdText.setText("");
        patientNameText.setText("");
        ageText.setText("");
        genderComboBox.setSelectedIndex(0);
        doctorText.setText("");
        laboratoryNoText.setText("");
        setDate();
        specimenText.setText("");
        testList.setListData(new Vector());
        headingText.setText("");
        pendingReportList.clearSelection();
        testAtReportIdText.setText("");
        clearTable();
    }
    
    
    private void clearTable(){
        int totalRows = tableModel.getRowCount();
        for(int k=0 ; k<totalRows ; k++){
            tableModel.removeRow(0);
        }
    }
    
    private String getReportNumber(int num){
        String s = String.valueOf(num);
        int length = s.length();
        int zeros = 7 - length;
        
        String newNumber="";
        for(int k=0 ; k<zeros ; k++){
            newNumber += "0";
        }
        newNumber += num;
        return newNumber;
    }
    
    private int getMaxReportDetailId(){
        int id = 1;
        try{
            id = DatabaseManager.getMaxReportDetailId();
        }catch(Exception ex){ex.printStackTrace();}
        return id;
    }
    
    private Vector<TestsAtReportsBean> ungeneratedTestsVector = new Vector();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountsLabel1;
    private javax.swing.JButton addRemarksButton;
    private javax.swing.JTextField ageText;
    private javax.swing.JComboBox categoryCombo;
    private javax.swing.JButton clearAllButton;
    private javax.swing.JTextField dateText;
    private javax.swing.JButton deleteSelectedReportButton;
    private javax.swing.JPanel doctorBorder;
    private javax.swing.JPanel doctorBorder1;
    private javax.swing.JPanel doctorBorder2;
    private javax.swing.JTextField doctorText;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JTextField headingText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField laboratoryNoText;
    private javax.swing.JButton moveButton;
    private javax.swing.JTextField patientIdText;
    private javax.swing.JTextField patientNameText;
    private javax.swing.JList pendingReportList;
    private javax.swing.JLabel productsLabel1;
    private javax.swing.JLabel productsLabel2;
    private javax.swing.JLabel productsLabel3;
    private javax.swing.JLabel productsLabel4;
    private javax.swing.JLabel productsLabel5;
    private javax.swing.JLabel quantityLabel1;
    private javax.swing.JLabel quantityLabel2;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField specimenText;
    private javax.swing.JTable table;
    private javax.swing.JTextField testAtReportIdText;
    private javax.swing.JList testList;
    // End of variables declaration//GEN-END:variables
}
