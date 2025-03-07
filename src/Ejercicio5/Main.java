package Ejercicio5;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Creamos los productos
        Producto p1 = new Producto(3, 1000, "Computadora");
        Producto p2 = new Producto(1, 500, "Celular");
        Producto p3 = new Producto(2, 700, "Tablet");

        // El HashMap :No mantiene orden
        Map<Integer, Producto> hashMap = new HashMap<>();
        hashMap.put(p1.getId(), p1);
        hashMap.put(p2.getId(), p2);
        hashMap.put(p3.getId(), p3);

        System.out.println("🔹 HashMap (Sin orden garantizado)");
        imprimirMapa(hashMap);

        // El LinkedHashMap (Mantiene el orden de inserción)
        Map<Integer, Producto> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(p1.getId(), p1);
        linkedHashMap.put(p2.getId(), p2);
        linkedHashMap.put(p3.getId(), p3);

        System.out.println("\n🔹 LinkedHashMap (Orden de inserción)");
        imprimirMapa(linkedHashMap);

        // El TreeMap ordena por claves
        Map<Integer, Producto> treeMap = new TreeMap<>();
        treeMap.put(p1.getId(), p1);
        treeMap.put(p2.getId(), p2);
        treeMap.put(p3.getId(), p3);

        System.out.println("\n🔹 TreeMap (Ordenado por clave)");
        imprimirMapa(treeMap);
    }

    // Método para imprimir cualquier mapa de productos
    private static void imprimirMapa(Map<Integer, Producto> mapa) {
        for (Map.Entry<Integer, Producto> entry : mapa.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " → " + entry.getValue());
        }
    }
}
