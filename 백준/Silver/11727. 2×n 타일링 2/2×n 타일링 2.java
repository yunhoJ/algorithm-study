import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] dbArr = new long[N+3];
        dbArr[1] = 1;
        dbArr[2] = 3;

        System.out.println(dp(N, dbArr));

    }

    private static Long dp(int n, long[] arr) {
        if (n < 3) {
            return arr[n];
        }
        if (arr[n] == 0) {
            arr[n] = ((dp(n - 2, arr)* 2) + dp(n - 1, arr)) % 10007;
        }
        return arr[n];
    }


}