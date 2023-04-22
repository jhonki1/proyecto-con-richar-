
package com.mycompany.agrocontrol;

public class adminInventario {
    private Inventario inicio;
    private int tamañoInventario;

    public adminInventario() {
        inicio=null;
        tamañoInventario=0;
    }
    
    public int getTamañoInventario() {
        return tamañoInventario;
    }
    public void añadirCabezaI(String tipoP,String nombre, String codigo, int cantidad, double precioCompra){
        inicio = new  Inventario(tipoP,nombre, codigo,cantidad,precioCompra,inicio);
            
        tamañoInventario++;
    }
    public int tamaño (){
        return tamañoInventario;
    }
    public void modificaProducto (String elemento,String codigom,int cantid, double precioc){
        Inventario pointer= inicio;
        boolean encontrado = false;
        if (inicio!= null){
            while(pointer !=null && encontrado!= true){
                if (pointer.getNombre().equals(elemento)){
                    pointer.setCodigo(codigom);
                    pointer.setCantidad(cantid);
                    pointer.setCosto(precioc);
                    encontrado=true;
                }
                pointer=pointer.siguiente;
            }
            System.out.println("PRODUCTO MODIFICADO CORRECTAMENTE");
        }
        else {
            System.out.println("EL ELEMENTO NO SE ENCUENTRA EN LA LISTA");
        }
    }
    public void modificarc(int cantida){
        Inventario pointer = inicio;
        pointer.setCantidad(pointer.getCantidad()-cantida);
        
    }
    public void CantidadP(){
        int cantidad=0;
        Inventario pointer = inicio;
        while (pointer!= null){
            cantidad+=pointer.getCantidad();
            System.out.println("PRODUCTO: "+ pointer.getNombre()+ "\t|     "+ "CANTIDAD: "+ pointer.getCantidad());
            System.out.println("\n");
            pointer= pointer.siguiente;
        }
        System.out.println("_______________________________________");
        System.out.println("TOTAL CANTIDAD PRODUCTOS: "+ cantidad);
    }
    public void recorrerLista(){
        Inventario pointer = inicio;
        if(pointer == null){
            System.out.println("LA LISTA ESTA VACIA");
        } 
        else {
        }
        while(pointer!= null){
            System.out.println("TIPO PRODUCTO:  "+  pointer.getTipoP());
            System.out.println("NOMBRE: \t"+ pointer.getNombre());
            System.out.println("CODIGO: \t"+ pointer.getCodigo());
            System.out.println("CANTIDAD: \t"+ pointer.getCantidad());
            System.out.println("PRECIO COMPRA: "+pointer.getCosto());
            System.out.println("_________________________________________________");
            pointer= pointer.siguiente;
        }
    }
    public void buscarProducto(String elemento){
        Inventario pointer=inicio;
        boolean encontrado =false;
        int contador=0;
        while(pointer != null && encontrado != true){
            if (pointer.getTipoP().equals(elemento)){
                System.out.println("TIPO PRODUCTO:  "+  pointer.getTipoP());
                System.out.println("NOMBRE: \t"+ pointer.getNombre());
                System.out.println("CODIGO: \t"+ pointer.getCodigo());
                System.out.println("CANTIDAD: \t"+ pointer.getCantidad());
                System.out.println("PRECIO COMPRA:  "+pointer.getCosto());
                System.out.println("______________________________________________");
                contador++;
            }
            pointer=pointer.siguiente;
        } 
        System.out.println("HAY "+ contador +" ELEMENTOS DE TIPO "+ elemento);
        encontrado=true;
    }
    public void eliminarProductoI (String elemento){
        Inventario pointer= inicio;   
        boolean encontrado = false;
        if(inicio==null){
            encontrado=true;
        }
        else if(inicio.siguiente==null && inicio.getNombre().equals(elemento)){
            inicio=null;
            tamañoInventario--;
            encontrado=true;
        }
        else if(inicio.siguiente==null){
            encontrado=true;
        }
        while(encontrado!=true){
            while(pointer !=null && encontrado != true){
                if (inicio.getNombre().equals(elemento)){
                    encontrado =true;
                    inicio=inicio.siguiente;
                    tamañoInventario--;
                }
                else if (pointer.siguiente.getNombre().equals(elemento)){
                    encontrado = true;
                    pointer.siguiente=pointer.siguiente.siguiente;
                    tamañoInventario--;
                }
            }
            pointer=pointer.siguiente;
        
        }
    }
}
