package main.Ejercicio_17;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.agregarEvento("2018-05-20", "Seminario de Innovación");
        agenda.agregarEvento("2023-12-01", "Conferencia de Tecnología");
        agenda.agregarEvento("2024-06-15", "Reunión Anual de la Empresa");
        agenda.agregarEvento("2026-09-10", "Lanzamiento de Producto");

        agenda.mostrarEventos();
        agenda.mostrarEventoMasProximo();
    }
}
