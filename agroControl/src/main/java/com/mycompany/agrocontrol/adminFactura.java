
package com.mycompany.agrocontrol;

public class adminFactura {


    
    static class Producto {
        String nombre;
        int cantidad;
        double valor;

        Producto(String nombre, int cantidad, double valor) {
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.valor = valor;
        }
    }
    static class Nodo {
        Producto producto;
        Nodo siguiente;

        Nodo(Producto producto) {
            this.producto = producto;
            this.siguiente = null;
        }
    }

    Nodo cabeza = null;
    double total = 0;

    public void agregarProducto(String nombre, int cantidad, double valor) {
        total += cantidad * valor;
        Producto producto = new Producto(nombre, cantidad, valor);
        Nodo nuevoNodo = new Nodo(producto);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo ultimo = cabeza;
            while (ultimo.siguiente != null) {
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = nuevoNodo;
        }
    }

    public void eliminarProductos() {
        cabeza = null;
        total = 0;
    }

    public double calcularTotal() {
        return total;
    }
    
}