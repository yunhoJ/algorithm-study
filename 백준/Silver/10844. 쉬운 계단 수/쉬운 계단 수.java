import java.io.*;
import java.util.Arrays;


class Main{
    static  long pay [][] =new long[102][10];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Arrays.fill(pay[1],1);
        int mod = 1_000_000_000;
        pay[1][0] = 0;

        for (int i = 2; i <=N ; i++) {
            for (int j = 0; j < 10; j++) {
                if (j==0){
                    pay[i][0] = pay[i-1][1]%mod;
                } else if (j==9) {
                    pay[i][9] = pay[i-1][8]%mod;
                } else {
                    pay[i][j] =( pay[i-1][j-1]+pay[i-1][j+1] )%mod ;
                }
            }
        }
        long result = 0;
        for (int i = 0; i <10 ; i++) {
            result+=pay[N][i];
        }
        System.out.println(result%mod);
    }

}

