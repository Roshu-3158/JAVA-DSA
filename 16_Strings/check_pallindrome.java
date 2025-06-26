import java.util.Scanner;

public class check_pallindrome{

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String reverse="";

        System.out.println("Enter the string");
        String original = sc.nextLine();

        // video logic 
        // for(int i=0; i<original.length()/2; i++){
        //     if(original.charAt(i) == original.charAt(original.length()-i-1)){
        //         System.out.println("String is pallindrome");
        //         break;
        //     }
        //     else{
        //         System.out.println("String is not pallindrome");
        //         break;
        //     }
        // }

        

        // my logic
        for(int i=original.length()-1; i>=0; i--){
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse : " + reverse);
        if(original.equals(reverse)){
            System.out.println("String is pallindrome");
        }
        else{
            System.out.println("String is not pallindrome");
        }
        sc.close();
        
    }
}