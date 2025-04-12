package Ex_15_StringBuffer_StringBuilder_String_Functions;

public class Program_145_StringBuffer {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");  // this string will get add na previously is get deleted
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = "World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!" So the total strings created 3
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);
    }
}
