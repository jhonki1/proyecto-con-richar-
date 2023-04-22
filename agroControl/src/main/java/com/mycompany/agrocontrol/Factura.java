package com.mycompany.agrocontrol;
import com.mycompany.agrocontrol.adminFactura.Nodo;
import java.util.Scanner;

public class Factura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        adminFactura factura = new adminFactura();
        boolean bandera = true;
        int opcion, caso1, caso2;
        Nodo cabeza = null;
        double total = 0;
        System.out.println("INGRESE\n 1.PARA ENTRAR A LA APLICACION DE LA FACTURA\n 2. PARA SALIR DE ESTE MODULO");
        opcion =Integer.parseInt(sc.nextLine());
        switch(opcion){
            case 1:
                System.out.println("BIENVENIDO A LA PARTE DE LA FACTURA");
                System.out.println(" 1.FACTURA NUEVA \n 2.BORRAR FACTURA ");
                caso1= Integer.parseInt(sc.nextLine());
                switch(caso1){
                    case 1:
                        adminFactura admin = new adminFactura();
                        while (true) {
                            System.out.println("INGRESE EL NOMBRE DEL PRODUCTO: ");
                            String nombre = sc.nextLine();

                            System.out.println("INGRESE LA CANTIDAD DEL PRODUCTO: ");
                            int cantidad = sc.nextInt();

                            System.out.println("INGRESE EL VALOR DEL PRODUCTO: ");
                            double valor = sc.nextDouble();

                            factura.agregarProducto(nombre, cantidad, valor);


                            System.out.println("EL TOTAL DE ESTA COMPRA ES: " + cantidad * valor);
                            System.out.println("EL TOTAL ACUMULADO DE ESTE FACTURA: " + factura.calcularTotal());

                            sc.nextLine();

                            System.out.println("DESEA AGREGAR OTRO PRODUCTO? (S/N)");
                            String respuesta = sc.nextLine();

                            if (respuesta.equalsIgnoreCase("N")) {
                                break;
                            }
                        }

                        System.out.println("Detalles de la factura:");
                        System.out.println("\t \t  AGRO-VETERINARIA \n \t \t  CALLE 34#5-6 \n \t \t  COLOMBIA-ANTIOQUIA \n \t \t  TELEFONO: 11233458");
                        System.out.println("--------------------------------------------------");
                        Nodo actual = factura.cabeza;
                        while (actual != null) {
                            System.out.println("Producto: " + actual.producto.nombre);
                            System.out.println("Cantidad: "+ actual.producto.cantidad);
                            System.out.println("Precio: " + actual.producto.valor);
                            actual = actual.siguiente;
                        }
                        System.out.println("--------------------------------------------------");
                        System.out.println("Total de la factura es: " + factura.calcularTotal());
                        System.out.println("--------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("APARTADO PARA BORRAR UNA FACTURA CREADA RECIENTE");
                        System.out.println("DESEA BORRAR LA FACTURA? (S/N)");
                        String borrar = sc.nextLine();
                        if (borrar.equalsIgnoreCase("S")) {
                            cabeza = null;
                            total = 0;
                            System.out.println("FACTURA ELIMINADA");
                        } else {
                            System.out.println("NO SE PUEDE BORRAR LA FACTURA");
                        }
                        break;
                }
            case 2: 
                System.out.println("SALIO DEL MODULO FACTURAS");
                break;     
        }
    }
}