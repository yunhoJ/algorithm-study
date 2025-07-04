
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> all = new ArrayList<>();
        all.add(2);
        for (int i = 2; i < 10000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == (i - 1)) {
                    all.add(i);
                }
            }
        }
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            int num = Integer.parseInt(br.readLine());
            int sum = 0 ,A=0,B=0;
            Loop1:
            for (int j = 0; j < all.size(); j++) {

                for (int k = j ; k < all.size(); k++) {

                    sum = all.get(j) + all.get(k);
                    if(sum>num)break;
                    if (sum == num) {
                         A = all.get(j);
                         B = all.get(k);
                        break ;
                    }
                }
            }
            System.out.println(A + " " + B);
        }
    }
}

