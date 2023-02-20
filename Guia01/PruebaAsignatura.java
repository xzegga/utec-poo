import java.util.Scanner;

public class PruebaAsignatura {
	public static void main(String args[]) {
		Asignatura asignatura1 = new Asignatura();		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nINGRESO ASIGNATURA AL CICLO EN CURSO");
		System.out.println("SOLICITUD DE DATOS \n");
		
		System.out.println("Nombre de la asignatura");
		asignatura1.nombre = scanner.nextLine();

		System.out.println("Sección donde se impartira la asignatura:");
		asignatura1.seccion = scanner.nextLine();

		System.out.println("Número maximo de estudiantes permitidos:");
		asignatura1.maxEstudiantes = scanner.nextInt();

		System.out.println("Aula donde se impartirá la asignatura:");
		asignatura1.aula = scanner.nextInt();

		System.out.println("Horario");
		asignatura1.hora = scanner.nextLine();
		
		// Mostrando información de la Asignatura
		System.out.println("\n==================================");
		System.out.println("LOS DATOS DE LA ASIGNATURA AGREGADA SON");
		System.out.println("Nombre:\t\t" + asignatura1.nombre);
		System.out.println("Sección:\t" + asignatura1.seccion);
		System.out.println("Estudiantes:\t" + asignatura1.maxEstudiantes);
		System.out.println("Aula:\t\t" + asignatura1.aula);
		System.out.println("Hora:\t\t" + asignatura1.hora);
	}
}
