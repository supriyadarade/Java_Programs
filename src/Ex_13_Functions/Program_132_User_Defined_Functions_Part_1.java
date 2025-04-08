package Ex_13_Functions;

public class Program_132_User_Defined_Functions_Part_1 {

    public static void main(String[] args) {

        // User Defined Functions

        // 1. Without Parameters and Without Return Type - wop-wor
        // 2. Without Parameters and With Return Type - wop-wr
        // 3. With Parameters and Without Return Type - wp-wor
        // 4. With Parameters and With Return Type - wp-wr

        // 1. Without Arguments  / Parameters and Without Return Type
        wop_wor_greet();

        // 2. Without Parameters and With Return Type
        String msg = greet_with_hello_wop_wrt();
        System.out.println(msg);

        // 3. With Parameters and Without Return Type - wp-wor - 90% we are using this
        greet_details_wp_wor("Supriya", 31, 5000);
        greet_details_wp_wor("Satish", 32, 10000);

        greet_full_name_wp_wor("Supriya", "Darade");

        // 4. With Parameters and With Return Type - wp-wr
        int addition1 = sum_of_two_numbers(4,6);
        System.out.println(addition1);

        int addition2 = sum_of_three_numbers(9,7, 6);
        System.out.println(addition2);

    }

    // 1. Without Parameters and Without Return Type
    static void wop_wor_greet() {
        System.out.println("Hi, How are you?");
    }

    // 2. Without Parameters and With Return Type
    static String greet_with_hello_wop_wrt() {
        System.out.println("Hello");
        return"Hi return";
    }

    // 3. With Parameters and Without Return Type - wp-wor - 90% we are using this
    static void greet_details_wp_wor(String name , int age , double salary) {
        System.out.println("Your name is -> " + name + "\nYour age is -> " + age + "\nYour salary is -> " + salary);
    }

    static void greet_full_name_wp_wor(String firstname , String lastname) {
        System.out.println("Your Full Name is -> " + firstname + lastname);
    }

    // 4. With Parameters and With Return Type - wp-wr
    static int sum_of_two_numbers(int a, int b) {
        return a + b;
    }

    static int sum_of_three_numbers(int a, int b, int c) {
        return a + b + c;
    }
}
