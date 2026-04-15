
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] bucket = new int[N];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = (i + 1);
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int mid = Integer.parseInt(st.nextToken()) - 1;
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = a; j <=b; j++) {
                if (j < mid) temp.add(bucket[j]);
                else {
                    bucket[j - mid +a] = bucket[j];
                }
            }
            for (int j = 0; j < temp.size(); j++) {
                bucket[b -mid+a+1 +j] = temp.get(j);
            }
        }
        for (int i = 0; i <bucket.length ; i++) {
            System.out.print(bucket[i]+" ");
        }

    }
}

