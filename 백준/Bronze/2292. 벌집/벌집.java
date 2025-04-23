import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int a = 1;
        int cnt = 1;
        while (a <input) {
            a += (6 * (cnt++));
        }
        System.out.println(cnt);
    }
}