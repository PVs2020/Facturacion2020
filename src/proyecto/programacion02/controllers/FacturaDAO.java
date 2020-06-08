/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion02.controllers;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import static proyecto.programacion02.controllers.Conexion.conexion;
import proyecto.programacion02.models.Factura;

/**
 *
 * @author Emma
 */
public class FacturaDAO extends Conexion{
    
    
    
    public void insertarfactura(String datosfactura, ArrayList<String> itemsFactura) {
        conectarBD();
        
        
        
    }

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
    
    public DefaultComboBoxModel Obt_Producto() {

        DefaultComboBoxModel listaProducto = new DefaultComboBoxModel();
        listaProducto.addElement("Seleccione un producto");
        conectarBD();
        ResultSet resul = this.consulta("Select Nombre from producto ORDER BY Nombre ASC;");

        try {
            while (resul.next()) {
                listaProducto.addElement(resul.getString("Nombre"));
            }
            resul.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }
        return listaProducto;
    }

    public void cargarReporteFactura(String text) {
        
    }
}
