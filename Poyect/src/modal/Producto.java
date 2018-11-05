package modal;

public class Producto {
	private int Codigo;
	private String Nombre;
	private String Tipo;
	private String SubTipo;
	private int Stock;
	private double Precio;
	public Producto(int codigo, String nombre, String tipo, String subTipo, int stock, double precio) {
		super();
		Codigo = codigo;
		Nombre = nombre;
		Tipo = tipo;
		SubTipo = subTipo;
		Stock = stock;
		Precio = precio;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getSubTipo() {
		return SubTipo;
	}
	public void setSubTipo(String subTipo) {
		SubTipo = subTipo;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}

}
