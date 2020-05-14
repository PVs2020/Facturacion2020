
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
import proyecto.programacion02.models.Cliente;


/**
 *
 * @author Reymond
 */
public class ClienteDAO extends Conexion {
    
    public ResultSet cargarCliente() {
        try {

            obj_Procedimiento = getConexion().prepareCall("{CALL clienteBuscarTodos}");
            rs = obj_Procedimiento.executeQuery();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return rs;
    }
    public boolean guardarCliente(Cliente cliente) {
        boolean rpt = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL clienteGuardar(?,?,?,?,?)}");
            obj_Procedimiento.setString(1, cliente.getId());
            obj_Procedimiento.setString(2, cliente.getNombre());
            obj_Procedimiento.setString(3, cliente.getDireccion());
            obj_Procedimiento.setString(4, cliente.getTelefono());
            obj_Procedimiento.setString(5, cliente.getFax());
            rpt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return rpt;
    }
    public boolean editarCliente(Cliente Cliente) {
        boolean rpt = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL clienteActulizar(?,?,?,?,?)}");
            obj_Procedimiento.setString(1, Cliente.getId());
            obj_Procedimiento.setString(2, Cliente.getNombre());
            obj_Procedimiento.setString(3, Cliente.getDireccion());
            obj_Procedimiento.setString(4, Cliente.getTelefono());
            obj_Procedimiento.setString(5, Cliente.getFax());
            rpt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return rpt;
    }
    public boolean eliminarCliente(String Id){
        boolean rpt = false;
      try{ 
    conectarBD();
    obj_Procedimiento = getConexion().prepareCall("{CALL clienteEliminar(?)}");
    obj_Procedimiento.setString(1, Id);
    rpt = obj_Procedimiento.executeUpdate()>=1;
    desconectarBD();
    }   catch (SQLException e) {
           System.err.println(e.getMessage());
        }
    return rpt;
    }
    public Cliente buscarCliente(String Id) {
        Cliente cliente = null;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL clienteBuscarId(?)}");
            obj_Procedimiento.setString(1, Id);
            rs = obj_Procedimiento.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getString(1));
                cliente.setNombre(rs.getString(2));
                cliente.setDireccion(rs.getString(3));
                cliente.setTelefono(rs.getString(4));
                cliente.setFax(rs.getString(5));
                }
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return cliente;
        
    }
    public void cargarReporteCliente(){
        conectarBD();
        JasperReport reporte= null;
        JasperPrint reporte_view;
        URL in = this.getClass().getResource("/proyecto/programacion02/Reports/rptCliente.jasper");
        
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
