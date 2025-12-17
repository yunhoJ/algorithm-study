import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        int [][] pay = new int[N][3];

        for (int i = 0; i <N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            pay[i][0] = Integer.parseInt(st.nextToken());
            pay[i][1] = Integer.parseInt(st.nextToken());
            pay[i][2] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <N ; i++) {
            pay[i][0] += Math.min(pay[i-1][1] ,pay[i-1][2] );
            pay[i][1] += Math.min(pay[i-1][0] ,pay[i-1][2] );
            pay[i][2] += Math.min(pay[i-1][0] ,pay[i-1][1] );
        }
        System.out.println(Math.min(Math.min(pay[N-1][0],pay[N-1][1]),pay[N-1][2]));
    }
}