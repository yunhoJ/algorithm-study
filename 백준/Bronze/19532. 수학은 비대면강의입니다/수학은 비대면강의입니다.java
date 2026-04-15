import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a[] = new int[6];
        for (int i = 0; i <6 ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = -999; i <1000 ; i++) {
            for (int j = -999; j <1000 ; j++) {
                if(((a[0]*i)+(a[1]*j)-a[2])==0 && ((a[3]*i)+(a[4]*j)-a[5])==0){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}
