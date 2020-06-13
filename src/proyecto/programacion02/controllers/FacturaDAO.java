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
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static proyecto.programacion02.controllers.Conexion.conexion;
import proyecto.programacion02.models.Factura;

/**
 *
 * @author Emma
 */
public class FacturaDAO extends Conexion{
    
    
    
    public void GuardarFactura(String datosFactura, ArrayList<String> itemsFactura) {
        conectarBD();
        ejecutar(datosFactura);
        System.out.println(datosFactura);
        for(String string : itemsFactura){
        ejecutar(string);
        }
        desconectarBD();        
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

    public void cargarReporteFactura(String numeroFactura) {
         conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
            URL in = this.getClass().getResource("/reportes/rptCliente.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            HashMap parametros = new HashMap();
            parametros.clear();
            parametros.put("numeroFactura", numeroFactura);
            
            reporte_view = JasperFillManager.fillReport(reporte, parametros, conexion);
            JasperViewer.viewReport(reporte_view, false); } 
        catch (JRException ex) {
                System.err.println(ex.toString());
                desconectarBD();
            }
    }
}
