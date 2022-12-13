package stacks_and_queues;
import java.util.*;
public class Main_LIFO {
    public static void main(String[] args) {
        ArrayDeque< Integer > stack = new ArrayDeque<>();

        // add -> Push(e), Remove Top -> Pop(), look at top -> peek()

        stack.push(1);
        stack.push(2);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(6);
        //за да изтрие вс "2" -> трябва да го превърнем в лист чрез "Arrays.asList"
        stack.removeAll(Arrays.asList(2));
        //за да изтрие само едно "6"(посл път, в който се среща), не е нужно превъщане в лист
        stack.remove(6);
        System.out.println(stack);//отпечатват се в обратен ред

        int checkLastEl = stack.peek(); // -> виж последен елемент
        System.out.println(checkLastEl);

        int checkFirstEl = stack.peekLast(); // -> виж първия елемент
        System.out.println(checkFirstEl);

        // ОПРЕДЕЛЕНИ ФУНКЦИИ:
        int element2 = 4;
        if(stack.contains(element2)){
            System.out.println("It contains 4");
        } else{
            System.out.println("There is no 4");
        }
        System.out.println();
        //stack.remove(element);
        // не може for(int i = 0; i < stack.size(); i ++)
        // ХМАЛСКО:
        int searchingElement = 3;//търсене на елемент
        while(!stack.isEmpty() ) { //докато има елементи в стека
            int topElement = stack.pop();
            if(topElement == searchingElement ){
                System.out.println("True");
            } else {
                System.out.println("False");
            }
            System.out.println(topElement);
            // последният добавен елемент е 32
        }


    }
}
