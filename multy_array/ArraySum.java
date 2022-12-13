package multy_array;
import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrix[][]= readMatrix(scanner); 
        //sum
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
            
        }

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);
    }
    private static int[][] readMatrix(Scanner scanner) {
        String[] dimensions = scanner.nextLine().split(", ");
 
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
 
        int[][] matrix = new int[rows][cols];
 
        for (int row = 0; row < rows; row++) {
 
            int[] arr = Arrays.stream(scanner.nextLine().split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
 
            matrix[row] = arr;
        }
        return matrix;
    }

}
