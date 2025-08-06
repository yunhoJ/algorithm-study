
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int[] operator;
    static int max = -2000000000;
    static int min = 2000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int result[] = new int[N - 1];
        boolean checker[] = new boolean[N + 1];
        operator = new int[N - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int a = Integer.parseInt(st2.nextToken());
            for (int j = 0; j < a; j++) {
                operator[cnt] = i;
                cnt++;
            }
        }
        backtraking(arr, result, N - 1, checker);
        System.out.println(max);
        System.out.println(min);

    }

    private static void backtraking(int[] arr, int[] result, int depth, boolean[] checker) {
        if (depth == 0) {
            int temp = arr[0];
            for (int i = 0; i < operator.length; i++) {
                switch (result[i]) {
                    case 0:
                        temp += arr[i + 1];
                        break;
                    case 1:
                        temp -= arr[i + 1];
                        break;
                    case 2:
                        temp *= arr[i + 1];
                        break;
                    case 3:
                        if (temp < 0) {
                            temp = temp * -1 / arr[i + 1];
                            temp = temp * -1;
                        } else {
                            temp /= arr[i + 1];
                        }
                        break;
                }
            }
            if (max < temp) {
                max = temp;
            }
            if (min > temp) {
                min = temp;
            }

            return;
        }
        for (int i = 0; i < operator.length; i++) {
            if (checker[i]) {
                continue;
            }
            checker[i] = true;
            result[i] = operator[operator.length - depth];
            backtraking(arr, result, depth - 1, checker);
            checker[i] = false;
        }
    }
}
//[1, 2, 3, 5, 6, 4]