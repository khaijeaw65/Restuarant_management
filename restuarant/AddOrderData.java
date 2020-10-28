package restuarant;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class AddOrderData extends javax.swing.JDialog {

    private static final int RET_CANCEL = 0;
    private static final int RET_OK = 1;
    private final DatabaseConnection dc = new DatabaseConnection();
    private double total;
    private String empID;
    private String empName;

    public AddOrderData(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        uiConfig();
        fillData();
        BG.requestFocus();
        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    public AddOrderData(java.awt.Frame parent, boolean modal, String empID, String empName) {
        super(parent, modal);
        initComponents();
        uiConfig();
        fillData();
        this.empID = empID;
        this.empName = empName;
        emp_field.setText(this.empName);
        BG.requestFocus();
        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }
    
    public int getReturnStatus() {
        return returnStatus;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingredient_table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        supplier_company_combo = new javax.swing.JComboBox<>();
        supplier_name_combo = new javax.swing.JComboBox<>();
        yearField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        monthBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        dateBox = new javax.swing.JComboBox<>();
        emp_field = new javax.swing.JTextField();
        hourField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        minuteField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        order_table = new javax.swing.JTable();
        add_order_button = new javax.swing.JButton();
        delete_order_button = new javax.swing.JButton();
        edit_order_button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        total_field = new javax.swing.JTextField();
        ingredient_search_field = new javax.swing.JTextField();
        ingredient_search_button = new javax.swing.JButton();
        reset_ingredient_table_button = new javax.swing.JButton();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        BG.setBackground(new java.awt.Color(255, 255, 255));

        okButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        okButton.setText("ยืนยัน");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("ยกเลิก");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("พนักงาน:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("บริษัท:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ผู้รับออเดอร์:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("วันที่:");

        ingredient_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ingredient_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสวัตถุดิบ", "ชื่อวัตถุดิบ", "ราคา", "ปริมาณคงเหลือ", "หน่วยวัด"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ingredient_table.getTableHeader().setResizingAllowed(false);
        ingredient_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ingredient_table);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("เวลา:");

        supplier_company_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supplier_company_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกบริษัท--" }));
        supplier_company_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                supplier_company_comboItemStateChanged(evt);
            }
        });

        supplier_name_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supplier_name_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกผู้รับออเดอร์--" }));

        yearField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yearField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearField.setText("ปี");
        yearField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        yearField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yearFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearFieldFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("-");

        monthBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        monthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกเดือน--", "มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        monthBox.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("-");

        dateBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dateBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกวัน--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dateBox.setBorder(null);

        emp_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emp_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        emp_field.setEnabled(false);

        hourField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hourField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hourField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText(":");

        minuteField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minuteField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minuteField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        order_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        order_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสวัตถุดิบ", "วัตถุดิบที่ต้องการซื้อ", "ปริมาณ", "หน่วยวัด", "ราคาต่อหน่วย", "ราคา"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        order_table.getTableHeader().setResizingAllowed(false);
        order_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(order_table);
        if (order_table.getColumnModel().getColumnCount() > 0) {
            order_table.getColumnModel().getColumn(2).setPreferredWidth(10);
            order_table.getColumnModel().getColumn(3).setPreferredWidth(10);
            order_table.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        add_order_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_order_button.setText("เพิ่มไปยังรายการ");
        add_order_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_order_buttonMouseClicked(evt);
            }
        });

        delete_order_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_order_button.setText("ลบรายการ");
        delete_order_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_order_buttonMouseClicked(evt);
            }
        });

        edit_order_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_order_button.setText("แก้ไขรายการ");
        edit_order_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_order_buttonMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ยอดรวม:");

        total_field.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        total_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        total_field.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        total_field.setFocusable(false);

        ingredient_search_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ingredient_search_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingredient_search_field.setText("ค้นหาวัตถุดิบ");
        ingredient_search_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        ingredient_search_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ingredient_search_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingredient_search_fieldFocusLost(evt);
            }
        });

        ingredient_search_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ingredient_search_button.setText("ค้นหา");
        ingredient_search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredient_search_buttonActionPerformed(evt);
            }
        });

        reset_ingredient_table_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset_ingredient_table_button.setText("ล้างการค้นหา");
        reset_ingredient_table_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset_ingredient_table_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(6, 6, 6)
                                    .addComponent(emp_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel3)
                                    .addGap(6, 6, 6)
                                    .addComponent(supplier_company_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel4)
                                    .addGap(6, 6, 6)
                                    .addComponent(supplier_name_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(BGLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(34, 34, 34)
                                    .addComponent(dateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel11)
                                    .addGap(6, 6, 6)
                                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel10)
                                    .addGap(6, 6, 6)
                                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addGap(6, 6, 6)
                                    .addComponent(hourField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel12)
                                    .addGap(6, 6, 6)
                                    .addComponent(minuteField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(133, 133, 133)))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addComponent(ingredient_search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(ingredient_search_button)
                                .addGap(12, 12, 12)
                                .addComponent(reset_ingredient_table_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add_order_button)
                                .addGap(256, 256, 256)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(edit_order_button, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete_order_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(cancelButton))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
            .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BGLayout.createSequentialGroup()
                    .addContainerGap(645, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(12, 12, 12)
                    .addComponent(total_field, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 411, Short.MAX_VALUE)))
        );

        BGLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supplier_company_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplier_name_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(emp_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(hourField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(minuteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edit_order_button)
                            .addComponent(delete_order_button)
                            .addComponent(okButton)))
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reset_ingredient_table_button)
                        .addComponent(ingredient_search_button)
                        .addComponent(ingredient_search_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add_order_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BGLayout.createSequentialGroup()
                    .addContainerGap(105, Short.MAX_VALUE)
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(total_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 455, Short.MAX_VALUE)))
        );

        getRootPane().setDefaultButton(okButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (validatedDateInput() && validatedTimeInput() && validatedSupplierData() && isRowExist(order_table)) {
            int confirm = JOptionPane.showConfirmDialog(this, "ยืนยันการสั่งซื้อ?", "ยืนยัน", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == 0) {
                confirmOrder();
                addExpenseData();
                JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อย", "บันทึก", JOptionPane.INFORMATION_MESSAGE);
                doClose(RET_OK);
            }
        } else {
            JOptionPane.showMessageDialog(this, "ข้อมูลไม่ครบถ้วน หรือ ข้อมูลไม่ถูกต้องกรุณาลองใหม่อีกครั้ง", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void supplier_company_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_supplier_company_comboItemStateChanged
        String company = supplier_company_combo.getSelectedItem().toString();
        supplier_name_combo.removeAllItems();
        supplier_name_combo.addItem("--เลือกผู้รับออเดอร์--");
        dc.getSuplierName(company, supplier_name_combo);
    }//GEN-LAST:event_supplier_company_comboItemStateChanged

    private void yearFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFieldFocusGained
        Object ob = evt.getSource();
        if (ob == yearField)
            yearField.setText("");
    }//GEN-LAST:event_yearFieldFocusGained

    private void yearFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFieldFocusLost
        if (yearField.getText().equals(""))
            yearField.setText("ปี");
    }//GEN-LAST:event_yearFieldFocusLost

    private void add_order_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_order_buttonMouseClicked
        try {
            if (isRowSelected(ingredient_table) == false) {
                JOptionPane.showMessageDialog(this, "โปรดเลือกวัตถุดิบที่ต้องการสั่งซื่อ", "เกิดข้อผิดพลาด", JOptionPane.WARNING_MESSAGE);
            } else {
                if (isOrderExits() == false) {
                    addOrderData();
                } else {
                    addExistOrderData();
                }
            }
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_add_order_buttonMouseClicked

    private void delete_order_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_order_buttonMouseClicked
        DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
        int selectedRow = order_table.getSelectedRow();
        double price = 0;
        try {
            if (isRowExist(order_table) == false) {
                JOptionPane.showMessageDialog(this, "ไม่มีรายการสั่งซื้อ", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
            } else if (isRowSelected(order_table) == false) {
                JOptionPane.showMessageDialog(this, "โปรดเลือกรายการที่ต้องการลบ", "เกิดข้อผิดพลาด", JOptionPane.WARNING_MESSAGE);
            } else {
                int confirm = JOptionPane.showConfirmDialog(this, "ต้องการลบรายการที่เลือกใช่หรือไม่", "ลบรายการ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirm == 0) {
                    price = Double.parseDouble(dt.getValueAt(selectedRow, 5).toString());
                    this.total -= price;
                    dt.removeRow(selectedRow);
                    total_field.setText(String.format("%.1f", this.total));
                }
            }
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_delete_order_buttonMouseClicked

    private void edit_order_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_order_buttonMouseClicked
        try {
            if (isRowExist(order_table) == false) {
                JOptionPane.showMessageDialog(this, "ไม่มีรายการสั่งซื้อ", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (isRowSelected(order_table) == false) {
                JOptionPane.showMessageDialog(this, "โปรดเลือกรายการที่ต้องการแก้ไข", "เกิดข้อผิดพลาด", JOptionPane.WARNING_MESSAGE);
            } else {
                editOrderData();
            }
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_edit_order_buttonMouseClicked

    private void ingredient_search_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingredient_search_fieldFocusGained
        Object ob = evt.getSource();
        if (ob.equals(ingredient_search_field)) {
            ingredient_search_field.setText("");
        }
    }//GEN-LAST:event_ingredient_search_fieldFocusGained

    private void ingredient_search_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingredient_search_fieldFocusLost
        String text = ingredient_search_field.getText();
        if (text.equals(""))
            ingredient_search_field.setText("ค้นหาวัตถุดิบ");
    }//GEN-LAST:event_ingredient_search_fieldFocusLost

    private void ingredient_search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingredient_search_buttonActionPerformed
        DefaultTableModel dt = (DefaultTableModel) ingredient_table.getModel();
        String ingredientName = ingredient_search_field.getText();
        dt.setRowCount(0);
        dc.getRemainingMaterialDataToTable(ingredient_table, ingredientName);
    }//GEN-LAST:event_ingredient_search_buttonActionPerformed

    private void reset_ingredient_table_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset_ingredient_table_buttonMouseClicked
        DefaultTableModel dt = (DefaultTableModel) ingredient_table.getModel();
        ingredient_search_field.setText("ค้นหาวัตถุดิบ");
        dt.setRowCount(0);
        dc.getRemainingMaterialDataToTable(ingredient_table);
    }//GEN-LAST:event_reset_ingredient_table_buttonMouseClicked

    private boolean isRowExist(JTable table) {
        DefaultTableModel dt = (DefaultTableModel) table.getModel();
        int row = dt.getRowCount();
        boolean isExist = false;

        if (row > 0) {
            isExist = true;
        }

        return isExist;
    }

    private boolean isRowSelected(JTable table) {
        boolean isSelected = false;
        int selectedRow = table.getSelectedRow();

        if (selectedRow >= 0) {
            isSelected = true;
        }

        return isSelected;
    }

    private boolean isOrderExits() {
        DefaultTableModel orderModel = (DefaultTableModel) order_table.getModel();
        int selectedRow = ingredient_table.getSelectedRow();
        String id = ingredient_table.getModel().getValueAt(selectedRow, 0).toString();
        String orderId = "";
        boolean isExist = false;

        for (int i = 0; i < orderModel.getRowCount(); i++) {
            orderId = orderModel.getValueAt(i, 0).toString();
            if (orderId.equals(id)) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    private boolean validatedSupplierData() {
        int company = supplier_company_combo.getSelectedIndex();
        int name = supplier_name_combo.getSelectedIndex();
        boolean isValid = false;

        if (company != 0 && name != 0) {
            isValid = true;
        }

        return isValid;
    }

    private boolean validatedDateInput() {
        int day = dateBox.getSelectedIndex();
        int month = monthBox.getSelectedIndex();
        String year = yearField.getText();
        boolean isValid = false;

        if (day != 0 && month != 0 && year.length() > 0 && year.length() <= 4 && year.matches("[0-9]+")) {
            isValid = true;
        }

        return isValid;
    }

    private boolean validatedTimeInput() {
        String hour = hourField.getText();
        String min = minuteField.getText();
        boolean isValid = false;

        if (hour.length() > 0 && hour.length() <= 2 && min.length() > 0 && min.length() <= 2 && hour.matches("[0-9]+") && min.matches("[0-9]+") && !hour.equals("") && !min.equals("")) {
            isValid = true;
        }

        return isValid;
    }

    private void addOrderData() {
        DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
        ArrayList<String> list = new ArrayList<>();
        int selectedRow = ingredient_table.getSelectedRow();
        String ingredientID = ingredient_table.getModel().getValueAt(selectedRow, 0).toString();
        String ingredientName = ingredient_table.getModel().getValueAt(selectedRow, 1).toString();
        String ingredientPrice = ingredient_table.getModel().getValueAt(selectedRow, 2).toString();
        String unit = ingredient_table.getModel().getValueAt(selectedRow, 4).toString();
        String inputDialogMessage = "โปรดระบุปริมาณวัตถุดิบที่ต้องการสั่งซื้อ" + "\n" + "ชื่อวัตถุดิบ: " + ingredientName + "\n" + "ราคา: " + ingredientPrice + "\n" + "หน่วยวัด: " + unit;
        String amount = JOptionPane.showInputDialog(this, inputDialogMessage, "การสั่งซื้อ", JOptionPane.INFORMATION_MESSAGE);
        if (!amount.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "ข้อมูลไม่ถูกต้อง", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "วัตถุดิบที่เลือก: " + ingredientName + "\n" + "ปริมาณ: " + amount + " " + unit, "ยืนยันการสั่งซื้อ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == 0) {
                double addAmount = Double.parseDouble(amount);
                double calPrice = Double.parseDouble(ingredientPrice) * Integer.parseInt(amount);
                this.total += calPrice;
                list.add(ingredientID);
                list.add(ingredientName);
                list.add(Double.toString(addAmount));
                list.add(unit);
                list.add(ingredientPrice);
                list.add(Double.toString(calPrice));
                dt.addRow(list.toArray());
                total_field.setText(String.format("%.1f", this.total));
            }
        }
    }

    private void addExistOrderData() {
        DefaultTableModel orderModel = (DefaultTableModel) order_table.getModel();
        int selectedRow = ingredient_table.getSelectedRow();
        String ingredientId = ingredient_table.getModel().getValueAt(selectedRow, 0).toString();
        String ingredientName = ingredient_table.getModel().getValueAt(selectedRow, 1).toString();
        String ingredientPrice = ingredient_table.getModel().getValueAt(selectedRow, 2).toString();
        String unit = ingredient_table.getModel().getValueAt(selectedRow, 4).toString();
        double price = 0;
        String orderId = "";
        double amount = 0;
        String dialogMessage = "";
        for (int row = 0; row < orderModel.getRowCount(); row++) {
            orderId = order_table.getModel().getValueAt(row, 0).toString();
            double orderPrice = Double.parseDouble(order_table.getModel().getValueAt(row, 5).toString());
            if (ingredientId.equals(orderId)) {
                amount = Double.parseDouble(order_table.getModel().getValueAt(row, 2).toString());
                dialogMessage = "โปรดระบุปริมาณวัตถุดิบที่ต้องการเพิ่มไปยังรายการสั่งซื้อ" + "\n" + "วัตถุดิบที่ต้องการเพิ่ม: " + ingredientName;
                String addAmount = JOptionPane.showInputDialog(this, dialogMessage, "เพิ่มการสั่งซื้อ", JOptionPane.QUESTION_MESSAGE);
                int confirm = JOptionPane.showConfirmDialog(this, "วัตถุดิบที่เลือก: " + ingredientName + "\n" + "ปริมาณ: " + addAmount + " " + unit, "ยืนยันการสั่งซื้อ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirm == 0) {
                    price = Double.parseDouble(ingredientPrice) * Double.parseDouble(addAmount);
                    this.total += price;
                    orderPrice += price;
                    amount += Double.parseDouble(addAmount);
                    order_table.getModel().setValueAt(amount, row, 2);
                    order_table.getModel().setValueAt(orderPrice, row, 5);
                    total_field.setText(Double.toString(this.total));
                    break;
                }
            }
        }
    }

    private void editOrderData() {
        DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
        int selectedRow = order_table.getSelectedRow();
        String newAmount = "";
        double pricePerUnit = 0;
        double price = 0;
        double newPrice = 0;

        pricePerUnit = Double.parseDouble(dt.getValueAt(selectedRow, 4).toString());
        price = Double.parseDouble(dt.getValueAt(selectedRow, 5).toString());
        newAmount = JOptionPane.showInputDialog(this, "โปรดระบุจำนวนที่ต้องการ", "แก้ไขรายการ", JOptionPane.INFORMATION_MESSAGE);
        this.total -= price;
        if (!newAmount.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "ข้อมูลไม่ถูกต้อง", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "ต้องการแก้ไขรายการที่เลือกใช่หรือไม่", "แก้ไขรายการ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == 0) {
                newPrice = pricePerUnit * Integer.parseInt(newAmount);
                this.total += newPrice;
                dt.setValueAt(Double.parseDouble(newAmount), selectedRow, 2);
                dt.setValueAt(newPrice, selectedRow, 5);
                total_field.setText(String.format("%.1f", this.total));
            }
        }
    }

    private void confirmOrder() {
        ArrayList<String> materialID = new ArrayList<>();
        ArrayList<String> materialAmount = new ArrayList<>();
        DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
        String date = convertDateTime();
        String empId = this.empID;
        String supplierId = getSupplierID();

        for (int i = 0; i < dt.getRowCount(); i++) {
            materialID.add(dt.getValueAt(i, 0).toString());
            materialAmount.add(dt.getValueAt(i, 2).toString());
        }

        dc.insertOrderData(empId, supplierId, date, materialID, materialAmount);
    }
    
    private void addExpenseData(){
        String date = convertDateTime();
        String balance = total_field.getText();
        String detail = "สังซื้อวัตถุดิบจากบริษัท: " + supplier_company_combo.getSelectedItem().toString() + "\nผู้รับออเดอร์: " + supplier_name_combo.getSelectedItem().toString();
        
        dc.insertAccountingData(this.empID, date, balance, detail);
    }

    private String convertDateTime() {
        int date = Integer.parseInt(dateBox.getSelectedItem().toString());
        int month = monthBox.getSelectedIndex();
        int year = Integer.parseInt(yearField.getText());
        int hour = Integer.parseInt(hourField.getText());
        int minute = Integer.parseInt(minuteField.getText());
        LocalDateTime convertDate = LocalDateTime.of(year, month, date, hour, minute, 00);

        return convertDate.toString();
    }

    private String getSupplierID() {
        String company = supplier_company_combo.getSelectedItem().toString();
        String name = supplier_name_combo.getSelectedItem().toString();
        String id = dc.getSupplierID(company, name);

        return id;
    }

    private void fillData() {
        dc.getRemainingMaterialDataToTable(ingredient_table);
        dc.getSupplierCompany(supplier_company_combo);
    }

    private void uiConfig() {
        TableColumnModel ingredientColumnModel = ingredient_table.getColumnModel();
        TableColumnModel orderColumnModel = order_table.getColumnModel();
        Font tableFont = new Font("Tahoma", Font.BOLD, 18);
        Font uiFont = new Font("Tahoma", Font.PLAIN, 14);
        UIManager.put("OptionPane.messageFont", uiFont);
        ingredient_table.getTableHeader().setFont(tableFont);
        order_table.getTableHeader().setFont(tableFont);
        ingredientColumnModel.removeColumn(ingredientColumnModel.getColumn(0));
        orderColumnModel.removeColumn(orderColumnModel.getColumn(0));
        orderColumnModel.removeColumn(orderColumnModel.getColumn(3));
    }

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddOrderData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOrderData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOrderData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOrderData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddOrderData dialog = new AddOrderData(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton add_order_button;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> dateBox;
    private javax.swing.JButton delete_order_button;
    private javax.swing.JButton edit_order_button;
    private javax.swing.JTextField emp_field;
    private javax.swing.JTextField hourField;
    private javax.swing.JButton ingredient_search_button;
    private javax.swing.JTextField ingredient_search_field;
    private javax.swing.JTable ingredient_table;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField minuteField;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JButton okButton;
    private javax.swing.JTable order_table;
    private javax.swing.JButton reset_ingredient_table_button;
    private javax.swing.JComboBox<String> supplier_company_combo;
    private javax.swing.JComboBox<String> supplier_name_combo;
    private javax.swing.JTextField total_field;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
