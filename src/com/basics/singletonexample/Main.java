package src.com.basics.singletonexample;

public class Main {
    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        Singleton object3 = Singleton.getInstance();

        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);

    }
}
