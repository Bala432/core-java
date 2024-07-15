package src.com.basics.staticexample;

public class Human {
    String name;
    int age;
    static int population;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
//        this.population = this.population + 1;
        Human.population = Human.population + 1;
    }

    static void getInfo(){
        System.out.println("Get Human Information");
        System.out.println(population);
    }
}
