
package proyecto.programacion02.models;

/**
 *
 * @author Daniel Jesús
 */
public class Cliente extends Persona {
    
    public String direccion;
    public String fax;

    public Cliente() {
    }

    public Cliente( String id, String nombre, String telefono,String direccion, String fax) {
        super(id, nombre, telefono);
        this.direccion = direccion;
        this.fax = fax;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "direccion=" + direccion + ", fax=" + fax + '}';
    }
    
    
    
    
}
