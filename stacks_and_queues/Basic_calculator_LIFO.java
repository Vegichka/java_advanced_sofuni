package stacks_and_queues;
import java.util.*;
public class Basic_calculator_LIFO {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

       //String []tokens = kb.nextLine().split("\\s+");

       // ArrayDeque<String> stack = new ArrayDeque<>();
        //Collections.addAll(stack, tokens);
        //"свързвам" stack с tokens
        //въвеждам в конзола "1 2 3 4 5"(като масив)
       // for(String s: stack){
        //    System.out.println(s);
        //}
        //отпечатва ми ги едно под друго в реда, в който съм ги вкарала
        //не като в stack на обратно
        //1
        // 2
        // 3
        // 4
        // 5

        String [] tokens = kb.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, tokens);
        //свързва масива със stack

        while(stack.size() > 1){
            int firstnum = Integer.parseInt(stack.pop());//взима се числова стойност, но се превръща в String
            String operation = stack.pop();
            int secondnum = Integer.parseInt(stack.pop());
            //pop изтрива вс преди това и оставя посл
            switch (operation) {
                case "+" : stack.push(String.valueOf(firstnum + secondnum));
                break;
                case "-" : stack.push(String.valueOf(firstnum - secondnum));
                break;
            }

        }
        System.out.println(stack.pop());
        kb.close();;
    }
}
