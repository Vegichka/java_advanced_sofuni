package exam_prep_1_marti;
import java.util.*;
import java.util.stream.Collectors;
public class Cook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read input -> first row -> quueue, second row -> stack

        //first row
        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        //second row
        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))//не използвам Arrays.stream 
        //директно, защото, ако го направя, ще се държи като queue
                .map(Integer::parseInt)
                .forEach(ingredients::push);

                
        Map<String, Integer> cookedFoods = new TreeMap<>();

        cookedFoods.put("Bread", 0);
        cookedFoods.put("Cake", 0);
        cookedFoods.put("Pastry", 0);
        cookedFoods.put("Fruit Pie", 0);
  
        
       while(!liquids.isEmpty() && !ingredients.isEmpty()){      
       //sum first element from first row + with last element from second row
        int lastIngredient = ingredients.pop();
        int sum = liquids.poll() + lastIngredient;

        String cookedFood;
        switch(sum){
            //различните случаи(от таблицата)
            case 25:
            cookedFood = "Bread";
            break;
            case 50:
            cookedFood = "Cake";
            break;
            case 75:
            cookedFood = "Pastry";
            break;
            case 100:
            cookedFood = "Fruit Pie";
            break;

            default:
            cookedFood = null;
            break;

        }
 //ако сме сготвили нещо -> вече горе сме сумирали числата => трябва да ги махнем от опашките
        if(cookedFood != null){
            cookedFoods.putIfAbsent(cookedFood, 0);
           int counter = cookedFoods.get(cookedFood) + 1;//създавам брояч
           cookedFoods.put(cookedFood, counter);//добавя, cookedFood променливата и брояча в map-а
          
        } else{
            ingredients.push(lastIngredient + 3);
        }
       }
                
        //print -> if all foods are cooked -> positive sentence output, else -> negative

        boolean allFoodsAreCooked = cookedFoods.entrySet().stream().allMatch(e -> e.getValue() > 0);

        if (allFoodsAreCooked) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }

        String remainingLiquids = liquids.isEmpty() ? "none" : liquids.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Liquids left: " + remainingLiquids);

        String remainingIngredients = ingredients.isEmpty() ? "none" : ingredients.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Ingredients left: " + remainingIngredients);

        cookedFoods.entrySet()
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        scanner.close();
    }
}
