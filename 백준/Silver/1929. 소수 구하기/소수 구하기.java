
import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
        for (int i = a; i <=b ; i++) {
            if(is_prime_num(i))
            {
                System.out.println(i);
            }
        }
    }
    public static boolean is_prime_num(long num){
        if (num ==0 ||num==1){
            return false;
        }

        for (long i = 2; i <=Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}