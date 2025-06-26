public class sorted_array {
    public static boolean issorted(int number[], int len){
        // Base case: if the array has one or no elements, it is sorted
        if (len == 0 || len == 1) {
            return true;
        }
        // If the last element is smaller than the second last, it's not sorted
        if (number[len - 1] < number[len - 2]) {
            return false;
        }
        // Recursively check the rest of the array
        return issorted(number, len - 1);


    }   
    
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // int number2[] = {1, 3, 5, 4, 6, 2, 8, 9};
        int len = number.length; // Get the length of the array
        boolean result = issorted(number,len);
        if(result){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
}
