
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a= Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            long temp = Long.parseLong(br.readLine());
            for (long j = temp;  ; j++) {
                if(is_prime_num(j)){
                    bw.write(j+"\n");
                    break;
                }

            }

        }
        bw.flush();

    }
    public static boolean is_prime_num(long num){
        if (num ==0 ||num==1){
            return false;
        }

        for (long i = 2; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}