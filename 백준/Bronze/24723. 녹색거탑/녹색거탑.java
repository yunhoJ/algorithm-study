import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int sum = 1;
        for (int i = 0; i <num ; i++) {
            sum*=2;
        }
        System.out.println(sum);
    }
}