
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int [] arr = new int[cnt];

        for (int i = 0; i <cnt ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int [] gap = new int[cnt-1];
        for (int i = 0; i < arr.length-1 ; i++) {
                gap[i] = arr[i+1]-arr[i];
        }
        int gcdarr = gap[0];
        for (int i = 0; i <gap.length ; i++) {
         gcdarr=gcd(gcdarr,gap[i]);

        }
        System.out.println((arr[cnt-1]-arr[0])/gcdarr - (arr.length-1));
    }

    public static int gcd (int a , int b ){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}