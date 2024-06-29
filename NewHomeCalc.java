import java.util.Scanner;

public class NewHomeCalc {

	// newline method
	static void space() {
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get the loan amount (principal)
		System.out.print("Enter the loan amount (principal): $");
		double principal = scanner.nextDouble();

		// Get the annual interest rate
		System.out.print("Enter the annual interest rate (in percentage): %");
		double annualInterestRate = scanner.nextDouble();

		// Get the loan term in years
		System.out.print("Enter the loan term (in years): ");
		int loanTermYears = scanner.nextInt();

		// Calculate the monthly interest rate
		double monthlyInterestRate = (annualInterestRate / 100) / 12;

		// Calculate the number of monthly payments
		int numberOfPayments = loanTermYears * 12;

		// Calculate the monthly mortgage payment using the formula
		double monthlyPayment = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
				/ (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

		// Print the monthly mortgage payment
		space();
		System.out.printf("Monthly mortgage payment: $%.2f\n", monthlyPayment);

		space();
		System.out.println("-------------------------");
		System.out.println("Additional Interest Rates");
		System.out.println("-------------------------");
		space();

		// Array of additional interest rates to calculate the payments for
		double[] interestRates = { 3, 3.5, 4, 5, 6, 7, 8, 9, 10 };

		// Calculate and display the monthly payment for each additional interest rate
		for (double rate : interestRates) {
			double rateMonthlyInterestRate = (rate / 100) / 12;
			double rateMonthlyPayment = (principal * rateMonthlyInterestRate
					* Math.pow(1 + rateMonthlyInterestRate, numberOfPayments))
					/ (Math.pow(1 + rateMonthlyInterestRate, numberOfPayments) - 1);
			System.out.printf("%.1f%% interest rate: $%.2f\n", rate, rateMonthlyPayment);
		}

		scanner.close();
	}
}
