package Loop;
import java.util.Scanner;
public class LoopOddEven3 
{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ordo = input.nextInt();
        int[][] matrix = new int[ordo][ordo];
        
 
        // input matrix
        for (int i = 0; i < ordo; i++)
            for (int j = 0; j < ordo; j++) {
                System.out.print("Baris " + (i + 1) + " Kolom " + (j + 1) + " : ");
                matrix[i][j] = input.nextInt();
            }
            System.out.println("Matriks: ");
            for (int i = 0; i < ordo; i++) {
                for (int j = 0; j < ordo; j++)
                    System.out.print(matrix[i][j] + "\t");
                System.out.println();
            }

        }
    }