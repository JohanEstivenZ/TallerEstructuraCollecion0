package main.Ejercicio_17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    Map<Date, String> eventos = new TreeMap<>();

    public void agregarEvento(String fecha, String descripcion) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(fecha);
            eventos.put(date, descripcion);
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + fecha);
        }
    }

    public void mostrarEventos() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        eventos.forEach((fecha, descripcion) ->
                System.out.println(sdf.format(fecha) + " " + descripcion));
    }

    public void mostrarEventoMasProximo() {
        Date ahora = new Date();
        for (Map.Entry<Date, String> entry : eventos.entrySet()) {
            if (!entry.getKey().before(ahora)) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                System.out.println("Evento más próximo: " + sdf.format(entry.getKey()) + " -> " + entry.getValue());
                return;
            }
        }
        System.out.println("No hay eventos próximos.");
    }
}
