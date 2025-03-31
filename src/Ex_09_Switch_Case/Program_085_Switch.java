package Ex_09_Switch_Case;

import java.util.Scanner;

public class Program_085_Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number");
        int day = scanner.nextInt();

        switch (day) {

            case 1 :
                System.out.println("Monday");
                break;

            case 2 :
                System.out.println("Tuesday");
                break;
        }
    }
}
