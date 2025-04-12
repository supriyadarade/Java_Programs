package Ex_15_StringBuffer_Builder_String_Functions;

public class Program_144_StringBuilder_Vs_StringBuffer {

    public static void main(String[] args) {

        // 90% of the time we are using string
        // Below is the syntax of how we create strings in two different types

        String so = "Supriya";
        String s1 = new String ("Supriya");

        // Below is the syntax of how to create StringBuilder and StringBuffer
        StringBuilder stringBuilder = new StringBuilder("Supriya");
        StringBuffer stringBuffer = new StringBuffer("Supriya");

        System.out.println(so);
        System.out.println(s1);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
    }
}
