import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A + 1];
        int maxSqrt = 0;
        for (int i = 1; i <= A; i++) {
            arr[i] = i;
            for (int j = 1; j * j <= i; j++) {
                arr[i] = Math.min(arr[i], arr[i - j * j] + 1);

            }
        }
        System.out.println(arr[A]);
    }
}
