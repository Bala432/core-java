package src.com.basics.inheritanceexample;

public class Parent {
    public String name;
    protected int age;
    private float money;

    public Parent(String name, int age, float money){
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString(){
        return this.getName() + " of " + this.age + " has " + this.getMoney();
    }
}

class Child extends Parent{
    String college;
    String stationery;

    public Child(String name, int age, float money, String college, String stationery) {
        super(name, age, money);
        this.college = college;
        this.stationery = stationery;
    }

}
