package restuarant;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class EditOrderData extends javax.swing.JDialog {

    public static final int RET_CANCEL = 0;
    public static final int RET_OK = 1;
    private String orderID;
    private final DatabaseConnection dc = new DatabaseConnection();

    public EditOrderData(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

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

    public EditOrderData(java.awt.Frame parent, boolean modal, String orderID) {
        super(parent, modal);
        initComponents();
        this.orderID = orderID;
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

    public int getReturnStatus() {
        return returnStatus;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        BG = new javax.swing.JPanel();
        save_button = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        order_table = new javax.swing.JTable();
        edit_order_button = new javax.swing.JButton();
        delete_order_button = new javax.swing.JButton();
        empField = new javax.swing.JTextField();
        compField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setResizable(false);
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
        if (order_table.getColumnModel().getColumnCount() > 0) {
            order_table.getColumnModel().getColumn(0).setResizable(false);
            order_table.getColumnModel().getColumn(1).setResizable(false);
            order_table.getColumnModel().getColumn(2).setResizable(false);
            order_table.getColumnModel().getColumn(3).setResizable(false);
            order_table.getColumnModel().getColumn(4).setResizable(false);
            order_table.getColumnModel().getColumn(5).setResizable(false);
        }

        edit_order_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_order_button.setText("แก้ไข");
        edit_order_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_order_buttonMouseClicked(evt);
            }
        });

        delete_order_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_order_button.setText("ลบ");
        delete_order_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_order_buttonMouseClicked(evt);
            }
        });

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

        dateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        dateField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dateField.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("พนักงาน:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("บริษัท:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ผู้รับออเดอร์:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("วันที่สั่งซื้อ:");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edit_order_button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_order_button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save_button, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        BGLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, save_button});

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(save_button)
                        .addComponent(cancelButton)
                        .addComponent(edit_order_button)
                        .addComponent(delete_order_button)))
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

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        if (checkDateInput()) {
            int confirm = JOptionPane.showConfirmDialog(this, "ต้องการบันทึกข้อมูลใช่หรือไม่?", "บันทึกข้อมูล", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == 0) {
                updateOrderTotal();
                JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อย", "บันทึก", JOptionPane.INFORMATION_MESSAGE);
                doClose(RET_OK);
            }
        }
    }//GEN-LAST:event_save_buttonActionPerformed

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void edit_order_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_order_buttonMouseClicked
        editOrder();
    }//GEN-LAST:event_edit_order_buttonMouseClicked

    private void delete_order_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_order_buttonMouseClicked
        removeOrder();
    }//GEN-LAST:event_delete_order_buttonMouseClicked

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    private void editOrder() {
        int selectedRow = order_table.getSelectedRow();
        if (isRowSelected()) {
            try {
                String mID = order_table.getModel().getValueAt(selectedRow, 1).toString();
                String mName = order_table.getModel().getValueAt(selectedRow, 2).toString();
                String newAmount = JOptionPane.showInputDialog(this, "วัตถุดิบที่ต้องการแก้ไขปริมาณ" + "\nวัตถุดิบ: " + mName, "แก้ไขข้อมูล", JOptionPane.INFORMATION_MESSAGE);
                if (newAmount.matches("[0-9]+") && !newAmount.equals("")) {
                    int confirm = JOptionPane.showConfirmDialog(this, "ต้องการแก้ไขรายการที่เลือกใช่หรือไม่?" + "\n", "แก้ไขรายการ" + "วัตถุดิบที่ต้องการแก้ไขปริมาณ" + "\nวัตถุดิบ: " + mName + "\nปริมาณ: " + newAmount, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (confirm == 0) {
                        dc.updateOrderDetailData(this.orderID, mID, newAmount);
                        refreshTable();
                    }
                }
            } catch (NullPointerException e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกรายการที่ต้องการลบ", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void removeOrder() {
        DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
        int selectedRow = order_table.getSelectedRow();

        if (isRowSelected()) {
            int confirm = JOptionPane.showConfirmDialog(this, "ต้องการลบรายการที่เลือกใช่หรือไม่", "ลบรายการ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == 0) {
                String mID = dt.getValueAt(selectedRow, 1).toString();
                dc.deleteOrderDetailData(this.orderID, mID);
                dt.removeRow(selectedRow);
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกรายการที่ต้องการแก้ไข", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateOrderTotal() {
        DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
        int rowCount = dt.getRowCount();
        dc.updateOrderAmount(orderID, rowCount);
    }

    private boolean isRowSelected() {
        boolean isSelected = false;
        int selectedRow = order_table.getSelectedRow();

        if (selectedRow >= 0) {
            isSelected = true;
        }

        return isSelected;
    }

    private boolean checkDateInput() {
        String date = dateField.getText();
        boolean isValid = false;

        if (date.matches("\\d{2}-\\d{2}-\\d{4} \\d{2}:\\d{2}")) {
            isValid = true;
        }

        return isValid;
    }

    private void refreshTable() {
        DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
        dt.setRowCount(0);
        dc.getOrderDetailDataToTable(order_table, this.orderID);
    }

    private void fillData() {
        ArrayList<String> list = dc.getOrderDetailData(this.orderID);
        dc.getOrderDetailDataToTable(order_table, this.orderID);
        empField.setText(list.get(0));
        compField.setText(list.get(1));
        contactField.setText(list.get(2));
        dateField.setText(list.get(3));
    }

    private void uiConfig() {
        Font tableFont = new Font("Tahoma", Font.BOLD, 18);
        TableColumnModel cm = order_table.getColumnModel();
        order_table.getTableHeader().setFont(tableFont);
        cm.removeColumn(cm.getColumn(0));
        cm.removeColumn(cm.getColumn(0));
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
            java.util.logging.Logger.getLogger(EditOrderData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditOrderData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditOrderData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditOrderData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditOrderData dialog = new EditOrderData(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField dateField;
    private javax.swing.JButton delete_order_button;
    private javax.swing.JButton edit_order_button;
    private javax.swing.JTextField empField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable order_table;
    private javax.swing.JButton save_button;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
