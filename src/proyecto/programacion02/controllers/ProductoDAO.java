/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion02.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
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
        ResultSet res = this.consulta("Select Compania from proveedor ORDER BY Compania ASC;");

        try {
            while (res.next()) {
                listaModeloProveedor.addElement(res.getString("Compania"));
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
        ResultSet res = this.consulta("Select NombreCategoria from categoria ORDER BY NombreCategoria ASC;");

        try {
            while (res.next()) {
                listaModeloProveedor.addElement(res.getString("NombreCategoria"));
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
            obj_Procedimiento.setString(5, producto.getIdProveedor());
            obj_Procedimiento.setString(6, producto.getIdCategoria());
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
            obj_Procedimiento.setString(5, producto.getIdProveedor());
            obj_Procedimiento.setString(6, producto.getIdCategoria());
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
                producto.setIdProveedor(rs.getString(5));
                producto.setIdCategoria(rs.getString(6));  
            }
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return producto;
    }
}
