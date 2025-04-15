package Ex_16_Arrays;

public class Program_162_2DArray_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 3x3 matrix

        for (int i = 0; i < matrix.length; i++) {          // matrix.length -> this will provide you the rows
            for (int j = 0; j < matrix[i].length; j++) {   // matrix[i].length -> this will provide you the columns
               // System.out.println(matrix[i][j]);
               // System.out.print(matrix[i][j] + " | ");
               // System.out.print(matrix[i][j] + " ");
                System.out.print("* " + " ");
            }
            System.out.println();
        }
    }
}
