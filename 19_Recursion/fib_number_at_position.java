import java.util.Scanner;

public class fib_number_at_position {

    public static int fib(int number) {
        if (number == 0 || number == 1) {
            return number;
        }

        int fib_number = fib(number - 1) + fib(number - 2);
        return fib_number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter the maximum value to print (Start from 0)");
        number = sc.nextInt();

        System.out.println("Fibonacci number at position:  " + number + " is " + fib(number));

        sc.close();
    }
}
