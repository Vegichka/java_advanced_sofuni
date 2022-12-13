package multy_array_exercise;
import java.util.*;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int matrix[][] = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
 
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
 
            matrix[row] = arr;
        }

        int mainDiagSum = 0;
        for (int counter = 0; counter < n; counter++) {
            mainDiagSum += matrix[counter][counter]; //matrix[0][0] + matrix[1][1] + ...(diagonalni chisla)
        }

        
        //for (int row = 0, col = size - 1; row < size; row++, col--) {
            //            secondDiagSum +=matrix[row][col];
            //        }


            int secondDiagSum = 0;

            for (int row = 0; row < n; row++) {
             secondDiagSum +=matrix[row][n - row - 1];
             }       
            
                int result = Math.abs(mainDiagSum - secondDiagSum);
                System.out.println( result);
                System.out.println(mainDiagSum);
                System.out.println(secondDiagSum);
                scanner.close();
    }
}
