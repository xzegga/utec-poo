import java.util.Scanner;

public class PruebaLibro {
	public static void main(String args[]) {
		Libro libro1 = new Libro();		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nINGRESO DE LIBRO NUEVO A INVENTARIO");
		System.out.println("SOLICITUD DE DATOS \n");
		
		System.out.println("Ingrese el código del libro");
		libro1.codigo = scanner.nextLine();

		System.out.println("Ingrese el título del libro:");
		libro1.titulo = scanner.nextLine();

		System.out.println("Ingrese el autor del libro:");
		libro1.autor = scanner.nextLine();

		System.out.println("Ingrese el número de páginas del libro:");
		libro1.paginas = scanner.nextInt();

		System.out.println("Ingrese el precio del libro:");
		libro1.precio = scanner.nextDouble();
		
		// Mostrando información del libro
		System.out.println("\n==================================");
		System.out.println("LOS DATOS DE LA LIBRO AGREGADO SON");
		System.out.println("Código:\t\t" + libro1.codigo);
		System.out.println("Título:\t\t" + libro1.titulo);
		System.out.println("Autor:\t\t" + libro1.autor);
		System.out.println("Páginas:\t" + libro1.paginas);
		System.out.println("Precio:\t\t" + "$" + libro1.precio);
	}
}
