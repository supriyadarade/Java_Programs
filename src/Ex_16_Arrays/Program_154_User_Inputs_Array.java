package Ex_16_Arrays;

import java.util.Scanner;

public class Program_154_User_Inputs_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] numbers_marks = new int [size];
//        float[] numbers_marks = new float[size];
//        String[] numbers_marks = new String[size];
        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println("Enter the number");
            numbers_marks[i] = sc.nextInt();
        }
        System.out.println("-------");

        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println(numbers_marks[i]);
        }
    }
}
