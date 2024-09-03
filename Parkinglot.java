
import java.util.Scanner;
public class Parkinglot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows (R): ");
        int rows = s.nextInt();
        System.out.print("Enter the number of columns (C): ");
        int columns = s.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix (0 or 1): ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        int maxOnesRow = -1;
        int maxOnesCount = -1;
        for (int i = 0; i < rows; i++) {
            int countOnes = 0;
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes > maxOnesCount) {
                maxOnesCount = countOnes;
                maxOnesRow = i + 1; 
            }
        }
        System.out.println("Row " + maxOnesRow + " has the maximum number of 1s");
    }
}
