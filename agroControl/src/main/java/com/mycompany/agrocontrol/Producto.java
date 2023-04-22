
package com.mycompany.agrocontrol;

/**
 *
 * @author usuario
 */
public class Producto {
    private String tipoP;
    private String nombre;
    private String codigo;
    private int cantidad;
    private double precioCompra;
    private double precioVenta;
    Producto siguiente;

    public Producto() {
    }

    public Producto(String nombre, String codigo, double precioVenta) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precioVenta = precioVenta;
    }
    
    public Producto(String tipoP,String nombre, String codigo, int cantidad, double precioCompra, double precioVenta, Producto siguiente) {
        this.tipoP = tipoP;
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.siguiente = siguiente;
    }

    public Producto(String tipoP,String nombre, String codigo, int cantidad, double precioCompra, double precioVenta) {
        this.tipoP = tipoP;
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        siguiente=null;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Producto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Producto siguiente) {
        this.siguiente = siguiente;
    }
    public void enlazarSiguiente(Producto nuevo){
        siguiente = nuevo;
    }
    
}
