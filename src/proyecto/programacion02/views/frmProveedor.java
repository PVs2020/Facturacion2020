
package proyecto.programacion02.views;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto.programacion02.controllers.Conexion;
import proyecto.programacion02.controllers.ProveedorDAO;
import proyecto.programacion02.models.Proveedor;

/**
 *
 * @author Reymond
 */
public class frmProveedor extends javax.swing.JInternalFrame {
ProveedorDAO proveedoresDao;
    /**
     * Creates new form Proveedores
     */
    

    
    public frmProveedor() {
        initComponents();
        proveedoresDao = new ProveedorDAO();
        cargarDatosProveedor();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winProveedor = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        txtCompania = new javax.swing.JTextField();
        txtNombreR = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtDatos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbSelect = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/partnership-handshake.png"))); // NOI18N
        jLabel2.setText("Representante");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/phone.png"))); // NOI18N
        jLabel3.setText("Teléfono");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cedula.png"))); // NOI18N
        jLabel4.setText("Cedula");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/company.png"))); // NOI18N
        jLabel5.setText("Compañia");

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/success.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnAceptar)
                .addGap(37, 37, 37)
                .addComponent(btnCancelar)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId)
                    .addComponent(txtCompania, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreR)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addGap(66, 66, 66))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delivery-truck.png"))); // NOI18N
        jLabel1.setText("Registro de Proveedores");

        javax.swing.GroupLayout winProveedorLayout = new javax.swing.GroupLayout(winProveedor.getContentPane());
        winProveedor.getContentPane().setLayout(winProveedorLayout);
        winProveedorLayout.setHorizontalGroup(
            winProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winProveedorLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(winProveedorLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        winProveedorLayout.setVerticalGroup(
            winProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winProveedorLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Proveedor");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/document.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return-on-investment.png"))); // NOI18N
        jButton6.setText("Cerrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(22, 22, 22)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar)
                    .addComponent(jButton6)
                    .addComponent(btnImprimir))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Buscar por:");

        cmbSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Eliga Categoria)", "Id Proveedor", "Nombre Representante", "Compañia" }));
        cmbSelect.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmbSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cleaning.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(416, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(cmbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jButton1))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProveedores);

        lblTotal.setText("Total: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotal))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        String msgError = ValidarDatos();
        if (msgError.equals("")) {
            Proveedor proveedor = new Proveedor();
            proveedor.setId(txtId.getText());
            proveedor.setNombre(txtNombreR.getText());
            proveedor.setTelefono(txtTelefono.getText());
            proveedor.setCompania(txtCompania.getText());
  
            if (winProveedor.getTitle().equals("Guardar")) {
                if (proveedoresDao.buscarProveedor(proveedor.getId()) == null) {
                    if (proveedoresDao.guardarProveedor(proveedor)) {
                        cargarDatosProveedor();
                        JOptionPane.showMessageDialog(winProveedor,
                            "Proveedor guardado exitosamente", "Guardar",
                            JOptionPane.INFORMATION_MESSAGE);
                        winProveedor.dispose();
                    } else {
                        JOptionPane.showMessageDialog(winProveedor,
                            "Error al intentar guardar", "Guardar",
                            JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(winProveedor, "Identificacion ya registrada",
                        "Guardar", JOptionPane.ERROR_MESSAGE);
                }
            } else {//Desea editar
                if (proveedoresDao.editarProveedor(proveedor)) {
                    cargarDatosProveedor();
                    JOptionPane.showMessageDialog(winProveedor,
                        "Proveedor editado exitosamente", "Editar",
                        JOptionPane.INFORMATION_MESSAGE);
                    winProveedor.dispose();
                } else {
                    JOptionPane.showMessageDialog(winProveedor,
                        "Error al intentar editar", "Editar",
                        JOptionPane.ERROR_MESSAGE);
                }
            }

        } else {
            JOptionPane.showMessageDialog(winProveedor, msgError, "Guardar",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        winProveedor.setSize(786, 436);
        winProveedor.setTitle("Guardar");
        winProveedor.setVisible(true);
        txtId.setEditable(true);
        //winProveedor.setLocationRelativeTo(tblProveedores);
        
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         this.dispose();      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
          winProveedor.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int fila = tblProveedores.getSelectedRow();
        if (fila != -1){
            winProveedor.setSize(786, 436);
            winProveedor.setTitle("Editar");
            winProveedor.setLocationRelativeTo(tblProveedores);
            winProveedor.setVisible(true);
            txtId.setEditable(false);
            String id = tblProveedores.getValueAt(fila, 0).toString();
            Proveedor proveedor = proveedoresDao.buscarProveedor(id);
            txtId.setText(proveedor.getId());
            txtNombreR.setText(proveedor.getNombre());
            txtTelefono.setText(proveedor.getTelefono());
            txtCompania.setText(proveedor.getCompania());
        }else{
            JOptionPane.showMessageDialog(rootPane, "Elija primero el proveedor a Editar", "Editar", JOptionPane.ERROR_MESSAGE);
        }                                         
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila = tblProveedores.getSelectedRow();
        if(fila != -1){
            String id = tblProveedores.getValueAt(fila, 0).toString();
            int resp = JOptionPane.showConfirmDialog(rootPane, "esta seguro eliminar a "+ id, "Eliminar", JOptionPane.YES_OPTION);
            if (resp == JOptionPane.YES_OPTION){
                if (proveedoresDao.eliminarProveedor(id)){
                    JOptionPane.showMessageDialog(rootPane, "eliminado");
                    cargarDatosProveedor();
                }else {
                    JOptionPane.showMessageDialog(rootPane, "problemas...");
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Seleccione el registro a eliminar",
                "Eliminar",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     
        if (cmbSelect.getSelectedIndex() == 0) {
            cmbSelect.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Debe de selecionar una categoria",
                    "Consulta", JOptionPane.ERROR_MESSAGE);
        }else if (txtDatos.getText().equals("")){
         txtDatos.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar consulta",
                    "Consulta", JOptionPane.ERROR_MESSAGE);
        }else{
        FiltrarDatos();
        }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtDatos.setText("");
        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
                "IDPROVEEDOR", "COMPAÑIA", "NOMBRE_REPRESENTANTE", "TELEFONO"
            }));
        cargarDatosProveedor();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        proveedoresDao.cargarReporteCategoria();
    }//GEN-LAST:event_btnImprimirActionPerformed
   public void FiltrarDatos(){
  Conexion conexion = new Conexion();
        String sql;
        ResultSet rs;
        conexion.conectarBD();
    switch (cmbSelect.getSelectedItem().toString()) {
        case "Id Proveedor":
            sql = "SELECT * FROM proveedor WHERE IdProveedor LIKE '%" + txtDatos.getText() + "%'";
            break;
        case "Nombre Representante":
            sql = "SELECT * FROM proveedor WHERE NombreRepresentante LIKE '%" + txtDatos.getText() + "%'";
            break;
        case "Compañia":
            sql = "SELECT * FROM proveedor WHERE Compañia LIKE '%" + txtDatos.getText() + "%'";
            break;
        default:
            sql = " ";
            break;
    }
        if (sql.contains("SELECT")) {
            rs = conexion.seleccionar(sql);
            if (rs != null) {
                tblProveedores.setModel(conexion.cargarEnTabla(rs));
                lblTotal.setText("TOTAL: " + tblProveedores.getRowCount());
            }
        }conexion.desconectarBD();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox<String> cmbSelect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtCompania;
    private javax.swing.JTextField txtDatos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreR;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JDialog winProveedor;
    // End of variables declaration//GEN-END:variables

  private void cargarDatosProveedor() {
        proveedoresDao.conectarBD();
        ResultSet rs = proveedoresDao.cargarProveedor();
        if (rs !=null){
        tblProveedores.setModel(proveedoresDao.cargarEnTabla(rs));
        lblTotal.setText("TOTAL: "+ tblProveedores.getRowCount());
        }
        proveedoresDao.desconectarBD();
    }
  
  public void limpiarCampos(){
      txtId.setText("");
      txtNombreR.setText("");
      txtTelefono.setText("");
      txtCompania.setText("");
  }
  private String ValidarDatos(){
    if (txtId.getText().trim().equals("")){
    txtId.requestFocus();
    return "Identificacion es requerida";
    }
    if (txtNombreR.getText().trim().equals("")){
    txtNombreR.requestFocus();
    return "El nombre del Representante es requerido";
    }
    if (txtTelefono.getText().trim().equals("")){
    txtTelefono.requestFocus();
    return "El telefono es requerido";
    }else{
        try{
        Integer.parseInt(txtTelefono.getText());
        }catch(NumberFormatException e){
        return "El telefono solo admite numeros.";
        }
    }
    if (txtCompania.getText().trim().equals("")){
    txtCompania.requestFocus();
    return "La compañia es requerido";}
     return ""; 
    }
}
