package stacks_and_queues_excercise;
import java.util.*;
public class Brackets_fitting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();
        boolean isValid = true;
        for(int i = 0; i < brackets.length(); i++){
            char currentBrackets = brackets.charAt(i);
            if(currentBrackets == '{' || currentBrackets == '(' || currentBrackets == '['){
                openingBrackets.push(currentBrackets);
            } else{
                char lastOpeningBracket = openingBrackets.pop();
                if(currentBrackets == '}' && lastOpeningBracket != '{' ){
                    isValid = false;
                } else if(currentBrackets == ')' && lastOpeningBracket != '(') {
                    isValid = false;
                } else if(currentBrackets == ']' && lastOpeningBracket != '[' ){
                    isValid = false;
                }
            }
        }
       if(isValid){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }
       scanner.close();

    }
}
