
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] result = new int[N];
        backtraking(M, N, N, result);
        bw.flush();
    }

    private static void backtraking(int m, int n, int depth, int[] result) throws IOException {
        if (depth == 0) {
//            System.out.println(Arrays.toString(result));
            for (int i = 0; i < result.length; i++) {
                bw.write(result[i] + " ");
            }
            bw.write("\n");

            return;
        }
        for (int i = 1; i < m + 1; i++) {

            if ((n - depth != 0)&& (result[n - depth - 1] >= i)) {
                continue;
            }
//            set.add(i);
            result[n - depth] = i;
            backtraking(m, n, depth - 1, result);
//            set.remove(i);

        }

    }
}