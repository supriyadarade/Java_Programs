package Tasks;

import java.util.Scanner;

public class Task_008_TriangleClassification_14_March {

    public static void main(String[] args) {

        //Triangle Classifier:
        //
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal). Use an if-else statement to classify the triangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first side of the triangle ");
        int a = sc.nextInt();

        System.out.println("Enter the length of second side of the triangle ");
        int b = sc.nextInt();

        System.out.println("Enter the length of third side of the triangle ");
        int c = sc.nextInt();

//       else if (a == b) {
//           System.out.println("Only a and b sides are same");
//       }
//       else if (b == c) {
//           System.out.println("Only b and c sides are same");
//       }
//       else if (a == c) {
//           System.out.println("Only a and c sides are same");
//       }
        if (a == b && b == c) {
            System.out.println("Triangle is equilateral");
        }
       else if (a == b || b == c || a == c) {
            System.out.println("Triangle is isosceles");
        }
       else {
           System.out.println("Triangle is scalene");
       }
    }
}
