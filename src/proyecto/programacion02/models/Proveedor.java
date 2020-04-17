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
public class Proveedor extends Persona{
    
    public String compania;

    public Proveedor() {
        
    }

    public Proveedor(String compania, String id, String nombre, String telefono) {
        super(id, nombre, telefono);
        this.compania = compania;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return super.toString() + "Proveedor{" + "compania=" + compania + '}';
    }
    
    
    
}
