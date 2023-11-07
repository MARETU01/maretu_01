import java.util.Scanner;

public class Collatz{
    private static int counter = 0;
    void collatz(int number){
        if (number <= 0){
            throw new IllegalArgumentException();
        }
        if (number == 1) {return;}
        if (number % 2 == 0){
            number /= 2;
        }
        else {
            number = 3 * number + 1;
        }
        counter += 1;
        collatz(number);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Collatz collatz = new Collatz();
        while (true){
            try {
                System.out.printf("Please enter an integer: ");
                int n = input.nextInt();
                collatz.collatz(n);
                System.out.printf("For initial n = %d, it took %d steps to reach 1.%n", n, counter);
            }
            catch(IllegalArgumentException e){
                System.out.println("Please use valid n");
            }
            counter = 0;
        }
    }
}