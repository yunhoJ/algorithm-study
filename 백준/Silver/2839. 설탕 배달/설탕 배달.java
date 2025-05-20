
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int KG = Integer.parseInt(br.readLine());

        int small = 3;
        int big = 5;
        int cnt =-1;
        Loop1:
        for (int i = 0; i <KG ; i++) {
            for (int j = 0; j <KG ; j++) {
                if (big*j+small*i==KG){
                    cnt=j+i;
                    break Loop1;
                }
            }
        }
        System.out.println(cnt);
    }
}


