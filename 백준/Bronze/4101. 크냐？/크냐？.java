import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st.nextToken());

            if (temp == 0 && temp2 == 0) {
                break;
            }
            if (temp > temp2) {
                System.out.println("Yes");
            } else System.out.println("No");
        }
    }
}