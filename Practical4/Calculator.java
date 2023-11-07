public class Calculator{
    public static int add(int a, int b){return a + b;}
    public static int subtract(int a, int b){return a - b;}
    public static int multiply(int a, int b){return a * b;}
    public static int divide(int a, int b) throws NotDivisibleException {
        if (b == 0){
            throw new ArithmeticException();
        }
        if (a % b != 0){
            throw new NotDivisibleException("Not divisible");
        }
        return a / b;
    }
}

class NotDivisibleException extends Exception {
    public NotDivisibleException(String str){
        super(str);
    }
}