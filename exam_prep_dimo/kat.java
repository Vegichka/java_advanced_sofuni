package exam_prep_dimo;
import java.util.*;
public class kat {
    
    private static int totalRegisteredCars = 0;
 
    private static int days = 0;
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> plate = new ArrayDeque<>();
        int[] platesArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        for (int currentPlate : platesArr) {
            plate.offer(currentPlate);
        }
        ArrayDeque<Integer> cars = new ArrayDeque<>();
        int[] carsArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        for (int currentCar : carsArr) {
            cars.push(currentCar);
        }
        while (!plate.isEmpty() && !cars.isEmpty()) {
            days++;
            int licenseNumbers = plate.peek();
            int carsToBeRegistered = cars.peek();
            if (carsToBeRegistered * 2 == licenseNumbers) {
                totalRegisteredCars += carsToBeRegistered;
                plate.poll();
                cars.pop();
            } else if (carsToBeRegistered * 2 > licenseNumbers) {
                licenseNumbers = plate.poll();
                totalRegisteredCars += licenseNumbers / 2;
                int newValue = cars.pop() - (licenseNumbers / 2);
                cars.addLast(newValue);
            } else if (carsToBeRegistered * 2 < licenseNumbers) {
                plate.poll();
                totalRegisteredCars += cars.pop();
                int newVal = licenseNumbers - (carsToBeRegistered * 2);
                plate.addLast(newVal);
            }
        }
        System.out.printf("%d cars were registered for %d days!%n", totalRegisteredCars, days);
        if (plate.size() > 0) {
            int remainingPlates = plate.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("%d license plates remain!", remainingPlates);
        }
        if (cars.size() > 0) {
            int remainingCars = cars.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("%d cars remain without license plates!", remainingCars);
        }
        if (plate.size() == 0 && cars.size() == 0) {
            System.out.println("Good job! There is no queue in front of the KAT!");
        }
        scanner.close();
    }
    
}    

