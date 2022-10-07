package Loop;
import java.util.Scanner;
public class LoopOddEven5
{


    public static void main ( String[] args ){
        
        Scanner bilangan = new Scanner(System.in);
        //tipe data
        int ganjil;
        int i,data;
        int awal[] = new int[20];
        int akhir[] = new int[20];
        int jumlah[] = new int[20];
        String ulang;
       
    


        //input
        do{
        System.out.print("Masukkan jumlah Perulangan = ");
        data = Integer.parseInt(bilangan.nextLine());
        for(i=1;i<=data;i++)
        {
            System.out.println("-------------------------------------------------");
            System.out.println("Perulangan ke "+i);
            System.out.print("Masukkan Nilai Awal = ");
            awal[i] = Integer.parseInt(bilangan.nextLine());
            System.out.print("Masukkan Nilai Akhir = ");
            akhir[i] = Integer.parseInt(bilangan.nextLine());
            System.out.println("-------------------------------------------------");


        //output
            for(ganjil=awal[i];ganjil<=akhir[i];ganjil++){
            if(ganjil%2==1)
            {
               
                jumlah[i] = jumlah[i] + ganjil;
                System.out.println(ganjil+"");
            }
            }
            System.out.println("-------------------------------------------------");
            System.out.println(""+jumlah[i]+"");
            System.out.println(" ");

            ganjil++;

            }
            System.out.println("Maau Mengulang data lagi? [Y][N] ? : ");
            ulang =bilangan.nextLine();
        }
        while(ulang.equals("Y")|| ulang.equals("y"));
        


     }
}