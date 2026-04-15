import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[Integer.parseInt(st.nextToken())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int cnt = Integer.parseInt(st.nextToken());
        for (int i = 0; i <cnt ; i++) {
            st = new StringTokenizer(br.readLine());
            int A =Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int temp;
            temp = arr[A-1];
            arr[A-1] = arr[B-1];
            arr[B-1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+" ");
        }
        bw.flush();
    }
}

