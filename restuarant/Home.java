package restuarant;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Home extends javax.swing.JFrame {

    private String userID;
    private final DatabaseConnection dc = new DatabaseConnection();
    int xx, xy;

    public Home() {
        initComponents();
        control_panel.setVisible(false);
        uiConfig();
        fillTableData();
    }

    public Home(String name, String userID) {
        initComponents();
        this.userID = userID;
        employeeNameLabel.setText(name);
        control_panel.setVisible(false);
        uiConfig();
        fillTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        top_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        closeButton = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        side_panel = new javax.swing.JPanel();
        accounting_button = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        ingredient_button = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        employee_button = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        welcome_panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        employeeNameLabel = new javax.swing.JLabel();
        logout_button = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        supplier_button = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        ingredient_order_button = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        control_panel = new javax.swing.JPanel();
        account_management_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        account_table = new javax.swing.JTable();
        reccord_search_button = new javax.swing.JButton();
        add_account_data_button = new javax.swing.JButton();
        edit_account_data_button = new javax.swing.JButton();
        account_table_refresh_button = new javax.swing.JButton();
        expense_year_field = new javax.swing.JTextField();
        expense_day_box = new javax.swing.JComboBox<>();
        expense_month_box = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        calculate_expense = new javax.swing.JButton();
        ingredient_manage_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        material_table = new javax.swing.JTable();
        edit_material_button = new javax.swing.JButton();
        add_material_button = new javax.swing.JButton();
        ingredient_order_panel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        order_table = new javax.swing.JTable();
        edit_order_button = new javax.swing.JButton();
        receive_material_button = new javax.swing.JButton();
        create_order_button = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        order_table_refresh_button = new javax.swing.JButton();
        order_day_box = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        order_month_box = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        order_year_field = new javax.swing.JTextField();
        order_search_button = new javax.swing.JButton();
        supplier_management_panel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        supplier_table = new javax.swing.JTable();
        edit_supplier_button = new javax.swing.JButton();
        add_supplier_button = new javax.swing.JButton();
        employee_management_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        employee_table = new javax.swing.JTable();
        add_emp_button = new javax.swing.JButton();
        edit_emp_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top_panel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ระบบจัดการร้านอาหาร");

        closeButton.setBackground(new java.awt.Color(51, 153, 255));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                frameButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                frameButtonMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("X");

        javax.swing.GroupLayout closeButtonLayout = new javax.swing.GroupLayout(closeButton);
        closeButton.setLayout(closeButtonLayout);
        closeButtonLayout.setHorizontalGroup(
            closeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeButtonLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        closeButtonLayout.setVerticalGroup(
            closeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        minimizeButton.setBackground(new java.awt.Color(0, 153, 255));
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                frameButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                frameButtonMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("_");

        javax.swing.GroupLayout minimizeButtonLayout = new javax.swing.GroupLayout(minimizeButton);
        minimizeButton.setLayout(minimizeButtonLayout);
        minimizeButtonLayout.setHorizontalGroup(
            minimizeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimizeButtonLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(10, 10, 10))
        );
        minimizeButtonLayout.setVerticalGroup(
            minimizeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout top_panelLayout = new javax.swing.GroupLayout(top_panel);
        top_panel.setLayout(top_panelLayout);
        top_panelLayout.setHorizontalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 711, Short.MAX_VALUE)
                .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        top_panelLayout.setVerticalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(top_panelLayout.createSequentialGroup()
                .addGroup(top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BG.add(top_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1210, 90));

        side_panel.setBackground(new java.awt.Color(51, 51, 51));
        side_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accounting_button.setBackground(new java.awt.Color(51, 51, 51));
        accounting_button.setForeground(new java.awt.Color(51, 51, 51));
        accounting_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlButtonOnClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOnButton(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOnButton(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("รายรับ/รายจ่าย");

        javax.swing.GroupLayout accounting_buttonLayout = new javax.swing.GroupLayout(accounting_button);
        accounting_button.setLayout(accounting_buttonLayout);
        accounting_buttonLayout.setHorizontalGroup(
            accounting_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accounting_buttonLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel16)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        accounting_buttonLayout.setVerticalGroup(
            accounting_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accounting_buttonLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(25, 25, 25))
        );

        side_panel.add(accounting_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 170, -1));

        ingredient_button.setBackground(new java.awt.Color(51, 51, 51));
        ingredient_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlButtonOnClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOnButton(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOnButton(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("วัตถุดิบในคลัง");

        javax.swing.GroupLayout ingredient_buttonLayout = new javax.swing.GroupLayout(ingredient_button);
        ingredient_button.setLayout(ingredient_buttonLayout);
        ingredient_buttonLayout.setHorizontalGroup(
            ingredient_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredient_buttonLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel17)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        ingredient_buttonLayout.setVerticalGroup(
            ingredient_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredient_buttonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        side_panel.add(ingredient_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 170, -1));

        employee_button.setBackground(new java.awt.Color(51, 51, 51));
        employee_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlButtonOnClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOnButton(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOnButton(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("ข้อมูลพนักงาน");

        javax.swing.GroupLayout employee_buttonLayout = new javax.swing.GroupLayout(employee_button);
        employee_button.setLayout(employee_buttonLayout);
        employee_buttonLayout.setHorizontalGroup(
            employee_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employee_buttonLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
        employee_buttonLayout.setVerticalGroup(
            employee_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employee_buttonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        side_panel.add(employee_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 170, -1));

        welcome_panel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ยินดีต้อนรับ");

        employeeNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        employeeNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        employeeNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        employeeNameLabel.setText("ชื่อพนักงาน");

        javax.swing.GroupLayout welcome_panelLayout = new javax.swing.GroupLayout(welcome_panel);
        welcome_panel.setLayout(welcome_panelLayout);
        welcome_panelLayout.setHorizontalGroup(
            welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(employeeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        welcome_panelLayout.setVerticalGroup(
            welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcome_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_panel.add(welcome_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        logout_button.setBackground(new java.awt.Color(51, 51, 51));
        logout_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOnButton(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOnButton(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ออกจากระบบ");

        javax.swing.GroupLayout logout_buttonLayout = new javax.swing.GroupLayout(logout_button);
        logout_button.setLayout(logout_buttonLayout);
        logout_buttonLayout.setHorizontalGroup(
            logout_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout_buttonLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        logout_buttonLayout.setVerticalGroup(
            logout_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout_buttonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        side_panel.add(logout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 170, -1));

        supplier_button.setBackground(new java.awt.Color(51, 51, 51));
        supplier_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlButtonOnClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOnButton(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOnButton(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ข้อมูล Supplier");

        javax.swing.GroupLayout supplier_buttonLayout = new javax.swing.GroupLayout(supplier_button);
        supplier_button.setLayout(supplier_buttonLayout);
        supplier_buttonLayout.setHorizontalGroup(
            supplier_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplier_buttonLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel19)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        supplier_buttonLayout.setVerticalGroup(
            supplier_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplier_buttonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel19)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        side_panel.add(supplier_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 170, -1));

        ingredient_order_button.setBackground(new java.awt.Color(51, 51, 51));
        ingredient_order_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlButtonOnClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEnteredOnButton(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExitedOnButton(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("สั่งซื่อวัตถุดิบ");

        javax.swing.GroupLayout ingredient_order_buttonLayout = new javax.swing.GroupLayout(ingredient_order_button);
        ingredient_order_button.setLayout(ingredient_order_buttonLayout);
        ingredient_order_buttonLayout.setHorizontalGroup(
            ingredient_order_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredient_order_buttonLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel21)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        ingredient_order_buttonLayout.setVerticalGroup(
            ingredient_order_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredient_order_buttonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel21)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        side_panel.add(ingredient_order_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 170, -1));

        BG.add(side_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 170, 590));

        control_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        account_management_panel.setBackground(new java.awt.Color(255, 255, 255));
        account_management_panel.setPreferredSize(new java.awt.Dimension(1030, 580));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ข้อมูลรายรับ/รายจ่าย");

        account_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        account_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสการทำรายการ", "พนักงาน", "วันที่", "ประเภท", "รายรับ", "รายจ่าย", "รายละเอียด"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        account_table.getTableHeader().setResizingAllowed(false);
        account_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(account_table);
        if (account_table.getColumnModel().getColumnCount() > 0) {
            account_table.getColumnModel().getColumn(0).setResizable(false);
            account_table.getColumnModel().getColumn(0).setPreferredWidth(-5);
            account_table.getColumnModel().getColumn(1).setResizable(false);
            account_table.getColumnModel().getColumn(1).setPreferredWidth(50);
            account_table.getColumnModel().getColumn(2).setResizable(false);
            account_table.getColumnModel().getColumn(3).setResizable(false);
            account_table.getColumnModel().getColumn(3).setPreferredWidth(10);
            account_table.getColumnModel().getColumn(4).setResizable(false);
            account_table.getColumnModel().getColumn(4).setPreferredWidth(10);
            account_table.getColumnModel().getColumn(5).setResizable(false);
            account_table.getColumnModel().getColumn(5).setPreferredWidth(10);
            account_table.getColumnModel().getColumn(6).setResizable(false);
        }

        reccord_search_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reccord_search_button.setText("ค้นหา");
        reccord_search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reccord_search_buttonActionPerformed(evt);
            }
        });

        add_account_data_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_account_data_button.setText("เพิ่มข้อมูล");
        add_account_data_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_account_data_buttonMouseClicked(evt);
            }
        });

        edit_account_data_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_account_data_button.setText("แก้ไขข้อมูล");
        edit_account_data_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_account_data_buttonMouseClicked(evt);
            }
        });

        account_table_refresh_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        account_table_refresh_button.setText("รีเฟรช");
        account_table_refresh_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                account_table_refresh_buttonMouseClicked(evt);
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

        expense_day_box.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        expense_day_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกวัน--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        expense_day_box.setBorder(null);

        expense_month_box.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        expense_month_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกเดือน--", "มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        expense_month_box.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("-");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("-");

        calculate_expense.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calculate_expense.setText("คำนวณรายรับ/รายจ่าย");
        calculate_expense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculate_expenseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout account_management_panelLayout = new javax.swing.GroupLayout(account_management_panel);
        account_management_panel.setLayout(account_management_panelLayout);
        account_management_panelLayout.setHorizontalGroup(
            account_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(account_management_panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(account_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(account_management_panelLayout.createSequentialGroup()
                        .addGroup(account_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(account_management_panelLayout.createSequentialGroup()
                                .addComponent(add_account_data_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edit_account_data_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculate_expense)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                .addComponent(expense_day_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expense_month_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expense_year_field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reccord_search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(account_table_refresh_button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        account_management_panelLayout.setVerticalGroup(
            account_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(account_management_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(account_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(account_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reccord_search_button)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)
                        .addComponent(expense_year_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(expense_day_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(expense_month_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(account_table_refresh_button))
                    .addGroup(account_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add_account_data_button)
                        .addComponent(edit_account_data_button)
                        .addComponent(calculate_expense)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        control_panel.add(account_management_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1030, 590));

        ingredient_manage_panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("วัตถุดิบในคลัง");

        material_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        material_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสวัตถุดิบ", "ชื่อวัตถุดิบ", "จำนวน", "หน่วยวัด", "ราคา", "รายละเอียด"
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
        material_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(material_table);
        if (material_table.getColumnModel().getColumnCount() > 0) {
            material_table.getColumnModel().getColumn(0).setResizable(false);
            material_table.getColumnModel().getColumn(1).setResizable(false);
            material_table.getColumnModel().getColumn(2).setResizable(false);
            material_table.getColumnModel().getColumn(3).setResizable(false);
            material_table.getColumnModel().getColumn(4).setResizable(false);
            material_table.getColumnModel().getColumn(5).setResizable(false);
        }

        edit_material_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_material_button.setText("แก้ไขข้อมูลวัตถุดิบ");
        edit_material_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_material_buttonMouseClicked(evt);
            }
        });

        add_material_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_material_button.setText("เพิ่มวัตถุดิบ");
        add_material_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_material_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ingredient_manage_panelLayout = new javax.swing.GroupLayout(ingredient_manage_panel);
        ingredient_manage_panel.setLayout(ingredient_manage_panelLayout);
        ingredient_manage_panelLayout.setHorizontalGroup(
            ingredient_manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredient_manage_panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ingredient_manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ingredient_manage_panelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(870, Short.MAX_VALUE))
                    .addGroup(ingredient_manage_panelLayout.createSequentialGroup()
                        .addGroup(ingredient_manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                            .addGroup(ingredient_manage_panelLayout.createSequentialGroup()
                                .addComponent(add_material_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edit_material_button)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        ingredient_manage_panelLayout.setVerticalGroup(
            ingredient_manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredient_manage_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(ingredient_manage_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_material_button)
                    .addComponent(add_material_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        control_panel.add(ingredient_manage_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1030, 590));

        ingredient_order_panel.setBackground(new java.awt.Color(255, 255, 255));
        ingredient_order_panel.setPreferredSize(new java.awt.Dimension(1030, 580));

        order_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        order_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสรายการ", "พนักงาน", "บริษัท", "พนักงานที่รับออเดอร์", "วันที่สั่งซื้อ", "วันที่ได้รับ", "จำนวนการสั่งซื่อ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        order_table.getTableHeader().setReorderingAllowed(false);
        order_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_tableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(order_table);
        if (order_table.getColumnModel().getColumnCount() > 0) {
            order_table.getColumnModel().getColumn(0).setResizable(false);
            order_table.getColumnModel().getColumn(1).setResizable(false);
            order_table.getColumnModel().getColumn(1).setPreferredWidth(10);
            order_table.getColumnModel().getColumn(2).setResizable(false);
            order_table.getColumnModel().getColumn(2).setPreferredWidth(15);
            order_table.getColumnModel().getColumn(3).setResizable(false);
            order_table.getColumnModel().getColumn(4).setResizable(false);
            order_table.getColumnModel().getColumn(5).setResizable(false);
            order_table.getColumnModel().getColumn(6).setResizable(false);
        }

        edit_order_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_order_button.setText("แก้ไขข้อมูล");
        edit_order_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_order_buttonMouseClicked(evt);
            }
        });

        receive_material_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        receive_material_button.setText("บันทึกการรับวัตถุดิบ");
        receive_material_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receive_material_buttonMouseClicked(evt);
            }
        });

        create_order_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        create_order_button.setText("สั่งซื่อวัตถุดิบ");
        create_order_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_order_buttonMouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("การสั่งซื้อวัตถุดิบ");

        order_table_refresh_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        order_table_refresh_button.setText("รีเฟรช");
        order_table_refresh_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_table_refresh_buttonMouseClicked(evt);
            }
        });

        order_day_box.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        order_day_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกวัน--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        order_day_box.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("-");

        order_month_box.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        order_month_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--เลือกเดือน--", "มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        order_month_box.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("-");

        order_year_field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        order_year_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        order_year_field.setText("ปี");
        order_year_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        order_year_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                order_year_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                order_year_fieldFocusLost(evt);
            }
        });

        order_search_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        order_search_button.setText("ค้นหา");
        order_search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ingredient_order_panelLayout = new javax.swing.GroupLayout(ingredient_order_panel);
        ingredient_order_panel.setLayout(ingredient_order_panelLayout);
        ingredient_order_panelLayout.setHorizontalGroup(
            ingredient_order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingredient_order_panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ingredient_order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ingredient_order_panelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(838, Short.MAX_VALUE))
                    .addGroup(ingredient_order_panelLayout.createSequentialGroup()
                        .addGroup(ingredient_order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingredient_order_panelLayout.createSequentialGroup()
                                .addComponent(order_day_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(order_month_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(order_year_field, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(order_search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(order_table_refresh_button, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(create_order_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edit_order_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(receive_material_button))
                            .addComponent(jScrollPane4))
                        .addGap(10, 10, 10))))
        );
        ingredient_order_panelLayout.setVerticalGroup(
            ingredient_order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingredient_order_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(30, 30, 30)
                .addGroup(ingredient_order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ingredient_order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(order_search_button)
                        .addComponent(jLabel10)
                        .addComponent(jLabel12)
                        .addComponent(order_year_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(order_day_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(order_month_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(order_table_refresh_button))
                    .addGroup(ingredient_order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(create_order_button)
                        .addComponent(edit_order_button)
                        .addComponent(receive_material_button)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        control_panel.add(ingredient_order_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1030, 590));

        supplier_management_panel.setBackground(new java.awt.Color(255, 255, 255));
        supplier_management_panel.setPreferredSize(new java.awt.Dimension(1030, 580));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Supplier");

        supplier_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supplier_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส", "บริษัท", "ชื่อ", "ที่อยู่", "เบอร์โทรศัพท์"
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
        supplier_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(supplier_table);
        if (supplier_table.getColumnModel().getColumnCount() > 0) {
            supplier_table.getColumnModel().getColumn(0).setResizable(false);
            supplier_table.getColumnModel().getColumn(1).setResizable(false);
            supplier_table.getColumnModel().getColumn(2).setResizable(false);
            supplier_table.getColumnModel().getColumn(3).setResizable(false);
            supplier_table.getColumnModel().getColumn(4).setResizable(false);
        }

        edit_supplier_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_supplier_button.setText("แก้ไขข้อมูล");
        edit_supplier_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_supplier_buttonMouseClicked(evt);
            }
        });

        add_supplier_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_supplier_button.setText("เพิ่มข้อมูล ");
        add_supplier_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_supplier_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout supplier_management_panelLayout = new javax.swing.GroupLayout(supplier_management_panel);
        supplier_management_panel.setLayout(supplier_management_panelLayout);
        supplier_management_panelLayout.setHorizontalGroup(
            supplier_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplier_management_panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(supplier_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(supplier_management_panelLayout.createSequentialGroup()
                        .addComponent(add_supplier_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_supplier_button))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        supplier_management_panelLayout.setVerticalGroup(
            supplier_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(supplier_management_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel20)
                .addGap(30, 30, 30)
                .addGroup(supplier_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_supplier_button)
                    .addComponent(edit_supplier_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        control_panel.add(supplier_management_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 590));

        employee_management_panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ข้อมูลพนักงาน");

        employee_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employee_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส", "คำนำหน้า", "ชื่อ", "นามสกุล", "วัน/เดือน/ปีเกิด", "เบอร์ติดต่อ"
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
        employee_table.getTableHeader().setReorderingAllowed(false);
        employee_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employee_tableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(employee_table);
        if (employee_table.getColumnModel().getColumnCount() > 0) {
            employee_table.getColumnModel().getColumn(0).setResizable(false);
            employee_table.getColumnModel().getColumn(1).setResizable(false);
            employee_table.getColumnModel().getColumn(2).setResizable(false);
            employee_table.getColumnModel().getColumn(3).setResizable(false);
            employee_table.getColumnModel().getColumn(4).setResizable(false);
            employee_table.getColumnModel().getColumn(5).setResizable(false);
        }

        add_emp_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_emp_button.setText("เพิ่มข้อมูล");
        add_emp_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_emp_buttonMouseClicked(evt);
            }
        });

        edit_emp_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_emp_button.setText("แก้ไขข้อมูล");
        edit_emp_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_emp_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout employee_management_panelLayout = new javax.swing.GroupLayout(employee_management_panel);
        employee_management_panel.setLayout(employee_management_panelLayout);
        employee_management_panelLayout.setHorizontalGroup(
            employee_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employee_management_panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(employee_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(employee_management_panelLayout.createSequentialGroup()
                        .addComponent(add_emp_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit_emp_button))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        employee_management_panelLayout.setVerticalGroup(
            employee_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employee_management_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addGroup(employee_management_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_emp_button)
                    .addComponent(edit_emp_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        control_panel.add(employee_management_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1030, 590));

        BG.add(control_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 1030, 580));

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

    private void mouseEnteredOnButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEnteredOnButton
        if (evt.getSource() == accounting_button) {
            accounting_button.setBackground(Color.darkGray);
        }
        if (evt.getSource() == ingredient_button) {
            ingredient_button.setBackground(Color.darkGray);
        }
        if (evt.getSource() == ingredient_order_button) {
            ingredient_order_button.setBackground(Color.darkGray);
        }
        if (evt.getSource() == supplier_button) {
            supplier_button.setBackground(Color.darkGray);
        }
        if (evt.getSource() == employee_button) {
            employee_button.setBackground(Color.darkGray);
        }
        if (evt.getSource() == logout_button)
            logout_button.setBackground(Color.darkGray);
    }//GEN-LAST:event_mouseEnteredOnButton

    private void mouseExitedOnButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExitedOnButton
        if (evt.getSource() == accounting_button) {
            accounting_button.setBackground(new Color(51, 51, 51));
        }
        if (evt.getSource() == ingredient_button) {
            ingredient_button.setBackground(new Color(51, 51, 51));
        }
        if (evt.getSource() == ingredient_order_button) {
            ingredient_order_button.setBackground(new Color(51, 51, 51));
        }
        if (evt.getSource() == supplier_button) {
            supplier_button.setBackground(new Color(51, 51, 51));
        }
        if (evt.getSource() == employee_button) {
            employee_button.setBackground(new Color(51, 51, 51));
        }
        if (evt.getSource() == logout_button)
            logout_button.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_mouseExitedOnButton

    private void logout_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_buttonMouseClicked
        int result = JOptionPane.showConfirmDialog(this, "ต้องการออกจากระบบใช่หรือไม่?", "ออกจากระบบ", JOptionPane.YES_NO_CANCEL_OPTION);
        if (result == 0) {
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logout_buttonMouseClicked

    private void controlButtonOnClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlButtonOnClicked
        control_panel.setVisible(true);
        if (evt.getSource() == accounting_button) {
            refreshExpenseTableData();
            this.requestFocus();
            account_management_panel.setVisible(true);
            ingredient_manage_panel.setVisible(false);
            ingredient_order_panel.setVisible(false);
            supplier_management_panel.setVisible(false);
            employee_management_panel.setVisible(false);
        }
        if (evt.getSource() == ingredient_button) {
            refreshMaterialTableData();
            this.requestFocus();
            account_management_panel.setVisible(false);
            ingredient_manage_panel.setVisible(true);
            ingredient_order_panel.setVisible(false);
            supplier_management_panel.setVisible(false);
            employee_management_panel.setVisible(false);
        }
        if (evt.getSource() == ingredient_order_button) {
            refreshOrderTableData();
            this.requestFocus();
            account_management_panel.setVisible(false);
            ingredient_manage_panel.setVisible(false);
            ingredient_order_panel.setVisible(true);
            supplier_management_panel.setVisible(false);
            employee_management_panel.setVisible(false);
        }
        if (evt.getSource() == supplier_button) {
            refreshSupplierTableData();
            this.requestFocus();
            account_management_panel.setVisible(false);
            ingredient_manage_panel.setVisible(false);
            ingredient_order_panel.setVisible(false);
            supplier_management_panel.setVisible(true);
            employee_management_panel.setVisible(false);
        }
        if (evt.getSource() == employee_button) {
            refreshEmployeeTableData();
            this.requestFocus();
            account_management_panel.setVisible(false);
            ingredient_manage_panel.setVisible(false);
            ingredient_order_panel.setVisible(false);
            supplier_management_panel.setVisible(false);
            employee_management_panel.setVisible(true);
        }
    }//GEN-LAST:event_controlButtonOnClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void frameButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameButtonMouseEntered
        if (evt.getSource() == closeButton) {
            closeButton.setBackground(new Color(51, 102, 255));
        }
        if (evt.getSource() == minimizeButton)
            minimizeButton.setBackground(new Color(51, 102, 255));
    }//GEN-LAST:event_frameButtonMouseEntered

    private void frameButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameButtonMouseExited
        if (evt.getSource() == closeButton) {
            closeButton.setBackground(new Color(51, 153, 255));
        }
        if (evt.getSource() == minimizeButton)
            minimizeButton.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_frameButtonMouseExited

    private void minimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseClicked

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        int result = JOptionPane.showConfirmDialog(this, "ต้องการปิดโปรแกรมใช่หรือไม่", "คำเตือน", JOptionPane.YES_NO_CANCEL_OPTION);
        if (result == 0)
            System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void account_table_refresh_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_account_table_refresh_buttonMouseClicked
        refreshExpenseTableData();
    }//GEN-LAST:event_account_table_refresh_buttonMouseClicked

    private void reccord_search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reccord_search_buttonActionPerformed
        if (validatedExpenseDateInput()) {
            searchExpenseData();
            resetExpenseDateInput();
            this.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลวันที่ ที่ต้องการค้นหาข้อมูล", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
            this.requestFocus();
        }

    }//GEN-LAST:event_reccord_search_buttonActionPerformed

    private void expense_year_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expense_year_fieldFocusGained
        Object ob = evt.getSource();
        if (ob == expense_year_field)
            expense_year_field.setText("");
    }//GEN-LAST:event_expense_year_fieldFocusGained

    private void expense_year_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expense_year_fieldFocusLost
        if (expense_year_field.getText().equals(""))
            expense_year_field.setText("ปี");
    }//GEN-LAST:event_expense_year_fieldFocusLost

    private void calculate_expenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculate_expenseMouseClicked
        new ViewTotalIncomeExpense().setVisible(true);
    }//GEN-LAST:event_calculate_expenseMouseClicked

    private void add_material_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_material_buttonMouseClicked
        AddMaterialData add = new AddMaterialData(this, true);
        add.setVisible(true);
        int returnValue = add.getReturnStatus();
        if (returnValue == 1) {
            refreshMaterialTableData();
            material_table.clearSelection();
            this.requestFocus();
        }
    }//GEN-LAST:event_add_material_buttonMouseClicked

    private void edit_material_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_material_buttonMouseClicked
        String[] data = new String[6];
        int selectedRow = material_table.getSelectedRow();

        if (selectedRow >= 0) {
            for (int i = 0; i < data.length; i++) {
                data[i] = material_table.getModel().getValueAt(selectedRow, i).toString();
            }
            EditMaterialData edit = new EditMaterialData(this, true, data);
            edit.setVisible(true);
            int returnValue = edit.getReturnStatus();
            if (returnValue == 1) {
                refreshMaterialTableData();
                material_table.clearSelection();
                this.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกข้อมูลที่ต้องการแก้ไข", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
            this.requestFocus();
        }
    }//GEN-LAST:event_edit_material_buttonMouseClicked

    private void create_order_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_order_buttonMouseClicked
        AddOrderData add = new AddOrderData(this, true, this.userID, employeeNameLabel.getText());
        add.setVisible(true);
        int returnValue = add.getReturnStatus();
        if (returnValue == 1) {
            refreshOrderTableData();
            order_table.clearSelection();
            this.requestFocus();
        }
    }//GEN-LAST:event_create_order_buttonMouseClicked

    private void order_table_refresh_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_table_refresh_buttonMouseClicked
        refreshOrderTableData();
    }//GEN-LAST:event_order_table_refresh_buttonMouseClicked

    private void order_year_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_order_year_fieldFocusGained
        Object ob = evt.getSource();
        if (ob == order_year_field)
            order_year_field.setText("");
    }//GEN-LAST:event_order_year_fieldFocusGained

    private void order_year_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_order_year_fieldFocusLost
        if (order_year_field.getText().equals(""))
            order_year_field.setText("ปี");
    }//GEN-LAST:event_order_year_fieldFocusLost

    private void order_search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_search_buttonActionPerformed
        if (validatedOrderDateInput()) {
            searchOrderData();
            resetOrderDateInput();
            this.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลวันที่ ที่ต้องการค้นหาข้อมูล", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
            this.requestFocus();
        }

    }//GEN-LAST:event_order_search_buttonActionPerformed

    private void edit_account_data_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_account_data_buttonMouseClicked
        String[] data = new String[7];
        int selectedRow = account_table.getSelectedRow();

        if (selectedRow >= 0) {
            for (int i = 0; i < data.length; i++) {
                data[i] = account_table.getModel().getValueAt(selectedRow, i).toString();
            }
            EditExpenseData edit = new EditExpenseData(this, true, data);
            edit.setVisible(true);
            int returnValue = edit.getReturnStatus();
            if (returnValue == 1) {
                refreshExpenseTableData();
                account_table.clearSelection();
                this.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกข้อมูลที่ต้องการแก้ไข", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
            this.requestFocus();
        }
    }//GEN-LAST:event_edit_account_data_buttonMouseClicked

    private void add_account_data_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_account_data_buttonMouseClicked
        AddExpenseData addExpenseData = new AddExpenseData(this, true, this.userID, employeeNameLabel.getText());
        addExpenseData.setVisible(true);
        int returnValue = addExpenseData.getReturnStatus();
        if (returnValue == 1) {
            refreshExpenseTableData();
            account_table.clearSelection();
            this.requestFocus();
        }
    }//GEN-LAST:event_add_account_data_buttonMouseClicked

    private void edit_order_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_order_buttonMouseClicked
        DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
        int selectedRow = order_table.getSelectedRow();
        String orderID = "";
        if (selectedRow >= 0) {
            orderID = dt.getValueAt(selectedRow, 0).toString();
            EditOrderData edit = new EditOrderData(this, true, orderID);
            edit.setVisible(true);
            int returnValue = edit.getReturnStatus();
            if (returnValue == 1) {
                refreshOrderTableData();
                order_table.clearSelection();
                this.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกข้อมูลที่ต้องการแก้ไข", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
            this.requestFocus();
        }
    }//GEN-LAST:event_edit_order_buttonMouseClicked

    private void order_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_tableMouseClicked
        int selectedRow = order_table.getSelectedRow();
        if (evt.getClickCount() == 2) {
            String id = order_table.getModel().getValueAt(selectedRow, 0).toString();
            new ViewOrderDetail(id).setVisible(true);
        }
    }//GEN-LAST:event_order_tableMouseClicked

    private void receive_material_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receive_material_buttonMouseClicked
        DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
        int selectedRow = order_table.getSelectedRow();
        String orderID = "";
        if (selectedRow >= 0) {
            orderID = dt.getValueAt(selectedRow, 0).toString();
            ReceiveMaterialData edit = new ReceiveMaterialData(this, true, orderID, this.userID);
            edit.setVisible(true);
            int returnValue = edit.getReturnStatus();
            if (returnValue == 1) {
                refreshOrderTableData();
                order_table.clearSelection();
                this.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกข้อมูลที่ต้องการแก้ไข", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
            this.requestFocus();
        }
    }//GEN-LAST:event_receive_material_buttonMouseClicked

    private void add_supplier_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_supplier_buttonMouseClicked
        AddSupplierData add = new AddSupplierData(this, true);
        add.setVisible(true);
        int returnValue = add.getReturnStatus();
        if (returnValue == 1) {
            refreshSupplierTableData();
            this.requestFocus();
        }
    }//GEN-LAST:event_add_supplier_buttonMouseClicked

    private void edit_supplier_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_supplier_buttonMouseClicked
        String[] data = new String[5];
        int selectedRow = supplier_table.getSelectedRow();

        if (selectedRow >= 0) {
            for (int i = 0; i < data.length; i++) {
                data[i] = supplier_table.getModel().getValueAt(selectedRow, i).toString();
            }
            EditSupplierData edit = new EditSupplierData(this, true, data);
            edit.setVisible(true);
            int returnValue = edit.getReturnStatus();
            if (returnValue == 1) {
                refreshSupplierTableData();
                supplier_table.clearSelection();
                this.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกข้อมูลที่ต้องการแก้ไข", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
            this.requestFocus();
        }
    }//GEN-LAST:event_edit_supplier_buttonMouseClicked

    private void add_emp_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_emp_buttonMouseClicked
        AddEmployeeData add = new AddEmployeeData(this, true);
        add.setVisible(true);
        int returnValue = add.getReturnStatus();
        if (returnValue == 1) {
            refreshEmployeeTableData();
            this.requestFocus();
        }

    }//GEN-LAST:event_add_emp_buttonMouseClicked

    private void edit_emp_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_emp_buttonMouseClicked
        int selectedRow = employee_table.getSelectedRow();
        String empID = "";

        if (selectedRow >= 0) {
            empID = employee_table.getModel().getValueAt(selectedRow, 0).toString();
            EditEmployeeData edit = new EditEmployeeData(this, true, empID);
            edit.setVisible(true);
            int returnValue = edit.getReturnStatus();
            if (returnValue == 1) {
                refreshEmployeeTableData();
                employee_table.clearSelection();
                this.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกข้อมูลที่ต้องการแก้ไข", "เกิดข้อผิดพลาด", JOptionPane.ERROR_MESSAGE);
            this.requestFocus();
        }
    }//GEN-LAST:event_edit_emp_buttonMouseClicked

    private void employee_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employee_tableMouseClicked
        int selectedRow = employee_table.getSelectedRow();
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            String id = employee_table.getModel().getValueAt(selectedRow, 0).toString();
            new ViewEmployeeDetail(id).setVisible(true);
        }
    }//GEN-LAST:event_employee_tableMouseClicked

    private boolean validatedExpenseDateInput() {
        int day = expense_day_box.getSelectedIndex();
        int month = expense_month_box.getSelectedIndex();
        String year = expense_year_field.getText();

        return !(day == 0 || month == 0 || !year.matches("[0-9]+"));
    }

    private boolean validatedOrderDateInput() {
        int day = order_day_box.getSelectedIndex();
        int month = order_month_box.getSelectedIndex();
        String year = order_year_field.getText();

        return !(day == 0 || month == 0 || !year.matches("[0-9]+"));
    }

    private void resetExpenseDateInput() {
        expense_day_box.setSelectedIndex(0);
        expense_month_box.setSelectedIndex(0);
        expense_year_field.setText("");
    }

    private void resetOrderDateInput() {
        order_day_box.setSelectedIndex(0);
        order_month_box.setSelectedIndex(0);
        order_year_field.setText("");
    }

    private String getAccountingSearchDate() {
        int day = expense_day_box.getSelectedIndex();
        int month = expense_month_box.getSelectedIndex();
        int year = Integer.parseInt(expense_year_field.getText());
        LocalDate convertedDate = LocalDate.of(year, month, day);

        return convertedDate.toString();
    }

    private String getOrderSearchDate() {
        int day = order_day_box.getSelectedIndex();
        int month = order_month_box.getSelectedIndex();
        int year = Integer.parseInt(order_year_field.getText());
        LocalDate convertedDate = LocalDate.of(year, month, day);

        return convertedDate.toString();
    }

    private void refreshExpenseTableData() {
        DefaultTableModel dt = (DefaultTableModel) account_table.getModel();
        dt.setRowCount(0);
        dc.getAccountingToTable(account_table);
    }

    private void refreshMaterialTableData() {
        DefaultTableModel dt = (DefaultTableModel) material_table.getModel();
        dt.setRowCount(0);
        dc.getMaterialDataToTable(material_table);
    }

    private void refreshOrderTableData() {
        DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
        dt.setRowCount(0);
        dc.getOrderDataToTable(order_table);
    }

    private void refreshSupplierTableData() {
        DefaultTableModel dt = (DefaultTableModel) supplier_table.getModel();
        dt.setRowCount(0);
        dc.getSupplierToTable(supplier_table);
    }

    private void refreshEmployeeTableData() {
        DefaultTableModel dt = (DefaultTableModel) employee_table.getModel();
        dt.setRowCount(0);
        dc.getEmployeeDataToTable(employee_table);
    }

    private void searchExpenseData() {
        String date = getAccountingSearchDate();
        DefaultTableModel dt = (DefaultTableModel) account_table.getModel();
        dt.setRowCount(0);
        dc.getAccountingToTable(account_table, date);
    }

    private void searchOrderData() {
        String date = getOrderSearchDate();
        DefaultTableModel dt = (DefaultTableModel) order_table.getModel();
        dt.setRowCount(0);
        dc.getOrderDataToTable(order_table, date);
    }

    private void fillTableData() {
        dc.getSupplierToTable(supplier_table);
        dc.getAccountingToTable(account_table);
        dc.getMaterialDataToTable(material_table);
        dc.getOrderDataToTable(order_table);
        dc.getEmployeeDataToTable(employee_table);
    }

    private void uiConfig() {
        TableColumnModel accountColumnModel = account_table.getColumnModel();
        TableColumnModel materialColumnModel = material_table.getColumnModel();
        TableColumnModel supplierColumnModel = supplier_table.getColumnModel();
        TableColumnModel orderColumnModel = order_table.getColumnModel();
        TableColumnModel employeeColumnModel = employee_table.getColumnModel();
        Font tableFont = new Font("Tahoma", Font.BOLD, 18);
        UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.PLAIN, 14));
        account_table.getTableHeader().setFont(tableFont);
        material_table.getTableHeader().setFont(tableFont);
        supplier_table.getTableHeader().setFont(tableFont);
        order_table.getTableHeader().setFont(tableFont);
        employee_table.getTableHeader().setFont(tableFont);
        accountColumnModel.removeColumn(accountColumnModel.getColumn(0));
        accountColumnModel.removeColumn(accountColumnModel.getColumn(2));
        materialColumnModel.removeColumn(materialColumnModel.getColumn(0));
        supplierColumnModel.removeColumn(supplierColumnModel.getColumn(0));
        orderColumnModel.removeColumn(orderColumnModel.getColumn(0));
        employeeColumnModel.removeColumn(employeeColumnModel.getColumn(0));
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel account_management_panel;
    private javax.swing.JTable account_table;
    private javax.swing.JButton account_table_refresh_button;
    private javax.swing.JPanel accounting_button;
    private javax.swing.JButton add_account_data_button;
    private javax.swing.JButton add_emp_button;
    private javax.swing.JButton add_material_button;
    private javax.swing.JButton add_supplier_button;
    private javax.swing.JButton calculate_expense;
    private javax.swing.JPanel closeButton;
    private javax.swing.JPanel control_panel;
    private javax.swing.JButton create_order_button;
    private javax.swing.JButton edit_account_data_button;
    private javax.swing.JButton edit_emp_button;
    private javax.swing.JButton edit_material_button;
    private javax.swing.JButton edit_order_button;
    private javax.swing.JButton edit_supplier_button;
    private javax.swing.JLabel employeeNameLabel;
    private javax.swing.JPanel employee_button;
    private javax.swing.JPanel employee_management_panel;
    private javax.swing.JTable employee_table;
    private javax.swing.JComboBox<String> expense_day_box;
    private javax.swing.JComboBox<String> expense_month_box;
    private javax.swing.JTextField expense_year_field;
    private javax.swing.JPanel ingredient_button;
    private javax.swing.JPanel ingredient_manage_panel;
    private javax.swing.JPanel ingredient_order_button;
    private javax.swing.JPanel ingredient_order_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel logout_button;
    private javax.swing.JTable material_table;
    private javax.swing.JPanel minimizeButton;
    private javax.swing.JComboBox<String> order_day_box;
    private javax.swing.JComboBox<String> order_month_box;
    private javax.swing.JButton order_search_button;
    private javax.swing.JTable order_table;
    private javax.swing.JButton order_table_refresh_button;
    private javax.swing.JTextField order_year_field;
    private javax.swing.JButton reccord_search_button;
    private javax.swing.JButton receive_material_button;
    private javax.swing.JPanel side_panel;
    private javax.swing.JPanel supplier_button;
    private javax.swing.JPanel supplier_management_panel;
    private javax.swing.JTable supplier_table;
    private javax.swing.JPanel top_panel;
    private javax.swing.JPanel welcome_panel;
    // End of variables declaration//GEN-END:variables
}
