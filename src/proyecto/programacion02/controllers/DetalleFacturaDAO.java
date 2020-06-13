/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion02.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import proyecto.programacion02.models.DetalleFactura;


/**
 *
 * @author Maria Arrierta
 */
public class DetalleFacturaDAO extends Conexion {
    public ResultSet cargarDetalle() {

        try {
            obj_Procedimiento = getConexion().prepareCall("{Call buscarTodoNumFactura}");
            rs = obj_Procedimiento.executeQuery();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return rs;
    }
    public boolean guardarDetalle(DetalleFactura detalle) {
        boolean rpt = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL agregarDetalle(?,?,?,?)}");
            obj_Procedimiento.setString(1, detalle.getNumFactura());
            obj_Procedimiento.setString(2, detalle.getIdProducto());
            obj_Procedimiento.setInt(3, detalle.getCantidad());
            obj_Procedimiento.setDouble(4, detalle.getPrecio());
            
            rpt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return rpt;
    }

   public DetalleFactura buscarDetalle(String num){
        DetalleFactura detalle= null;
        
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL buscarNumDetalle(?)}");
            obj_Procedimiento.setString(1, num);
            
            rs =  obj_Procedimiento.executeQuery();
            if(rs.next()){
                detalle = new DetalleFactura();
                detalle.setNumFactura(rs.getString(1));
                detalle.setIdProducto(rs.getString(2));
                detalle.setCantidad(rs.getInt(3));
                detalle.setPrecio(rs.getDouble(4));
          
            }
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return detalle;
    }    
}
