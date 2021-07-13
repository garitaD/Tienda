/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yFrame;
import AppPackage.AnimationClass;
import javax.swing.JOptionPane;
import Class.Slide;

/**
 *
 * @author DGB
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Slide slide;
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        slide = new Slide();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btbIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnlBackground = new javax.swing.JPanel();
        lblPublicidad2 = new javax.swing.JLabel();
        lblPublicidad1 = new javax.swing.JLabel();
        lblSlide = new javax.swing.JLabel();
        lblSlide1 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblDisplay = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogin.setOpaque(false);
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(111, 174, 2));
        lblUsuario.setText("Usuario:");
        pnlLogin.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 20));

        txtUsuario.setBackground(new java.awt.Color(33, 33, 33));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        pnlLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, -1));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(111, 174, 2));
        lblPassword.setText("Contraseña:");
        pnlLogin.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 20));

        txtPassword.setBackground(new java.awt.Color(26, 26, 26));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        pnlLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, -1));

        btbIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GO_LOG_OFF.png"))); // NOI18N
        btbIngresar.setBorder(null);
        btbIngresar.setBorderPainted(false);
        btbIngresar.setContentAreaFilled(false);
        btbIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btbIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GO_LOG_ON.png"))); // NOI18N
        btbIngresar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GO_LOG_ON.png"))); // NOI18N
        btbIngresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GO_LOG_ON.png"))); // NOI18N
        btbIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbIngresarMouseClicked(evt);
            }
        });
        btbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbIngresarActionPerformed(evt);
            }
        });
        pnlLogin.add(btbIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGIN_INGRESO.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        pnlLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 270));

        getContentPane().add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, -240, 250, 270));

        pnlBackground.setMinimumSize(new java.awt.Dimension(1000, 500));
        pnlBackground.setOpaque(false);
        pnlBackground.setPreferredSize(new java.awt.Dimension(1000, 500));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPublicidad2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/publi2.png"))); // NOI18N
        pnlBackground.add(lblPublicidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 1000, 320));

        lblPublicidad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/publi1.png"))); // NOI18N
        pnlBackground.add(lblPublicidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 320));

        lblSlide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paloPublic.png"))); // NOI18N
        pnlBackground.add(lblSlide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 418, 1000, 10));

        lblSlide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paloPublic.png"))); // NOI18N
        pnlBackground.add(lblSlide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 94, 1000, 10));

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BACK.png"))); // NOI18N
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setContentAreaFilled(false);
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });
        pnlBackground.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 50, 30));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NEXT.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnlBackground.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 50, 30));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        lblDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDisplayMouseClicked(evt);
            }
        });
        getContentPane().add(lblDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 30, 70));

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Delete_32px.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        getContentPane().add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, 70));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        AnimationClass ac = new AnimationClass();
        ac.jLabelXRight(-1000, 0, 25, 5, lblPublicidad1);
        
        AnimationClass acc = new AnimationClass();
        acc.jLabelXRight(0, 1000, 25, 5, lblPublicidad2);
        
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        // TODO add your handling code here:
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(0, -1000, 25, 5, lblPublicidad1);
        
        AnimationClass acc = new AnimationClass();
        acc.jLabelXLeft(1000, 0, 25, 5, lblPublicidad2);
    }//GEN-LAST:event_btnNextMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Hace la animacion apenas inicia la aplicacion
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(0, -1000, 25, 5, lblPublicidad1);
        
        AnimationClass acc = new AnimationClass();
        acc.jLabelXLeft(1000, 0, 25, 5, lblPublicidad2); 
    }//GEN-LAST:event_formWindowOpened

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        
        try {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Desea salir del sistema?","EXIT",dialogButton);
            if (result==0) {
                System.exit(0);
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisplayMouseClicked
        this.setState(yFrame.Login.ICONIFIED);
    }//GEN-LAST:event_lblDisplayMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        slide.jPanelYAbajo(-240, 0, 25, 5, pnlLogin);
        slide.jPanelYArriba(0, -240, 25, 5, pnlLogin);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btbIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbIngresarMouseClicked
        // TODO add your handling code here:
        if (txtUsuario.getText() == "" && txtPassword.getText()=="")  {
            JOptionPane.showMessageDialog(null, "Usuario Invalido");
        }else{
            Inicio inicio = new Inicio();
            dispose();
            inicio.setVisible(true);
        }
    }//GEN-LAST:event_btbIngresarMouseClicked

    private void btbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btbIngresarActionPerformed

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
                if ("Windows".equals(info.getName())) {//Nimbus
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbIngresar;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPublicidad1;
    private javax.swing.JLabel lblPublicidad2;
    private javax.swing.JLabel lblSlide;
    private javax.swing.JLabel lblSlide1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
