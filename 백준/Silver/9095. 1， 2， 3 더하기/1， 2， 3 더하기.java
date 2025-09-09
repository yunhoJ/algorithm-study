import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int T =Integer.parseInt(br.readLine());
        arr =new int[20];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        for (int i = 0; i <T ; i++) {
            int n= Integer.parseInt(br.readLine());
            System.out.println(dp(n));
        }


    }

    private static int dp(int n) {
        if(n<3){
            return arr[n];
        }
        arr[n] = dp(n-1) + dp(n-2) + dp(n-3);
        return arr[n];
    }
}