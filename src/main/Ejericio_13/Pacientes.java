package main.Ejericio_13;

public class Pacientes implements Comparable<Pacientes> {
    String paciente;
    int prioridad;

    public Pacientes(String descripcion, int prioridad) {
        this.paciente = descripcion;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Pacientes otro) {
        return Integer.compare(this.prioridad, otro.prioridad);
    }

    @Override
    public String toString() {
        return "Paciente: " + paciente + " (Prioridad: " + prioridad + ")";
    }
}



