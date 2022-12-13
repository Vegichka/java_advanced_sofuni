package exam_prep_1_marti;
import java.util.*;
import java.util.stream.Collectors;

import javax.naming.spi.DirStateFactory.Result;
public class Energy_drinks {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int result;
         int caffAmount = 300;
         int cafNew = 0;
        //read input -> first row -> quueue, second row -> stack

        //first row
        ArrayDeque<Integer> milligrams= new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))//не използвам Arrays.stream 
        //директно, защото, ако го направя, ще се държи като queue
                .map(Integer::parseInt)
                .forEach(milligrams::push);

        //second row
        ArrayDeque<Integer> drinks = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        while(!milligrams.isEmpty() && !drinks.isEmpty()){
            int lastMil = milligrams.pop();
            int firstDrink = drinks.poll();
            result = lastMil*firstDrink;
            
          
           
           
        }

        

      
        
    }
}
