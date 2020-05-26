/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion02.views;

import proyecto.programacion02.controllers.CategoriaDAO;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import proyecto.programacion02.controllers.Conexion;
import proyecto.programacion02.models.Categoria;




/**
 *
 * @author Emma
 */
public class frmCategoria extends javax.swing.JInternalFrame {

    CategoriaDAO CategoriaDao;
    /**
     * Creates new form frmCategoria
     */
    public frmCategoria() {
        initComponents();
        CategoriaDao = new CategoriaDAO();
        cargarCategoria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winCategoria = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtIdCatego = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnGuardarP = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnGuar = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnElimin = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        cmbCatego = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lbltotal = new javax.swing.JLabel();
        btnCon = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtConsulta = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registro de Productos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID Categoria:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("<html>Nombre Categoria:<html>");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Descripcion:");

        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        btnGuardarP.setText("Guardar");
        btnGuardarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCategoria))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdCatego))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(111, 111, 111)
                        .addComponent(btnGuardarP)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCatego, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarP)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout winCategoriaLayout = new javax.swing.GroupLayout(winCategoria.getContentPane());
        winCategoria.getContentPane().setLayout(winCategoriaLayout);
        winCategoriaLayout.setHorizontalGroup(
            winCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        winCategoriaLayout.setVerticalGroup(
            winCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winCategoriaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnGuar.setText("Guardar");
        btnGuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuarActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnElimin.setText("Eliminar");
        btnElimin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnexit.setText("Volver");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        cmbCatego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Id Categoria", "Nombre Categoria", "Descripcion" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnElimin)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(cmbCatego, 0, 1, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnexit)
                        .addComponent(cmbCatego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar)
                            .addComponent(btnElimin)
                            .addComponent(btnEdit)
                            .addComponent(btnGuar)
                            .addComponent(btnImprimir))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id Categoria", "Nombre Categoria", "Descripcion"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        lbltotal.setText("TOTAL: ");

        btnCon.setText("Buscar");
        btnCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCon)
                    .addComponent(jButton3))
                .addGap(23, 23, 23))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuarActionPerformed

        winCategoria.setSize(732, 396);
        winCategoria.setTitle("Guardar");
        winCategoria.setVisible(true);
        txtIdCatego.setEditable(true);
        LimpiarCampos();
        
    }//GEN-LAST:event_btnGuarActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void btnGuardarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPActionPerformed
        String msgError = ValidarDatos();
        if (msgError.equals("")) {
            Categoria cat = new Categoria();
            cat.setIdCategoria(txtIdCatego.getText());
            cat.setNombreCategoria(txtCategoria.getText());
            cat.setDescripcion(txtDescripcion.getText());

            if (winCategoria.getTitle().equals("Guardar")) {
                if (CategoriaDao.buscarCategoria(cat.getIdCategoria()) == null) {
                    if (CategoriaDao.GuardarCategoria(cat)) {
                        cargarCategoria();
                        JOptionPane.showMessageDialog(winCategoria,
                                "Proveedor guardado exitosamente", "Guardar",
                                JOptionPane.INFORMATION_MESSAGE);
                        winCategoria.dispose();
                    } else {
                        JOptionPane.showMessageDialog(winCategoria,
                                "Error al intentar guardar", "Guardar",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(winCategoria, "Identificacion ya registrada",
                            "Guardar", JOptionPane.ERROR_MESSAGE);
                }
            } else {//Desea editar
                if (CategoriaDao.editarCategoria(cat)) {
                    cargarCategoria();
                    JOptionPane.showMessageDialog(winCategoria,
                            "Proveedor editado exitosamente", "Editar",
                            JOptionPane.INFORMATION_MESSAGE);
                    winCategoria.dispose();
                } else {
                    JOptionPane.showMessageDialog(winCategoria,
                            "Error al intentar editar", "Editar",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        } else {
            JOptionPane.showMessageDialog(winCategoria, msgError, "Guardar",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        winCategoria.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
           int fila = tblProductos.getSelectedRow();
        if (fila != -1){
            winCategoria.setSize(732, 396);
            winCategoria.setTitle("Editar");
            winCategoria.setLocationRelativeTo(tblProductos);
            winCategoria.setVisible(true);
            String IdCategoria = tblProductos.getValueAt(fila, 0).toString();
            Categoria cat = CategoriaDao.buscarCategoria(IdCategoria);
            txtIdCatego.setText(cat.getIdCategoria());
            txtCategoria.setText(cat.getDescripcion());
            txtDescripcion.setText(cat.getNombreCategoria());
           
        }else{
            JOptionPane.showMessageDialog(rootPane, "Elija primero el producto a Editar", "Editar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnEliminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminActionPerformed
            int fila = tblProductos.getSelectedRow();
        if(fila != -1){
            String id = tblProductos.getValueAt(fila, 0).toString();
            int resp = JOptionPane.showConfirmDialog(rootPane, "esta seguro eliminar a "+ id, "Eliminar", JOptionPane.YES_OPTION);
            if (resp == JOptionPane.YES_OPTION){
                if (CategoriaDao.eliminarCategoria(id)){
                    JOptionPane.showMessageDialog(rootPane, "eliminado");
                    cargarCategoria();
                }else {
                    JOptionPane.showMessageDialog(rootPane, "ocurrrió un problema intente de nuevo");
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Seleccione el registro a eliminar",
                "Eliminar",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
       // CategoriaDao.cargarReporteCategoria();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarCategoria();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultaActionPerformed

    private void btnConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConActionPerformed

         if (cmbCatego.getSelectedIndex() == 0) {
            cmbCatego.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Debe de selecionar una opcion",
                    "Consulta", JOptionPane.ERROR_MESSAGE);
        }else if (txtConsulta.getText().equals("")){
         txtConsulta.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Ingrese el valor a buscar",
                    "Consulta", JOptionPane.ERROR_MESSAGE);
        }else{
        FiltrarDatos();
        }
        
    }//GEN-LAST:event_btnConActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       limpiar();
        cargarCategoria();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCon;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnElimin;
    private javax.swing.JButton btnGuar;
    private javax.swing.JButton btnGuardarP;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnexit;
    private javax.swing.JComboBox<String> cmbCatego;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtIdCatego;
    private javax.swing.JDialog winCategoria;
    // End of variables declaration//GEN-END:variables
    public void limpiar(){
    txtConsulta.setText("");
    
    }
    
    public void LimpiarCampos(){
    txtIdCatego.setText("");
    txtCategoria.setText("");
    txtDescripcion.setText("");
    
    
    
    }
    
    
    private void cargarCategoria() {

        CategoriaDao.conectarBD();
        ResultSet rs = CategoriaDao.cargarDatosCategoria();
        if (rs != null) {
            tblProductos.setModel(CategoriaDao.cargarEnTabla(rs));
            lbltotal.setText("TOTAL: " + tblProductos.getRowCount());
        }
        CategoriaDao.desconectarBD();

    }

    private String ValidarDatos() {

        if (txtIdCatego.getText().trim().equals("")) {
            txtIdCatego.requestFocus();
            return "Ingrese un numero";
        }
        if (txtCategoria.getText().trim().equals("")) {
            txtCategoria.requestFocus();
            return "La categoria es requerida";
        }
        if (txtDescripcion.getText().trim().equals("")) {
            txtDescripcion.requestFocus();
            return "Ingrese una descripcion del producto";
        }
        return "";
    }

    public void FiltrarDatos(){
     Conexion conexion = new Conexion();
        String sql;
        ResultSet rs;
        conexion.conectarBD();
    switch (cmbCatego.getSelectedItem().toString()) {
        case "Id Categoria":
            sql = "SELECT * FROM categoria WHERE IdCategoria LIKE '%" + txtConsulta.getText() + "%'";
            break;
        case "Nombre Categoria":
            sql = "SELECT * FROM categoria WHERE NombreCategoria LIKE '%" + txtConsulta.getText() + "%'";
            break;
        case "Descripcion":
            sql = "SELECT * FROM categoria WHERE Descripcion LIKE '%" + txtConsulta.getText() + "%'";
            break;
        default:
            sql = " ";
            break;
    }
        if (sql.contains("SELECT")) {
            rs = conexion.seleccionar(sql);
            if (rs != null) {
                tblProductos.setModel(conexion.cargarEnTabla(rs));
                lbltotal.setText("TOTAL: " + tblProductos.getRowCount());
            }
        }conexion.desconectarBD();
    
    
    
    
    }
}
