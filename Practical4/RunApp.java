import java.util.*;

public class RunApp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            try{
                int number1 = input.nextInt();
                char operation = input.next().charAt(0);
                if (operation == 'q' || operation == 'Q') {break;}
                int number2 = input.nextInt();
                if (operation == '+') {
                    System.out.printf("%d%n", calculator.add(number1, number2));
                }
                else if (operation == '-') {
                    System.out.printf("%d%n", calculator.subtract(number1, number2));
                }
                else if (operation == '*') {
                    System.out.printf("%d%n", calculator.multiply(number1, number2));
                }
                else if (operation == '/') {
                    System.out.printf("%d%n", calculator.divide(number1, number2));
                }
                else {System.out.println("Invalid operation!");}
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input");
            }
            catch(ArithmeticException e){
                System.out.println("Division by zero");
            }
            catch(NotDivisibleException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}