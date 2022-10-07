package Loop;
import java.util.Scanner;
public class LoopOddEven {


    public static void main ( String[] args ){

        Scanner bilangan = new Scanner(System.in);
        int ganjil,jumlah = 0;

        System.out.println("Bilangan Ganjil dari 1-10 pertama");
        System.out.println("-------------------------------------------------");

        for(ganjil=0;ganjil<10;ganjil++){
            if(ganjil%2==1)
            {
                jumlah = jumlah + ganjil;
                System.out.println(ganjil+"");
            }
            }
            System.out.println("------------");
            System.out.println(""+jumlah+"");
            System.out.println(" ");
            ganjil++;

            int i, jmlah=0;
            for(i=11;i<20;i++){
                if(i%2==1)
                {
                    jmlah=jmlah+i;
                    System.out.println(i+" ");
                }
            }
            System.out.println("------------");
            System.out.println(""+jmlah+"");
            System.out.println(" ");
            i++;
            int n,jumlah1=0;
            for(n=21;n<30;n++){
                if(n%2==1);
                {
                    jumlah1=jumlah1+n;
                    System.out.println(n+"");

                }
            }
            System.out.println("-------");
            System.out.println(""+jumlah1+"");
            System.out.println("");
            i++;
            
            int m,jumlah2=0;

            for(m=31;m<40;m++){
            if(m%2==1)
            {
                jumlah2=jumlah2+m;
                System.out.println(m+" ");

            }
            }
            System.out.println("-------");
            System.out.println(""+jumlah2+"");
            System.out.println(" ");
            i++;
     }
}
    

