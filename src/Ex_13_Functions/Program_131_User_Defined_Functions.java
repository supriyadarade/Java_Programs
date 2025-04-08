package Ex_13_Functions;

public class Program_131_User_Defined_Functions {

    public static void main(String[] args) {

        int result_1 = sum_of_two_numbers(5, 9);
            System.out.println(result_1);

        int result_2 = sum_of_two_numbers(1, 64);
        System.out.println(result_2);
    }

    static int sum_of_two_numbers (int a, int b) {
        return a+b;
    }
}
