package exc_1_opinion;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPeople = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();//list vs hora

        for(int i = 0; i < countOfPeople; i++){//cikul za chetec na hora

            String []personInfo = scanner.nextLine().split(" ");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);

            Person person = new Person(name, age);//constructor
            people.add(person);//dobavqme vseki chovek

        }
        people.stream()
                .filter( person -> person.getAge() > 30)//да са по-големи от 30 години
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))//подреждаме по азбучен ред
                // чрез compare метод
                //.sorted(Comparator.comparing(Person::getName)) 
                //- >подреждаме по азбучен ред според име (същото като горното)
                .forEach(System.out::println);
        


        scanner.close();
}  
}