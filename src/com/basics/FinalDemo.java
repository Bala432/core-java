package src.com.basics;

public class FinalDemo {
    public static void main(String []arguments)
    {
        Person person1 = new Person();

        for(int i=0;i<1000000;i++)
        {
            person1 = new Person();
        }
    }
}
