package View;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    
    public Login() { 
        setExtendedState(MAXIMIZED_BOTH); 
        initComponents();
        controller = new LoginController(this); 
        Banco.inicia();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextSenha = new javax.swing.JPasswordField();
        TextUsuario = new javax.swing.JTextField();
        USUARIO = new javax.swing.JLabel();
        BotaoEntrar = new javax.swing.JButton();
        LOGIN = new javax.swing.JLabel();
        SENHA = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 140, 30));

        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 140, 30));

        USUARIO.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        USUARIO.setForeground(new java.awt.Color(255, 255, 255));
        USUARIO.setText("USUARIO");
        USUARIO.setToolTipText("");
        getContentPane().add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 90, 40));

        BotaoEntrar.setText("ENTRAR");
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 140, 30));

        LOGIN.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LOGIN.setText("LOGIN");
        getContentPane().add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 110, 40));

        SENHA.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        SENHA.setForeground(new java.awt.Color(255, 255, 255));
        SENHA.setText("SENHA");
        getContentPane().add(SENHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 70, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/projeto-barbearia-login.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -119, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed
        this.controller.entrarNoSistema();
       
    }//GEN-LAST:event_BotaoEntrarActionPerformed

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsuarioActionPerformed

    private void TextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSenhaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JLabel LOGIN;
    private javax.swing.JLabel SENHA;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JLabel USUARIO;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem); 
    }

    public JPasswordField getTextSenha() {
        return (JPasswordField) TextSenha;
    }

    public void setTextSenha(JPasswordField TextSenha) {
        this.TextSenha = TextSenha;
    }

    public JTextField getTextUsuario() {
        return TextUsuario;
    }

    public void setTextUsuario(JTextField TextUsuario) {
        this.TextUsuario = TextUsuario;
    }
}
