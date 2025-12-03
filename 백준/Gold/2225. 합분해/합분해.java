import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int arr[][] = new int[N + 1][K + 1];
        Arrays.fill(arr[0], 1);

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                arr[i][j] = (arr[i][j - 1] + arr[i - 1][j]) % 1000000000;
            }
        }
        System.out.println(arr[N][K]);
    }


}

/*
이걸 arr[i][j-1] + arr[i-1][j]로 줄이는 이유
    arr[i-1][j]를 다시 펼쳐보면 똑같은 구조가 반복됨.
    arr[i-1][j] = arr[i-1][j-1] + arr[i-2][j-1] + ... + arr[0][j-1]

따라서 전체 합:
    arr[i][j] = arr[i][j-1] + arr[i-1][j]
    이렇게 하면 마지막 수를 0으로 고른 경우 + 마지막 수 1 이상인 모든 경우를 한 번에 포함하는 구조가 됨.
 */