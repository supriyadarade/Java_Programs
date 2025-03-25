package Ex_05_Type_Casting;

public class Program_060_Narrowing_TypeCasting {
    public static void main(String[] args) {

        long phone_no = 9876543210l;
        // short a = phone_no; - Implicit narrowing is not possible
        short a = (short) phone_no; // Explicit narrowing is valid

        System.out.println(a);
    }
}
