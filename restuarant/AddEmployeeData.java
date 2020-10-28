package restuarant;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class AddEmployeeData extends javax.swing.JDialog {

    public static final int RET_CANCEL = 0;
    public static final int RET_OK = 1;
    private final DatabaseConnection dc = new DatabaseConnection();

    public AddEmployeeData(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.PLAIN, 14));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        address_field = new javax.swing.JTextArea();
        username_field = new javax.swing.JTextField();
        prefix_combo = new javax.swing.JComboBox<>();
        name_field = new javax.swing.JTextField();
        lastname_field = new javax.swing.JTextField();
        id_field = new javax.swing.JTextField();
        tel_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        birth_year_field = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        birth_month_combo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        birth_date_combo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        work_year_field = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        work_month_combo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        work_date_combo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setForeground(new java.awt.Color(0, 0, 0));

        okButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        okButton.setText("บันทึก");
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

        address_field.setColumns(20);
        address_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        address_field.setLineWrap(true);
        address_field.setRows(5);
        address_field.setWrapStyleWord(true);
        jScrollPane1.setViewportView(address_field);

        username_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        prefix_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prefix_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกคำนำหน้า--", "นาย", "นาง", "นางสาว" }));

        name_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lastname_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastname_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastname_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        id_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        tel_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tel_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tel_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ชื่อผู้ใช้:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("รหัสผ่าน:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("คำนำหน้าชื่อ:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ชื่อ:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("นามสกุล:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("รหัสบัตรประชาชน:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("เบอร์โทรศัพท์:");

        birth_year_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        birth_year_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        birth_year_field.setText("ปี");
        birth_year_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        birth_year_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                birth_year_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                birth_year_fieldFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("-");

        birth_month_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        birth_month_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกเดือน--", "มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        birth_month_combo.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("-");

        birth_date_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        birth_date_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกวัน--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        birth_date_combo.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("วัน/เดือน/ปีเกิด:");

        work_year_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        work_year_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        work_year_field.setText("ปี");
        work_year_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        work_year_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                birth_year_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                birth_year_fieldFocusLost(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("-");

        work_month_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        work_month_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกเดือน--", "มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        work_month_combo.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("-");

        work_date_combo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        work_date_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกวัน--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        work_date_combo.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("วันที่เริ่มงาน:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("ที่อยู่:");

        password_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("ตัวอย่าง: 1234-123-123-432");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("ตัวอย่าง: 081-123-4567");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton)))
                        .addGap(10, 10, 10))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(BGLayout.createSequentialGroup()
                                    .addComponent(work_date_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel13)
                                    .addGap(6, 6, 6)
                                    .addComponent(work_month_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel12)
                                    .addGap(6, 6, 6)
                                    .addComponent(work_year_field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(BGLayout.createSequentialGroup()
                                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(18, 18, 18)
                                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BGLayout.createSequentialGroup()
                                            .addComponent(birth_date_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel11)
                                            .addGap(6, 6, 6)
                                            .addComponent(birth_month_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel10)
                                            .addGap(6, 6, 6)
                                            .addComponent(birth_year_field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tel_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(BGLayout.createSequentialGroup()
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BGLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(52, 52, 52)
                                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(prefix_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(23, 23, 23)
                                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(BGLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(password_field))
                                        .addGroup(BGLayout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(lastname_field, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        BGLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prefix_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(lastname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(25, 25, 25)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16))
                .addGap(25, 25, 25)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(birth_date_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birth_month_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(birth_year_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(work_date_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(work_month_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(work_year_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addGap(20, 20, 20))
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
        if (checkTextInput() && checkBirthDateInput() && checkWorkDateInput() && checkIdInput()) {
            int confirm = JOptionPane.showConfirmDialog(this, "ต้องการบันทึกข้อมูลใช่หรือไม่?", "บันทึกข้อมูล", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == 0) {
                if (checkUsername()) {
                    insert();
                    JOptionPane.showMessageDialog(this,"บันทึกข้อมูลเรียบร้อย","บันทึกข้อมูล",JOptionPane.INFORMATION_MESSAGE);
                    doClose(RET_OK);
                }else
                    JOptionPane.showMessageDialog(this, "ชื่อผู้ใช้งานซ้ำกับในระบบ", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
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

    private void birth_year_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birth_year_fieldFocusGained
        Object ob = evt.getSource();
        if (ob == birth_year_field)
            birth_year_field.setText("");
        else if (ob == work_year_field)
            work_year_field.setText("");
    }//GEN-LAST:event_birth_year_fieldFocusGained

    private void birth_year_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_birth_year_fieldFocusLost
        if (birth_year_field.getText().equals(""))
            birth_year_field.setText("ปี");
        else if (work_year_field.getText().equals(""))
            work_year_field.setText("ปี");
    }//GEN-LAST:event_birth_year_fieldFocusLost

    private void insert() {
        String[] data = new String[10];
        data[0] = username_field.getText();
        data[1] = new String(password_field.getPassword());
        data[2] = prefix_combo.getSelectedItem().toString();
        data[3] = name_field.getText();
        data[4] = lastname_field.getText();
        data[5] = id_field.getText();
        data[6] = tel_field.getText();
        data[7] = address_field.getText();
        data[8] = convertBirthDate();
        data[9] = convertWorkDate();

        dc.insertEmployeeData(data);
    }

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    private String convertBirthDate() {
        int day = birth_date_combo.getSelectedIndex();
        int month = birth_month_combo.getSelectedIndex();
        int year = Integer.parseInt(birth_year_field.getText());
        LocalDateTime convertedDate = LocalDateTime.of(year, month, day,0,0);

        return convertedDate.toString();
    }

    private String convertWorkDate() {
        int day = work_date_combo.getSelectedIndex();
        int month = work_month_combo.getSelectedIndex();
        int year = Integer.parseInt(work_year_field.getText());
        LocalDateTime convertedDate = LocalDateTime.of(year, month, day, 0, 0);

        return convertedDate.toString();
    }

    private boolean checkTextInput() {
        String username = username_field.getText();
        String password = new String(password_field.getPassword());
        int prefixIndex = prefix_combo.getSelectedIndex();
        String name = name_field.getText();
        String lastName = lastname_field.getText();     
        String tel = tel_field.getText();
        String address = address_field.getText();
        boolean isValid = false;

        if (!username.isEmpty() && !password.isEmpty() && prefixIndex != 0 && !name.isEmpty() && !lastName.isEmpty() && tel.length() > 0 && tel.length() <= 12 && !tel.isEmpty() && tel.matches("\\d{3}-\\d{3}-\\d{4}") && !address.isEmpty()) {
            isValid = true;
        }

        return isValid;
    }

    private boolean checkIdInput() {
        String id = id_field.getText();
        boolean isValid = false;
        
        if (!id.isEmpty() && id.matches("\\d{4}-\\d{3}-\\d{3}-\\d{3}") && id.length() > 0 && id.length() <=16)
            isValid = true;
        
        return isValid;
    }
    
    private boolean checkBirthDateInput() {
        int day = birth_date_combo.getSelectedIndex();
        int month = birth_month_combo.getSelectedIndex();
        String year = birth_year_field.getText();
        boolean isValid = false;

        if (day != 0 && month != 0 && !year.isEmpty() && year.matches("[0-9]+") && year.length() > 0 && year.length() <= 4) {
            isValid = true;
        }

        return isValid;
    }

    private boolean checkWorkDateInput() {
        int day = work_date_combo.getSelectedIndex();
        int month = work_month_combo.getSelectedIndex();
        String year = work_year_field.getText();
        boolean isValid = false;

        if (day != 0 && month != 0 && !year.isEmpty() && year.matches("[0-9]+") && year.length() > 0 && year.length() <= 4) {
            isValid = true;
        }

        return isValid;
    }

    private boolean checkUsername() {
        String username = username_field.getText();
        ArrayList<String> list = dc.getUsername();
        boolean isExist = false;

        for (int i = 0; i < list.size(); i++) {
            if (username.equals(list.get(i))) {
                isExist = false;
                break;
            }else
                isExist = true;
        }
        return isExist;
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
            java.util.logging.Logger.getLogger(AddEmployeeData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddEmployeeData dialog = new AddEmployeeData(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextArea address_field;
    private javax.swing.JComboBox<String> birth_date_combo;
    private javax.swing.JComboBox<String> birth_month_combo;
    private javax.swing.JTextField birth_year_field;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField id_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname_field;
    private javax.swing.JTextField name_field;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JComboBox<String> prefix_combo;
    private javax.swing.JTextField tel_field;
    private javax.swing.JTextField username_field;
    private javax.swing.JComboBox<String> work_date_combo;
    private javax.swing.JComboBox<String> work_month_combo;
    private javax.swing.JTextField work_year_field;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
