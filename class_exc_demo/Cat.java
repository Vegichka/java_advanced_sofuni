package class_exc_demo;

public class Cat {
    private String name;
    private int age;//нямаме достъп до възрастта
    private String color;
    private String favToy;
    //konstruktor nomer 1
    Cat(String name, int age){
        this.name = name;
        this.age = age;
       
    }
    //същия конструктор, но с цвят
    //konstriktor nomer 2
    Cat(String name, int age, String color){
        this(name, age);//викам конструктор номер 1
        this.color = color;//добавям color
    }
    //konstriktor nomer 3
    Cat(String name, int age, String color, String favToy){
        this(name, age, color);//викам конструктор номер 2
        this.favToy = favToy;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 0){
            throw new IllegalArgumentException("Age can't be less than 0 ");
        }
        else{
        this.age = age;
        }
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getFavToy() {
        return favToy;
    }
    public void setFavToy(String favToy) {
        this.favToy = favToy;
    }

    //без static  - имаме нужда отт обекта(вече създадена котка в Main),
    //защото ни трябва името й
    public void meow(){
    System.out.println("meow, " + getName());
    }


    //със static - нямаме нужда от обект, метода принадлежи на класа и
    //и работи независимо дали сме създали обект или не
    public static void saySomething(){
        System.out.println("something");
    }
    // default cat construvtor(empty one)
    //Cat(){

    //}
}
