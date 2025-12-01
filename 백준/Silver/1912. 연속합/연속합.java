
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int result = -20000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A];
        int[] result_arr = new int[A];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        result_arr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result_arr[i] = Math.max(result_arr[i - 1] + arr[i], arr[i]);
        }
        for (int i = 0; i < result_arr.length; i++) {
            result = Math.max(result_arr[i], result);
        }

        System.out.println(result);
    }
}
