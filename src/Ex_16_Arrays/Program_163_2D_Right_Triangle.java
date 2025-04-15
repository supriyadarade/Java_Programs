package Ex_16_Arrays;

import java.util.Scanner;

public class Program_163_2D_Right_Triangle {
    public static void main(String[] args) {
        // How the pattern you want
        // n = 3
        // *
        // **
        // ***

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {          // When i is greater than j then the value will get print
            for (int j = 0; j <= i ; j++) {    // When j is greater than i we don't want the value to be print
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
