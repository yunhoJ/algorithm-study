
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            if (A % i == 0) {
                arr.add(i);
            }
        }
        if (arr.size() >=B) System.out.println(arr.get(B - 1));
        else System.out.println(0);
    }
}