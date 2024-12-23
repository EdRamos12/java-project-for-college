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
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edu
 */
public class ImovelWindow extends javax.swing.JFrame {

    /**
     * Creates new form ImovelWindow
     */
    public ImovelWindow() {
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

        Imovel = new javax.swing.JDialog();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        Endereco = new javax.swing.JTextField();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        Enviar = new javax.swing.JButton();
        Editando = new javax.swing.JCheckBox();
        Tipo = new javax.swing.JComboBox<>();
        Valor = new javax.swing.JFormattedTextField();
        Area = new javax.swing.JFormattedTextField();
        Ndequartos = new javax.swing.JFormattedTextField();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        Ndebanheiros = new javax.swing.JFormattedTextField();
        Status = new javax.swing.JCheckBox();
        label11 = new java.awt.Label();
        ProprietarioBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Novo = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Busca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        Imovel.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Imovel.setTitle("Novo cliente");
        Imovel.setFocusTraversalPolicyProvider(true);
        Imovel.setLocationByPlatform(true);
        Imovel.setModal(true);
        Imovel.setResizable(false);
        Imovel.setSize(new java.awt.Dimension(388, 427));
        Imovel.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                ImovelWindowOpened(evt);
            }
        });

        label4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label4.setText("Tipo:");

        label5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label5.setText("Registrar novo Imóvel");

        label6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label6.setText("Endereço:");

        Endereco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        label7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label7.setText("Valor:");

        label8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label8.setText("Area:");

        Enviar.setText("Enviar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        Editando.setText("Editando");
        Editando.setEnabled(false);

        Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Apartamento", "Duplex", "Triplex", "Penthouse", "Townhouse", "Flat", "Loft", "Giardino", "Studio", "Casa greminada", "Sobrado", "Bangalô", "Edícula", "Kitnet" }));
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        Valor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        Area.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        Ndequartos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        label9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label9.setText("Nº de quartos:");

        label10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label10.setText("Nº de banheiros:");

        Ndebanheiros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        Status.setText("Status");
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });

        label11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label11.setText("Proprietário:");

        ProprietarioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Apartamento", "Duplex", "Triplex", "Penthouse", "Townhouse", "Flat", "Loft", "Giardino", "Studio", "Casa greminada", "Sobrado", "Bangalô", "Edícula", "Kitnet" }));
        ProprietarioBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProprietarioBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("²");

        javax.swing.GroupLayout ImovelLayout = new javax.swing.GroupLayout(Imovel.getContentPane());
        Imovel.getContentPane().setLayout(ImovelLayout);
        ImovelLayout.setHorizontalGroup(
            ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImovelLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(Editando, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ImovelLayout.createSequentialGroup()
                .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ImovelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ImovelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ImovelLayout.createSequentialGroup()
                                .addComponent(Status)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ImovelLayout.createSequentialGroup()
                                .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ndebanheiros)
                                    .addComponent(ProprietarioBox, 0, 241, Short.MAX_VALUE)))))
                    .addGroup(ImovelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Endereco)
                            .addGroup(ImovelLayout.createSequentialGroup()
                                .addComponent(Area)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(Tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Valor)
                            .addComponent(Ndequartos))))
                .addContainerGap())
        );
        ImovelLayout.setVerticalGroup(
            ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImovelLayout.createSequentialGroup()
                .addComponent(Editando, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Valor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Area))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ndequartos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ndebanheiros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProprietarioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(ImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enviar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(Status))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Imóveis");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        label3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label3.setText("Imóveis");

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Endereço", "Valor", "Área", "Nº de quartos", "Nº de Banheiros", "Status", "Propriedade de"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
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

        Novo.setText("Novo imóvel");
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });

        Excluir.setText("Excluir");
        Excluir.setEnabled(false);
        Excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExcluirMouseClicked(evt);
            }
        });

        Editar.setText("Editar imóvel");
        Editar.setEnabled(false);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuscaKeyPressed(evt);
            }
        });

        jLabel1.setText("Buscar por proprietario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Novo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Busca)))
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
                            .addComponent(Busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Excluir)
                            .addComponent(Novo)
                            .addComponent(Editar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    class ProprietarioItem {
        int id;
        String name;
        public ProprietarioItem(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public int getId() {
            return id;
        }
        @Override
        public String toString() {
            return name;
        }
    }
    
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int id = Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());

        try {
            String sql = "SELECT * FROM Imovel WHERE id_imovel="+id;
            Connection conn = Conexao.getConexao();

            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
            ResultSet res = st.executeQuery(sql);

            Editar.setEnabled(true);
            Excluir.setEnabled(true);

            while (res.next()) {
                Area.setText(res.getString("area"));
                Valor.setText(res.getString("valor_imovel"));
                Endereco.setText(res.getString("endereco_imovel"));
                Ndebanheiros.setText(res.getString("numero_de_banheiros"));
                Ndequartos.setText(res.getString("numero_de_quartos"));
                Tipo.setSelectedItem(res.getString("tipo"));
                if ("false".equals(res.getObject("status").toString())) {
                    Status.setSelected(false);
                } else {
                    Status.setSelected(true);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
        Area.setText("");
        Valor.setText("");
        Endereco.setText("");
        Ndebanheiros.setText("");
        Ndequartos.setText("");
        Tipo.setSelectedIndex(0);
        Status.setSelected(false);
        Editando.setSelected(false);
        Imovel.setVisible(true);
    }//GEN-LAST:event_NovoActionPerformed

    private void ExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExcluirMouseClicked
        // TODO add your handling code here:
        PreparedStatement ps = null;

        try {
            String sql = "DELETE FROM Imovel WHERE id_imovel = ?";

            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());

            int r = JOptionPane.showConfirmDialog(this, "Você tem certeza que quer excluir esse imóvel?");

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

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        jTable2MouseClicked(null);
        Editando.setSelected(true);
        Imovel.setVisible(true);
    }//GEN-LAST:event_EditarActionPerformed

    private void refreshTableBasedOnResults(ResultSet res) {
        try {
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

            String[] columnName = {"ID", "Tipo", "Endereço", "Valor", "Área", "Nº de Quartos", "Nº de Banheiros", "Status", "Proprietário"};
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setDataVector(rowData, columnName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void BuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscaKeyPressed
        // TODO add your handling code here:
        try {
            String sql = "SELECT Imovel.id_imovel, Imovel.tipo, Imovel.endereco_imovel, Imovel.valor_imovel, Imovel.area, Imovel.numero_de_quartos, Imovel.numero_de_banheiros, Imovel.status, Proprietario.nome_proprietario FROM Imovel JOIN Proprietario ON Imovel.id_proprietario = Proprietario.id_proprietario WHERE Proprietario.nome_proprietario LIKE '%"+Busca.getText()+"%'";

            Connection conn = Conexao.getConexao();

            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
            ResultSet res = st.executeQuery(sql);
            refreshTableBasedOnResults(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BuscaKeyPressed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps = null;
        String sql = "";
        boolean is_editing = Editando.isSelected();

        try {
            String area = Area.getText();
            String valor = Valor.getText().replace(".", "").replace(",", ".");
            System.out.println(valor);
            String endereco = Endereco.getText();
            String ndebanheiros = Ndebanheiros.getText();
            String ndequartos = Ndequartos.getText();
            String tipo = Tipo.getSelectedItem().toString();
            String status = "";
            ProprietarioItem itemFromBox = (ProprietarioItem) ProprietarioBox.getSelectedItem();
            String proprietario_box = Integer.toString(itemFromBox.getId());
            
            if (Status.isSelected()) {
                status = "1";
            } else {
                status = "0";
            }

            if (!is_editing) {
                sql = "INSERT INTO Imovel (tipo, endereco_imovel, valor_imovel, area, numero_de_quartos, numero_de_banheiros, status, id_proprietario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            } else {
                sql = "UPDATE Imovel SET tipo = ?, endereco_imovel = ?, valor_imovel = ?, area = ?, numero_de_quartos = ?, numero_de_banheiros = ?, status = ?, id_proprietario = ? WHERE id_imovel = ?";
            }

            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, tipo);
            ps.setString(2, endereco);
            ps.setString(3, valor);
            ps.setString(4, area);
            ps.setString(5, ndequartos);
            ps.setString(6, ndebanheiros);
            ps.setString(7, status);
            ps.setString(8, proprietario_box);

            if (is_editing) {
                ps.setString(9, jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString());
            }

            boolean b = ps.execute();
            if (!b) {
                if (is_editing) {
                    JOptionPane.showMessageDialog(this, "Imóvel editado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Imóvel criado com sucesso!");
                }
                formWindowOpened(null);
            } else {
                JOptionPane.showMessageDialog(this, "Erro! Tente novamente mais tarde...");
            }
            Imovel.setVisible(false);
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EnviarActionPerformed

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            String sql = "SELECT Imovel.id_imovel, Imovel.tipo, Imovel.endereco_imovel, Imovel.valor_imovel, Imovel.area, Imovel.numero_de_quartos, Imovel.numero_de_banheiros, Imovel.status, Proprietario.nome_proprietario FROM Imovel JOIN Proprietario ON Imovel.id_proprietario = Proprietario.id_proprietario;";
            
            Connection conn = Conexao.getConexao();
            
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                  ResultSet.CONCUR_UPDATABLE);
            ResultSet res = st.executeQuery(sql);
            refreshTableBasedOnResults(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void ProprietarioBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProprietarioBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProprietarioBoxActionPerformed

    private void ImovelWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ImovelWindowOpened
        // TODO add your handling code here:
        try {
            String sql = "SELECT id_proprietario, nome_proprietario FROM Proprietario";
            
            Statement st = Conexao.getConexao().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                  ResultSet.CONCUR_UPDATABLE);
            ResultSet res = st.executeQuery(sql);
            Vector vector = new Vector();
            int i = 0;
            int selected_i = 0;
            while (res.next()) {
                vector.addElement(
                    new ProprietarioItem(
                        res.getInt("id_proprietario"), 
                        res.getString("nome_proprietario")
                    )
                );
                
                if (Editando.isSelected() && jTable2.getValueAt(jTable2.getSelectedRow(), 8).equals(res.getString("nome_proprietario"))) {
                    selected_i = i;
                }
                
                i++;
            }
            
            ProprietarioBox.setModel(new DefaultComboBoxModel(vector));
            
            if (Editando.isSelected()) {
                ProprietarioBox.setSelectedIndex(selected_i);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ImovelWindowOpened

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
            java.util.logging.Logger.getLogger(ImovelWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImovelWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImovelWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImovelWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImovelWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Area;
    private javax.swing.JTextField Busca;
    private javax.swing.JCheckBox Editando;
    private javax.swing.JButton Editar;
    private javax.swing.JTextField Endereco;
    private javax.swing.JButton Enviar;
    private javax.swing.JButton Excluir;
    private javax.swing.JDialog Imovel;
    private javax.swing.JFormattedTextField Ndebanheiros;
    private javax.swing.JFormattedTextField Ndequartos;
    private javax.swing.JButton Novo;
    private javax.swing.JComboBox<String> ProprietarioBox;
    private javax.swing.JCheckBox Status;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JFormattedTextField Valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    // End of variables declaration//GEN-END:variables
}
