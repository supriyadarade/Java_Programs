package Tasks;

public class Program_156_Sum_Of_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 13, 14};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);

        System.out.println("For Each------"); // Enhanced for loop
        for (int n : numbers) {
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
