package multy_array_exercise;
import java.util.*;
public class fill_matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input[] = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String pattern = input[1];
        int matrix[][] = new int[n][n];

        switch (pattern) {
            case "A":
                 PatternA(n, matrix);
              printMatrix(n, matrix);
                break;

                case "B":
                PatternB(n, matrix);
                printMatrix(n, matrix);
                break;
            default:
                break;
        }
        PatternB(n, matrix);
       
       

scanner.close();
    }
    //printMatrix:
    private static void printMatrix(int n, int[][] matrix) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    //PaternB:
    private static void PatternB(int n, int matrix[][]){
        int counter = 1;
         // => first fill - purva colona index - >(00, 21, 02)
        // => second fill - vtora colona index - >(10, 11, 12)
        // => third fill - treta colona index - > (20, 01, 22)
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                //ako colonata e chetna -> populvam ot gore nadolu
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
                //ako e colonata e nechetna -> populvam ot dolu nagore
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        }
    }
    //PatternA:
    private static void PatternA(int size, int[][] matrix) {
        int counter = 1;
        // for -> 1) COLONA - 2) RED 
        // => first fill - purva colona index - >(00, 01, 02)
        // => second fill - vtora colona index - >(10, 11, 12)
        // => third fill - treta colona index - > (20, 21, 22)
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
    }
}
