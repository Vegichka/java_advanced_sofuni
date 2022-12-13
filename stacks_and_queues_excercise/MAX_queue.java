package stacks_and_queues_excercise;
import java.util.*;
public class MAX_queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();
         for(int i = 0; i < n; i ++){
         int [] commands= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
         int commandTYPE = commands[0];
         switch(commandTYPE){
             case 1:
                 queue.push(commands[1]);
                 break;
             case 2:
                 queue.pop();
                 break;
             case 3:
                 System.out.println(Collections.max(queue));
                 break;
                 
         }
         scanner.close();
        }
    }
}
