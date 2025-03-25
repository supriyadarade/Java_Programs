package Ex_06_Ternary_Operator;

public class Program_064_Interview_QnA {
    public static void main(String[] args) {

        // Nested Ternary
        // result = Condition 1 ? Expression 1 : (Condition 2 ? Expression 2 : Expression 3)

        int number = 5;
        String Result = (number > 10) ? "A" : "B";
        System.out.println(Result);

        int number1 = 20;
        String Result2 = (number1 > 10) ? (number1 > 20 ? "N>20" : "N<20") : "B";
        System.out.println(Result2);
    }
}
