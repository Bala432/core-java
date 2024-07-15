package src.com.basics.abstractexample;

public abstract class Parent {

    static void hello(){
        System.out.println("greetings from static method");
    }

    abstract void advice();

    void info(){
        System.out.println("Parent class Information");
    }


}
