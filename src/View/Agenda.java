package View;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Agenda extends javax.swing.JFrame {

    private final AgendaController controller;
    public String getTextValor;

    
    public Agenda() {
        setExtendedState(MAXIMIZED_BOTH); 
        initComponents();
        controller = new AgendaController(this);
        Iniciar(); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextObservacao = new javax.swing.JTextField();
        JComboBoxServico = new javax.swing.JComboBox<>();
        JComboBoxCliente = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TextValor = new javax.swing.JTextField();
        TextHora = new javax.swing.JTextField();
        TextData = new javax.swing.JTextField();
        jTextField = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaAgendamentos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextObservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextObservacaoActionPerformed(evt);
            }
        });
        getContentPane().add(TextObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 250, 50));

        JComboBoxServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxServicoItemStateChanged(evt);
            }
        });
        JComboBoxServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxServicoActionPerformed(evt);
            }
        });
        getContentPane().add(JComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 150, -1));

        getContentPane().add(JComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 150, 30));

        jButton1.setText("AGENDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 170, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("OBSERVAÇÃO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 120, 30));

        TextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorActionPerformed(evt);
            }
        });
        getContentPane().add(TextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 160, -1));

        TextHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextHoraActionPerformed(evt);
            }
        });
        getContentPane().add(TextHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 160, -1));

        TextData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDataActionPerformed(evt);
            }
        });
        getContentPane().add(TextData, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 160, -1));

        jTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField.setForeground(new java.awt.Color(255, 255, 255));
        jTextField.setText("VALOR");
        getContentPane().add(jTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HORA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SERVIÇO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CLIENTE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jScrollPane2.setToolTipText("");

        TabelaAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "SERVIÇO", "VALOR", "DATA", "HORA", "OBSERVAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelaAgendamentos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 660, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 30, 40));

        TextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdActionPerformed(evt);
            }
        });
        getContentPane().add(TextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/projeto-barbearia-3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -38, 1330, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdActionPerformed

    private void TextHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextHoraActionPerformed

    private void TextDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDataActionPerformed

    private void TextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorActionPerformed

    private void JComboBoxServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxServicoActionPerformed

    private void JComboBoxServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxServicoItemStateChanged
        this.controller.atualizaValor();
    }//GEN-LAST:event_JComboBoxServicoItemStateChanged

    private void TextObservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextObservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextObservacaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.controller.Agendar();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**.
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboBoxCliente;
    private javax.swing.JComboBox<String> JComboBoxServico;
    private javax.swing.JTable TabelaAgendamentos;
    private javax.swing.JTextField TextData;
    private javax.swing.JTextField TextHora;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextObservacao;
    private javax.swing.JTextField TextValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jTextField;
    // End of variables declaration//GEN-END:variables

    private void Iniciar() {
        this.controller.atualizaTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaServico(); 
        this.controller.atualizaValor(); 
    } 

    public JTable getTabelaAgendamentos() {
        return TabelaAgendamentos;
    }

    public void setTabelaAgendamentos(JTable jTableAgendamento) {
        this.TabelaAgendamentos = jTableAgendamento; 
    }

    public JComboBox<String> getjComboBoxCliente() {
        return JComboBoxCliente;
    }

    public void setjComboBoxCliente(JComboBox<String> jComboBoxCliente) {
        this.JComboBoxCliente = jComboBoxCliente;
    }

    public JComboBox<String> getjComboBoxServico() {
        return JComboBoxServico;
    }

    public void setjComboBoxServico(JComboBox<String> jComboBoxServico) {
        this.JComboBoxServico = jComboBoxServico;
    }

    public JTextField getTextValor() {
        return TextValor;
    }

    public void setTextValor(JTextField TextValor) {
        this.TextValor = TextValor;
    }

    public JTextField getTextHoraFormatada() {
        return TextHora;
    }

    public void setTextHoraFormatada(JTextField TextHora) {
        this.TextHora = TextHora;
    }

    public JTextField getTextId() {
        return TextId;
    }

    public void setTextId(JTextField TextId) {
        this.TextId = TextId;
    }

    public JTextField getTextObservacao() {
        return TextObservacao;
    }

    public void setTextObservacao(JTextField TextObservacao) {
        this.TextObservacao = TextObservacao;
    }

    public JTextField getTextDataFormatada() {
        return TextData;
    }

    public void setTextDataFormatada(JTextField TextData) {
        this.TextData = TextData;
    }

    public class getText {

        public getText() {
        }
    }

   

   
    
}