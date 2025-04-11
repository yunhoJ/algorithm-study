
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int init =0;
        int cnt=0;
        while (true){
            init+=(++cnt);
            if(init>=input){
                if(cnt%2==0){
                    System.out.println((input+cnt-init)+"/"+(init-input+1));
                }else {
                    System.out.println((init-input+1)+"/"+(input+cnt-init));
                }
                break;
            }
        }
    }
}


