
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        long sum = 0;
        for (int i = 1; i <=a-2 ; i++) {
            sum += (long) i *(i+1)/2;
        }
        System.out.println(sum);
        System.out.println(3);
    }
}
