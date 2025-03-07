package main.Ejercicio_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Inventario {
    List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void eliminarProducto(String codigo) {
        productos.removeIf(p -> p.codigo.equals(codigo));
    }

    public Producto buscarProducto(String codigo) {
        return productos.stream().filter(p -> p.codigo.equals(codigo)).findFirst().orElse(null);
    }

    public void listarPorNombre() {
        productos.sort(Comparator.comparing(p -> p.nombre));
        productos.forEach(System.out::println);
    }

    public void listarPorPrecio() {
        productos.sort(Comparator.comparingDouble(p -> p.precio));
        productos.forEach(System.out::println);
    }

    public void eliminarProductosAgotados() {
        productos.removeIf(p -> {
            if (p.cantidad <= 0) {
                System.out.println("Producto agotado: " + p.nombre + " (Código: " + p.codigo + ")");
                return true;
            }
            return false;
        });
    }
}