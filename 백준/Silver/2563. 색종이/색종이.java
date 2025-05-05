
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int [][]all = new int[100][100];

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i <count ; i++) {
            st= new StringTokenizer(br.readLine());
             int x = Integer.parseInt(st.nextToken());
             int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x+10; j++) {
                for (int k = y; k <y+10 ; k++) {
                    all[j][k]=1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < all.length ; i++) {
            for (int j = 0; j < all[i].length ; j++) {
                sum+=all[i][j];
            }
        }
        System.out.println(sum);
    }
}

