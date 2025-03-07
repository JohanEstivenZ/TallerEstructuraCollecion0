package Ejercicio8;
import java.util.Vector;

public class Vector {
	
	

	public class EditorTexto {
	    private Vector<String> historial;

	    public EditorTexto() {
	        historial = new Vector<>();
	    }

	    // Agregar un cambio al historial
	    public void agregarCambio(String cambio) {
	        historial.add(cambio);
	        System.out.println("Cambio agregado: " + cambio);
	    }

	    // Deshacer el último cambio
	    public void deshacerCambio() {
	        if (!historial.isEmpty()) {
	            String ultimoCambio = historial.remove(historial.size() - 1);
	            System.out.println("Se ha deshecho el cambio: " + ultimoCambio);
	        } else {
	            System.out.println("No hay cambios para deshacer.");
	        }
	    }

	    // Mostrar el historial de cambios
	    public void mostrarHistorial() {
	        if (historial.isEmpty()) {
	            System.out.println("No hay cambios en el historial.");
	        } else {
	            System.out.println("\nHistorial de cambios:");
	            for (int i = 0; i < historial.size(); i++) {
	                System.out.println((i + 1) + ". " + historial.get(i));
	            }
	        }
	    }

	    public static void main(String[] args) {
	        EditorTexto editor = new EditorTexto();

	        // Simulación de cambios en el editor
	        editor.agregarCambio("Agregué un título");
	        editor.agregarCambio("Corregí errores ortográficos");
	        editor.agregarCambio("Ajusté el formato");

	        // Mostrar historial
	        editor.mostrarHistorial();

	        // Deshacer el último cambio
	        editor.deshacerCambio();

	        // Mostrar historial después de deshacer
	        editor.mostrarHistorial();
	    }
	}

}
