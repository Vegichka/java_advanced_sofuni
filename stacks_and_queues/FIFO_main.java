package stacks_and_queues;
import java.util.*;
//add -> отпред, offer - > добавям отпред
//remove, poll -> махам първи елемент от опашката
//peek -> надниквам върха на опашката
public class FIFO_main {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.poll();
        for( int el : queue){
            System.out.println(el);
        }

    }
}
