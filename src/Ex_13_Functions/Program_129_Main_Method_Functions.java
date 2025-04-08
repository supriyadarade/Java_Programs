package Ex_13_Functions;

public class Program_129_Main_Method_Functions {

    public static void main(String[] args) {
        // JVM calling the main function
        // If you don't call the function then the code will not execute
        f1();
        name_of_the_function();
    }
    // Step 1 -> Def
    static void f1() {
        System.out.println("Hello");
    }
    static void name_of_the_function() {
        System.out.println("This is the code that you want");
    }
}
