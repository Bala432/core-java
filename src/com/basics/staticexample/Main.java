package src.com.basics.staticexample;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("A", 23);
        Human human2 = new Human("B", 45);

//        System.out.println(Human.population);
//        System.out.println(Human.population);

//        Main object = new Main();
//        object.show();

        show();

        Human.getInfo();
    }

    static void show(){
        System.out.println("Display method of Main Class");
        Main object = new Main();
        object.getParamInfo();
    }

    void getParamInfo() {
        System.out.println("getting parameter Information");
    }
}
