package Ejercicio11;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

// Clase que representa una Canción
class Cancion {
    private String titulo;
    private String artista;

    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    // Se sobreescriben equals() y hashCode() para evitar duplicados
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cancion cancion = (Cancion) obj;
        return Objects.equals(titulo, cancion.titulo) && Objects.equals(artista, cancion.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista);
    }

    @Override
    public String toString() {
        return "🎵 " + titulo + " - " + artista;
    }
}

// Clase que gestiona la lista de canciones favoritas
class BibliotecaMusical {
    private Set<Cancion> favoritas = new LinkedHashSet<>();

    // Método para agregar canciones a favoritos
    public void agregarFavorita(Cancion cancion) {
        if (favoritas.add(cancion)) {
            System.out.println("✅ Agregada: " + cancion);
        } else {
            System.out.println("⚠️ La canción ya está en favoritos: " + cancion);
        }
    }

    // Método para mostrar las canciones favoritas
    public void mostrarFavoritas() {
        if (favoritas.isEmpty()) {
            System.out.println("📂 No tienes canciones favoritas.");
        } else {
            System.out.println("\n🎶 Tus canciones favoritas:");
            for (Cancion cancion : favoritas) {
                System.out.println(cancion);
            }
        }
    }
}




