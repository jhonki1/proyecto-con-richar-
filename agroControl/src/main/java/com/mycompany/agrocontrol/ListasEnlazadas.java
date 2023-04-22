
package com.mycompany.agrocontrol;

import static java.awt.AWTEventMulticaster.remove;


public class ListasEnlazadas {
    private Producto cabeza;
    private int tamaño;

    public int getTamaño() {
        return tamaño;
    }
    
    
    public ListasEnlazadas(){
        cabeza= null;
        tamaño = 0;
    }
    public void añadirCabeza(String tipoP,String nombre, String codigo, int cantidad, double precioCompra, double precioVenta){
        cabeza = new Producto (tipoP,nombre, codigo, cantidad, precioCompra, precioVenta, cabeza);
        tamaño++;
    }
    public void recorrerLista(){
        
        Producto pointer = cabeza;
        if(pointer == null){
            System.out.println("LA LISTA ESTA VACIA");
        } else {
        }
        while(pointer!= null){
            System.out.println("TIPO PRODUCTO:  "+ pointer.getTipoP());
            System.out.println("NOMBRE: \t"+ pointer.getNombre());
            System.out.println("CODIGO: \t"+ pointer.getCodigo());
            System.out.println("CANTIDAD: \t"+ pointer.getCantidad());
            System.out.println("PRECIO COMPRA:  "+pointer.getPrecioCompra());
            System.out.println("PRECIO VENTA:   "+ pointer.getPrecioVenta());
            System.out.println("___________________________________________");
            pointer= pointer.siguiente;
            
        }
        
    }
    public void modificaProducto (String elemento,String codigom,int cantid, double precioc, double precio){
        Producto pointer= cabeza;
        boolean encontrado = false;
        if (cabeza!= null){
            while(pointer !=null && encontrado!= true){
                if (pointer.getNombre().equals(elemento)){
                    pointer.setCodigo(codigom);
                    pointer.setCantidad(cantid);
                    pointer.setPrecioCompra(precioc);
                    pointer.setPrecioVenta(precio);
                    encontrado=true;
                }
                pointer=pointer.siguiente;
            }
            
        }
        else {
           
        }
    }
    
    public void modificarPrecio (String elemento, double precio){
        Producto pointer= cabeza;
        boolean encontrado = false;
        if (cabeza!= null){
            while(pointer !=null && encontrado!= true){
                if (pointer.getNombre().equals(elemento)){
                  
                    pointer.setPrecioVenta(precio);
                    encontrado=true;
                }
                pointer=pointer.siguiente;
            }
            
        }
        else {
            System.out.println("EL ELEMENTO NO SE ENCUENTRA EN LA LISTA");
        }
    }


    public void buscarProducto(String elemento){
        Producto pointer=cabeza;
        boolean encontrado =false;
        int contador=0;
        while(pointer != null && encontrado != true){
            if (pointer.getNombre().equals(elemento)){
                System.out.println("TIPO PRODUCTO:  "+  pointer.getTipoP());
                System.out.println("NOMBRE: \t"+ pointer.getNombre());
                System.out.println("CODIGO: \t"+ pointer.getCodigo());
                System.out.println("CANTIDAD: \t"+ pointer.getCantidad());
                System.out.println("PRECIO COMPRA:  "+pointer.getPrecioCompra());
                System.out.println("PRECIO VENTA:   "+pointer.getPrecioVenta());
                System.out.println("______________________________________________");
                encontrado = true;
                
            }
            else{
                System.out.println(elemento + "- NO ESTA EN LA LISTA");
            }
            pointer=pointer.siguiente;
        } 
    }
    public void eliminarProducto (String elemento){
        Producto pointer= cabeza;   
        boolean encontrado = false;
        if(cabeza==null){
            System.out.println("NO HAY ELEMENTOS EN LA LISTA \n"
                    + "INGRESE EN EL MENU DE PRODUCTOS EN LA OPCION 1");
            encontrado=true;
        }
        else if(cabeza.siguiente==null&&cabeza.getNombre().equals(elemento)){
            cabeza=null;
            System.out.println("PRODUCTO ELIMINADO CORRECTAMENTE");
            tamaño--;
            encontrado=true;
        }
        else if (cabeza.siguiente==null){
            if(!cabeza.getNombre().equals(elemento)){
                System.out.println("EL PRODUCTO NO EXISTE EN LA LISTA, REVISE SUS PRODUCTOS EN EL MENU DE PRODUCTOS EN LA OPCION 4");
                encontrado=true;
            }    
        }
        while(encontrado!=true){
            while(pointer !=null && encontrado != true){
                if (cabeza.getNombre().equals(elemento)){
                    encontrado =true;
                    cabeza=cabeza.siguiente;
                    tamaño--;
                    System.out.println("PRODUCTO ELIMINADO CORRECTAMENTE");
                }
                else if (pointer.siguiente.getNombre().equals(elemento)){
                    encontrado = true;
                    pointer.siguiente=pointer.siguiente.siguiente;
                    System.out.println("PRODUCTO ELIMINADO CORRECTAMENTE");
                    tamaño--;
                    
                }
                    
                else{
                    System.out.println("EL PRODUCTO NO EXISTE EN LA LISTA, REVISE SUS PRODUCTOS EN EL MENU DE PRODUCTOS EN LA OPCION 4");
                    encontrado=true;
                }
                
                pointer=pointer.siguiente;
            }
        }       
    }
    public void modificarCantidad(int cantidad){
        Producto pointer=cabeza;
        pointer.setCantidad(pointer.getCantidad()-cantidad);
    }
    public boolean ListaVacia(){
        return (cabeza==null)?true:false;
    }
}