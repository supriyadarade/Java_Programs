package Ex_02_Java_Basic;

public class Program_024_printF {

    public static void main(String[] args) {

        int a = 10;
        System.out.printf("Your variable is %d", a);
        // %d -> int, byte, long, short - data types
        // %s -> Strings
        // %f -> Float, Double
        // %b -> Boolean

        int b = 20;
        System.out.println("---");
        System.out.printf("%d + %d", a,b);
    }
}
