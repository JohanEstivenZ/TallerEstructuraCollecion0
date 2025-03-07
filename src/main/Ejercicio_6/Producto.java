package main.Ejercicio_6;

public class Producto {
    String codigo;
    String nombre;
    double precio;
    int cantidad;

    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " + nombre + " - $" + precio + " (Cantidad: " + cantidad + ")";
    }
}