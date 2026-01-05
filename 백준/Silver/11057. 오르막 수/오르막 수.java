import java.io.*;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][]result = new int[N+1][10];
        Arrays.fill(result[1],1);

        for (int i = 2; i <=N ; i++) {
            for (int j = 9; j >=0 ; j--) {
                if (j==9){
                    result[i][j] = 1;
                }else{
                    result[i][j] =( result[i-1][j]+result[i][j+1])%10007;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i <result[N].length ; i++) {
            sum+=result[N][i];
        }
        System.out.println(sum%10007);
    }
}

