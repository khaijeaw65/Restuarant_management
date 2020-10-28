package restuarant;

import java.awt.Font;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {

    int xx,xy;
    private DatabaseConnection dc = new DatabaseConnection();
    
    public Login() {
        initComponents();
        UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.PLAIN, 14));
        this.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        right_panel = new javax.swing.JPanel();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        minimize_button = new javax.swing.JLabel();
        close_button = new javax.swing.JLabel();
        left_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        right_panel.setBackground(new java.awt.Color(255, 255, 255));
        right_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameField.setFont(new java.awt.Font("AngsanaUPC", 0, 18)); // NOI18N
        userNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameField.setText("ชื่อผู้ใช้");
        userNameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        userNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameFieldFocusLost(evt);
            }
        });
        right_panel.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 130, 180, 30));

        passwordField.setFont(new java.awt.Font("AngsanaUPC", 0, 18)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setText("รหัสผ่าน");
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        right_panel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 220, 180, 30));

        loginButton.setBackground(new java.awt.Color(51, 51, 51));
        loginButton.setFont(new java.awt.Font("AngsanaUPC", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("เข้าสู่ระบบ");
        loginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        right_panel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 90, 32));

        minimize_button.setForeground(new java.awt.Color(0, 0, 0));
        minimize_button.setText("_");
        minimize_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_buttonMouseClicked(evt);
            }
        });
        right_panel.add(minimize_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 6, -1, -1));

        close_button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        close_button.setForeground(new java.awt.Color(0, 0, 0));
        close_button.setText("X");
        close_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        close_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_buttonMouseClicked(evt);
            }
        });
        right_panel.add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 0, -1, 26));

        left_panel.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout left_panelLayout = new javax.swing.GroupLayout(left_panel);
        left_panel.setLayout(left_panelLayout);
        left_panelLayout.setHorizontalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        left_panelLayout.setVerticalGroup(
            left_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(left_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(right_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(right_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
            .addComponent(left_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFieldFocusGained
        if (userNameField.getText().equals("ชื่อผู้ใช้")){
            userNameField.setText("");
        }
    }//GEN-LAST:event_userNameFieldFocusGained

    private void userNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFieldFocusLost
        if (userNameField.getText().equals("")){
            userNameField.setText("ชื่อผู้ใช้");
        }
    }//GEN-LAST:event_userNameFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        char [] defaultPass = {'ร', 'ห', 'ั', 'ส', 'ผ', '่', 'า', 'น'};
        if (Arrays.equals(passwordField.getPassword(), defaultPass))
        passwordField.setText("");
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        String ch = new String(passwordField.getPassword());
        if (ch.equals(""))
        passwordField.setText("รหัสผ่าน");
    }//GEN-LAST:event_passwordFieldFocusLost

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = userNameField.getText();
        String password = new String(passwordField.getPassword());
        
        if (checkUserInput(username, password) == true){
            String userId = dc.getUser(username, password)[0];
            String name = dc.getUser(username, password)[1];
            this.dispose();
            new Home(name, userId).setVisible(true);
        }else
            JOptionPane.showMessageDialog(this, "ชื่อผู้ใช้ หรือ รหัสผ่านผิด โปรดลองใหม่อีกครั้ง", "Error", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_loginButtonActionPerformed

    private void minimize_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_buttonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize_buttonMouseClicked

    private void close_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_buttonMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        this.requestFocus();
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private boolean checkUserInput(String user, String pass){
        boolean isCorrect = false;
        String [] userData = dc.getUser(user, pass);
        
        if (userData[0] == null && userData[1] == null)
            return isCorrect;
        else
            isCorrect = true;
        
        return isCorrect;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_button;
    private javax.swing.JPanel left_panel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel minimize_button;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel right_panel;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
