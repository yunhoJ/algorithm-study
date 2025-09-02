import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
        int b1 = Integer.parseInt(a[0]);
        int b2 = Integer.parseInt(a[1]);
        System.out.println(Integer.toString(b1,b2).toUpperCase());
    }
}