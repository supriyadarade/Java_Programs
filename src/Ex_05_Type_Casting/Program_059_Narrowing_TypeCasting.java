package Ex_05_Type_Casting;

public class Program_059_Narrowing_TypeCasting {

    public static void main(String[] args) {

        int a = 300;
        // byte b = a; // Invalid - Narrowing - Implicit Casting -  Not allowed.

        byte b = (byte) a; // Valid - Narrowing - Explicit Casting - Allowed.
        // Data Loss.
        System.out.println(b);
        // 200 will convert in the binary number
        // Then it will take 8 bits and converted it to the decimal
    }
}
