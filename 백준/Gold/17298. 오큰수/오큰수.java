import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[cnt];
        int[] result = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            result[i] = -1; // 기본값 -1
        }

        Stack<Integer> stack = new Stack<>(); // 인덱스를 저장
        for (int i = 0; i < cnt; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                int idx = stack.pop();
                result[idx] = arr[i];
            }
            stack.push(i);
        }

        for (int num : result) {
            bw.write(num + " ");
        }
        bw.flush();
    }
}