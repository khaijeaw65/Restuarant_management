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
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ReceiveMaterialData extends javax.swing.JDialog {

    public static final int RET_CANCEL = 0;
    public static final int RET_OK = 1;
    private String orderID;
    private String empID;
    private final DatabaseConnection dc = new DatabaseConnection();

    public ReceiveMaterialData(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        uiConfig();
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

    public ReceiveMaterialData(java.awt.Frame parent, boolean modal, String orderID, String empID) {
        super(parent, modal);
        initComponents();
        this.orderID = orderID;
        this.empID = empID;
        uiConfig();
        fillTableData();
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
        save_button = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        order_table = new javax.swing.JTable();
        empField = new javax.swing.JTextField();
        compField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dateBox = new javax.swing.JComboBox<>();
        hourField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        minuteField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yearField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        monthBox = new javax.swing.JComboBox<>();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        BG.setBackground(new java.awt.Color(255, 255, 255));

        save_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save_button.setText("บันทึก");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("ยกเลิก");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        order_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        order_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสการสั่งซื้อ", "รหัสวัตถุดิบ", "ชื่อวัตถุดิบ", "ปริมาณ", "หน่วยวัด", "สถานะ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        order_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(order_table);

        empField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        empField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        empField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        empField.setFocusable(false);

        compField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        compField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        compField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        compField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        compField.setFocusable(false);

        contactField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contactField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        contactField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contactField.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("พนักงาน:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("บริษัท:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ผู้รับออเดอร์:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("-");

        dateBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dateBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกวัน--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dateBox.setBorder(null);

        hourField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hourField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hourField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText(":");

        minuteField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minuteField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minuteField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("วันที่:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("เวลา:");

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

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(empField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(save_button)
                        .addComponent(cancelButton))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getRootPane().setDefaultButton(save_button);

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

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        if (validatedDateInput() && validatedTimeInput()) {
            int confirm = JOptionPane.showConfirmDialog(this, "ต้องการบันทึกข้อมูลใช่หรือไม่?", "บันทึกข้อมูล", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == 0) {
                addReceiveData();
                JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อย", "บันทึก", JOptionPane.INFORMATION_MESSAGE);
                doClose(RET_OK);
            }
        }else
            JOptionPane.showMessageDialog(this, "กรุณาระบุวันที่และเวลาที่ได้รับวัตถุดิบ", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_save_buttonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void yearFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFieldFocusGained
        Object ob = evt.getSource();
        if (ob == yearField)
            yearField.setText("");
    }//GEN-LAST:event_yearFieldFocusGained

    private void yearFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFieldFocusLost
        if (yearField.getText().equals(""))
            yearField.setText("ปี");
    }//GEN-LAST:event_yearFieldFocusLost

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

    private String convertDateTime() {
        int date = Integer.parseInt(dateBox.getSelectedItem().toString());
        int month = monthBox.getSelectedIndex();
        int year = Integer.parseInt(yearField.getText());
        int hour = Integer.parseInt(hourField.getText());
        int minute = Integer.parseInt(minuteField.getText());
        LocalDateTime convertDate = LocalDateTime.of(year, month, date, hour, minute, 00);

        return convertDate.toString();
    }

    private void addReceiveData() {
        ArrayList<String> mID = new ArrayList<>();
        ArrayList<String> mAmount = new ArrayList<>();
        DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
        String date = convertDateTime();

        for (int i = 0; i < dt.getRowCount(); i++) {
            mID.add(dt.getValueAt(i, 1).toString());
            mAmount.add(dt.getValueAt(i, 3).toString());
        }

        dc.insertReceiveData(this.orderID, date, this.empID, mID, mAmount);

    }

    private void fillTableData(){
        ArrayList<String> list = dc.getOrderDetailData(this.orderID);
        dc.getOrderDetailDataToTable(order_table, this.orderID);
        empField.setText(list.get(0));
        compField.setText(list.get(1));
        contactField.setText(list.get(2));
    }
    
    private void uiConfig() {
        Font tableFont = new Font("Tahoma", Font.BOLD, 18);
        TableColumnModel cm = order_table.getColumnModel();
        order_table.getTableHeader().setFont(tableFont);
        cm.removeColumn(cm.getColumn(0));
        cm.removeColumn(cm.getColumn(0));
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
            java.util.logging.Logger.getLogger(ReceiveMaterialData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceiveMaterialData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceiveMaterialData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceiveMaterialData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ReceiveMaterialData dialog = new ReceiveMaterialData(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField compField;
    private javax.swing.JTextField contactField;
    private javax.swing.JComboBox<String> dateBox;
    private javax.swing.JTextField empField;
    private javax.swing.JTextField hourField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField minuteField;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JTable order_table;
    private javax.swing.JButton save_button;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
