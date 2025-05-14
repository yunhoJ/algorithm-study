
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num  = Integer.parseInt(br.readLine());
        int arr[] = new int[num];
        for (int i = 0; i <num ; i++) {
            arr[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < arr.length ; i++) {
            bw.write(arr[i]+"\n");
        }
        bw.flush();
    }
}