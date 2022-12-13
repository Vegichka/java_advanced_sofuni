package multy_array;
import java.util.*;
public class Sum_2x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split(", "))
        .mapToInt(Integer::parseInt)
        .toArray();

        int rows = input[0];
        int cols = input[1];

        int matrix[][] = new int[rows][cols];
        //read elements
        for(int i =0; i < matrix.length; i ++){
            matrix[i] = Arrays.stream(scanner.nextLine().split(", "))
            .mapToInt(Integer::parseInt)
            .toArray();
          
        } 
        
        int maxSum = Integer.MIN_VALUE;
        int [][] resultMatrix = new int[2][2];
        for (int i = 0; i < matrix.length - 1; i++) {
            for(int j = 0; j < matrix[i].length - 1; j ++){ // -1, zashtoto inache shte gledam sum na polovin matrica
            
                int curSum = matrix[i][j] + matrix[i][j + 1]
                + matrix[i + 1][j] + matrix[i+1][j + 1];

                if(maxSum < curSum){
                maxSum = curSum;
                //new result matrix
               resultMatrix = new int[][]{
                {matrix[i][j],matrix[i][j+1]},
                {matrix[i+1][j], matrix[i+1][j+1]}
               };
            }
        }
        }
          printMatrix(resultMatrix);
        System.out.println(maxSum);
       scanner.close();
    }
    private static void printMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
           for(int j = 0; j < matrix[i].length; j ++){
            System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
        }
    }
}
