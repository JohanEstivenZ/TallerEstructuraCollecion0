package Ejercicio5;

public class Producto {
	
	private int id;
	private double precio;
	private String nombre;
	public Producto(int id, double precio, String nombre) {
		super();
		this.id = id;
		this.precio = precio;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
