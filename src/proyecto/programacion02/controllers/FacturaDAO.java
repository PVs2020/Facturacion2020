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

    public void cargarReporteFactura() {
        conectarBD();
        JasperReport reportes = null;
        JasperPrint reporte_view;
        URL in = this.getClass().getResource("/proyecto/programacion02/Reports/rptFactura.jasper");
        try {
            reportes = (JasperReport) JRLoader.loadObject(in);
            reporte_view = JasperFillManager.fillReport(reportes, null, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {

            System.err.println(ex.toString());
        }

    }
    
    public ResultSet cargarFactura() {

        try {
            obj_Procedimiento = getConexion().prepareCall("{Call buscarTodoNumFactura}");
            rs = obj_Procedimiento.executeQuery();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return rs;
    }
    public boolean guardarFactura(Factura factura) {
        boolean rpt = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL agregarFactura(?,?,?)}");
            obj_Procedimiento.setString(1, factura.getNumeroFactura());
            obj_Procedimiento.setString(2, factura.getFecha());
            obj_Procedimiento.setString(3, factura.getIdCliente());
            
            rpt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return rpt;
    }

    public boolean editarFactura(Factura factura) {
        boolean rpt = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("CALL editarFactura(?,?,?)");
            obj_Procedimiento.setString(1, factura.getNumeroFactura());
            obj_Procedimiento.setString(2, factura.getFecha());
            obj_Procedimiento.setString(3, factura.getIdCliente());
            rpt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return rpt;
    }
    
    public Factura buscarFactura(String num){
        Factura factura = null;
        
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL buscarNumFactura(?)}");
            obj_Procedimiento.setString(1, num);
            
            rs =  obj_Procedimiento.executeQuery();
            if(rs.next()){
                factura = new Factura();
                factura.setNumeroFactura(rs.getString(1));
                factura.setFecha(rs.getString(2));
                factura.setIdCliente(rs.getString(3));
          
            }
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return factura;
    }
}
