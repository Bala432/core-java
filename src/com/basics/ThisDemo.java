package src.com.basics;

class Person{
    String name;
    int age;

    Person(){
        this("A", 33);
//        this.info();
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void info(){
        System.out.println("Person Info");
    }

    @Override
    protected void finalize(){
        System.out.println("Object person is destroyed");
    }

}

public class ThisDemo {
    public static void main(String []arguments)
    {
        Person person1 = new Person();
        System.out.println(person1.name);
        System.out.println(person1.age);
    }
}
