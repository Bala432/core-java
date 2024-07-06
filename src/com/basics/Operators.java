package src.com.basics;

public class Operators {
    public static void main(String []arguments)
    {
        int number1 = 7;
        int number2 = 5;

        int remainder = number1 % number2;
        System.out.println(remainder);

        int result = ++number1;
        System.out.println(result);

        result = number2++;
        System.out.println(result);
    }
}