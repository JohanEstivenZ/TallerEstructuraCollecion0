package main.Ejercio_4;

class Tarea implements Comparable<Tarea> {
    String descripcion;
    int prioridad;

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea: " + descripcion + " (Prioridad: " + prioridad + ")";
    }
}

