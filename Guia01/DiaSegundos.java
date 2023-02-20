
//ejercicio 1
import java.util.Scanner;

public class DiaSegundos {
    public static void main(String[] args) {
 		 // Definir variables para almacenar entradas.
        int numDias;
		 int numSegundos;

		 // Instanciando el objeto Scanner
        Scanner input = new Scanner(System.in);

        // solicitud de dias al usuario
        System.out.print("Ingrese el número de días a calcular: ");
        numDias = input.nextInt();

        // calculo de segundos de los dias ingresados
        numSegundos = numDias * 24 * 60 * 60;

        // resultado
        System.out.println("El número de segundos en " + numDias + " días es: " + numSegundos);
    }
}

// Utiliza clase Scanner para leer el número de días introducido por el usuario desde teclado. Luego, se calcula el número de segundos multiplicando el número de días por 24 horas por 60 minutos por 60 segundos. Finalmente, se imprime el resultado utilizando el método System.out.println().
