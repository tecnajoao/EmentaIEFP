/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Tecna Joao
 */
public class LoginFrame extends javax.swing.JFrame {
    
    int xx = 0, yy = 0;
    EmentaUser user;
    EmentaAdmin admin;
    
    
    /**
     * Creates new form LoginFrame
     * 
     */
    public LoginFrame() {
        initComponents();
        getContentPane().setBackground(Color.white);
        

        /*ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("/Images/Restaurant_20px.png"));
        this.setIconImage(img.getImage());*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        IEFP_Logo = new javax.swing.JLabel();
        Setubal = new javax.swing.JLabel();
        IEFP = new javax.swing.JLabel();
        talheres = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblAdm1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        UserPanel = new javax.swing.JPanel();
        Logo_User = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnLoginUser = new javax.swing.JLabel();
        AdminPanel = new javax.swing.JPanel();
        Logo_Adm = new javax.swing.JLabel();
        lblAdm = new javax.swing.JLabel();
        adminPass = new javax.swing.JPasswordField();
        btnLoginAdm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(657, 449));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        HeaderPanel.setBackground(new java.awt.Color(0, 153, 51));
        HeaderPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderPanelMouseDragged(evt);
            }
        });
        HeaderPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderPanelMousePressed(evt);
            }
        });
        HeaderPanel.setLayout(null);

        IEFP_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pck/icons/IEFP_branco_png.png"))); // NOI18N
        HeaderPanel.add(IEFP_Logo);
        IEFP_Logo.setBounds(30, 20, 110, 90);

        Setubal.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        Setubal.setForeground(new java.awt.Color(255, 255, 255));
        Setubal.setText(" SETÚBAL");
        HeaderPanel.add(Setubal);
        Setubal.setBounds(260, 20, 250, 50);

        IEFP.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        IEFP.setForeground(new java.awt.Color(255, 255, 255));
        IEFP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IEFP.setText("IEFP ");
        HeaderPanel.add(IEFP);
        IEFP.setBounds(130, 20, 150, 50);

        talheres.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        talheres.setForeground(new java.awt.Color(255, 255, 255));
        talheres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pck/icons/Restaurant_32px.png"))); // NOI18N
        HeaderPanel.add(talheres);
        talheres.setBounds(180, 70, 40, 30);

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pck/icons/Close Window_32px.png"))); // NOI18N
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        HeaderPanel.add(lblExit);
        lblExit.setBounds(622, 0, 30, 30);

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pck/icons/Minimize Window_32px.png"))); // NOI18N
        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });
        HeaderPanel.add(lblMinimize);
        lblMinimize.setBounds(590, 0, 30, 30);

        lblAdm1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAdm1.setForeground(new java.awt.Color(255, 255, 255));
        lblAdm1.setText("Login Frame");
        HeaderPanel.add(lblAdm1);
        lblAdm1.setBounds(280, 110, 100, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" EMENTA SEMANAL ");
        HeaderPanel.add(jLabel7);
        jLabel7.setBounds(220, 70, 300, 30);

        getContentPane().add(HeaderPanel);
        HeaderPanel.setBounds(0, 0, 660, 130);

        UserPanel.setBackground(new java.awt.Color(255, 255, 255));
        UserPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 5));

        Logo_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pck/icons/Male User_100px.png"))); // NOI18N

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUser.setForeground(new java.awt.Color(0, 153, 51));
        lblUser.setText("User");

        btnLoginUser.setBackground(new java.awt.Color(0, 151, 53));
        btnLoginUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLoginUser.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLoginUser.setText("Log in");
        btnLoginUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLoginUser.setOpaque(true);
        btnLoginUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UserPanelLayout = new javax.swing.GroupLayout(UserPanel);
        UserPanel.setLayout(UserPanelLayout);
        UserPanelLayout.setHorizontalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logo_User))
                .addGap(55, 55, 55))
        );
        UserPanelLayout.setVerticalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Logo_User)
                .addGap(0, 0, 0)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(btnLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(UserPanel);
        UserPanel.setBounds(380, 150, 220, 270);

        AdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        AdminPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 5));

        Logo_Adm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pck/icons/homem_verde.png"))); // NOI18N

        lblAdm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAdm.setForeground(new java.awt.Color(0, 153, 51));
        lblAdm.setText("Administrator");

        adminPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adminPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adminPass.setText("12345");
        adminPass.setToolTipText("12345");

        btnLoginAdm.setBackground(new java.awt.Color(0, 151, 53));
        btnLoginAdm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLoginAdm.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginAdm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLoginAdm.setText("Log in");
        btnLoginAdm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginAdm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLoginAdm.setOpaque(true);
        btnLoginAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginAdmMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(adminPass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logo_Adm)
                    .addComponent(btnLoginAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addComponent(Logo_Adm)
                .addGap(0, 0, 0)
                .addComponent(lblAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(adminPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoginAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(AdminPanel);
        AdminPanel.setBounds(50, 150, 220, 270);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        // TODO add your handling code here:
        
        System.exit(0);
        
    }//GEN-LAST:event_lblExitMouseClicked

    private void HeaderPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMouseDragged
        // TODO add your handling code here:
       
        this.setLocation(evt.getXOnScreen()-xx,evt.getYOnScreen()-yy);
       
    }//GEN-LAST:event_HeaderPanelMouseDragged

    private void HeaderPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMousePressed
        // TODO add your handling code here:
        
       xx=evt.getX();
       yy=evt.getY();
    }//GEN-LAST:event_HeaderPanelMousePressed

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        // TODO add your handling code here:
        
        this.setState(LoginFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void btnLoginUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginUserMouseClicked
        // TODO add your handling code here:
        
        user = new EmentaUser();
        user.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnLoginUserMouseClicked

    private void btnLoginAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginAdmMouseClicked
        // TODO add your handling code here:
        
       String pass = String.valueOf(adminPass.getPassword());
       
        if(pass.equals("12345"))
        {
            admin = new EmentaAdmin();
            admin.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Password Errada !");
        }
    }//GEN-LAST:event_btnLoginAdmMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel IEFP;
    private javax.swing.JLabel IEFP_Logo;
    private javax.swing.JLabel Logo_Adm;
    private javax.swing.JLabel Logo_User;
    private javax.swing.JLabel Setubal;
    private javax.swing.JPanel UserPanel;
    private javax.swing.JPasswordField adminPass;
    private javax.swing.JLabel btnLoginAdm;
    private javax.swing.JLabel btnLoginUser;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAdm;
    private javax.swing.JLabel lblAdm1;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel talheres;
    // End of variables declaration//GEN-END:variables

    private void SetIconImages(ImageIcon img) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object JPanelOptions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
