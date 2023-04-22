
package com.mycompany.agrocontrol;

public class Inventario {
    private String tipoP;
    private String nombre;
    private String codigo;
    private int cantidad;
    private double costo;
    Inventario siguiente;

    public Inventario() {
    }

    public Inventario(String tipoP,String nombre, String codigo, int cantidad, double costo, Inventario siguiente) {
        this.tipoP = tipoP;
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.costo = costo;
        this.siguiente = siguiente;
    }

    public Inventario(String tipoP,String nombre, String codigo, int cantidad, double costo) {
        this.tipoP = tipoP;
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.costo = costo;
        siguiente= null;
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Inventario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Inventario siguiente) {
        this.siguiente = siguiente;
    }
    public void next (Inventario nuevo){
        siguiente = nuevo;
    }
    
}
