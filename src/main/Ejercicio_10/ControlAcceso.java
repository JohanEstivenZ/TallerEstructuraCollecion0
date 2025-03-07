package main.Ejercicio_10;

import java.util.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class ControlAcceso {
    public static void main(String[] args) {
        HashSet<String> empleadosAutorizados = new HashSet<>(); // IDs permitidos
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese ID del empleado (o 'salir' para terminar): ");
            String id = scanner.nextLine().trim();

            if (id.equalsIgnoreCase("salir")) {
                break; // Finaliza el programa
            }

            // Verificar si el ID ya ingresó
            if (empleadosAutorizados.contains(id)) {
                System.out.println("Acceso DENEGADO para " + id + " (ya ingresó previamente)");
            } else {
                empleadosAutorizados.add(id); // Registrar acceso
                System.out.println("Acceso PERMITIDO para " + id);
            }
        }

        scanner.close();
        System.out.println("Registro final de accesos: " + empleadosAutorizados);
    }
}


