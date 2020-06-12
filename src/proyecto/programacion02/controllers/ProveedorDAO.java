
package proyecto.programacion02.controllers;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
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
    
    public void cargarReporteCategoria() {

        conectarBD();
        JasperReport reportes;
        JasperPrint reporte_view;
        try {
            URL in = this.getClass().getResource("/proyecto/programacion02/Reports/rptProveedor.jasper");
            reportes = (JasperReport) JRLoader.loadObject(in);
            reporte_view = JasperFillManager.fillReport(reportes, null, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {

            System.err.println(ex.toString());
        }
    }
}
