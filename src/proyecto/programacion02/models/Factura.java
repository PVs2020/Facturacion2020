/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.programacion02.models;

/**
 *
 * @author Emma
 */
public class Factura {

    
    public String numeroFactura;
    public String idCliente;
    public String Fecha;


    public Factura() {
    }

    public Factura(String numeroFactura, String idCliente, String Fecha) {
        this.numeroFactura = numeroFactura;
        this.idCliente = idCliente;
        this.Fecha = Fecha;
    }
    
 public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
     @Override
    public String toString() {
        return "Factura{" + "numeroFactura=" + numeroFactura + ", idCliente=" + idCliente + ", Fecha=" + Fecha + '}';
    }
}
