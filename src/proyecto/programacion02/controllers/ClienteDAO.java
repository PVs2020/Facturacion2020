
package proyecto.programacion02.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Reymond
 */
public class ClienteDAO extends Conexion {
    
    public ResultSet cargarCliente() {
        try {

            obj_Procedimiento = getConexion().prepareCall("CALL clienteBuscarTodos");
            rs = obj_Procedimiento.executeQuery();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return rs;
    }
    
    
}
