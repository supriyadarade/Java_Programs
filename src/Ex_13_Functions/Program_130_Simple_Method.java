package Ex_13_Functions;

public class Program_130_Simple_Method {

    public static void main(String[] args) {

        // calling function
        supriya_f1();
        int function1 = return_int();
        System.out.println("Function 1 - " + function1);

        float function2 = return_float_pi_value();
        System.out.println("Function 2 - " + function2);

        boolean function3 = return_boolean();
        System.out.println("Function 3 - " + function3);

        long function4 = return_long();
        System.out.println("Function 4 - " + function4);

        byte function5 = return_byte();
        System.out.println("Function 5 - " + function5);

        String function6 = return_String();
        System.out.println("Function 6 - " + function6);
    }

    static void supriya_f1 () {
        System.out.println("No Return Value");
    }

    static int return_int () {
        return 10;
    }

    static float return_float_pi_value() {
        return 3.14f;
    }

    static boolean return_boolean() {
        return true;
    }

    static long return_long() {
        return 10l;
    }

    static byte return_byte() {
        return 100;
    }

    static String return_String() {
        return "Supriya";
    }
}
