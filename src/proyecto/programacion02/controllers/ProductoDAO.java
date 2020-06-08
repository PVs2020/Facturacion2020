/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion02.controllers;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static proyecto.programacion02.controllers.Conexion.conexion;
import proyecto.programacion02.models.Producto;

/**
 *
 * @author Daniel Jesús
 */
public class ProductoDAO extends Conexion {
    
    public ResultSet consulta(String sql) {
        ResultSet res = null;
        try {
            // conectarBD();
            PreparedStatement pstm = conexion.prepareStatement(sql);
            res = pstm.executeQuery();

        } catch (SQLException e) {
            System.err.println("Error consulta : " + e.getMessage());
        }
        return res;

    }

    public DefaultComboBoxModel Obt_Proveedor() {
        DefaultComboBoxModel listaModeloProveedor = new DefaultComboBoxModel();
        listaModeloProveedor.addElement("Seleccione un proveedor");
        conectarBD();
        ResultSet res = this.consulta("Select IdProveedor from proveedor ORDER BY IdProveedor ASC;");

        try {
            while (res.next()) {
                listaModeloProveedor.addElement(res.getString("IdProveedor"));
            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }
        return listaModeloProveedor;
    }

    public DefaultComboBoxModel Obt_Categoria() {
        DefaultComboBoxModel listaModeloProveedor = new DefaultComboBoxModel();
        listaModeloProveedor.addElement("Seleccione una categoria de productos");
        conectarBD();
        ResultSet res = this.consulta("Select IdCategoria from categoria ORDER BY IdCategoria ASC;");

        try {
            while (res.next()) {
                listaModeloProveedor.addElement(res.getString("IdCategoria"));
            }
           
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }
        return listaModeloProveedor;
    }

    public ResultSet cargarProducto() {

        try {
            obj_Procedimiento = getConexion().prepareCall("{Call buscarTodoProducto}");
            rs = obj_Procedimiento.executeQuery();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return rs;
    }

    public boolean guardarProducto(Producto producto) {
        boolean rpt = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL guardarProducto(?,?,?,?,?,?)}");
            obj_Procedimiento.setString(1, producto.getIdProducto());
            obj_Procedimiento.setString(2, producto.getNombreProducto());
            obj_Procedimiento.setDouble(3, producto.getPrecioUnidad());
            obj_Procedimiento.setInt(4, producto.getUnidadExistecia());
            obj_Procedimiento.setString(5, producto.getIdCategoria());
            obj_Procedimiento.setString(6, producto.getIdProveedor());
            rpt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return rpt;
    }

    public boolean editarProducto(Producto producto) {
        boolean rpt = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("CALL editarProducto(?,?,?,?,?,?)");
            obj_Procedimiento.setString(1, producto.getIdProducto());
            obj_Procedimiento.setString(2, producto.getNombreProducto());
            obj_Procedimiento.setDouble(3, producto.getPrecioUnidad());
            obj_Procedimiento.setInt(4, producto.getUnidadExistecia());
            obj_Procedimiento.setString(5, producto.getIdCategoria());
            obj_Procedimiento.setString(6, producto.getIdProveedor());
            rpt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return rpt;
    }
    
    public boolean eliminarProducto(String id){
        boolean rpt = false; 
        try {
            conectarBD();
            obj_Procedimiento =  getConexion().prepareCall("{CALL eliminarProducto(?)}");
            obj_Procedimiento.setString(1, id);
            rpt = obj_Procedimiento.executeUpdate()>=1;
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return rpt;
        
    }
    
    public Producto buscarProducto(String id){
        Producto producto = null;
        
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL buscarIdProducto(?)}");
            obj_Procedimiento.setString(1, id);
            
            rs =  obj_Procedimiento.executeQuery();
            if(rs.next()){
                producto = new Producto();
                producto.setIdProducto(rs.getString(1));
                producto.setNombreProducto(rs.getString(2));
                producto.setPrecioUnidad(rs.getDouble(3));
                producto.setUnidadExistecia((rs.getInt(4)));
                producto.setIdCategoria(rs.getString(5));  
                producto.setIdProveedor(rs.getString(6));
            }
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return producto;
    }
    
    public void cargarReporteProducto(){
        conectarBD();
        JasperReport reporte= null;
        JasperPrint reporte_view;
        URL in = this.getClass().getResource("/proyecto/programacion02/Reports/rptProducto.jasper");
        
        try {
            reporte = (JasperReport) JRLoader.loadObject(in);
            reporte_view = JasperFillManager.fillReport(reporte, null, getConexion());
           JasperViewer  jv = new JasperViewer(reporte_view, false);
       
            jv.setVisible(true); 
            jv.setTitle("Visor de Reporte");
        } catch (JRException ex) {
                System.err.println(ex.toString());
            }
    }
}
