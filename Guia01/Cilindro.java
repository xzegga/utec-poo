import java.util.Scanner;
public class Cilindro
{      
       public static void main(String args[])
	   {
			// Declaración de propiedades
			double radio, area, volumen, altura;

			// Definiendo objeto Scanner para lectura de datos
			Scanner sc = new Scanner(System.in);
			
			System.out.println("CALCULANDO AREA Y VOLUMEN DE CILINDRO");

			// Lectura de entradas del usuario
			System.out.println("Ingrese el radio del cilindro");
			radio = sc.nextDouble();

			System.out.println("Ingrese la altura del cilindro");
			altura = sc.nextDouble();
			
			area = 2 * 3.1416 * radio *(radio + altura);
			volumen = 3.1416 * radio * radio * altura;
			
			
			System.out.println("El Area del Cilindro es "+ String.format("%.2f", area));
			System.out.println("El volumen del Cilindro es "+ String.format("%.2f", volumen));
	   }
}
			
