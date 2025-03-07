package main.Ejercicio_9;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.println("Escribe una URL para visitar o 'atras' para retroceder.");
        System.out.println("Escribe 'salir' para finalizar.");

        while (true) {
            System.out.print("Ingresar comando o URL: ");
            entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Cerrando navegador...");
                break;
            } else if (entrada.equalsIgnoreCase("atras")) {
                System.out.println(navegador.retroceder());
            } else {
                navegador.visitarPagina(entrada);
            }
        }

        scanner.close();
    }
}
