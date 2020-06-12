
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
import proyecto.programacion02.models.Categoria;


/**
 *
 * @author Emma
 */
public class CategoriaDAO extends Conexion {
     public ResultSet cargarDatosCategoria(){
    
        try {
            obj_Procedimiento = getConexion().prepareCall("{CALL categoriasBuscarTodos}");
            rs = obj_Procedimiento.executeQuery();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            
        }
        return rs;
    }
    public boolean GuardarCategoria(Categoria cat) {
        boolean rpta = false;
        try {
            //Nos conectamos
            conectarBD();
            //Busca los datos del profesor
            String call = "{CALL categoriaGuardar(?,?,?)}";
            //Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            //Identificacion
            obj_Procedimiento.setString(1, cat.getIdCategoria());
            obj_Procedimiento.setString(2, cat.getNombreCategoria());
            obj_Procedimiento.setString(3, cat.getDescripcion());
         

            rpta = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);
        }
        return rpta;
    }
             public boolean editarCategoria(Categoria cat){
     
          boolean rpta = false;
        try {
            //Nos conectamos
            conectarBD();
            //Busca los datos del profesor
            String call = "{CALL categoriaActualizar(?,?,?)}";
            //Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            //Identificacion
            obj_Procedimiento.setString(1, cat.getIdCategoria());
            obj_Procedimiento.setString(2, cat.getNombreCategoria());
            obj_Procedimiento.setString(3, cat.getDescripcion());
         
     
               rpta = obj_Procedimiento.executeUpdate() ==1;
            desconectarBD();
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);

        }
        return rpta;
     
   
     }
    public boolean eliminarCategoria(String IdCategoria) {
        boolean rpt = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL categoriaEliminar(?)}");
            obj_Procedimiento.setString(1, IdCategoria);
            rpt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();
        } catch (SQLException e) {

            System.err.println(e.getMessage());
        }

        return rpt;
    }
    public Categoria buscarCategoria(String IdCategoria){

        Categoria cat = null;

        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL categoriaBuscarId(?)}");
            obj_Procedimiento.setString(1, IdCategoria);
            rs = obj_Procedimiento.executeQuery();
            if (rs.next()) {
                cat = new Categoria();
                cat.setIdCategoria(rs.getString(1));
                cat.setNombreCategoria(rs.getString(2));
                cat.setDescripcion(rs.getString(3));
              
               
            }
            desconectarBD();
        } catch (SQLException e) {

            System.err.println(e.getMessage());
        }
        return cat;
    } 
//    
        public void cargarReporteCategoria() {

        conectarBD();
        JasperReport reportes;
        JasperPrint reporte_view;
        try {
            URL in = this.getClass().getResource("/proyecto/programacion02/Reports/rptCategoria.jasper");
            reportes = (JasperReport) JRLoader.loadObject(in);
            reporte_view = JasperFillManager.fillReport(reportes, null, getConexion());
            JasperViewer.viewReport(reporte_view, false);
        } catch (JRException ex) {

            System.err.println(ex.toString());
        }

    }
}
