package Ex_09_Switch_Case;

public class Program_092_JDK_13_Above {

    public static void main (String[] args) {

        // in JDK > 13 it wil work -> New Concept

        int item_code = 001;

        switch (item_code) {

            case 001 -> System.out.println("001");
            case 002 -> System.out.println("001");
            case 003 -> System.out.println("001");
            default -> System.out.println("Default");

        }
    }
}
