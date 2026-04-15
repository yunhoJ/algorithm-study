
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println((int)Math.pow(2, N)-1);
        move(N , 1,2,3);
        bw.flush();
    }

    public static void move(int N , int start ,int tmp, int target  ) throws IOException {
        if (N==0){
            return;
        }
        move(N-1, start, target , tmp   );
        bw.write(start +" "+ target+"\n" );
        move(N-1 ,tmp ,start , target   );
    }
}