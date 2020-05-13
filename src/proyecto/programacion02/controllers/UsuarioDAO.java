
package proyecto.programacion02.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import proyecto.programacion02.models.Usuario;

/**
 *
 * @author Reymond
 */
public class UsuarioDAO extends Conexion {
    public ResultSet cargarUsuario(){
        try{
            obj_Procedimiento = getConexion().prepareCall("{CALL usuarioBuscarTodos}");
            rs = obj_Procedimiento.executeQuery();
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return rs;
    }
    
    public boolean guardarUsuario(Usuario usuario){
        
        boolean rpt = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL usuarioAgregar(?,?,?)}");
            obj_Procedimiento.setString(1, usuario.getUsuario());
            obj_Procedimiento.setString(2, usuario.getContraseña());
            obj_Procedimiento.setString(3, usuario.getEstado());
            rpt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return rpt;
       
    }
    
    public Usuario buscarUsuario(String usuario) {

        Usuario usua = null;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL usuarioBuscarId(?)}");
            obj_Procedimiento.setString(1, usuario);
            rs = obj_Procedimiento.executeQuery();
            if (rs.next()) {
                usua = new Usuario();
                usua.setUsuario(rs.getString(1));
                usua.setContraseña(rs.getString(2));
                usua.setEstado(rs.getString(3));
                usua.setTipo(rs.getString(4));
            }
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return usua;
    } 
    
    public boolean eliminarUsuario(String usu) {
        boolean rtp = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL usuarioEliminar(?)}");
            obj_Procedimiento.setString(1, usu);
            rtp = obj_Procedimiento.executeUpdate() >= 1;
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return rtp;
    }
    
      
    public boolean editarUsuario(Usuario usuario) {
        boolean rpt = false;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL usuarioActualizar(?,?,?)}");
            obj_Procedimiento.setString(1, usuario.getUsuario());
            obj_Procedimiento.setString(2, usuario.getContraseña());
            obj_Procedimiento.setString(3, usuario.getEstado());
            rpt = obj_Procedimiento.executeUpdate() == 1;
            desconectarBD();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return rpt;
    }
    public boolean Login(Usuario usua) {

        //Usuario usua = null;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL usuarioBuscarId(?)}");
            obj_Procedimiento.setString(1, usua.getUsuario());
            rs = obj_Procedimiento.executeQuery();
            if (rs.next()) {
                if (usua.getContraseña().equals(rs.getString(2))) {
                    usua.setUsuario(rs.getString(1));
                    //  usua.setContraseña(rs.getString(2));
                    usua.setEstado(rs.getString(3));
                    usua.setTipo(rs.getString(4));
                    return true;
                } else {
                    return false;
                }
            }
            desconectarBD();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;

    }

    public boolean estadoLogin(Usuario usua) {

        //Usuario usua = null;
        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL usuarioBuscarId(?)}");
            obj_Procedimiento.setString(1, usua.getUsuario());
            rs = obj_Procedimiento.executeQuery();
            if (rs.next()) {
                if (usua.getEstado().equals(rs.getString(3))) {
                    usua.setUsuario(rs.getString(1));
                    usua.setContraseña(rs.getString(2));
                    // usua.setEstado(rs.getString(3));
                    usua.setTipo(rs.getString(4));
                    return true;
                } else {
                    return false;
                }
            }
            desconectarBD();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;

    }
}
