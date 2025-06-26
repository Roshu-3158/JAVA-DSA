// given a "2*n" board and tiles "2*1", count the number of ways to tile the given board using 2*1 tiles. (A tile can either be placed horizontally or vertically)
public class tilling_problem {

    public static int tillingProblem(int n) {
        // Base case: if the board length is 0 or 1, there's only one way to tile it
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case: place a tile vertically or horizontally
        // If placed vertically, reduce the board length by 1
        // If placed horizontally, reduce the board length by 2
        return tillingProblem(n - 1) + tillingProblem(n - 2);

    }

    public static void main(String[] args) {
        int n = 4; // Length of the board
        int ways = tillingProblem(n);
        System.out.println("Number of ways to tile a 2*" + n + " board: " + ways);

    }

}
