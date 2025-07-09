import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a = Integer.parseInt(br.readLine());
            int sum = 0;
            String temp = "";
            if (a == -1) break;
            for (int i = 1; i < a; i++) {

                if(a%i==0){
                    sum+=i;
                    temp+=(i+" + ");
                }
            }
            if(a==sum){
                System.out.println(a+" = "+temp.substring(0,temp.length()-3));
            }else System.out.println(a+" is NOT perfect.");

        }
    }
}
