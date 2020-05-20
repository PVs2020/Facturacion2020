/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion02.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import proyecto.programacion02.models.Proveedor;

/**
 *
 * @author Daniel Jesús
 */
public class ProveedorDAO extends Conexion {
    
    public ResultSet cargarProveedor() {
        try {
            obj_Procedimiento = getConexion().prepareCall("{CALL proveedoreBuscarTodos}");
            rs = obj_Procedimiento.executeQuery();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return rs;
    }
    
    public Proveedor buscarProveedor(String id) {
        Proveedor proveedor = null;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL proveedorBuscarId(?)}");
            obj_Procedimiento.setString(1, id);
            rs = obj_Procedimiento.executeQuery();
            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setId(rs.getString(1));
                proveedor.setCompania(rs.getString(2));
                proveedor.setNombre(rs.getString(3));
                proveedor.setTelefono(rs.getString(4));
            }
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return proveedor;
    }
    
    public boolean guardarProveedor(Proveedor proveedor) {
        boolean rpt = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL proveedorGuardar(?,?,?,?)}");
             obj_Procedimiento.setString(1, proveedor.getId());
            obj_Procedimiento.setString(2, proveedor.getCompania());
            obj_Procedimiento.setString(3, proveedor.getNombre());
            obj_Procedimiento.setString(4, proveedor.getTelefono());
            rpt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return rpt;
    }
    
    public boolean eliminarProveedor(String id){
    boolean rtp = false;
    try{ 
    conectarBD();
    obj_Procedimiento = getConexion().prepareCall("{CALL proveedorEliminar(?)}");
    obj_Procedimiento.setString(1, id);
    rtp = obj_Procedimiento.executeUpdate()>=1;
    desconectarBD();
    }   catch (SQLException e) {
           System.err.println(e.getMessage());
        }
    return rtp;
}
    
    public boolean editarProveedor(Proveedor proveedor) {
        boolean rpt = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL proveedorActualizar(?,?,?,?)}");
            obj_Procedimiento.setString(1, proveedor.getId());
            obj_Procedimiento.setString(2, proveedor.getCompania());
            obj_Procedimiento.setString(3, proveedor.getNombre());
            obj_Procedimiento.setString(4, proveedor.getTelefono());
            rpt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return rpt;
    }
}
