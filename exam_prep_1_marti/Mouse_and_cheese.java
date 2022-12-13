package exam_prep_1_marti;
import java.util.*;
public class Mouse_and_cheese {
   //статични променливи, за да ги ползвам във всеки метод
   private static int row;
   private static int col;
   //row и col важат за това на кой ред и колона се намира мишката
   private static int eatenCheese;
   private static boolean mouseIsInField = true;
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       //creat 2D square array
       int n = Integer.parseInt(scanner.nextLine());
       char field[][] = new char[n][n];
       //read elements
       for(int i =0; i < field.length; i ++){
           String line = scanner.nextLine();//линия
           field[i] = line.toCharArray();//елементи от линията


    
           if(line.contains("M")){//ако линията съдържа "M"
               row = i;//реда е i
               col = line.indexOf("M");//колоната е индекса на линията. на който се намира М
           }
       } 
      
       
       String command = scanner.nextLine();
       while(!command.equals("end") && mouseIsInField){
           

        if (command.equals("up")) {
            moveMouse(field, -1, 0);
        } else if (command.equals("down")) {
            moveMouse(field, 1, 0);
        } else if (command.equals("left")) {
            moveMouse(field, 0, -1);
        } else if (command.equals("right")) {
            moveMouse(field, 0, 1);
        }

        if (!mouseIsInField) {
            break;
        }

        command = scanner.nextLine();
    }
       
       if(!mouseIsInField){
        System.out.println("Where is the mouse?");
    }

       if (eatenCheese >= 5) {
           System.out.println("Great job, the mouse is fed " + eatenCheese + " cheeses!");
       } else {
           System.out.println("The mouse couldn't eat the cheeses, she needed " +
                   (5 - eatenCheese) + " cheeses more.");
       }
       printMatrix(field);
       scanner.close();
   }
   //moving method
   private static void moveMouse(char[][] field, int rowMutator, int colMutator) {
    int nextRow = row + rowMutator;
    int nextCol = col + colMutator;

    boolean isBonusHit = false;

    if (!isInBounds(field, nextRow, nextCol)) {
        field[row][col] = '-';
        mouseIsInField = false;
        return;
    }

    //cheese
    if (field[nextRow][nextCol] == 'c') {
        eatenCheese++;
        //bonus
    } else if (field[nextRow][nextCol] == 'B') {
        isBonusHit = true;
    }
    //предишното М се превръща в -
    field[row][col] = '-';
    field[nextRow][nextCol] = 'M';
    row = nextRow;//следващия row се превръща в текущ
    col = nextCol;

    if (isBonusHit) {
        // Call this same method with the same mutators again if bonus is hit
        //рекурсия
        moveMouse(field, rowMutator, colMutator);
    }
}

private static boolean isInBounds(char[][] field, int r, int c) {
    return r >= 0 && r < field.length && c >= 0 && c < field[r].length;
}

private static void printMatrix(char[][] field) {
    for (char[] arr : field) {
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }
}
      
}
