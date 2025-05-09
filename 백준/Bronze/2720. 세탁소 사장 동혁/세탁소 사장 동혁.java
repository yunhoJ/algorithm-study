
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            int[] arr = new int[4];
            int temp = Integer.parseInt(br.readLine());
            arr[0] = temp / 25;
            temp %= 25;
            arr[1] = temp / 10;
            temp %= 10;
            arr[2] = temp / 5;
            temp %= 5;
            arr[3] = temp;
            bw.write(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+"\n");
        }
        bw.flush();
    }
}