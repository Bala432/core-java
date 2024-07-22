package src.com.basics.exceptions;

public class Exception2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = divide(a, b);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I will run whatever happens");
        }
    }

    private static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Cannot Divide by Zero");
        }

        return a / b ;
    }
}
