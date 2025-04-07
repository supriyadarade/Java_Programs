package Ex_11_While_Loop;

public class Program_117_While_Loop_3 {

    public static void main(String[] args) {

        int i = 5;
        boolean condition = false;
        while (i < 10) {
            // program will not run bcoz condition is false
            condition = true;
            System.out.println("Enter in the program");
            System.out.println(i);
            i++;
        }
        if (condition) {
            System.out.println("While loop executed ");
        }
        else {
            System.out.println("While loop is not executed");
        }
    }
}
