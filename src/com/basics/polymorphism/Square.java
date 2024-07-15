package src.com.basics.polymorphism;

public class Square extends Shape{
    @Override
    void area() {
        System.out.println("Area of Square");
    }

    void square_method(){
        System.out.println("Square specific method");
    }
}
