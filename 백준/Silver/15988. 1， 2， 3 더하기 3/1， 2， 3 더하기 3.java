import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long []dp_data = new long[10_000_002];
        int T = Integer.parseInt(br.readLine());
        //초기 데이터 입력
        dp_data[1]=1;
        dp_data[2]=2;
        dp_data[3]=4;


        for (int i = 0; i <T ; i++) {
            int n=Integer.parseInt(br.readLine());
            for (int j = 4; j <=n; j++) {
                if (dp_data[j]!=0) continue;
                dp_data[j] = (dp_data[j-1]+dp_data[j-2]+dp_data[j-3])%1_000_000_009;
            }
            System.out.println(dp_data[n]);
        }

    }
}