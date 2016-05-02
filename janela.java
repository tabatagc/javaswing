/*
 * Janela.java
 *
 */

package Teste;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author  rm58891
 */
public class Janela extends javax.swing.JDialog {
int x=12;
    /** Creates new form Janela */
    public Janela(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.ButtonGroup();
        grupo_estilo = new javax.swing.ButtonGroup();
        grupo_tamanho = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        txtVisor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        optAzul = new javax.swing.JRadioButton();
        optVermelho = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        optNegrito = new javax.swing.JRadioButton();
        optItalico = new javax.swing.JRadioButton();
        optNormal = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        opt12 = new javax.swing.JRadioButton();
        opt14 = new javax.swing.JRadioButton();
        opt16 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formatar Fonte");
        setBackground(new java.awt.Color(204, 204, 255));
        setResizable(false);

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cor"));

        Grupo.add(optAzul);
        optAzul.setForeground(new java.awt.Color(51, 51, 255));
        optAzul.setText("Azul");
        optAzul.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                optAzulItemStateChanged(evt);
            }
        });
        optAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optAzulActionPerformed(evt);
            }
        });

        Grupo.add(optVermelho);
        optVermelho.setForeground(new java.awt.Color(255, 0, 0));
        optVermelho.setText("Vermelho");
        optVermelho.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                optVermelhoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(optVermelho)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optAzul)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(optAzul)
                .addGap(3, 3, 3)
                .addComponent(optVermelho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Estilo"));

        grupo_estilo.add(optNegrito);
        optNegrito.setFont(new java.awt.Font("Tahoma", 1, 11));
        optNegrito.setText("Negrito");
        optNegrito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                optNegritoItemStateChanged(evt);
            }
        });

        grupo_estilo.add(optItalico);
        optItalico.setFont(new java.awt.Font("Tahoma", 2, 11));
        optItalico.setText("ItÃ¡lico");
        optItalico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                optItalicoItemStateChanged(evt);
            }
        });

        grupo_estilo.add(optNormal);
        optNormal.setText("Normal");
        optNormal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                optNormalItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optNegrito)
                    .addComponent(optItalico)
                    .addComponent(optNormal))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(optNegrito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optItalico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optNormal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamanho"));

        grupo_tamanho.add(opt12);
        opt12.setFont(new java.awt.Font("Tahoma", 0, 12));
        opt12.setText("12");
        opt12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opt12ItemStateChanged(evt);
            }
        });

        grupo_tamanho.add(opt14);
        opt14.setFont(new java.awt.Font("Tahoma", 0, 14));
        opt14.setText("14");
        opt14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opt14ItemStateChanged(evt);
            }
        });

        grupo_tamanho.add(opt16);
        opt16.setFont(new java.awt.Font("Tahoma", 0, 16));
        opt16.setText("16");
        opt16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opt16ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opt12)
                    .addComponent(opt16)
                    .addComponent(opt14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opt12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        jLabel1.setText("Formatar Fonte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtVisor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, 0, 108, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void optAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optAzulActionPerformed
     
    }//GEN-LAST:event_optAzulActionPerformed

    private void optAzulItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optAzulItemStateChanged
       if(optAzul.isSelected())
           txtVisor.setForeground(Color.BLUE);
       
    }//GEN-LAST:event_optAzulItemStateChanged

    private void optVermelhoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optVermelhoItemStateChanged
    if(optVermelho.isSelected())
           txtVisor.setForeground(Color.RED);
    }//GEN-LAST:event_optVermelhoItemStateChanged

    private void optNegritoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optNegritoItemStateChanged
        Font f = new Font("Tahoma",Font.BOLD,x);
        if(optNegrito.isSelected())
            txtVisor.setFont(f);
    }//GEN-LAST:event_optNegritoItemStateChanged

    private void opt12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opt12ItemStateChanged
    if(opt12.isSelected())
        x = 12;
    }//GEN-LAST:event_opt12ItemStateChanged

    private void opt14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opt14ItemStateChanged
       if(opt14.isSelected())
        x = 14;
    }//GEN-LAST:event_opt14ItemStateChanged

    private void opt16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opt16ItemStateChanged
     if(opt16.isSelected())
      x = 16;
    }//GEN-LAST:event_opt16ItemStateChanged

    private void optItalicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optItalicoItemStateChanged
    Font f = new Font("Tahoma",Font.ITALIC,x);
        if(optNegrito.isSelected())
            txtVisor.setFont(f);
    }//GEN-LAST:event_optItalicoItemStateChanged

    private void optNormalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_optNormalItemStateChanged
    Font f = new Font("Tahoma",Font.PLAIN,x);
        if(optNegrito.isSelected())
            txtVisor.setFont(f);
    }//GEN-LAST:event_optNormalItemStateChanged
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Janela dialog = new Janela(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo;
    private javax.swing.ButtonGroup grupo_estilo;
    private javax.swing.ButtonGroup grupo_tamanho;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton opt12;
    private javax.swing.JRadioButton opt14;
    private javax.swing.JRadioButton opt16;
    private javax.swing.JRadioButton optAzul;
    private javax.swing.JRadioButton optItalico;
    private javax.swing.JRadioButton optNegrito;
    private javax.swing.JRadioButton optNormal;
    private javax.swing.JRadioButton optVermelho;
    private javax.swing.JTextField txtVisor;
    // End of variables declaration//GEN-END:variables
    
}
