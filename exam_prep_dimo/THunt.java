package exam_prep_dimo;
import java.util.*;
import java.util.stream.Collectors;
public class THunt {
static int currentRow = 0;
static int currentCol = 0;
static int newRow;
static int newCol;
 static int rowMultiplier;
 static int colMultiplier;
static boolean treasureFind = false;
 static String input;
 static ArrayList<String> correctCommands = new ArrayList<>();
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = coordinates[0];
        int cols = coordinates[1];
        char[][] field = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            List<Character> characters = Arrays.stream(scanner.nextLine().split(" ")).map(c -> c.charAt(0)).collect(Collectors.toList());
            for (int col = 0; col < characters.size(); col++) {
                if (characters.get(col) == 'Y') {
                    currentRow = row;
                    currentCol = col;
                }
                field[row][col] = characters.get(col);
            }
        }
        while (!"Finish".equals(input = scanner.nextLine())) {
            switch (input) {
                case "up":
                    rowMultiplier = -1;
                    colMultiplier = 0;
                    newRow = currentRow + rowMultiplier;
                    newCol = currentCol + colMultiplier;
                    break;
                case "down":
                    rowMultiplier = 1;
                    colMultiplier = 0;
                    newRow = currentRow + rowMultiplier;
                    newCol = currentCol + colMultiplier;
                    break;
                case "left":
                    rowMultiplier = 0;
                    colMultiplier = -1;
                    newRow = currentRow + rowMultiplier;
                    newCol = currentCol + colMultiplier;
                    break;
                case "right":
                    rowMultiplier = 0;
                    colMultiplier = 1;
                    newRow = currentRow + rowMultiplier;
                    newCol = currentCol + colMultiplier;
                    break;
            }
            if (isInBounds(field)) {
                if (field[newRow][newCol] == 'T') {
                    newRow = newRow - rowMultiplier;
                    newCol = newCol - colMultiplier;
                    field[newRow][newCol] = 'Y';
                    currentRow = newRow;
                    currentCol = newCol;
                } else if (field[newRow][newCol] == 'X') {
                    correctCommands.add(input);
                    treasureFind = true;
                    break;
                } else {
                    field[newRow][newCol] = 'Y';
                    field[currentRow][currentCol] = '-';
                    currentRow = newRow;
                    currentCol = newCol;
                    correctCommands.add(input);
                }
            } else {
                newRow = newRow - rowMultiplier;
                newCol = newCol - colMultiplier;
                field[newRow][newCol] = 'Y';
                currentRow = newRow;
                currentCol = newCol;
            }
        }
        if (treasureFind) {
            System.out.println("I've found the treasure!");
            System.out.printf("The right path is %s", String.join(", ", correctCommands));
 
        } else {
            System.out.println("The map is fake!");
        }
    }
 
    private static boolean isInBounds(char[][] field) {
        return newRow >= 0 && newRow < field.length && newCol >= 0 && newCol < field[newRow].length;
    }
   
}

