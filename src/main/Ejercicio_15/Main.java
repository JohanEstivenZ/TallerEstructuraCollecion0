package main.Ejercicio_15;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private HashMap<String, String> contactos = new HashMap<>();

    public void agregarContacto(String nombre, String telefono) {
        contactos.put(nombre, telefono);
    }

    public String buscarTelefono(String nombre) {
        return contactos.getOrDefault(nombre, "Contacto no encontrado");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DirectorioTelefonico directorio = new DirectorioTelefonico();

        while (true) {
            System.out.println("Seleccione una opción: \n1. Agregar contacto \n2. Buscar contacto \n3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono: ");
                    String telefono = scanner.nextLine();
                    directorio.agregarContacto(nombre, telefono);
                    System.out.println("Contacto agregado");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    System.out.println("Teléfono: " + directorio.buscarTelefono(nombreBuscar));
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