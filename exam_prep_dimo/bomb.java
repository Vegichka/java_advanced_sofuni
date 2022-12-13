package exam_prep_dimo;
import java.util.*;
import java.util.stream.Collectors;
public class bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read size 
        int n = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");

        char[][] matrix = new char[n][n];

        int sapperRow = 0;
        int sapperCol = 0;
        int bombCounter = 0;
        for (int row = 0; row < n; row++) {
            List<Character> characterList = Arrays.stream(scanner.nextLine().split(" "))
                    .map(e -> e.charAt(0))
                    .collect(Collectors.toList());



            for (int col = 0; col < characterList.size(); col++) {
                char currentChar = characterList.get(col);
                if (currentChar == 's') {
                    sapperRow = row;
                    sapperCol = col;
                } else if (currentChar == 'B') {
                    bombCounter++;
                }
                matrix[row][col] = currentChar;
            }
        }

        int bombsFound = 0;
        for (int i = 0; i < commands.length; i++) {
            String commandName = commands[i];
            switch (commandName) {
                case "up":
                    if (sapperRow != 0) {
                        sapperRow--;
                    }
                    break;
                case "down":
                    if (sapperRow != n - 1) {
                        sapperRow++;
                    }
                    break;
                case "right":
                    if (sapperCol != n - 1) {
                        sapperCol++;
                    }
                    break;
                case "left":
                    if (sapperCol != 0) {
                        sapperCol--;
                    }
                    break;
            }
            if(matrix[sapperRow][sapperCol] == 'B'){
                System.out.println("You found a bomb!");
                matrix[sapperRow][sapperCol] = '+';
                bombsFound++;
            } 
            if(bombCounter == bombsFound){
                System.out.println("Congratulations! You found all bombs!");
            }
            else if(matrix[sapperRow][sapperCol] == 'e')
            System.out.printf("END! %d bombs left on the field", bombCounter - bombsFound);
        }
        
        scanner.close();
    }

      
    }


