import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] input = new int[2][N];

//            초기회
            for (int j = 0; j <input.length ; j++) {
                st = new StringTokenizer(br.readLine());
                int k = 0;
                while (st.hasMoreTokens()){
                    input[j][k]=Integer.parseInt(st.nextToken());
                    k++;
                }
            }

//            dp
            for (int j = 1; j <N ; j++) {
                input[0][j] = Math.max(input[0][j-1],input[1][j-1]+input[0][j]);
                input[1][j] = Math.max(input[1][j-1],input[0][j-1]+input[1][j]);
            }
// 마지막 두 값중 큰거 출력
            System.out.println(Math.max(input[0][N-1],input[1][N-1]));
        }
    }
}
