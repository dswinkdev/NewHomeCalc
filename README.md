# New Home Calculator

The `HouseCalc` program is designed to calculate the monthly mortgage payment for a home loan based on user input. The program also compares this payment against a series of additional interest rates.

The `space` method is a simple utility function that prints an empty line to the console, used to improve the readability of the output.

The `main` method is where the program execution begins. It starts by creating a `Scanner` object to read input from the user. The program prompts the user to enter the principal loan amount, the annual interest rate, and the loan term in years. These inputs are stored in the `principal`, `annualInterestRate`, and `loanTermYears` variables, respectively.

The program then calculates the monthly interest rate by dividing the annual interest rate by 100 to convert it to a decimal, and then by 12 to convert it to a monthly rate. The number of monthly payments is calculated by multiplying the loan term in years by 12.

Next, the program calculates the monthly mortgage payment using the formula for a fixed-rate mortgage. This formula involves raising (1 + monthly interest rate) to the power of the number of payments, and then using this result in a fraction to determine the monthly payment. The calculated monthly payment is then printed to the console.

The program then outputs a header for additional interest rate calculations and iterates over an array of predefined interest rates. For each interest rate, the program recalculates the monthly payment using the same formula, adjusted for the current rate. The results are printed to the console, allowing the user to see how the monthly payment would change with different interest rates.

Finally, the `Scanner` object is closed to free up resources.

This program is a practical tool for anyone looking to understand their potential mortgage payments under different interest rate scenarios.
