package Ex_07_Increment_Decrement;

public class Program_070_Increment1 {
    public static void main(String[] args) {

        // Pre - Increment ->  ++Operand
        // value is increased first and then stored in the result
        // value is increased by 1

        int a = 10;
        int b = ++a; // 10+1 -> b -> 11
        System.out.println(b);  // 11
        System.out.println(a);  // 11

        // Expression and Result Table
        // Line No  |     a     |  Result b
        // Line 10  |     10    |  NA
        // Line 11  |     11    |  11
        // Line 12  |  11 (NA)  |  11
        // Line 12  |     11    |  11 (NA)








    }
}
