package Ex_06_Ternary_Operator;

public class Program_065_TO_P2 {
    public static void main(String[] args) {

        // Find the maximum number between two number
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));

        String max = x > y ? "X is max" : "Y is max";
        System.out.println(max);

        int max1 = x > y ? x : y;
        System.out.println(max1);

    }
}
