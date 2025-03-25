package Ex_05_Type_Casting;

public class Program_058_Widening_TypeCasting2 {
    public static void main(String[] args) {

        byte b = 10;
        int a = b;       // Implicit Casting
        int a1 = (int)b; // Explicit Casting - Widening (Doesn't Require)
        // JVM knows
    }
}
