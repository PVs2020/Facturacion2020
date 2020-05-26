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

   public class Producto {
    public String idProducto;
    public String nombreProducto;
    public double precioUnidad;
    public int unidadExistecia;
    public String idProveedor;
    public String idCategoria;

    public Producto() {
    }

    public Producto(String idProducto, String nombreProducto, double precioUnidad,
            int unidadExistecia, String idProveedor, String idCategoria) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioUnidad = precioUnidad;
        this.unidadExistecia = unidadExistecia;
        this.idProveedor = idProveedor;
        this.idCategoria = idCategoria;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getUnidadExistecia() {
        return unidadExistecia;
    }

    public void setUnidadExistecia(int unidadExistecia) {
        this.unidadExistecia = unidadExistecia;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" 
                + nombreProducto + ", precioUnidad=" + precioUnidad + ", unidadExistecia=" 
                + unidadExistecia + ", idProveedor=" 
                + idProveedor + ", idCategoria=" + idCategoria + '}';
    }
    
    
    
    
}
