/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion02.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author reymo
 */
public class VentasDAO extends Conexion{
    
   public ResultSet cargarDatosVentas(){
        try {
            obj_Procedimiento = getConexion().prepareCall("{CALL cargarVentas}");
            rs = obj_Procedimiento.executeQuery();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            
        }
        return rs;
    }
    
}
