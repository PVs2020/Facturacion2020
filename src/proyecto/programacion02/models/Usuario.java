
package proyecto.programacion02.models;

/**
 *
 * @author reymo
 */
public class Usuario {
    
    private String usuario;
    private String contra;
    private String estado;
    private String tipo;

    public Usuario() {
        
    }

    public Usuario(String usuario, String contraseña, String estado, String tipo) {
        this.usuario = usuario;
        this.contra = contraseña;
        this.estado = estado;
        this.tipo = tipo;
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

    public void setContraseña(String contraseña) {
        this.contra = contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contra=" + contra + ", estado=" + estado + ", tipo=" + tipo + '}';
    }

    
    
}
