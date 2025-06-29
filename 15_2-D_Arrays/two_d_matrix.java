import java.util.Scanner;
public class two_d_matrix {


    public static void search(int matrix[][], int key, int row, int col){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == key){
                    System.out.println("Element found at "+i+" "+j);
                }
            }

        }
    }
    public static void main(String[] args) {
        // create 2d matrix 
        int row=3;
        int col=3;
        int[][] matrix = new int[row][col];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(" ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }  
        
        search(matrix, 3, row, col);
        sc.close();

    }
}