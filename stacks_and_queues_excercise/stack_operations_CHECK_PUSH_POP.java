package stacks_and_queues_excercise;
import java.util.*;
public class stack_operations_CHECK_PUSH_POP {
    public static void main(String[] args) {
        //n - kolko elementa shte pushnem, S - kolko da popnem, X - check dali chisloo e v staka
        //sledvasht red - vsichkite chisla za stacka
        Scanner scanner = new Scanner(System.in);
        int input[] =  Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = (input[0]);//num of elements tom push
        int s = (input[1]);//nums to pop
        int x = (input[2]);//nums to check
         ArrayDeque<Integer> stack = new ArrayDeque<>();

         int nums[] = Arrays.stream(scanner.nextLine().split(""))
                 .mapToInt(Integer::parseInt)
                 .toArray();

         for(int i = 0; i < n; i ++){
             stack.push(nums[i]);
         }
         for(int i = 0; i < s; i++){
             stack.pop();
         }
         if(stack.contains(x)){
             System.out.println("true");
         } else if(stack.isEmpty()){
             System.out.println("0");
         } else{
             for(int i = 0; i < n; i++){
                System.out.println(Collections.min(stack));

                 // 2) наюин за намиране на най-малкото


             }
         }
         scanner.close();
    }
}
