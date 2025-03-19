package Ex_03_Literals;

public class Program_034_Char_Literals {

    public static void main(String[] args) {

        char c1 = 'A'; // A - z, a - z, !@#$%^&*()_+
        // char c2 = "A"; // This is no a char this is string
        char c2 = 'B';
        char c3 = '@';
        char c4 = '1';
        char c5 = '-';
        char c6 = '(';
        char c7 = ' ';    // Blank space


        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

       System.out.println("SupriyaDarade");
       System.out.println("Supriya" + new_line + "Darade");
       System.out.println("Supriya" + tab_line + "Darade");
       System.out.println("Supriya" + back_space + "Darade");
       System.out.println("Supriya" + carriage_return + "Darade");

        System.out.println("Hi, This is a first line \nThis is a second line \nThis is a third line ");

        char c10 = 'A';
        System.out.println(c10);

        char my_smile = '\u1f60';
        System.out.println(my_smile);

    }
}
