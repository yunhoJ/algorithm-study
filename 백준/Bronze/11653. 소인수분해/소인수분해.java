import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if(num>1){
            for (int i = 2; i <=num ; i++) {
                while (num%i==0){
                    System.out.println(i);
                    num/=i;
                }

            }
        }
    }
}