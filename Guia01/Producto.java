public class Producto {
	// Atributos de clase Producto
	private String nombre;
	private String descripcion;
	private double precio;
	private String codigo;
	private String categoria;

	// Getter y Setters para nombre
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Setters and Getters para descripcion
	public String getDescripcion() { 
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// Setters and Getters para precio
	public double getPrecio() { 
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Setters and Getters para codigo
	public String getCodigo() { 
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	// Setters and Getters para categoria
	public String getCategoria() { 
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
