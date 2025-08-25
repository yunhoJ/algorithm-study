import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if(isPrime(i)){
                bw.write(i+"\n");
            }
        }
        bw.flush();

    }
    private static boolean isPrime(int i) {
        if (i<=1){
            return false;
        }
        for (int j = 2; j <=Math.sqrt(i); j++) {
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}