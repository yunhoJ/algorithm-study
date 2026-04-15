
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       StringTokenizer st =new StringTokenizer(br.readLine());
       int arr[] = new int[Integer.parseInt(st.nextToken())];
       int cnt = Integer.parseInt(st.nextToken());
        for (int i = 0; i <cnt ; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            for (int j = A; j <=B ; j++) {
                arr[j-1]=C;

            }

        }
        for (int i = 0; i <arr.length ; i++) {
            bw.write(arr[i]+" ");
        }
        bw.flush();

    }
}

