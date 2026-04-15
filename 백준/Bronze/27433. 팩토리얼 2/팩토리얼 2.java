
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fact(N));
    }
    public static Long fact(int a){
        if (a<=1){
            return 1L;
        }
        return a*fact(a-1);
    }
}

