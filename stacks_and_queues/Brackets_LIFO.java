package stacks_and_queues;
import java.util.*;
public class Brackets_LIFO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String uravnenie = scanner.nextLine();

        ArrayDeque<Integer> indexes = new ArrayDeque<>();
        for(int i = 0; i < uravnenie.length(); i++){
            char currentsymbol = uravnenie.charAt(i);
            if(currentsymbol == '('){
                indexes.push(i);
            } else if(currentsymbol == ')'){
                int lastIndex = indexes.pop();
                String betweenBrackets = uravnenie.substring(lastIndex, i + 1);
                //символите между засечените скоби - от lastIndex до i
                System.out.println(betweenBrackets);
                scanner.close();
            }
        }
    }
}
