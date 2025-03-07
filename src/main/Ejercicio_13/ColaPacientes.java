package main.Ejercicio_13;

import java.util.PriorityQueue;

public class ColaPacientes {
    public static void main(String[] args) {
        PriorityQueue<Pacientes> cola = new PriorityQueue<>();
        cola.add(new Pacientes("Johan", 3));
        cola.add(new Pacientes("Juan", 1));
        cola.add(new Pacientes("Alex", 2));
        cola.add(new Pacientes("Jhonantan", 4));
        cola.add(new Pacientes("Estiven", 1));

        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
