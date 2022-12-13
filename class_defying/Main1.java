package class_defying;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       

        int n = Integer.parseInt(scanner.nextLine());
       while( n-- > 0) {
            String tokens[] = scanner.nextLine().split("\\s+");

            CarDefaultValue  car;
           if(tokens.length == 1 ){
            String brand = tokens[0];
            car = new CarDefaultValue (brand);
           } else{
            String brand = tokens[0];
            String model = tokens[1];
            int horsePower = Integer.parseInt(tokens[2]);
            car = new CarDefaultValue(brand, model, horsePower);
           }

         
           

          System.out.println(car.carInfo());
        }
        scanner.close();

    }
}