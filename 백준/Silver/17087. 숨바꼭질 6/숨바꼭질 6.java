import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Integer, Boolean> primeCache = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int min = 1000000001;
        for (int i = 0; i <N ; i++) {
            int tmp =Math.abs(Integer.parseInt(st.nextToken()) - S);
            if (tmp<min){
                min = tmp;
            }
            arr[i] = Math.abs(tmp);

        }

        System.out.println(GCD(arr,min));

    }

    private static int GCD(int[] arr, int min) {
        for (int i = min; i >0 ; i--) {
            boolean ok = true;
            for (int x : arr) {
                if (x % i != 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) return i;

        }
        return 1;
    }
}