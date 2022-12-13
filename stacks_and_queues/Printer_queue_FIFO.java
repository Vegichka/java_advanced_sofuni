package stacks_and_queues;
import java.util.*;

import static java.lang.System.in;

public class Printer_queue_FIFO {
    public static void main(String[] args) {
        Scanner kb = new Scanner(in);

        String command = kb.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();

        while(!command.equals("print")){
            if(command.equals("cancel")){
                if(stack.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else{
                    String firstFileInQueue = stack.poll();
                    System.out.println("Canceled " + firstFileInQueue);

                }
            }else{
                stack.offer(command);
            }

            command = kb.nextLine();
        }
        kb.close();
       while(!stack.isEmpty()){
           System.out.println(stack.poll());//отпечатва това, което е на върха
       }
        }
        

}
