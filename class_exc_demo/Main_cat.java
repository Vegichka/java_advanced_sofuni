package class_exc_demo;
public class Main_cat {
public static void main(String[] args) {
    //заради конструкторите, не можем да имаме обект без съществуващо име и години

    Cat.saySomething();//прединсъздаден обект - работи

    Cat tobi = new Cat("Tob", 12,"golden", "ball");
    tobi.meow();
    System.out.println(tobi.getName() + " " + tobi.getAge() + " " + tobi.getColor() + " " + tobi.getFavToy());

    Cat puhcho = new Cat("Puhcho", 2);
    puhcho.meow();
    System.out.println(puhcho.getName() + " " + puhcho.getAge());
    
}
    
}
