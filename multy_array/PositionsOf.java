package multy_array;
import java.util.*;
public class PositionsOf {
    public static void main(String[] args) {
        //read matrix
        Scanner scanner = new Scanner(System.in);
        int matrix[][]= readMatrix(scanner);
        //search number
        int num = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for(int i = 0; i < matrix.length; i ++)
            for(int j = 0; j < matrix[i].length; j ++)
                if(matrix[i][j] == num){
                    System.out.println(i + " " + j);
                isFound = true;
                }
                if(!isFound)
                System.out.println("not found");
    
            
        }
    
    private static int[][] readMatrix(Scanner scanner) {
        String[] dimensions = scanner.nextLine().split("\\s+");
 
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
 
        int[][] matrix = new int[rows][cols];
 
        for (int row = 0; row < rows; row++) {
 
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
 
            matrix[row] = arr;
        }
        return matrix;
    }
}
