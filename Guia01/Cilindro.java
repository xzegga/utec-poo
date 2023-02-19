import java.util.Scanner;
public class Cilindro
{      
       public static void main(String args[])
	   {
			
			double radio, area, volumen, altura;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("CALCULANDO AREA DE CILINDRO");
			System.out.println("Ingrese el radio del cilindro");
			radio = sc.nextDouble();
			System.out.println("Ingrese la altura del cilindro");
			altura = sc.nextDouble();
			
			area = 2 * 3.1416 * radio *(radio + altura);
			volumen = 3.1416 * radio * radio * altura;
			
			
			System.out.println("El Area del Cilindro es"+ area);
			System.out.println("El volumen del Cilindro es"+ volumen);
	   }
}
			