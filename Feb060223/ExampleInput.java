import java.util.Scanner;

public class ExampleInput {

	public static void main(String args[]) {
		// Declaring input variables: name, age and user weight
		String name;
		int age;
		double weight;
		double weightKg;
		final Double kgFactor = 0.453592;

		// Define Scanner object to catch all user inputs from console
		Scanner scanner = new Scanner(System.in);
		
		// Star process reading values
		System.out.println("Enter your name");
		name = scanner.nextLine();

		System.out.println("Enter your age");
		age = scanner.nextInt();

		System.out.println("Enter your weight in pounds");
		weight = scanner.nextDouble();

		weightKg = weight * kgFactor;

		// Outputs: Welcome message

		/*
		System.out.println(
			"Welcome " + name 
			+ ", your age is " + age 
			+ " and your weight is " + String.format("%.2f", weightKg) + " kg"

		);
		*/

		System.out.printf(
                        "Welcome " + name
                        + ", your age is " + age
                        + " and your weight is %.2f kgs.", weightKg
                );

	}

}
