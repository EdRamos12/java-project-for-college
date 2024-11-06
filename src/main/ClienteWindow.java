/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edu
 */
public class ClienteWindow extends javax.swing.JFrame {

    /**
     * Creates new form ClienteWindow
     */
    public ClienteWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cliente = new javax.swing.JDialog();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        Nome = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        Telefone = new javax.swing.JTextField();
        label7 = new java.awt.Label();
        Email = new javax.swing.JTextField();
        label8 = new java.awt.Label();
        CPF = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();
        label3 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Novo_Cliente = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Editar_Cliente = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        Cliente.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Cliente.setTitle("Novo cliente");
        Cliente.setFocusTraversalPolicyProvider(true);
        Cliente.setLocationByPlatform(true);
        Cliente.setMinimumSize(new java.awt.Dimension(388, 297));
        Cliente.setModal(true);
        Cliente.setResizable(false);
        Cliente.setSize(new java.awt.Dimension(388, 327));

        label4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label4.setText("Nome:");

        label5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label5.setText("Novo Cliente");

        Nome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        label6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label6.setText("Telefone:");

        Telefone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        label7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label7.setText("E-mail:");

        Email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        label8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label8.setText("CPF:");

        CPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jCheckBox1.setText("Cliente possui interesse?");

        jButton5.setText("Enviar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Editando");
        jCheckBox2.setEnabled(false);

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente.getContentPane());
        Cliente.getContentPane().setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Telefone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CPF)
                                    .addComponent(Nome)))
                            .addGroup(ClienteLayout.createSequentialGroup()
                                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ClienteLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ClienteLayout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addGap(0, 58, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox2))
                    .addGroup(ClienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jButton6.setText("Enviar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        label3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label3.setText("Clientes");

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Email", "CPF", "Interesse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowHeight(50);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.setUpdateSelectionOnSort(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        Novo_Cliente.setText("Novo cliente");
        Novo_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Novo_ClienteActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.setEnabled(false);
        Excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExcluirMouseClicked(evt);
            }
        });

        Editar_Cliente.setText("Editar cliente");
        Editar_Cliente.setEnabled(false);
        Editar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar_ClienteActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel1.setText("Buscar cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Editar_Cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Novo_Cliente))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1)))
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Novo_Cliente)
                            .addComponent(Editar_Cliente))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int id = Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());

        try {
            String sql = "SELECT * FROM Cliente WHERE id_cliente="+id;
            Connection conn = Conexao.getConexao();

            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
            ResultSet res = st.executeQuery(sql);

            Editar_Cliente.setEnabled(true);
            Excluir.setEnabled(true);

            while (res.next()) {
                Nome.setText(res.getString("nome_cliente"));
                Email.setText(res.getString("email_cliente"));
                Telefone.setText(res.getString("telefone_cliente"));
                CPF.setText(res.getString("CPF_cliente"));
                if ("false".equals(res.getObject("interesse").toString())) {
                    jCheckBox1.setSelected(false);
                } else {
                    jCheckBox1.setSelected(true);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void Novo_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Novo_ClienteActionPerformed
        Nome.setText("");
        Email.setText("");
        Telefone.setText("");
        CPF.setText("");
        jCheckBox2.setSelected(false);
        Cliente.setVisible(true);
    }//GEN-LAST:event_Novo_ClienteActionPerformed

    private void Editar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editar_ClienteActionPerformed
        // TODO add your handling code here:
        jTable2MouseClicked(null);
        jCheckBox2.setSelected(true);
        Cliente.setVisible(true);
    }//GEN-LAST:event_Editar_ClienteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps = null;
        String sql = "";
        boolean is_editing = jCheckBox2.isSelected();

        try {
            String nome = Nome.getText();
            String telefone = Telefone.getText().replaceAll("[+\\-\\s]", "");
            String email = Email.getText();
            String cpf = CPF.getText().replaceAll("[\\s.-]", "");
            String interesse = String.valueOf(jCheckBox1.isSelected());
            if (!"false".equals(interesse)) {
                interesse = "1";
            } else {
                interesse = "0";
            }
            
            if (!is_editing) {
                sql = "INSERT INTO Cliente (nome_cliente, telefone_cliente, email_cliente, CPF_cliente, interesse) VALUES (?, ?, ?, ?, ?)";
            } else {
                sql = "UPDATE Cliente SET nome_cliente = ?, telefone_cliente = ?, email_cliente = ?, CPF_cliente = ?, interesse = ? WHERE id_cliente = ?";
            }

            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, telefone);
            ps.setString(3, email);
            ps.setString(4, cpf);
            ps.setString(5, interesse);
            
            if (is_editing) {
                ps.setString(6, jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
            }

            boolean b = ps.execute();
            if (!b) {
                if (is_editing) {
                    JOptionPane.showMessageDialog(this, "Usuário editado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Usuário criado com sucesso!");
                }
                formWindowOpened(null);
            } else {
                JOptionPane.showMessageDialog(this, "Erro! Tente novamente mais tarde...");
            }
            Cliente.setVisible(false);
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            String sql = "SELECT * FROM Cliente";
            
            Connection conn = Conexao.getConexao();
            
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                  ResultSet.CONCUR_UPDATABLE);
            ResultSet res = st.executeQuery(sql);
            res.last();
            int row = res.getRow();
            int col = res.getMetaData().getColumnCount();
            res.beforeFirst();
            String rowData[][] = new String[row][col];
            int r = 0;
            while (res.next()) {
                for (int i = 0; i < col; i++) {
                    rowData[r][i] = res.getObject(i + 1).toString();
                }
                r++;
            }
            
            String[] columnName = {"ID", "Nome", "Telefone", "E-mail", "CPF", "Interesse"};
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            
            model.setDataVector(rowData, columnName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void ExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExcluirMouseClicked
        // TODO add your handling code here:
        PreparedStatement ps = null;

        try {
            String sql = "DELETE FROM Cliente WHERE id_cliente = ?";
            
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
            
            int r = JOptionPane.showConfirmDialog(this, "Você tem certeza que quer excluir esse cliente?");
            
            if (r != 0) {
                return;
            }
            
            if (!ps.execute()) {
                formWindowOpened(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ExcluirMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM Cliente WHERE nome_cliente LIKE '%"+jTextField1.getText()+"%'";
            
            Connection conn = Conexao.getConexao();
            
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
            ResultSet res = st.executeQuery(sql);
            res.last();
            int row = res.getRow();
            int col = res.getMetaData().getColumnCount();
            res.beforeFirst();
            String rowData[][] = new String[row][col];
            int r = 0;
            while (res.next()) {
                for (int i = 0; i < col; i++) {
                    rowData[r][i] = res.getObject(i + 1).toString();
                }
                r++;
            }
            
            String[] columnName = {"ID", "Nome", "Telefone", "E-mail", "CPF", "Interesse"};
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            
            model.setDataVector(rowData, columnName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(ClienteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPF;
    private javax.swing.JDialog Cliente;
    private javax.swing.JButton Editar_Cliente;
    private javax.swing.JTextField Email;
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField Nome;
    private javax.swing.JButton Novo_Cliente;
    private javax.swing.JTextField Telefone;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    // End of variables declaration//GEN-END:variables
}