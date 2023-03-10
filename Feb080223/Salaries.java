import java.util.Scanner;

public class Salaries {

	public static void main(String args[]){
		// Declaring inputs
		String name;
		double baseSalary, netSalary;
		double extraHours;
		double rent, isss, afp, hourSalary, totalDiscounts;
	
		// Declare and define constant factors to get discount and taxes
		final Double rentFactor = 0.1;
		final Double afpFactor = 0.0725;
		final Double isssFactor = 0.075;

		// Define Scanner object to catch all user inputs from console
	        Scanner scanner = new Scanner(System.in);

		// Star process reading values
	        System.out.println("Enter employee name");
	        name = scanner.nextLine();

		System.out.println("Enter the base Salary for " + name + " in USD$");
	        baseSalary = scanner.nextDouble();

		System.out.println("How much hours " + name + " works");
                extraHours = scanner.nextDouble();

		hourSalary = (baseSalary / 30 / 8) * extraHours;

		baseSalary = baseSalary;
		
		rent = (baseSalary + hourSalary) * rentFactor;
		isss = (baseSalary + hourSalary) * isssFactor;
		afp = (baseSalary + hourSalary) * afpFactor;

		totalDiscounts = afp + isss + rent;
	
		netSalary = baseSalary + hourSalary - totalDiscounts;
	
		System.out.printf(
        		"\nThe base salary for \n" + name + " is $%.2f \n\n"
			+ "Overtime worked: %.2f hours\n"
			+ "Salary for extra hour worked: $%.2f \n\n"
	                + "Discounts: \n"
			+ "-------------------------\n"
			+ " AFP:\t\t $%.2f \n" 
			+ " Renta:\t\t $%.2f \n"
			+ " ISSS:\t\t $%.2f \n"
			+ "-------------------------\n"
			+ "Total\t\t $%.2f\n\n"
        	        + "NET SALARY:\t $%.2f\n"
			+ "-------------------------\n",
				baseSalary, 
				extraHours,
				hourSalary,
				afp,
				rent,
				isss,
				totalDiscounts,
				netSalary
                );
	}
}
