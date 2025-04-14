package Ex_16_Arrays;

public class Program_150_Arrays_3 {

    public static void main(String[] args) {  // you can write any thing in the args like abc or supriya or xyz

        // 1st way to create a array
        int[] marks1 = {1, 2, 3, 4, 5, 6};

        // 2nd way to create the arrays
        int[] marks2 = new int[5];  // Fixed value
        int marks3[] = new int[5];  // Fixed value
        int marks4 = 10;  // This is just a integer

        // String Arrays
        String[] names = new String[3];
        names[0] = "Supriya";
        names[1] = "Satish";
        names[2] = "Darade";

        System.out.println(marks4);
        System.out.println(marks1); // It will print address bcoz we did not assign the values.
    }
}
