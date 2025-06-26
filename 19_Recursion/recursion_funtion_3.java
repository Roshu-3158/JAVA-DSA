import java.util.Scanner;

public class recursion_funtion_3 {

    public static int sum_of_numbers(int number) {
        if (number == 1) {
            return 1;
        }
        
        int sum = number + (number - 1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        System.out.print("Sum of first n natural numbers is : " + sum_of_numbers(number));

        sc.close();
    }
}
