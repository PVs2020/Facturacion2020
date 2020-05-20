
package proyecto.programacion02.controllers;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reymond 
 */
public class Conexion {
    
    static PoolConexionMySql poolConexion;
    protected static int servidor;
    static protected Connection conexion;
    protected CallableStatement obj_Procedimiento;
    protected Statement stmt;
    protected ResultSet rs; 
    
    public Conexion (){
       obj_Procedimiento = null;
       if(poolConexion == null){
           poolConexion = new PoolConexionMySql(servidor);
       }
    }
    
    public static void setServidor(int servidor){
        Conexion.servidor = servidor;
        
    }
        
    public synchronized boolean conectarBD() {
        conexion = poolConexion.getConexion();
        if (conexion != null) {
            System.out.print("Conexion obtenida\t");
            return true;
        } else {
           
            return false;
        }
    }
      
    public synchronized void desconectarBD() {

        if (obj_Procedimiento != null) {
            try {
                obj_Procedimiento.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            } // nothing we can do
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            } // nothing we can do
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            } // nothing we can do
        }
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexion devuelta");
            } catch (SQLException e) {
            } // nothing we can do
        }
    }
    
    public synchronized ResultSet seleccionar(String sql) {
        try {
            stmt = conexion.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return rs;
    }
    
    public synchronized void ejecutar(String sql) throws SQLException {
        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw ex;
        }
    }
    
    public Connection getConexion() {
        return conexion;
    }
    
    public synchronized DefaultTableModel cargarEnTabla(ResultSet rs) {
        DefaultTableModel modelo = null;
        ResultSetMetaData metaDatos;
        Object[] etiquetas;

        final int numeroColumnas;
        try {
            metaDatos = rs.getMetaData();
            numeroColumnas = metaDatos.getColumnCount();
            etiquetas = new Object[numeroColumnas];
            // Se obtiene cada una de las etiquetas para cada columna
            for (int i = 0; i < numeroColumnas; i++) {
                // Nuevamente, para ResultSetMetaData la primera columna es la 1.
                etiquetas[i] = metaDatos.getColumnLabel(i + 1).toUpperCase();
            }

            modelo = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    etiquetas) {
                        boolean[] canEdit = new boolean[numeroColumnas];

                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit[columnIndex];
                        }
                    };

            while (rs.next()) {
                // Se crea un array que será una de las filas de la tabla.
                Object[] fila = new Object[numeroColumnas]; // Hay tres columnas en la tabla

                // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
                for (int i = 0; i < numeroColumnas; i++) {
                    fila[i] = rs.getObject(i + 1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                }
                // Se añade al modelo la fila completa.
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return modelo;
    }

   
    
    
}
