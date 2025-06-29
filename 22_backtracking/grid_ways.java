// going from target cell (1st cell) to destination cell (last cell) in a grid
public class grid_ways {
    // printing all ways using . for path
    public static void printWays(int row, int col, String path) {
        // Base case: if we reach the destination cell
        if (row == 1 && col == 1) {
            System.out.println(path); // Print the path taken to reach the destination
            return;
        }
        
        // If we can move down, add 'D' to the path and recurse
        if (row > 1) {
            printWays(row - 1, col, path + "D");
        }
        
        // If we can move right, add 'R' to the path and recurse
        if (col > 1) {
            printWays(row, col - 1, path + "R");
        }
    }
    

    public static int countWays(int row, int col) {
        // Base case: if we are at the destination cell
        if (row == 1 || col == 1) {
            return 1; // Only one way to reach the destination
        }
        
        // Recursive case: sum of ways from the cell below and the cell to the right
        return countWays(row - 1, col) + countWays(row, col - 1);
    }
    public static void main(String[] args) {
        int row = 3; // Number of rows
        int col = 3; // Number of columns
        System.out.println(countWays(row, col)); // Output the number of ways to reach the destination
        printWays(row, col, ""); // Print all the paths to the destination
        
    }
    
}
