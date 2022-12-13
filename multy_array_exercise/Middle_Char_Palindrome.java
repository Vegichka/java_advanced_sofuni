package multy_array_exercise;
import java.util.*;
public class Middle_Char_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input[] = Arrays.stream( scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
        int rows = input[0];
        int cols = input[1];
        String matrix[][] = new String[rows][cols];

        for ( int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < cols; j ++){
                char outside = (char)('a' + i); // 'a' + index of row(examp: 'a' + 0 = 'a', 'a' + 1 = 'b')
                char middle = (char)('a'+ i +  j);// outside('a' + i) + index of row
               //matrix[i][j] = "" + outside + middle + outside; -> variant 1
               //vsichko subrano sus string se prevrushta vuv string
               matrix[i][j] =String.valueOf(outside) + middle + outside;
               // - > variant 2
            }
        }
        scanner.close();
        printMatrix(matrix);
    }
    //printMatrix:
    private static void printMatrix( String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
