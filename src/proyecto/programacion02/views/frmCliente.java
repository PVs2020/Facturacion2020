
package proyecto.programacion02.views;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import proyecto.programacion02.controllers.ClienteDAO;
import proyecto.programacion02.controllers.Conexion;
import proyecto.programacion02.models.Cliente;

/**
 *
 * @author Reymond
 */
public class frmCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCliente
     */
    
        ClienteDAO clienteDao;
        
    public frmCliente() {
        initComponents();
        clienteDao = new ClienteDAO();
        cargarDatosCliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winCliente = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnEnviarDatos = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        txtDatos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbSelect = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/phone.png"))); // NOI18N
        jLabel2.setText("Teléfono:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adress.png"))); // NOI18N
        jLabel3.setText("Dirección:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cedula.png"))); // NOI18N
        jLabel4.setText("Cédula:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/name2.png"))); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fax.png"))); // NOI18N
        jLabel6.setText("Fax:");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/success.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFax))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/register.png"))); // NOI18N
        jLabel1.setText("Registro de Cliente");

        javax.swing.GroupLayout winClienteLayout = new javax.swing.GroupLayout(winCliente.getContentPane());
        winCliente.getContentPane().setLayout(winClienteLayout);
        winClienteLayout.setHorizontalGroup(
            winClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winClienteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(67, 67, 67))
        );
        winClienteLayout.setVerticalGroup(
            winClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winClienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        mnEnviarDatos.setText("Enviar Datos");
        mnEnviarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEnviarDatosActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnEnviarDatos);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cliente");

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCliente.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tblCliente);

        jToolBar1.setRollover(true);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditar);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/document.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEliminar);

        btnImprimir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImprimir);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return-on-investment.png"))); // NOI18N
        jButton6.setText("Cerrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTotal.setText("Total:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButton5.setText("Buscar");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatosActionPerformed(evt);
            }
        });

        jLabel7.setText("Buscar por:");

        cmbSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Eliga Categoria)", "Id Cliente", "Nombre", "Telefono", "Dirrecion", "Fax" }));
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton1))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(679, 679, 679)
                        .addComponent(lblTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblTotal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        winCliente.setSize(414, 515);
        winCliente.setTitle("Guardar");
        txtId.setEditable(true);
        limpiarCampos();
        winCliente.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        String msgError = ValidarDatos();
        if (msgError.equals("")) {
            Cliente cliente = new Cliente();
            cliente.setId(txtId.getText());
            cliente.setNombre(txtNombre.getText());
            cliente.setDireccion(txtDireccion.getText());
            cliente.setTelefono(txtTelefono.getText());
            cliente.setFax(txtFax.getText());

            if (winCliente.getTitle().equals("Guardar")) {
                if (clienteDao.buscarCliente(cliente.getId()) == null) {
                    if (clienteDao.guardarCliente(cliente)) {
                        cargarDatosCliente();
                        JOptionPane.showMessageDialog(winCliente,
                            "Cliente guardado exitosamente", "Guardar",
                            JOptionPane.INFORMATION_MESSAGE);
                        winCliente.dispose();
                    } else {
                        JOptionPane.showMessageDialog(winCliente,
                            "Error al intentar guardar", "Guardar",
                            JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(winCliente, "Identificacion ya registrada",
                        "Guardar", JOptionPane.ERROR_MESSAGE);
                }
            } else {//Desea editar
                if (clienteDao.editarCliente(cliente)) {
                    cargarDatosCliente();
                    JOptionPane.showMessageDialog(winCliente,
                        "Cliente editado exitosamente", "Editar",
                        JOptionPane.INFORMATION_MESSAGE);
                    winCliente.dispose();
                } else {
                    JOptionPane.showMessageDialog(winCliente,
                        "Error al intentar editar", "Editar",
                        JOptionPane.ERROR_MESSAGE);
                }
            }

        } else {
            JOptionPane.showMessageDialog(winCliente, msgError, "Guardar",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        winCliente.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int fila = tblCliente.getSelectedRow();
        if (fila != -1) {
            winCliente.setSize(414, 515);
            winCliente.setTitle("Editar");
            winCliente.setLocationRelativeTo(tblCliente);
            txtId.setEditable(false);
            winCliente.setVisible(true);
            String id = tblCliente.getValueAt(fila, 0).toString();
            Cliente cliente = clienteDao.buscarCliente(id);
            txtId.setText(cliente.getId());
            txtNombre.setText(cliente.getNombre());
            txtDireccion.setText(cliente.getDireccion());
            txtTelefono.setText(cliente.getTelefono());
            txtFax.setText(cliente.getFax());
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Elija el Cliente a Editar", "Editar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila = tblCliente.getSelectedRow();
        if(fila != -1){
            String id = tblCliente.getValueAt(fila, 0).toString();
            int resp = JOptionPane.showConfirmDialog(rootPane, "esta seguro eliminar a "+ id, "Eliminar", JOptionPane.YES_OPTION);
            if (resp == JOptionPane.YES_OPTION){
                if (clienteDao.eliminarCliente(id)){
                    JOptionPane.showMessageDialog(rootPane, "eliminado");
                    cargarDatosCliente();
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

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        clienteDao.cargarReporteCliente();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

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

    }//GEN-LAST:event_jButton5ActionPerformed

    private void cmbSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtDatos.setText("");
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
                "IDCLIENTE", "NOMBRECLIENTE", "DIRECCION", "TELEFONO", "FAX"
            }));
            cargarDatosCliente();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mnEnviarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEnviarDatosActionPerformed
        // TODO add your handling code here:
        int fila = tblCliente.getSelectedRow();
        try {
            if(fila==-1)
            {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");

            }
            else
            {
               String id = tblCliente.getValueAt(fila, 0).toString();
            Cliente cliente = clienteDao.buscarCliente(id);
            frmFacturacion.txtIdCliente.setText(cliente.getId());
            frmFacturacion.txtNomCliente.setText(cliente.getNombre());
            this.dispose();

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_mnEnviarDatosActionPerformed

    private void txtDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox<String> cmbSelect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenuItem mnEnviarDatos;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtDatos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JDialog winCliente;
    // End of variables declaration//GEN-END:variables
      
    private void cargarDatosCliente() {
       clienteDao.conectarBD();
       ResultSet rs = clienteDao.cargarCliente();
       if(rs !=null){
           tblCliente.setModel(clienteDao.cargarEnTabla(rs));
           lblTotal.setText("TOTAL"+tblCliente.getRowCount());
           
       }
        clienteDao.desconectarBD();
    }
    
    private void limpiarCampos(){
       txtId.setText("");
       txtNombre.setText("");
       txtTelefono.setText("");
       txtDireccion.setText("");
       txtFax.setText("");
   }
   
    private String ValidarDatos(){
        
    if (txtId.getText().trim().equals("")){
    txtId.requestFocus();
    return "Identificacion es requerida";
    }
    if (txtNombre.getText().trim().equals("")){
    txtNombre.requestFocus();
    return "El nombre es requerido";
    }
    if (txtDireccion.getText().trim().equals("")){
    txtDireccion.requestFocus();
    return "Identificacion es requerida";
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
    if (txtFax.getText().trim().equals("")){
    txtFax.requestFocus();
    return "El numero de Fax es requerido";
    }else{
        try{
        Integer.parseInt(txtFax.getText());
        }catch(NumberFormatException e){
        return "El fax solo admite numeros.";
        }
    }
      return ""; 
}
public void FiltrarDatos(){
  Conexion conexion = new Conexion();
        String sql;
        ResultSet rs;
        conexion.conectarBD();
    switch (cmbSelect.getSelectedItem().toString()) {
        case "Id Cliente":
            sql = "SELECT * FROM cliente WHERE IdCliente LIKE '%" + txtDatos.getText() + "%'";
            break;
        case "Nombre":
            sql = "SELECT * FROM cliente WHERE NombreCliente LIKE '%" + txtDatos.getText() + "%'";
            break;
        case "Dirrecion":
            sql = "SELECT * FROM cliente WHERE Dirrecion LIKE '%" + txtDatos.getText() + "%'";
            break;
        case "Telefono":
            sql = "SELECT * FROM cliente WHERE Telefono LIKE '%" + txtDatos.getText() + "%'";
            break;    
        case "Fax":
            sql = "SELECT * FROM cliente WHERE Fax LIKE '%" + txtDatos.getText() + "%'";
            break;    
        default:
            sql = " ";
            break;
    }
        if (sql.contains("SELECT")) {
            rs = conexion.seleccionar(sql);
            if (rs != null) {
                tblCliente.setModel(conexion.cargarEnTabla(rs));
                lblTotal.setText("TOTAL: " + tblCliente.getRowCount());
            }
        }conexion.desconectarBD();
}


}
