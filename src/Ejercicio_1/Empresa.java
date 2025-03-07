package Ejercicio_1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Empresa {

	Set<Producto> productos;

	public Empresa() {
		this.productos = new TreeSet<>();
	}

	public void agregarProducto(Producto producto) { // Este método agrega productos
		productos.add(producto);
	}

	public void imprimirProductos() { // metodo para imprimir los productos
		Iterator<Producto> iterador = productos.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}

	}
	
	public Producto buscarProducto(int codigo) {
		
		for(Producto producto:productos) {
			if(producto.getCodigo()==codigo) {
				System.out.println("Producto encontrado: " + producto);
				
				return producto;
				
			}
		}
		System.out.println("Producto no encontrado.");
		return null;
	}

}
