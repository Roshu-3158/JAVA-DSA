// for a given set of strings, print the largest string (in dexicographic order)

public class largest_string {
    public static void main(String[] args) {

        String fruits[] = {"banana" ,"apple", "mango"};
        String largest = fruits[0];

        // time complexity = O(x) * n  where x = length of largest string and n is no. of strings present in array
        for(int i=0; i<fruits.length; i++){
                if(largest.compareTo(fruits[i]) < 0){
                    largest = fruits[i];
                }

                // if(largest.compareToIgnoreCase(fruits[i]) < 0){
                //     largest = fruits[i];
                // }
        }
        System.out.println("Largest String is : " +largest);
    }
}
