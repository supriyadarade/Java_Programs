package Ex_08_If_Condition;

public class Program_080_if_P1 {

    public static void main(String[] args ) {

        int age = Integer.parseInt(args[0]);
        if (age > 18) {
            System.out.println("You can go to GOA !");
        }
        else {
            System.out.println("You can't go to GOA !!");
        }
    }
}
