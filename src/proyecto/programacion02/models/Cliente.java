/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    public Cliente(String direccion, String fax, String id, String nombre, String telefono) {
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
