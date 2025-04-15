package Ex_16_Arrays;

import java.util.Scanner;

public class Program_164_2D_Multiplication_Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int Size_of_the_table = sc.nextInt();

        for (int i = 0; i < Size_of_the_table; i++) {
            for (int j = 0; j < Size_of_the_table; j++) {
               // System.out.print(i + "x" + j + "=" + (i * j) + "\t");
               System.out.print((i * j) + "\t");  // \t means tab for space
            }
            System.out.println();
        }
    }
}
