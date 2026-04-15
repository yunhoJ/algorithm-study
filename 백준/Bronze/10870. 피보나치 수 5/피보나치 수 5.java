import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int fobo_num=Integer.parseInt(br.readLine());

        int result=febo(fobo_num);
        System.out.println(result);
    }
    private static int febo(int num){
        if (num==0){
            return 0;
        } else if (num==1) {
            return 1;
        }
        return febo(num-1)+febo(num-2);
    }
}