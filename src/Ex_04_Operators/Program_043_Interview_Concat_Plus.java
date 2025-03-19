package Ex_04_Operators;

public class Program_043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String First_Name = "Supriya";
        String Second_Name = "Darade";

        int a = 10;
        int b = 10;

        System.out.println(First_Name + Second_Name + a + b);
        // SupriyaDarade1010 - First operator is string it is considering a and b also is string
        // +  performed as concatenation

        System.out.println(a + b + First_Name + Second_Name);
        // it is considering 1st arithmetic operation

        System.out.println(First_Name + Second_Name + (a + b));
        // Now in this it will do the arithmetic operations
    }
}
