import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int[] result ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A];
        result = new int[A];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[j]<arr[i]){
                    result[i] = Math.max(result[j]+1,result[i]);

                }
            }
        }
        int answer = 0;
        for (int i = 0; i < A; i++) {
            answer = Math.max(answer, result[i]);
        }
        System.out.println(answer + 1);
    }
}
