package Ex_13_Functions;

import java.util.Scanner;

public class Program_134_Function_Arithmetic {

    public static void main(String[] args) {

        // Create a function of Sub, Sum, Mul, Div
        // With the parameter a and b. User will give you a parameter

        // Logic Building Formula
        // Step 1 -> Inputs and Outputs
        // a, b -> int -> Scanner
        // int - variable result

        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments / parameters

        // Write the code and fix the edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of number a -> ");
        int a = 0;
        if (scanner.hasNextInt()) {
                 a = scanner.nextInt();
        }
        else {
            System.out.println("Please enter the integer value");
            System.exit(0);
        }

        System.out.println("Enter the value of number b -> ");
        int b = 0;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        }
        else {
            System.out.println("Please enter the integer value");
            System.exit(0);
        }

        int result_sub = sub (a , b);
        int result_sum = sum (a , b);
        int result_mul = mul (a , b);
        int result_div = div (a , b);
        int result_mod = mod (a , b);

        System.out.println(result_sub);
        System.out.println(result_sum);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);

    }
    static int sub(int a , int b) {
        return a - b;
    }

    static int sum(int a , int b) {
        return a + b;
    }

    static int mul(int a , int b) {
        return a * b;
    }

    static int div(int a , int b) {
        if (b == 0) {
            System.out.println("division with the 0 is not allowed");
            System.exit(0);
        }
        return a / b;
    }

    static int mod(int a , int b) {
        return a % b;
    }
}
