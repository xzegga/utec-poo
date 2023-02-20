import java.util.Scanner;

public class PruebaPersona {
	public static void main(String args[]) {
		Persona persona1 = new Persona();		
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n SOLICITUD DE DATOS \n");
		System.out.println("Ingrese el número de DUI:");
		
		persona1.dui = scanner.nextLine();
		
		System.out.println("\nLOS DATOS DE LA PERSONA AGREGADA SON");
		System.out.println("No. DUI: " + persona1.dui);
	}

}
