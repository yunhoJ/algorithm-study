
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A=new int[3];
        for (int i = 0; i <A.length ; i++) {
            A[i]= sc.nextInt();
            
            if(A[i]<2 | A[i]>10000){
                throw new RuntimeException();
            }
        }
        System.out.println((A[0]+A[1])%A[2]);
        System.out.println(((A[0]%A[2])+ (A[1]%A[2]))%A[2]);
        System.out.println((A[0]*A[1])%A[2]);
        System.out.println(((A[0]%A[2])*(A[1]%A[2]))%A[2]);
    }
}