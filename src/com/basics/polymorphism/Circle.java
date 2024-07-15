package src.com.basics.polymorphism;

public class Circle extends Shape{
    @Override
    void area() {
        System.out.println("Area of Circle");
    }

    void circle_method(){
        System.out.println("Circle specific method");
    }

    static void greeting(){
        System.out.println("greetings method");
    }
}
