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
public class Categoria {
    
    public String IdCategoria;
    public String nombreCategoria;
    public String descripcion;

    public Categoria() {
    }

    public Categoria(String IdCategoria, String nombreCategoria, String descripcion) {
        this.IdCategoria = IdCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcion = descripcion;
    }

    public String getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(String IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" + "IdCategoria=" + IdCategoria + ", nombreCategoria=" + nombreCategoria + ", descripcion=" + descripcion + '}';
    }

    
    
    
}
