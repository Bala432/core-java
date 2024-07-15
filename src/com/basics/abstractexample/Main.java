package src.com.basics.abstractexample;

public class Main {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.advice();
        child1.info();

        Parent parent1 = new Child();
        parent1.advice();
        parent1.info();
        Parent.hello();
    }
}
