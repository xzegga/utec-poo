public class Profesor {
	// Atributos de clase Profesor
	private String nombre;
	private String apellidos;
	private int edad;	
	private String carrera;
	private String escalafon;

	// Constructor
	public Profesor(){
		this.nombre = "Sin definir";
		this.apellidos = "Sin definir";
		this.edad = 0;
		this.carrera = "Sin definir";
		this.escalafon = "Sin definir";	
	}
	
        // Getter y Setters para nombre
        public String getNombre() {
                return nombre;
        }
        
        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

	// Setters and Getters para los apellidos
	public String getApellidos() { 
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	// Setters and Getters para edad
	public int getEdad() { 
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Setters and Getters para carrera
	public String getCarrera() { 
		return carrera;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	// Setters and Getters para escalafon
	public String getEscalafon() { 
		return escalafon;
	}
	
	public void setEscalafon(String escalafon) {
		this.escalafon = escalafon;
	}

	public void mostrarValores(){
		System.out.println("\n");
		System.out.println("\n=============================================");
                System.out.println("SE ASIGNARON LOS SIGUIENTES DATOS POR DEFECTO:");
                System.out.println("Nombre:\t\t" + this.nombre);
                System.out.println("Apellidos:\t" + this.apellidos);
                System.out.println("Edad:\t\t" + this.edad);
                System.out.println("Carrera:\t" + this.carrera);
                System.out.println("Escalafón:\t" + this.escalafon);
	}
}
