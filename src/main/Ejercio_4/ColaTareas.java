package main.Ejercio_4;

import java.util.PriorityQueue;

public class ColaTareas {
    public static void main(String[] args) {
        PriorityQueue<Tarea> cola = new PriorityQueue<>();
        cola.add(new Tarea("Revisar correo", 3));
        cola.add(new Tarea("Preparar informe", 1));
        cola.add(new Tarea("Llamar al cliente", 1));

        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
