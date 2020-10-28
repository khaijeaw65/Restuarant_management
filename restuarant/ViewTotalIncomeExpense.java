package restuarant;

import java.awt.Font;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ViewTotalIncomeExpense extends javax.swing.JFrame {

    private DatabaseConnection dc = new DatabaseConnection();

    public ViewTotalIncomeExpense() {
        initComponents();
        UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.PLAIN, 14));
        BG.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        BG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        incomeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        expenseField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        profitField = new javax.swing.JTextField();
        reccord_search_button = new javax.swing.JButton();
        expense_year_field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        expense_month_box = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        expense_day_box = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("jLabel1");

        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BG.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("วันที่:");

        dateField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateField.setForeground(new java.awt.Color(0, 0, 0));
        dateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        dateField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dateField.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("รายรับทั้งหมด:");

        incomeField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        incomeField.setForeground(new java.awt.Color(0, 0, 0));
        incomeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        incomeField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        incomeField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        incomeField.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("รายจ่ายทั้งหมด:");

        expenseField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        expenseField.setForeground(new java.awt.Color(0, 0, 0));
        expenseField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expenseField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        expenseField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        expenseField.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("กำไรสุทธิ:");

        profitField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        profitField.setForeground(new java.awt.Color(0, 0, 0));
        profitField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        profitField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        profitField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profitField.setFocusable(false);

        reccord_search_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reccord_search_button.setText("ค้นหา");
        reccord_search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reccord_search_buttonActionPerformed(evt);
            }
        });

        expense_year_field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        expense_year_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expense_year_field.setText("ปี");
        expense_year_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        expense_year_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                expense_year_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                expense_year_fieldFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("-");

        expense_month_box.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        expense_month_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกเดือน--", "มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        expense_month_box.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("-");

        expense_day_box.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        expense_day_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกวัน--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        expense_day_box.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("วันที่ ที่ต้องการ:");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(expenseField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(incomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profitField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(expense_day_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expense_month_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expense_year_field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reccord_search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reccord_search_button)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(expense_year_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expense_day_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expense_month_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(incomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(expenseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(profitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

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

    private void reccord_search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reccord_search_buttonActionPerformed
        if (validatedDateInput() && validateData()) {
            fillData();
        } else
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลวันที่ ที่ต้องการค้นหาข้อมูล", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_reccord_search_buttonActionPerformed

    private void fillData() {
        String date = convertDateInput();
        String income = dc.getIncomeData(date);
        String expense = dc.getExpenseData(date);
        String profit = calculateProfit();
        dateField.setText(date);
        incomeField.setText(income);
        expenseField.setText(expense);
        profitField.setText(profit);
    }

    private String calculateProfit() {
        String date = convertDateInput();
        String income = dc.getIncomeData(date);
        String expense = dc.getExpenseData(date);
        String profit = "";
        if (income != null && expense != null) {
            profit = Integer.toString(Integer.parseInt(income) - Integer.parseInt(expense));
            return profit;
        }
        return profit;
    }

    private String convertDateInput() {
        int day = expense_day_box.getSelectedIndex();
        int month = expense_month_box.getSelectedIndex();
        int year = Integer.parseInt(expense_year_field.getText());
        LocalDate convertedDate = LocalDate.of(year, month, day);
        return convertedDate.toString();
    }

    private boolean validatedDateInput() {
        int day = expense_day_box.getSelectedIndex();
        int month = expense_month_box.getSelectedIndex();
        String year = expense_year_field.getText();

        return !(day == 0 || month == 0 || !year.matches("[0-9]+") || year.length() < 4);
    }

    private boolean validateData() {
        boolean isValid = false;
        String date = convertDateInput();
        if (!date.isEmpty()) {
            String income = dc.getIncomeData(date);
            String expense = dc.getExpenseData(date);

            if (!income.isEmpty() && !expense.isEmpty()) {
                isValid = true;
            }
        }
        return isValid;
    }

    private void expense_year_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expense_year_fieldFocusGained
        Object ob = evt.getSource();
        if (ob == expense_year_field)
            expense_year_field.setText("");
    }//GEN-LAST:event_expense_year_fieldFocusGained

    private void expense_year_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expense_year_fieldFocusLost
        if (expense_year_field.getText().equals(""))
            expense_year_field.setText("ปี");
    }//GEN-LAST:event_expense_year_fieldFocusLost

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
            java.util.logging.Logger.getLogger(ViewTotalIncomeExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTotalIncomeExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTotalIncomeExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTotalIncomeExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTotalIncomeExpense().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField expenseField;
    private javax.swing.JComboBox<String> expense_day_box;
    private javax.swing.JComboBox<String> expense_month_box;
    private javax.swing.JTextField expense_year_field;
    private javax.swing.JTextField incomeField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField profitField;
    private javax.swing.JButton reccord_search_button;
    // End of variables declaration//GEN-END:variables
}
