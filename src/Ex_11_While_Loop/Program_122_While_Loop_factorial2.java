package Ex_11_While_Loop;

import java.util.Scanner;

public class Program_122_While_Loop_factorial2 {

    public static void main(String[] args) {
        // Factorial program

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read the input from the user
        System.out.println("Welcome to the factorial program");
        int number = scanner.nextInt();  // Read an integer input from the user

        int factorial = 1;  // Initialize the factorial variable to 1
        int i = 1;

        if (number <= 0) {   // Check if the factorial variable to 1
            System.out.println("Factorial is -> " + factorial);   // If ture, print the factorial is 1
        }
        else {
            // If the number is greater than 0, calculate the factorial
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }
        }
        System.out.println("Factorial is -> " + factorial);  // Print the calculated factorial value
    }
}

