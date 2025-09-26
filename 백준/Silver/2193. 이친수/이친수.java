import java.io.*;
import java.util.Arrays;


class Main {
    static long pay[][] = new long[92][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        pay[1][0] = 0;
        pay[1][1] = 1;

        pay[2][0] = 1;
        pay[2][1] = 0;

        System.out.println(dp(N,0)+dp(N,1));
    }

    private static long dp(int n,int ze) {
        if (pay[n][0] + pay[n][1] != 0) {
             return pay[n][ze];
        }
        pay[n][1] = dp(n-1,0) ;
        pay[n][0] = dp(n-1,1) + dp(n-1,0);

        return pay[n][ze];

    }
}