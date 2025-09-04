import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    private static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new long[n+1];

        if (n<=2){
            System.out.println(n);
        }else{
            arr[1] = 1;
            arr[2] = 2;
            System.out.println(fibo(n));
        }

    }
    private static long fibo(int n) {
        if (arr[n]==0){
            arr[n] = (fibo(n-1) + fibo(n-2)) % 10007;
        }
        return arr[n];
    }

}
