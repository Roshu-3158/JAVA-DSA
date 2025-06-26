import java.util.Scanner;

public class recursion_funtion_2 {

    public static void printinc(int number){
        if(number==1){
            System.out.print(number + " ");
            return;
        }
        printinc(number-1);
        System.out.print(number + " ");
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int number;

        System.out.println("Enter the maximum value to print (Start from 0)");
        number = sc.nextInt();

        printinc(number);



        sc.close();
    }
}