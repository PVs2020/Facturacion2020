
package proyecto.programacion02.controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;





/**
 *
 * @author Reymond Ponce 
 */
public class ProductosDAO extends Conexion{
    
    
    public ResultSet consulta(String sql){
    ResultSet res = null; 
        try {
           // conectarBD();
            PreparedStatement pstm = conexion.prepareStatement(sql);
            res = pstm.executeQuery();
           
            
        } catch (SQLException e) {
            System.err.println("Error consulta : "+ e.getMessage());
        }
        return res;
       
    }
    
    public DefaultComboBoxModel Obt_Proveedor(){
        DefaultComboBoxModel listaModeloProveedor = new DefaultComboBoxModel();
        listaModeloProveedor.addElement("Seleccione un proveedor");
        conectarBD();
        ResultSet res =  this.consulta("Select Compañia from proveedor ORDER BY Compañia ASC;");
        
        try {
            while(res.next()){
                listaModeloProveedor.addElement(res.getString("Compañia"));
            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            
        }
        return listaModeloProveedor;
    }
    
    public DefaultComboBoxModel Obt_Categoria(){
        DefaultComboBoxModel listaModeloProveedor = new DefaultComboBoxModel();
        listaModeloProveedor.addElement("Seleccione un proveedor");
        conectarBD();
        ResultSet res =  this.consulta("Select Compañia from proveedor ORDER BY Compañia ASC;");
        
        try {
            while(res.next()){
                listaModeloProveedor.addElement(res.getString("Compañia"));
            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            
        }
        return listaModeloProveedor;
    }
      
    public ResultSet cargarproducto() {
        
            try {
                obj_Procedimiento = getConexion().prepareCall("{Call buscarProducto}");
                rs = obj_Procedimiento.executeQuery();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            return rs;
        }
    

      
    
}
