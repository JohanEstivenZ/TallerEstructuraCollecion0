package main.Ejercicio_15;

import java.util.HashMap;
import java.util.Map;

public class DirectorioTelefonico {
    Map<String, String> directorio = new HashMap<>();

    public void agregarContacto(String nombre, String telefono) {
        directorio.put(nombre, telefono);
    }

    public String buscarTelefono(String nombre) {
        return directorio.getOrDefault(nombre, "No encontrado");
    }
}
