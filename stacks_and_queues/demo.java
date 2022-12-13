package stacks_and_queues;
import java.util.ArrayDeque;


public class demo {
    public static void main(String[] args) {
        ArrayDeque< Integer > stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();

        for ( int el: stack) {
            System.out.println(el);
        }
    }
}
