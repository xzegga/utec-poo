import java.util.Scanner;

public class PruebaProfesor {
        public static void main(String args[]) {
		// Declaración de variables para almacenar inputs del usuario
                String nombre, apellidos, carrera, escalafon;
                int edad;

		// Definición de objeto Producto
                Profesor profesor1 = new Profesor();

		// Mostrando valores por defecto;
		profesor1.mostrarValores();

		// Definición de objeto scanner;
                Scanner scanner = new Scanner(System.in);

		// Lectura de datos
                System.out.println("\nINGRESE LOS NUEVOS DATOS:");
                
                System.out.println("Nombre del Profesor:");
                nombre = scanner.nextLine();
                profesor1.setNombre(nombre);

                System.out.println("Apellidos del Profesor:");
                apellidos = scanner.nextLine();
                profesor1.setApellidos(apellidos);
		  
                System.out.println("Edad del profesor:");
                edad = scanner.nextInt();
                profesor1.setEdad(edad);
		scanner.nextLine();

		System.out.println("Carrera del profesor:");
		carrera = scanner.nextLine();
		profesor1.setCarrera(carrera);

                System.out.println("Escalafón del profesor:");
                escalafon = scanner.nextLine();
                profesor1.setEscalafon(escalafon);

                // Mostrando información del producto
                System.out.println("\n======================================");
                System.out.println("LOS DATOS DEL PROFESOR AGREGADO SON");
                System.out.println("Nombre:\t\t" + profesor1.getNombre());
                System.out.println("Apellidos:\t" + profesor1.getApellidos());
                System.out.println("Edad:\t\t" + profesor1.getEdad());
                System.out.println("Carrera:\t" + profesor1.getCarrera());
                System.out.println("Escalafón:\t" +  profesor1.getEscalafon());
        }
}

