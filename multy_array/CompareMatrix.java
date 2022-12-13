package multy_array;
import java.util.*;
public class CompareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixSizes = scanner.nextLine().split("\\s+");
        //read first matrix(sizes and elements)
        int rows = Integer.parseInt(matrixSizes[0]);
        int cols = Integer.parseInt(matrixSizes[1]);
        int[][] firstMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] rowArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            firstMatrix[i] = rowArr;
        }
        //read Second matrix SIZES
        String[] secondMatrixSizes = scanner.nextLine().split("\\s+");
        int secRows = Integer.parseInt(secondMatrixSizes[0]);
        int secCols = Integer.parseInt(secondMatrixSizes[1]);
        //if the sizes of 1 and 2 matrixes are not equal
        if (rows != secRows || cols != secCols) {
            System.out.println("not equal");
            return;
        }
        //read elements of second matrix
        int[][] secondMatrix = new int[secRows][secCols];
        for (int i = 0; i < secRows; i++) {
            int[] secRowArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            secondMatrix[i] = secRowArr;
        }
       
        //method for comparing the elements of the 2 matrix
        boolean areEqual = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (firstMatrix[i][j] == secondMatrix[i][j]) {
                    areEqual = true;
                } else {
                    System.out.println("not equal");
                    return;
                }
            }
        }
        //printing result
        if (areEqual) {
            System.out.println("equal");
        } scanner.close();
       
    }
   // private static void printMatrix(int matrix[][]){
     //   for (int i = 0; i < matrix.length; i++) {
       //    for(int j = 0; j < matrix[i].length; j ++){
         //   System.out.print(matrix[i][j] + " ");
           //}
         //  System.out.println();
        //}
    //}
}
