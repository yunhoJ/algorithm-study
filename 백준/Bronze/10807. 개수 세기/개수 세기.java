
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(br.readLine());
        int cnt =0;
        for (int i =0 ; i<num;i++){
            if (A==Integer.parseInt(st.nextToken())){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

