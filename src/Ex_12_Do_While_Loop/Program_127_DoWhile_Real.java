package Ex_12_Do_While_Loop;

public class Program_127_DoWhile_Real {

    public static void main(String[] args) {

        // Web automation
        int number = 0;
        // 0 -> it can be 0 to 10 - elements or students
        do {
            System.out.println(number);
            // Call function(number);
            // we use do while loop if we need to open the file for 1 time or close the file.
            number++;
        }
        while (number < 0);
    }
}
