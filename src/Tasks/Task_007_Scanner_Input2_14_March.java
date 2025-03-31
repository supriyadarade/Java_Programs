package Tasks;

import java.util.Scanner;

public class Task_007_Scanner_Input2_14_March {

    public static void main(String[] args) {

        //Take a user input - Name, Age and Salary and print them in the end.

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name : " );
        String Name = sc.nextLine();

        System.out.println("What is your Age : " );
        int Age = sc.nextInt();

        System.out.println("What is your salary : " );
        long Salary = sc.nextLong();

        System.out.printf(" Name : %s \n Age : %d \n Salary : %d", Name, Age, Salary);

//        System.out.println("Enter the Name, Age, Salary : ");
//        String name = args[0];
//        int age = Integer.parseInt(args[1]);
//        double salary = Double.parseDouble(args[2]);
//
//        System.out.println("Name");
//        System.out.println("Age");
//        System.out.println("Salary");

    }
}