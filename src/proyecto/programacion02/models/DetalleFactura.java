/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion02.models;

/**
 *
 * @author Maria Arrierta
 */
public class DetalleFactura {
    public String numFactura;
    public String idProducto;
    public int cantidad;
    public double precio;

    public DetalleFactura() {
    }

    public DetalleFactura(String numFactura, String idProducto, int cantidad, double precio) {
        this.numFactura = numFactura;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "numFactura=" + numFactura + ", idProducto=" + idProducto + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
}
