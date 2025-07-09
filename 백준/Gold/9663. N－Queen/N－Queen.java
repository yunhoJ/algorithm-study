


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static int N;
    static int CNT;
    static int[][] arrys;
    static boolean[] same_col;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arrys = new int[N][N];
        same_col = new boolean[N];
        backtraking(0);
        System.out.println(CNT);
    }

    private static void backtraking(int start) {
        if (start == N) {
//            for (int i = 0; i < N; i++) {
//                System.out.println(Arrays.toString(arrys[i]));
//            }
//            System.out.println();
            CNT++;

            return;
        }
        for (int i = 0; i < N; i++) {
//            같은행일 경유 패스
            if (same_col[i]) {
                continue;
            }

            boolean check = false;
            int minus = 1;
            for (int j = start; j > 0; j--) {
//                대각선일경우 패스왼쪽
                if (i >= minus && (arrys[start - minus][i - minus] == 1)) {
                    check = true;

                }
                minus += 1;
            }
            if (check) {
                continue;
            }
            boolean check2 = false;
            int minus2 = 1;
            for (int j = start; j > 0; j--) {
//                대각선일경우 패스오른쪽
                if (i + minus2 < N && (arrys[start - minus2][i + minus2] == 1)) {
                    check2 = true;

                }
                minus2 += 1;
            }
            if (check2) {
                continue;
            }
//            if (start > 0 && i < N - 1 && (arrys[start - 1][i + 1] == 1)) {
//                continue;
//            }
            arrys[start][i] = 1;
            same_col[i] = true;

            backtraking(start + 1);
            same_col[i] = false;
            arrys[start][i] = 0;

        }


    }
}
