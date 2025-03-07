package Ejercicio_1;

public class Main {
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa ();
		
		Producto producto1 = new Producto(1234,"Nevera", 1500000);
		Producto producto2 = new Producto(6796,"Televisor", 800000);
		Producto producto3 = new Producto(1086,"Sofa-Cama", 1200000);
		Producto producto4 = new Producto(2348,"Biblioteca", 1480000);
		Producto producto5 = new Producto(2864,"Lavadora", 2000000);
		Producto producto6 = new Producto(8734,"Lampara", 50000);
		Producto producto7 = new Producto(7612,"Estufa", 400000);
		Producto producto8 = new Producto(5431,"Mesa Computador", 150000);
		Producto producto9 = new Producto(9825,"Portarretratos", 25000);
		Producto producto10 = new Producto(6689,"Vagilla", 90000);
		
		empresa.agregarProducto(producto1);
		empresa.agregarProducto(producto2);
		empresa.agregarProducto(producto3);
		empresa.agregarProducto(producto4);
		empresa.agregarProducto(producto5);
		empresa.agregarProducto(producto6);
		empresa.agregarProducto(producto7);
		empresa.agregarProducto(producto8);
		empresa.agregarProducto(producto9);
		empresa.agregarProducto(producto10);
		
		//empresa.imprimirProductos();
		empresa.buscarProducto(6689);
		
		
	}

}
