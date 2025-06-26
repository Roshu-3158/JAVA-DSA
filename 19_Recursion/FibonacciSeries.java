import java.util.Scanner;

public class FibonacciSeries {

    // Recursive Fibonacci function
    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many terms? ");
        int terms = sc.nextInt(); // Example: 10

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        for (int i = 0; i < terms; i++) {
            int result = fib(i); // Get Fibonacci number at position i
            System.out.print(result);

            // Add comma only if it's not the last term
            if (i < terms - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
