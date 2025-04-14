package Ex_16_Arrays;

public class Program_153_Find_Array_Min_Max_Interview_QnA {

    public static void main(String[] args) {

        int[] array = {4, 9, 63, 81, 90, 21, 43, 67, 76, 45};
        // Can we take input from the user also - Yes
        // Max and Min

        // Max
        int max_output = give_me_array(array);
        System.out.println(max_output);

        // Min
        int min_output = give_me_min(array);
        System.out.println(min_output);
    }
    private static int give_me_array(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
        private static int give_me_min(int[] array) {
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
    }
}
