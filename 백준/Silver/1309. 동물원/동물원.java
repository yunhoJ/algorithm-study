import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] result = new int [N+1];
        int[] sum = new int [N+1];
        result[0] = 2;
        result[1]=3;
        sum[1] = 2;
        for (int i = 2; i <=N ; i++) {
            result[i] = result[i-1]+2*(sum[i-1]);
            sum[i] =(sum[i-1]+result[i-1])%9901;

        }
        System.out.println(result[N]%9901);
    }
}