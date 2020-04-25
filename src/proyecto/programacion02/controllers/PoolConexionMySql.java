
package proyecto.programacion02.controllers;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Reymond
 */
public class PoolConexionMySql {
    
    MysqlDataSource ds_con;
    
    public PoolConexionMySql()  {
       
            ds_con = new MysqlConnectionPoolDataSource();
            ds_con.setServerName("localhost");
            ds_con.setPort(3306);
            ds_con.setDatabaseName("proyecto");
            ds_con.setUser("root");
            ds_con.setPassword("root"); 
    }
    
       
     PoolConexionMySql(int servidor) {
        try {
            ds_con = new MysqlConnectionPoolDataSource();
            switch (servidor) {
               case 1:
                   
                   ds_con.setServerName("localhost");
                   ds_con.setPort(3306);
                   ds_con.setLoginTimeout(5);
                   ds_con.setDatabaseName("proyecto");
                   ds_con.setUser("root");
                   ds_con.setPassword("root");
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
            System.out.println("Unica conexión establecida");
        } catch (SQLException ex) {
            Logger.getLogger(PoolConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
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
