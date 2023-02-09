import java.util.Scanner;
public class SumaResta {
	public static void main(String args[]){
		double num1;
		double num2;
		double add;
		double substract;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number");
		num1 = scanner.nextDouble();

		System.out.println("Enter the second number");
                num2 = scanner.nextDouble();

		add = num1 + num2;
		substract = num1 - num2;

		System.out.printf("The sum of the first and second numbers is %.2f and \n"
			+ "The subtraction of the first number minus the second is %.2f", add, substract);
		
	}
}
