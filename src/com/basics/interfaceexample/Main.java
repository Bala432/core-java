package src.com.basics.interfaceexample;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.engine_start();
        car.engine_stop();

        Engine engine = new Car();
        engine.engine_stop();
        int price = Engine.price;
        System.out.println(price);
    }
}
