package Ex_07_Increment_Decrement;

public class Program_076_Incre_Example2 {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // ++a -> A -> ExpA - 11, a -> 11
        // +
        // ++a -> B -> ExpB - 12, a -> 12
        // A+B -> ExpA+ExpB - 11+12 -> 23, a -> 12
    }
}
