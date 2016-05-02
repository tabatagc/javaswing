
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Aula2 extends javax.swing.JFrame {
    
 
    public Aula2() {
        initComponents();
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        txtTexto = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExibir = new javax.swing.JButton();
        lblTit = new java.awt.Label();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        mnFormat = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 237, 237));

        txtTexto.setFont(txtTexto.getFont().deriveFont(txtTexto.getFont().getSize()+3f));
        txtTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Book Antiqua", 0, 14));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEntrada.setFont(new java.awt.Font("Book Antiqua", 0, 14));
        btnEntrada.setText("Entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Book Antiqua", 0, 14));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnExibir.setFont(new java.awt.Font("Book Antiqua", 0, 14));
        btnExibir.setText("Exibir");
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });

        lblTit.setFont(new java.awt.Font("Book Antiqua", 1, 16));
        lblTit.setText("Aula");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEntrada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExibir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnEntrada)
                    .addComponent(btnLimpar)
                    .addComponent(btnExibir))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jMenuBar2.setBackground(new java.awt.Color(244, 237, 237));

        mnFile.setBackground(new java.awt.Color(244, 237, 237));
        mnFile.setText("Arquivo");

        jMenuItem1.setText("Abrir");
        mnFile.add(jMenuItem1);

        jMenuBar2.add(mnFile);

        mnEdit.setBackground(new java.awt.Color(244, 237, 237));
        mnEdit.setText("Editar");
        jMenuBar2.add(mnEdit);

        mnFormat.setBackground(new java.awt.Color(244, 237, 237));
        mnFormat.setText("Formatar");
        jMenuBar2.add(mnFormat);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setText(String Nome) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    private int showConfirmDialog(int showConfirmDialog) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void txtTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoActionPerformed
        
}//GEN-LAST:event_txtTextoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int x;
            x = JOptionPane.showConfirmDialog(null, "Deseja Sair?");
            
            if (x == JOptionPane.YES_OPTION)
                  System.exit(0);
             else
                JOptionPane.showMessageDialog(null, "Boa Sorte");           
                
}//GEN-LAST:event_btnSairActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtTexto.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        String Nome;
        Nome =  JOptionPane.showInputDialog("Digite seu nome: ");
                txtTexto.setText(Nome);
        
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed
               
        if(txtTexto.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Texto Vazio");
        else
            JOptionPane.showMessageDialog(null, txtTexto.getText());
        //txtTexto.setText(Nome);
        
    }//GEN-LAST:event_btnExibirActionPerformed
    
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aula2().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnExibir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label lblTit;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenu mnFormat;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
    
}
