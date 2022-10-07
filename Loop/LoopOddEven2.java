package Loop;
import java.util.Scanner;
public class LoopOddEven2 
{


 

    public static void main (String[]args) {
		Scanner masuk = new Scanner (System.in);
	    int [][]matriksA;
	    int [][]matriksAt;
	    int baris;
	    int kolom;
      

	        System.out.println(" ");
	        System.out.println("** SELAMAT DATANG ***");
	        System.out.println(" ");
	        System.out.println("             MENU UTAMA             ");
	        System.out.println("1. Matriks Tranpose");
	        System.out.println("2. Luas persegi panjang");
	        System.out.println("3. selesai");
	        
	        System.out.println("=====================================");
	        System.out.print("Pilihan [1/2/3] = ");
	        int pilih = masuk.nextInt();
	        System.out.println("=====================================");
	
		switch (pilih) {
        case 1:{
        	//Menampilkan Matriks A

                System.out.print("Masukkan Baris : ");
                baris=masuk.nextInt();
                System.out.print("Masukkan Kolom : ");
                kolom=masuk.nextInt();
                System.out.println();
        
                matriksA =new int[baris][kolom];
               
            //Input Matriks A
            System.out.println("-> Matriks A <-");
            for (int i=0;i<baris;i++){
                for (int j=0;j<kolom;j++){
                    System.out.print("matriksA ["+i+"]["+j+"]= ");
                    int isiMatriks = masuk.nextInt();
                    matriksA[i][j]=isiMatriks;
                }
                }
           
            //Rumus Transpose Matriks
            matriksAt =new int[kolom][baris];
        
            for (int i=0;i<kolom;i++){
                for (int j=0;j<baris;j++){
                    matriksAt[i][j]=matriksA[j][i];
                }
            }
               System.out.println(" ");
        
               //Menampilkan Matriks A
             System.out.println("-> Matriks A <-");
             for (int i=0;i<baris;i++){
                for (int j=0;j<kolom;j++){
                    System.out.print(matriksA[i][j]+"   ");
                }
                 System.out.println("");
                }
                System.out.println("");
                //Menampilhan hasil transpose matriks
             System.out.println("-> Transpose Matriks dari Matrik A Adalah ... <-");
             for (int i=0;i<kolom;i++){
                for (int j=0;j<baris;j++){
                    System.out.print(matriksAt[i][j]+"   ");
                }
                 System.out.println();
                }
                break;
            }

        case 2:{
        	System.out.println("    MENGHITUNG LUAS PERSEGI PANJANG  ");
            System.out.println("*****");
            System.out.print("Masukan Panjang   = ");
            int d = masuk.nextInt();
            System.out.print("Masukan Lebar     = ");
            int e = masuk.nextInt();
            int z = d * e;
            System.out.println("=====================================");
            System.out.println("Luas Persegi panjang = " + z);
            
            }

         case 3:{
             System.out.println("=====================================");
        	 System.out.println("Warning !! Pilihan tidak tersedia !! ");
             System.out.println("=====================================");
             break;
            }
            default:
            System.out.println("Tolong Pilih Angka Sesuai MENU Ya ^^");
	        } System.out.println("Mau Mengulang data lagi? [Y][N] ? : ");

        
        }
    }