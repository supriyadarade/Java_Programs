package Ex_14_Strings;

public class Program_135_Strings_Immutable {

    public static void main(String[] args) {

        String name = "supriya";
        name.toUpperCase();
        name = name.toUpperCase();
        System.out.println(name);
    }
}
