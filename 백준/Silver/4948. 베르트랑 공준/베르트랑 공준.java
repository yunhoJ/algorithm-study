
import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int temp = Integer.parseInt(br.readLine());
            if(temp==0) break;
            System.out.println(count_prime(temp));
        }
    }

    private static int count_prime(int temp) {
        int cnt = 0;
//        소수 판별 temp ,2temp
        for (int i = temp+1; i <=temp *2 ; i++) {
            if(prime(i)){
                cnt++;
            }
        }
        return cnt;
    }
    private static boolean prime(int i) {
        if (i ==0 ||i==1){
            return false;
        }
        for (int k = 2; k <=Math.sqrt(i) ; k++) {
            if(i%k==0){
                return false;
            }
        }
        return true;
    }
}