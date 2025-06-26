import java.util.Scanner;

public class factorial_number {

    public static int factorial(int number){
        if (number==0){
            return 1;
        }
        
        int fact_number = number * factorial(number-1);
        return fact_number;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        
        System.out.print("Factorial of the number is : " +factorial(number));

        sc.close();
    }
}
