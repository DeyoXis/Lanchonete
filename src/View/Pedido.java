/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.AtendenteControler;
import Controler.ClientesControler;
import Controler.MesasControler;
import Controler.PedidosControler;
import Controler.ProdutosControler;
import Controler.Produtos_VendidosControler;
import Model.Atendente;
import Model.Mesas;
import Model.Pedidos;
import Model.Produtos_Vendidos;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author info206
 */
public class Pedido extends javax.swing.JFrame {

    /**
     * Creates new form Pedido
     */
    public Pedido() {
        try {
            initComponents();
            ClientesControler c = new ClientesControler();
            ProdutosControler p = new  ProdutosControler();
         Vector   s = c.selectPessoa();
         Vector   r = p.selectProdutos();
          combo_cliente1.setModel(new  javax.swing.DefaultComboBoxModel(s));
          combo_produto2.setModel(new  javax.swing.DefaultComboBoxModel(r));
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CampoObs = new javax.swing.JTextField();
        jBotaoSalvar = new javax.swing.JButton();
        jBotaoVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CampoDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        combo_cliente1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        combo_produto2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(204, 204, 204));
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setText("Pedido");

        jLabel2.setText("Obs:");

        CampoObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoObsActionPerformed(evt);
            }
        });

        jBotaoSalvar.setText("Salvar");
        jBotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoSalvarActionPerformed(evt);
            }
        });

        jBotaoVoltar.setText("Voltar");
        jBotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoVoltarActionPerformed(evt);
            }
        });

        jLabel4.setText("Mesa:");

        CampoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDescricaoActionPerformed(evt);
            }
        });

        jLabel5.setText("Atendente:");

        jLabel6.setText("Cliente:");

        combo_cliente1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Produto");

        combo_produto2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addGap(35, 35, 35)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CampoObs, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CampoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CampoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                        .addComponent(combo_cliente1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jBotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo_produto2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jInternalFrame1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBotaoSalvar, jBotaoVoltar});

        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combo_cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CampoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CampoObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combo_produto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoVoltar)
                    .addComponent(jBotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jInternalFrame1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBotaoSalvar, jBotaoVoltar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoVoltarActionPerformed
            Apresentacao frame = new Apresentacao();
            frame.setVisible(true);
    }//GEN-LAST:event_jBotaoVoltarActionPerformed

    private void jBotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoSalvarActionPerformed
        //Salva o Atendente
        try {
            Atendente at = new Atendente (this.CampoNome.getText());
            AtendenteControler atendenteControler = new AtendenteControler();
            atendenteControler.inserirAtendente(at);
        } catch (SQLException ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Salva a mesa
        try {
            Mesas m = new Mesas (this.CampoDescricao.getText());
            MesasControler mesasControler = new MesasControler();
            mesasControler.inserirMesa(m);
        } catch (SQLException ex) {
            Logger.getLogger(Mesas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Salva o Pedido e Produto
        ProdutosControler pr = new ProdutosControler();
        int Produto_ID = pr.getIdByNome_Produtos((String)combo_produto2.getSelectedItem());
        
        ClientesControler cli=  new ClientesControler();
        int cliente_ID = cli.getIdByNome_Cliente((String)combo_cliente1.getSelectedItem());
        
        try {
        Pedidos p = new Pedidos (0, null, cliente_ID, cliente_ID, Produto_ID, 0);
                PedidosControler pedidosControler = new PedidosControler();
                pedidosControler.inserirPedido(p);
    } catch (SQLException ex) {
                Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }//GEN-LAST:event_jBotaoSalvarActionPerformed

    private void CampoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDescricaoActionPerformed

    private void CampoObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoObsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoObsActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoDescricao;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoObs;
    private javax.swing.JComboBox combo_cliente1;
    private javax.swing.JComboBox combo_produto2;
    private javax.swing.JButton jBotaoSalvar;
    private javax.swing.JButton jBotaoVoltar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
