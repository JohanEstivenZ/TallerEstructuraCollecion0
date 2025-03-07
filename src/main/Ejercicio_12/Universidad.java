package main.Ejercicio_12;

import java.util.Set;
import java.util.TreeSet;

public class Universidad {
    Set<String> estudiantes = new TreeSet<>();

    public void agregarEstudiante(String nombre) {
        estudiantes.add(nombre);
    }

    public void mostrarEstudiantes() {
        //estudiantes.forEach(System.out::println);
        if (!estudiantes.isEmpty()) {
            System.out.println("Primer estudiante: " + ((TreeSet<String>) estudiantes).first());
            System.out.println("Último estudiante: " + ((TreeSet<String>) estudiantes).last());
        }
    }
}
