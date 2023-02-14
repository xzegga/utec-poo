import java.util.Scanner;

public class VolumenEsfera {
	public static void main(String args[]) {
		// Identify inputs: sphere radio
		double radio, volumen;		
		
		// Creating Scanner object type
		Scanner scanner = new Scanner(System.in);

		// Request inputs to the user
		System.out.println("\n PROGRAMS PARA ENCONTRAR EL RADIO DE LA ESFERA \n");
		System.out.println("Ingrese el radio de la esfera");
		radio = scanner.nextDouble();

		volumen = (double)4/3 * Math.PI * Math.pow(radio, 3);
		

		System.out.println("El volumen de la esfera es: " + volumen); 
	}

}
