package Ex_08_If_Condition;

import java.util.Scanner;

public class Program_081_If_Else {

        // Allowed tto vote or not.
        // If Age > 18 -> Allowed top vote.
        // Else Age <18 -> Nt allowed to vote.

    public static void main(String[] args) {

        // How to take user input
        // 1. CLT Options

        // int age = Integer.parseInt(args[0]);

        // 2. Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");

        int age = sc.nextInt();
        System.out.printf("Age = %d\n",age);

        if (age >= 18) {
            System.out.println("You are allowed to vote.");
        }

        else {
            System.out.println("You are not allowed to vote.");

        }
    }
}

