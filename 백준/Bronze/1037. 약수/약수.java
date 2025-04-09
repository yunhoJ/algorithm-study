import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] a = new int[cnt];
        for (int i = 0; i <cnt ; i++) {
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        System.out.println(a[0]*a[cnt-1]);
    }

}