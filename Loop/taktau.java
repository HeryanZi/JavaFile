package Loop;
import java.util.Scanner;
public class taktau {


    public static void main(String args[]){
     
        int nilai;
        Scanner input = new Scanner(System.in);
         
        System.out.print("Input Nilai Anda (0 - 100): ");
        nilai = input.nextInt();
         
        if (nilai >= 81 ) {
          System.out.println("PT A!");
        }
        else if (nilai >= 71) {
          System.out.println("PT B");
        }
        else if (nilai >= 61) {
          System.out.println("PT C");
        }
          
        
        else if (nilai <= 40) {
          System.out.println("Kebanyakan bolos...");
        }
        else {
          System.out.println("Maaf, format nilai tidak sesuai");
        }
        
     }
    }
