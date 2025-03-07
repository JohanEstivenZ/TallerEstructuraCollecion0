package main.Ejercicio_7;

import java.util.LinkedList;
import java.util.Scanner;

public class BancoTurnos {
    public static void main(String[] args) {
        LinkedList<String> colaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Sistema de Turnos del Banco ---");
            System.out.println("1. Agregar cliente a la cola");
            System.out.println("2. Atender al primer cliente");
            System.out.println("3. Agregar cliente con urgencia");
            System.out.println("4. Mostrar cola de espera");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    colaClientes.addLast(cliente);
                    System.out.println(cliente + " ha sido agregado a la cola.");
                    break;

                case 2:
                    if (!colaClientes.isEmpty()) {
                        String atendido = colaClientes.pollFirst();
                        System.out.println("Atendiendo a: " + atendido);
                    } else {
                        System.out.println("No hay clientes en la cola.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del cliente con urgencia: ");
                    String urgente = scanner.nextLine();
                    colaClientes.addFirst(urgente);
                    System.out.println(urgente + " ha sido agregado con urgencia.");
                    break;

                case 4:
                    if (colaClientes.isEmpty()) {
                        System.out.println("No hay clientes en la cola.");
                    } else {
                        System.out.println("Cola de espera: " + colaClientes);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema de turnos.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }
}
