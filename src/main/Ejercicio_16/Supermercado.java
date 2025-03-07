package main.Ejercicio_16;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> carrito = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Supermercado ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar factura");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String producto = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    carrito.put(producto, precio);
                    System.out.println("Producto agregado.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String eliminar = scanner.nextLine();
                    if (carrito.remove(eliminar) != null) {
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("El producto no está en el carrito.");
                    }
                    break;

                case 3:
                    if (carrito.isEmpty()) {
                        System.out.println("El carrito está vacío.");
                    } else {
                        System.out.println("\n--- Factura ---");
                        double total = 0;
                        for (Map.Entry<String, Double> entry : carrito.entrySet()) {
                            System.out.println(entry.getKey() + ": $" + entry.getValue());
                            total += entry.getValue();
                        }
                        System.out.println("-------------------");
                        System.out.println("Total a pagar: $" + total);
                    }
                    break;

                case 4:
                    System.out.println("Gracias por su compra.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }
}

