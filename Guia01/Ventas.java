import java.util.Scanner;
public class Ventas{
	public static void main(String[] args){
		//declaracion de variables
		double precio, pago, cambio;

		// Instanciando objeto Scanner
		Scanner sc = new Scanner(System.in);

		// Mostrar mensajes y leer entradas de usuario
		System.out.println("Digite el precio del producto");
		precio = sc.nextDouble();

		System.out.println("Digite monto que cliente paga");
		pago = sc.nextDouble();

		// Cálculo de cambio entregado al usuario
		cambio = precio - pago;

		// Imprimiendo mensajes de salida
		System.out.println("Su cambio es " + cambio);
		
	}
}