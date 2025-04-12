package Ex_15_StringBuffer_StringBuilder_String_Functions;

public class Program_147_SB {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        sb.delete( 5 , 16 ); // It will deleted the 5 to 16 characters
        System.out.println(sb);

        sb.replace(0 , 4 , "C++");
        System.out.println(sb);



    }
}
