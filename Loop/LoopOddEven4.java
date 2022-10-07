package Loop;
import java.util.Scanner;
public class LoopOddEven4

{


    public static void main(String[] args) {
        ///Scanner input = new Scanner(System.in);
        String[][] array = new String[3][9];

        String[] array_Ma = {"1"," 2"," 4"," 3"," 7"," 2"," 5"," 8"," 4"};
        String[] array_Mb = {"1"," 2"," 2"," 2"," 2"," 1"," 1"," 1"," 1"};
        String[] array_Mc = {"11","14","12","12","45","30","23","45","12"};

        array[0] = array_Ma;
        array[1] = array_Mb;
        array[2] = array_Mc;
        System.out.println("Matrix D");
        
        // input matrix
        for (int i = 0; i < array.length; i++){

            for(int j=0; j< array[i].length; j++)
                System.out.print(" "+array[i][j] + "  ");
                System.out.println();
        }
        System.out.println();
            
        }
    }