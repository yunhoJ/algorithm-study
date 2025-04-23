
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean check =false;
        for (int i = 1; i <N ; i++) {
            if(N==sum(i)){
                System.out.println(i);
                check=true;
                break;
            }
        }
        if(!check) System.out.println(0);
    }
    public static  int sum(int a){
        String tenp = String.valueOf(a);
        int sum =a;
        for (int i = 0; i <tenp.length() ; i++) {
            sum+=(tenp.charAt(i)-'0');
        }
        return sum;

    }
}
