package Ex_10_For_Loop;

public class Program_112_For_Loop_Continue {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) { // 0 to 49  --  50 times it will run
            if (i == 5) {
                continue;              // Skip the below program, and move to top

            }
            System.out.printf("Number i = %d\n", i);

        }

    }
}
