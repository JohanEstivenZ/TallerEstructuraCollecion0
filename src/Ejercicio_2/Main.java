package Ejercicio_2;

public class Main {
	public static void main(String[] args) {

		CreacionStack<Integer> numeros = new CreacionStack<>();

		numeros.agregarElementos(77);
		numeros.agregarElementos(100);
		numeros.agregarElementos(100);
		numeros.agregarElementos(12);
		numeros.agregarElementos(90);
		
		numeros.imprimirPila();


	}
}
