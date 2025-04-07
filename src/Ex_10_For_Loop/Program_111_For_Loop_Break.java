package Ex_10_For_Loop;

public class Program_111_For_Loop_Break {

    public static void main(String[] args) {

        for (int i = 0; i < 50 ; i++) {
            if (i == 5 ) {
                System.out.println("i == 5 statement is true, breaking the for loop.");
                break;
            }
            System.out.printf("Number i = %d\n", i); // in loop sentience
        }
        System.out.println("Outside For loop"); // out of the loop sentience
    }
}
