/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion02;

/**
 *
 * @author Daniel Jesús
 */
public class Producto {
    public String IdProducto;
    public String nombreProducto;
    public String precioUnidad;
    public String unidadExistecia;
    public String IdProveedor;
    public String IdCategoria;

    public Producto() {
    }

    public Producto(String IdProducto, String nombreProducto, String precioUnidad, String unidadExistecia, String IdProveedor, String IdCategoria) {
        this.IdProducto = IdProducto;
        this.nombreProducto = nombreProducto;
        this.precioUnidad = precioUnidad;
        this.unidadExistecia = unidadExistecia;
        this.IdProveedor = IdProveedor;
        this.IdCategoria = IdCategoria;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(String precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public String getUnidadExistecia() {
        return unidadExistecia;
    }

    public void setUnidadExistecia(String unidadExistecia) {
        this.unidadExistecia = unidadExistecia;
    }

    public String getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(String IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public String getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(String IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "IdProducto=" + IdProducto + ", nombreProducto=" + nombreProducto + ", precioUnidad=" + precioUnidad + ", unidadExistecia=" + unidadExistecia + ", IdProveedor=" + IdProveedor + ", IdCategoria=" + IdCategoria + '}';
    }
    
    
    
}
