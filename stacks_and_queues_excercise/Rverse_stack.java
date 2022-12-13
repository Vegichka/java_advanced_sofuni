package stacks_and_queues_excercise;
import java.util.*;
public class Rverse_stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String[] numbers = scanner.nextLine().split(" ");
       ArrayDeque<Integer> stack = new ArrayDeque<>();

       //свързвам масива със stack
       for(String num:  numbers){
           stack.push(Integer.parseInt(num));
       }

       //отпечатвам в обратен ред
        for(Integer el: stack){
          System.out.printf("%s ", stack.pop());
          System.out.println(el);
        }
        scanner.close();
    }
}
