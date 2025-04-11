package Ex_14_Strings;

public class Program_141_Interview_QnA_3 {

    public static void main(String[] args) {

        String s1 = "Hello";  // Will be saved in SCP
        String s2 = "Hello";  // Will be saved in SCP
        String s3 = "Hello";  // Will be saved in SCP

        // How many strings it will create?
        // The answer is one bcoz in the SCP there is no duplicate

        String s4 = new String ("Hello");  // Will be saved in Object area
        String s5 = new String ("Hello");  // Will be saved in Object area
        String s6 = new String ("hello");  // Will be saved in Object area

        // How many strings it will create?
        // The answer is three bcoz in the OA it will create all new strings

        // == -> Comparison -> String -> This will check the locations ref.

        System.out.println(s1 == s4);
        System.out.println(s2 == s5);
        System.out.println(s3 == s6);

        System.out.println(s1 == s2);
        System.out.println(s4 == s6); // contain is same but the location is different bcoz in the OA

        // equals (content) -> value -> it will compare the string contain

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s6));
        System.out.println(s2.equals(s4));
        System.out.println(s2.equals(s6));
        System.out.println(s2.equalsIgnoreCase(s4));

        // equalsIgnoreCase - it will always check for spelling - supriya, Supriya, SUPRIYA, SuPriya
        // == -> Check for referencer
        // = -> Assign the value



    }
}
