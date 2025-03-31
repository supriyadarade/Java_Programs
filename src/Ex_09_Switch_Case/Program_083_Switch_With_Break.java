package Ex_09_Switch_Case;

import java.util.Scanner;

public class Program_083_Switch_With_Break {

    public static void main(String[] args) {
        // Switch
        // Take a user input and tell them the day which they have told.
        // 1 to 7 -- 1 -- Mon, 5 -- Fri
        // 8 -- Not allowed or error

        // int day = Integer.parseInt(args[0]);  -- 1st is CLI option

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day number : ");
        int day = scanner.nextInt();

        switch (day) {

            case 1 :
                System.out.println("Monday");
                break;

            case 2 :
                System.out.println("Tuesday");
                break;

            case 3 :
                System.out.println("Wednesday");
                break;

            case 4 :
                System.out.println("Thursday");
                break;

            case 5 :
                System.out.println("Friday");
                break;

            case 6 :
                System.out.println("Saturday");
                break;

            case 7 :
                System.out.println("Sunday");
                break;

            default :
                System.out.println("Invalid day number");
                break;
        }
    }
}
