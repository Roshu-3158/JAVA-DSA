public class n_queen {

    // Function to print the chessboard configuration
    public static void printBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print((cell ? "Q " : ". "));
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to check if it's safe to place a queen at board[row][col]
    public static boolean isSafe(boolean[][] board, int row, int col) { 
        // Check the column for any queens
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false; // Column is not safe
            }
        }

        // Check the upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false; // Upper left diagonal is not safe
            }
        }

        // Check the upper right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false; // Upper right diagonal is not safe
            }
        }

        return true; // Safe to place a queen
    }

    public static void solveNQueens(boolean[][] board, int row) {
        // Base case: if we have placed queens in all rows
        if (row == board.length) {
            printBoard(board); // Print the current configuration of the board
            return;
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) { // Check if it's safe to place a queen
                board[row][col] = true; // Place the queen
                solveNQueens(board, row + 1); // Recur to place queens in the next row
                board[row][col] = false; // Backtrack: remove the queen
            }
        }
    }
    public static void main(String[] args) {
        int n = 4; // Size of the chessboard
        boolean[][] board = new boolean[n][n]; // Create a chessboard of size n x n
        solveNQueens(board, 0); // Start solving from the first row
    }
}
