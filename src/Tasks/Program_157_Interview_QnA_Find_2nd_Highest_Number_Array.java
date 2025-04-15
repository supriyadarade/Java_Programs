package Tasks;

import java.util.Arrays;

public class Program_157_Interview_QnA_Find_2nd_Highest_Number_Array {
    public static void main(String[] args) {
        // Find second larger set number
        int[] numbers = {1, 2, 34, 87, 42, 67, 9, 21};
        // 87, 67
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
