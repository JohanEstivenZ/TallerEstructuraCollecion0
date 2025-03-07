package Ejercicio3;

import java.util.LinkedList;
import java.util.List;


/**
 * Clase de tipo genérica que representa una lista sin elementos duplicados.
 * @param <T> Tipo de elementos almacenados en la lista. Debe implementar Comparable.
 */
public class Lista<T extends Comparable<T>> {
	
	

	List<T> elementos = new LinkedList<T>();
	
	/**
     * Agrega un elemento a la lista si no existe previamente.
     * 
     * @param elemento El elemento a agregar.
     * @return {@code true} si el elemento fue agregado, {@code false} si ya existía.
     * @post La lista mantiene elementos únicos.
     */

	public boolean agregarElementos(T elemento) {
		
		TipoVerificador verificador = new TipoVerificador(elemento.getClass());
		
		boolean existe =false;
		
		if(verificador.esPrimitivo()) {
			
			for (T indice: elementos) {
				if(indice==elemento) {
					existe=true;
					break;
				}
			}
		}else {
			existe =elementos.contains(elemento);
		}

		if (!existe) {
			elementos.add(elemento);
			System.out.println("Elemento agregado con éxito");
			return true;

		} else {
			System.out.println("El elemento ya está en la lista, por lo tanto no se agregó");
			return false;

		}
		

	}
	
	 /**
     * Clase interna que verifica si un tipo es primitivo o un objeto.
     */
	
	public static class TipoVerificador {
        private Class<?> tipo;
        
        /**
         * Constructor que recibe el tipo a verificar.
         * @param tipo Clase del tipo genérico.
         */

        public TipoVerificador(Class<?> tipo) {
            this.tipo = tipo;
        }
        
        /**
         * Verifica si el tipo es primitivo.
         * @return {@code true} si es un tipo primitivo, {@code false} en caso contrario.
         */

        public boolean esPrimitivo() {
            return tipo.isPrimitive();
        }
        
        /**
         * Verifica si el tipo es un objeto.
         * @return {@code true} si es un objeto, {@code false} en caso contrario.
         */

        public boolean esObjeto() {
            return !tipo.isPrimitive();
        }
    }
}
