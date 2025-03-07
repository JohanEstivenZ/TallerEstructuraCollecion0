package Ejercicio3;

//import Ejercicio3.Lista.TipoVerificador;

public class Main {
	
	public static void main(String[] args) {
		Lista<Integer> listaNumeros = new Lista<>();
        listaNumeros.agregarElementos(5);
        listaNumeros.agregarElementos(10);
        listaNumeros.agregarElementos(5); // No se agregará
        listaNumeros.agregarElementos(10);
        listaNumeros.agregarElementos(10);

        Lista<String> listaPalabras = new Lista<>();
        listaPalabras.agregarElementos("Hola");
        listaPalabras.agregarElementos("Mundo");
        listaPalabras.agregarElementos("Hola"); // No se agregará
        
     // Uso de TipoVerificador
        Lista.TipoVerificador verificador1 = new Lista.TipoVerificador(int.class);
        Lista.TipoVerificador verificador2 = new Lista.TipoVerificador(Integer.class);

        System.out.println("¿int es primitivo? " + verificador1.esPrimitivo());  // ✅ true
        System.out.println("¿Integer es objeto? " + verificador2.esObjeto());
	}

}
