import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class productos {
    public static void main(String[] args) {
        Scanner objeto_productos = new Scanner(System.in);

        System.out.println("INGRESA TODA LA INFORMACION DEL PRODUCTO\n");
        System.out.println("Ingresa el codigo del producto");
        String codProducto = objeto_productos.nextLine();
        System.out.println("Ingrese detalle de producto");
        String detalle = objeto_productos.nextLine();
        System.out.println("Ingrese que medida desea");
        Double medida = objeto_productos.nextDouble();
        System.out.println("Ingrese la descripcion del producto");
        String descripcion = objeto_productos.nextLine();
        System.out.println("Ingrese en que marce desea su repuesto");
        String marca = objeto_productos.nextLine();
        System.out.println("Ingrese la cantidad de producto en stock");
        int cantidad = objeto_productos.nextInt();
        System.out.println("Ingrese el precio de compra del producto");
        double precioCompra = objeto_productos.nextDouble();
        System.out.println("Ingrese el precio referencial de venta");
        double precioVenta = objeto_productos.nextDouble();

        System.out.println("El Producto fue agragado satisfactoriamente" + detalle);


        }

    }

