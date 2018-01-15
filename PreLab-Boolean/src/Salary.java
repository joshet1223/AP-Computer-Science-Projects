// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (an int: 1 for "Excellent", 2 for
//   "Good" or 3 for "Poor") are input.
// ***************************************************************
import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {
	public static void main(String[] args) {
		double currentSalary; // employee's current salary
		double raise = 0; // amount of the raise
		double newSalary; // new salary for the employee
		int rating; // performance rating
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print("Enter the performance rating " + "(1 for Excellent, 2 for Good, or 3 for Poor): ");
		rating = scan.nextInt();
		// Compute the raise using if ...
		if (rating == 1) {
			raise = currentSalary * .06;
		} else if (rating == 2) {
			raise = currentSalary * .04;
		} else if (rating == 3) {
			raise = currentSalary * .015;
		}
		newSalary = currentSalary + raise;
		// Print the results
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary:       " + money.format(currentSalary));
		System.out.println("Amount of your raise: " + money.format(raise));
		System.out.println("Your new salary:      " + money.format(newSalary));
		System.out.println();
	}
}
