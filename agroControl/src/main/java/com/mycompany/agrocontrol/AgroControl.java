

package com.mycompany.agrocontrol;
import java.util.Scanner;

public class AgroControl {

    public static void main(String[] args) {
        ListasEnlazadas productos =new ListasEnlazadas();
        adminInventario inventario = new adminInventario();
        Scanner sc = new Scanner (System.in);
        String nombre,codigo, tipo;
        boolean bandera = true;
        int opcion, caso1, caso2,caso3, cantidad;
        double precioCompra, precioVenta;
        System.out.println("\t \t \t \t AGRO-VETERINARIA \nBIENVENIDO AL SISTEMA DE INVENTARIO");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("");
        while(bandera){
            do {
                System.out.println("INGRESE EL NUMERO DE LA OPERACION QUE VA A REALIZAR");
                System.out.println("1. PRODUCTOS \n2. BUSCAR INVENTARIO2 \n3. FACTURA");
                opcion =Integer.parseInt(sc.nextLine());
                switch(opcion){
                    case 1:
                        System.out.println("A INGRESANDO AL MODULO DE PRODUCTOS, DIGITE");
                        System.out.println(" 1.AGREGAR PRODUCTOS\n 2.MODIFICAR PRECIO PRODUCTO\n 3.ELIMINAR PRODUCTO\n 4.LISTA PRODUCTOS\n 5.BUSCAR PRODUCTO ");
                        caso1= Integer.parseInt(sc.nextLine());
                        switch(caso1){
                            case 1:
                                System.out.println("***AGREGAR PRODUCTO***");
                                System.out.println("DIGITE EL TIPO DE PRODUCTO");
                                tipo=(sc.nextLine());
                                System.out.println("DIGITE EL NOMBRE DEL PRODUCTO");
                                nombre=(sc.nextLine());
                                System.out.println("DIGITE EL CODIGO DEL PRODUCTO");
                                codigo=(sc.nextLine());
                                System.out.println("DIGITE LA CANTIDAD DEL PRODUCTO");
                                cantidad=Integer.parseInt(sc.nextLine());
                                System.out.println("DIGITE EL PRECIO DE COMPRA");
                                precioCompra=Double.parseDouble(sc.nextLine());
                                System.out.println("DIGITE EL PRECIO DE VENTA");
                                precioVenta=Double.parseDouble(sc.nextLine());
                                productos.añadirCabeza(tipo,nombre, codigo, cantidad, precioCompra, precioVenta);
                                inventario.añadirCabezaI(tipo,nombre, codigo, cantidad, precioCompra);
                                System.out.println("SE REGISTRO LA INFORMACION DE FORMA CORRECTA");
                                break;
                                
                            case 2:
                                String nuevo = null, nombren, codigon, tipon;
                                double precio=0.0 , precioc=0;
                                int cantidadn=0;
                                System.out.println("***MODIFICAR PRECIO VENTA DEL PRODUCTO***");
                                System.out.println("EL CAMPO QUE NO VAYA A MODIFICAR VUELVALO A PONER COMO ESTABA");
                                System.out.println("DIGITE EL NOMBRE DEL PRODUCTO");
                                nuevo=(sc.nextLine());
                                System.out.println("DIGITE EL NUEVO PRECIO DE VENTA DEL PRODUCTO");
                                precio= Integer.parseInt(sc.nextLine());
                                productos.modificarPrecio(nuevo, precio);
                                //inventario.modificarPrecio(nuevo, precioc);
                                
                                break;



                            case 3:
                                System.out.println("***ELIMINAR PRODUCTO***");
                                String nombrenn;
                                System.out.println("LISTA DE PRODUCTOS");
                                productos.recorrerLista();
                                System.out.println("DIGITE EL NOMBRE DEL PRODUCTO A ELIMINAR");
                                nombrenn=(sc.nextLine());
                                productos.eliminarProducto(nombrenn);
                                inventario.eliminarProductoI(nombrenn);
                                break;
                             
                            case 4:
                                System.out.println("***LISTA DE PRODUCTOS***");
                                productos.recorrerLista();
                                break;
                            case 5:
                                System.out.println("***BUSCAR PRODUCTO POR NOMBRE***");
                                String nombreee;
                                System.out.println("INGRESE EL NOMBRE DEL PRODUCTO A BUSCAR"
                                        + ",DEBE RECORDARLO MUY BIEN");
                                nombreee=(sc.nextLine());
                                productos.buscarProducto(nombreee);
                        }
                        break;
                    case 2 :
                        System.out.println("INGRESANDO AL MODULO DE INVENTARIO, DIGITE");
                        System.out.println("1. CONOCER INVENTARIO\n2. MODIFICAR PRODUCTO,"
                                + "\n3. BUSCAR POR TIPO DE PRODUCTO");
                        caso2=Integer.parseInt(sc.nextLine());
                        switch(caso2){
                            case 1:
                                System.out.println("***CONOCER LA CANTIDAD DE PRODUCTOS EN EL INVENTARIO***");
                                System.out.println("PRODUCTOS: "+ inventario.tamaño());
                                inventario.CantidadP();
                                break;
                            case 2:
                                System.out.println("***MODIFICAR PRODUCTO***");
                                String nuevo, codigon ;
                                double precio=0.0 , precioc=0;
                                int cantidadn=0;
                                System.out.println("***MODIFICAR  PRODUCTO***");
                                System.out.println("EL CAMPO QUE NO VAYA A MODIFICAR VUELVALO A PONER COMO ESTABA");
                                System.out.println("DIGITE EL NOMBRE DEL PRODUCTO");
                                nuevo=(sc.nextLine());
                                System.out.println("DIGITE EL NUEVO CODIGO DEL PRODUCTO");
                                codigon=(sc.nextLine());
                                System.out.println("DIGITE LA NUEVA CANTIDAD DE PRODUCTO");
                                cantidadn=Integer.parseInt(sc.nextLine());
                                System.out.println("DIGITE EL NUEVO PRECIO DE COMPRA DEL PRODUCTO");
                                precioc= Integer.parseInt(sc.nextLine());
                                System.out.println("DIGITE EL NUEVO PRECIO DE VENTA DEL PRODUCTO");
                                precio= Integer.parseInt(sc.nextLine());
                                productos.modificaProducto(nuevo, codigon, cantidadn, precioc, precio);
                                inventario.modificaProducto(nuevo, codigon, cantidadn, precioc);
                                break;
                            case 3:
                                System.out.println("***BUSCAR POR TIPO DE PRODUCTO***");
                                String tipoProducto;
                                System.out.println("INGRESE EL TIPO DE PRODUCTO QUE DESEA BUSCAR");
                                tipoProducto=(sc.nextLine());
                                inventario.buscarProducto(tipoProducto);
                                break;
                            case 4:
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("INGRESANDO AL MODULO DE FACTURAS");
                        Factura factura = new Factura();
                        factura.main(null);
                        break;
                }
            }while(opcion!=9);
        }
    }
}
    
