// print all binary strings of size n without consecutive 1's

public class binary_string_problem {
    // Recursive function to print binary strings of size n without consecutive 1's
    public static void printBinaryStrings(int n, String str, int lastDigit) {   

        // Base case: if the length of the string is equal to n, print the string
        if (str.length() == n) {
            System.out.println(str);
            return;
        }

        // If the last digit is 0, we can add either 0 or 1
        if (lastDigit == 0) {
            printBinaryStrings(n, str + "0", 0); // Add 0
            printBinaryStrings(n, str + "1", 1); // Add 1
        } else {
            // If the last digit is 1, we can only add 0
            printBinaryStrings(n, str + "0", 0); // Add 0
        }
    }
    public static void main(String[] args) {
        int n = 3; // Size of the binary string
        printBinaryStrings(n, "", 0);
        
    }
    
}
