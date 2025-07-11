
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num];
        int Max = 0,Min = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i == 0) {
                Min = arr[0];
                Max= arr[0];
            }
            if (arr[i] > Max) {
                Max = arr[i];
            }
            if (arr[i] <= Min){
                Min =arr[i];
            }
        }
        System.out.println(Min+ " "+Max);
    }
}