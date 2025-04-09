import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a =Integer.parseInt(br.readLine());
        System.out.println(X(a));
    }
    public static int X(int a){
        int cnt=99;
        if(a<100){
            return a;

        }else if (a<=1000){
            for (int i =100;i<=a;i++){
                int one = i%10;
                int ten =(i/10)%10;
                int had = i/100;
                if (one-ten==ten-had) cnt++;
            }
            return cnt;
        }
        return 0;
    }
}
