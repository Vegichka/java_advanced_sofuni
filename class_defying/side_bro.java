package class_defying;

import javax.sound.sampled.SourceDataLine;

public class side_bro {
    
    String name;
    int age;
    double weight;

    side_bro(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    
    void print(){
        System.out.println("Name -> " + this.name + ", age -> " + this.age + ", weight -> " + this.weight);
    }
}
