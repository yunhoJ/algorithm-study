
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int C=sc.nextInt();
        if ((H<=23 & H>=0)&(M<=59 & M>=0)&(C<=1000&C>=0)){
            int h=C/60;
            int m=C%60;
            H+=h;
            M+=m;
            if( M>=60){
                H+=M/60;
                M%=60;

            }
            if(H>23){
                H%=24;
            }
            System.out.println(H+" "+M);
        }
        else throw new RuntimeException();
    }
}