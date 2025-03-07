package main.Ejercicio_14;

import java.util.ArrayDeque;

public class HistorialMensajes {
    public static void main(String[] args) {
        ArrayDeque<String> mensajes = new ArrayDeque<>();

        for (int i = 1; i <= 12; i++) {
            if (mensajes.size() == 10) {
                mensajes.pollFirst();
            }
            mensajes.add("Mensaje " + i);
        }

        System.out.println("Últimos mensajes: " + mensajes);
    }
}

