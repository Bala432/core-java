package src.com.basics.finterfaces;

@FunctionalInterface
interface Car{
    void start(int capacity);
}

public class FunctionalInterfaces{
    public static void main(String[] args) {
        Car car = new Car(){
            public void start(int capacity){
                System.out.println("Starting Car with capacity of " + capacity);
            }
        };
//        Car car = (capacity) -> {
//                System.out.println("Starting Car with capacity of " + capacity);
//        };
        car.start(100);
        System.out.println(car);
    }
}
