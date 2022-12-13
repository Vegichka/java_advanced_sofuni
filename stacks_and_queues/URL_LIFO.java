package stacks_and_queues;
import java.util.*;

import static java.lang.System.in;

public class URL_LIFO {
    public static void main(String[] args) {
        Scanner kb = new Scanner(in);
        String commands = kb.nextLine();
        String url = "blank"; // начална стойност

        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!commands.equals("Home")) {

            if (commands.equals("back")) {

                if (!stack.isEmpty()) {
                    url = stack.pop();// ако не е празен, ще изтрие последната страница и ще влезе в предпоследната
                    // ( предпоследната, която след pop-изтриването е станала последна)
                } else {
                    //в противен случай(ако е празен, т.е. има само 1 страница, която е "blank"), ще отпечата:
                    System.out.println("no previous URLs");
                    //след това чете отново командата и продължава
                    commands = kb.nextLine();
                    continue;
                }
            } else {
                if (!url.equals("blank"))
                    //в случай, че има повече от 1 страница push - добавя най- отгоре следващия url
                    stack.push(url);
                url = commands;
            }
            System.out.println(url);
            //след като url = commands, се отпечатва current url, тоест - последния или в случай "back" предпоследния
            commands = kb.nextLine();
            kb.close();
        }
    }
}