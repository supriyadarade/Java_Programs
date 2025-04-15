package Ex_16_Arrays;

import java.util.Scanner;

public class Program_165_2D_Left_Triangle {
    public static void main(String[] args) {
        // How the pattern you want
        // n = 3
        // ***
        // **
        // *

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {          // When i is greater than j then the value will get print
            for (int j = n ; j > i ; j--) {    // When j is greater than i we don't want the value to be print
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// int n = 3;
// for(int i = n ; i >= 1 ; i--) {
//      for( int j = 1 ; j <= i ; j++) {
//         System.out.print("*");
//      }
//   System.out.print();
// }