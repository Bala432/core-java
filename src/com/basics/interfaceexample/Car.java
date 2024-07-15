package src.com.basics.interfaceexample;

public class Car implements Engine, Brake{
    @Override
    public void brake_stop() {
        System.out.println("stop brakes");
    }

    @Override
    public void engine_stop() {
        System.out.println("stop engine");
    }

    @Override
    public void engine_start() {
        System.out.println("start engine");
    }
}
