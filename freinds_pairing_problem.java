// Given n freinds, each one can remain single or can be pronted up with some other freind. each freind can be paired only once. find out the total number of ways in which freinds can remain single or can be paired up.

public class freinds_pairing_problem {

    public static int countWays(int n) {
        // Base case: if there are no friends or one friend, there's only one way
        if (n <= 1) {
            return 1;
        }

        // Recursive case: either the nth friend remains single or pairs with one of the previous friends
        // If the nth friend remains single, we have countWays(n - 1) ways for the remaining friends
        // If the nth friend pairs with any of the (n - 1) previous friends, we have (n - 1) choices for pairing
        // and then countWays(n - 2) ways for the remaining friends
        return countWays(n - 1) + (n - 1) * countWays(n - 2);
    }
    public static void main(String[] args) {
        int n = 4; // Number of friends
        System.out.println("Total ways friends can remain single or paired up: " + countWays(n));
        
    }
    
}
