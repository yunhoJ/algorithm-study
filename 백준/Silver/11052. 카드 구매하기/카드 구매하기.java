import java.io.*;

class Main{
    private static int[] money;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        String []arr =br.readLine().split(" ");
        money = new int[N+1];
        money[0] = 0;
        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=i; j++) {
                money[i] = Math.max(money[i], money[i-j] + Integer.parseInt(arr[j-1]));

            }
        }
        System.out.println(money[N]);
    }
}

