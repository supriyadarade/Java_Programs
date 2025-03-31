package Ex_09_Switch_Case;

public class Program_093_JDK_13_Above {

    public static void main(String[] args) {
        // It will only work in the JDK above 13
        int item_code = 001;

        switch (item_code) {

            case 001, 002, 003 :
                System.out.println("All of them are electronic gadgets.");
                break;

            case 004, 005, 006 :
                System.out.println("All of them are working gadgets numbers.");
                break;

            default :
                System.out.println("None");
                break;
        }
    }
}
