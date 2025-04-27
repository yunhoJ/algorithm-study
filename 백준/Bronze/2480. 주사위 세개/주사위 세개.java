import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C=sc.nextInt();
        if ((A<=6 & A>=1)&(B<=6 & B>=1)&(C<=6&C>=1)){
           if ( A==B&B==C){
               System.out.println(10000+A*1000);
           } else if (A==B|B==C) {
               System.out.println(1000+B*100);
           } else if (C==A) {
               System.out.println(1000+C*100);

           }
           else {
               int v = (A>B)?(C>A)?C:A:(C>B)?C:B;
               System.out.println(v* 100);
           }
        }
        else throw new RuntimeException();
    }
}