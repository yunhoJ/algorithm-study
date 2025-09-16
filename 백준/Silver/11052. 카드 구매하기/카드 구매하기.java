import java.io.*;
import java.util.StringTokenizer;

class Main{
    static  int pay [];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        pay = new int[N+1];
        int[] card_pay = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <N ; i++) {
            card_pay[i]=Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=i ; j++) {
                pay[i] = Math.max(pay[i],card_pay[i-j]+pay[j-1]);
            }
        }
        System.out.println(pay[N]);
    }
}