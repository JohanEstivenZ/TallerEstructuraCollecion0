package Ejercicio11.copy;

//Clase principal
public class Main {
 public static void main(String[] args) {
     BibliotecaMusical biblioteca = new BibliotecaMusical();

     // Crear canciones
     Cancion c1 = new Cancion("Bohemian Rhapsody", "Queen");
     Cancion c2 = new Cancion("Imagine", "John Lennon");
     Cancion c3 = new Cancion("Billie Jean", "Michael Jackson");
     Cancion c4 = new Cancion("Bohemian Rhapsody", "Queen"); // Canción duplicada

     // Agregar canciones a favoritos
     biblioteca.agregarFavorita(c1);
     biblioteca.agregarFavorita(c2);
     biblioteca.agregarFavorita(c3);
     biblioteca.agregarFavorita(c4); // Intento de agregar duplicado

     // Mostrar canciones favoritas
     biblioteca.mostrarFavoritas();
 }
}