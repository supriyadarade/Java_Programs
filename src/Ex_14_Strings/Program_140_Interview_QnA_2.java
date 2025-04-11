package Ex_14_Strings;

public class Program_140_Interview_QnA_2 {

    public static void main(String[] args) {

        String s1 = "Hello";  // Will be saved in SCP
        String s2 = "Hello";  // Will be saved in SCP
        String s3 = "Hello";  // Will be saved in SCP

        // How many strings it will create?
        // The answer is one bcoz in the SCP there is no duplicate

        String s4 = new String ("Hello");  // Will be saved in Object area
        String s5 = new String ("Hello");  // Will be saved in Object area
        String s6 = new String ("Hello");  // Will be saved in Object area

        // How many strings it will create?
        // The answer is three bcoz in the OA it will create all new strings


    }
}
