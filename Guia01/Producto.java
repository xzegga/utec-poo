public class Producto {
	// Atributos de clase Producto
	private String codigo;
	private String nombre;
	private String descripcion;	
	private String categoria;
	private double precio;

	public Producto() {
		this.codigo = "Sin definir";
		this.nombre = "Sin definir";
		this.descripcion = "Sin definir";
		this.categoria = "Sin definir";
		this.precio = 0.00;
	}
	
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

        public void mostrarValores(){
                System.out.println("\n");
                System.out.println("\n=============================================");
                System.out.println("SE ASIGNARON LOS SIGUIENTES DATOS POR DEFECTO:");
                System.out.println("Código:\t\t" + this.codigo);
                System.out.println("Nombre:\t\t" + this.nombre);
                System.out.println("Descripción:\t" + this.descripcion);
                System.out.println("Precio:\t\t" + this.precio);
                System.out.println("Categoría:\t" + this.categoria);
        }
}
