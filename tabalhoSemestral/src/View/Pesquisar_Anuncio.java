/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Dao.ModulodConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Lenovo
 */
public class Pesquisar_Anuncio extends javax.swing.JInternalFrame {

    /**
     * Creates new form Pesquisar_Anuncio
     */
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Pesquisar_Anuncio() {
        initComponents();
        conexao = ModulodConexao.conector();
        consultarAnuncio();
    }
    
    private void consultarAnuncio() {
        String sql = "SELECT * FROM tbAnuncio";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            do {
                tblePesquisarAnuncio.setModel(DbUtils.resultSetToTableModel(rs));
            } while (rs.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        pnelPrincipal = new javax.swing.JPanel();
        cbxCriteriodPesquisar1 = new javax.swing.JComboBox();
        txtPesquisar1 = new javax.swing.JTextField();
        jSeparatorPesquisar1 = new javax.swing.JSeparator();
        lblPesquisar1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblePesquisarAnuncio = new javax.swing.JTable();

        pnelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        cbxCriteriodPesquisar1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cbxCriteriodPesquisar1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de an??ncio", "Tipo de im??vel" }));

        txtPesquisar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPesquisar1.setText("Pesquisar");
        txtPesquisar1.setBorder(null);
        txtPesquisar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPesquisar1FocusGained(evt);
            }
        });

        lblPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/search_50px_1.png"))); // NOI18N

        tblePesquisarAnuncio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de an??ncio", "Data de publica????o", "Tipo de im??vel", "Publicado por"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblePesquisarAnuncio);

        javax.swing.GroupLayout pnelPrincipalLayout = new javax.swing.GroupLayout(pnelPrincipal);
        pnelPrincipal.setLayout(pnelPrincipalLayout);
        pnelPrincipalLayout.setHorizontalGroup(
            pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnelPrincipalLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(cbxCriteriodPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisar1)
                            .addComponent(jSeparatorPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPesquisar1)
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnelPrincipalLayout.setVerticalGroup(
            pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnelPrincipalLayout.createSequentialGroup()
                        .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCriteriodPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparatorPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPesquisar1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisar1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesquisar1FocusGained
        // TODO add your handling code here:
        txtPesquisar1.setText("");
    }//GEN-LAST:event_txtPesquisar1FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxCriteriodPesquisar;
    private javax.swing.JComboBox cbxCriteriodPesquisar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparatorPesquisar;
    private javax.swing.JSeparator jSeparatorPesquisar1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblPesquisar1;
    private javax.swing.JPanel pnelComponentes;
    private javax.swing.JPanel pnelPrincipal;
    private javax.swing.JTable tblePesquisarAnuncio;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPesquisar1;
    // End of variables declaration//GEN-END:variables
}
