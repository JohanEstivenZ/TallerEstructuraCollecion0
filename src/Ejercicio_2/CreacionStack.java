package Ejercicio_2;

import java.util.Stack;

public class CreacionStack<T> {

	Stack<T> pila = new Stack<>();

	public void agregarElementos(T elemento) {
		// verificamos que la pila no ese vacia
		if (pila.isEmpty() || !pila.peek().equals(elemento)) { // valida y agrega unicamente si es diferente
			pila.push(elemento);
		}

	}
	
	public void imprimirPila() {
		if(pila.isEmpty()) {
			System.out.println("La pila esta vacia");
		}else {
			System.out.println("La pila contiene: "+pila);
		}
	}

}
