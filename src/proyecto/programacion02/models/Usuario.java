
package proyecto.programacion02.models;

/**
 *
 * @author reymo
 */
public class Usuario {
    
    private String usuario;
    private String contra;
    private String estado;

    public Usuario() {
        
    }

    public Usuario(String usuario, String contraseña, String estado) {
        this.usuario = usuario;
        this.contra = contra;
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contra;
    }

    public void setContraseña(String contra) {
        this.contra = contra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contra=" + contra + ", estado=" + estado + '}';
    }
    

    
    
}
