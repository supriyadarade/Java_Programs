package Ex_11_While_Loop;

import java.util.Scanner;
import java.util.Random;

public class Program_123_Guessing_Game {

    public static void main(String[] args) {
        // Guessing the number

        Random random = new Random();
        int NumberToGuess = random.nextInt(100) + 1;
       // System.out.println(NumberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int guess;
        int attempts = 0;

        while (true) {
            guess = scanner.nextInt();
            attempts++;

            if (guess < NumberToGuess) {
                System.out.println("Number is Too low, Please try again");
            }
            else if (guess > NumberToGuess) {
                System.out.println("Number is Too High, Try again");
            }
            else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            }
        }
    }
}
