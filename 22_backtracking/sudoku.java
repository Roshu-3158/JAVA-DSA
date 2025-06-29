public class sudoku {
    // Function to print the Sudoku board
    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to check if placing num at board[row][col] is valid
    public static boolean isValid(int[][] board, int row, int col, int num) {
        // Check if num is already in the current row
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }

        // Check if num is already in the current column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check if num is already in the current 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true; // Placement is valid
    }

    // Function to solve the Sudoku puzzle using backtracking
    public static boolean solveSudoku(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // If we find an empty cell (represented by 0)
                if (board[i][j] == 0) {
                    // Try placing numbers from 1 to 9
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(board, i, j, num)) { // Check if placing num is valid
                            board[i][j] = num; // Place the number
                            if (solveSudoku(board)) { // Recur to solve the rest of the board
                                return true; // If solved, return true
                            }
                            board[i][j] = 0; // Backtrack: remove the number
                        }
                    }
                    return false; // If no number can be placed, return false
                }
            }
        }
       
        return true; // All cells are filled correctly
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 2, 6, 0, 7, 0, 1 },
                { 6, 8, 0, 0, 7, 0, 0, 9, 0 },
                { 1, 9, 0, 0, 0, 4, 5, 0, 0 },
                { 8, 2, 0, 1, 0, 0, 0, 4, 0 },
                { 0, 0, 4, 6, 0, 2, 9, 0, 0 },
                { 0, 5, 0, 0, 0, 3, 0, 2, 8 },
                { 0, 0, 9, 3, 0, 0, 0, 7, 4 },
                { 0, 4, 0, 0, 5, 0, 0, 3, 6 },
                { 7, 0, 3, 0, 1, 8,  0, 0, 0}
        };

        if (solveSudoku(board)) {
            System.out.println("Solved Sudoku:");
            printBoard(board); // <-- Move it here
        } else {
            System.out.println("No solution exists.");
        }
    }
    
}
