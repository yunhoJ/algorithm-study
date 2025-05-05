
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max =-1;
        int max_i = 0;
        int max_j=0;
        for (int i = 0; i <9 ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (max < temp) {
                    max = temp;
                    max_i = i;
                    max_j = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((max_i+1)+" "+(max_j+1));




    }
}

