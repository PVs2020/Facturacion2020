
package proyecto.programacion02.controllers;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;


/**
 *
 * @author reymo
 */
public class PoolConexionMySql {
    
    MysqlDataSource ds_con;
    
    public PoolConexionMySql(){
       
        ds_con = new MysqlConnectionPoolDataSource();
        ds_con.setServerName("localhost");
        ds_con.setPort(3306);
        ds_con.setDatabaseName("proyecto");
        ds_con.setUser("root");
        ds_con.setPassword("root");
        
    }
    
    public Connection getConexion(){
        try {
            return ds_con.getConnection();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Se perdio la conexion con el servidor :(",
                    "Conexion al servidor", JOptionPane.ERROR_MESSAGE);
            System.err.println(ex.getMessage());
        }
        return null;
    }
            
    
    
}
