import java.util.Scanner;

public class TrianguloEquilatero {
	public static void main(String args[]){
		double lado, area;

		// Objeto Scanner para entrada de datos del usuario
		Scanner scanner = new Scanner(System.in);

		System.out.println("CALCULO DEL AREA DE UN TRIANGULO EQUILATERO");

		System.out.println("Ingrese la medida de uno de los lados del triángulo");
		lado = scanner.nextDouble();

		// Proceso de cálculo del área
		area = (double)Math.sqrt(3) / 4 * Math.pow(lado, 2);
	
		// Salida
		System.out.println("El área del triángulo equilátero de lado " + lado + " es " + area);
	}
}
