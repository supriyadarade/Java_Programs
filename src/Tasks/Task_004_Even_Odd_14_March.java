package Tasks;

import java.util.Scanner;

public class Task_004_Even_Odd_14_March {

    public static void main(String[] args) {

        // Take user input & Check weather the input is even or odd number

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number%2==0) {
            System.out.println(number+" is an even number");
        }

        else {
            System.out.println(number+ " is an odd number");
        }
    }
}

