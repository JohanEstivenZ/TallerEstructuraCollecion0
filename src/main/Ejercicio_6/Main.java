package main.Ejercicio_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        // Datos quemados
        inventario.agregarProducto(new Producto("001", "Manzana", 1.2, 8));
        inventario.agregarProducto(new Producto("002", "Pera", 0.8, 0));
        inventario.agregarProducto(new Producto("003", "Banano", 1.0, 5));
        inventario.agregarProducto(new Producto("004", "Uva", 2.5, 2));

        while (true) {
            System.out.println("\nInventario actual:");
            inventario.listarPorNombre();

            System.out.println("\nOpciones:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto agotado");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese cantidad: ");
                    int cantidad = scanner.nextInt();

                    inventario.agregarProducto(new Producto(codigo, nombre, precio, cantidad));
                    System.out.println("Producto agregado ");
                    break;

                case 2:
                    inventario.eliminarProductosAgotados();
                    break;

                case 3:
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
