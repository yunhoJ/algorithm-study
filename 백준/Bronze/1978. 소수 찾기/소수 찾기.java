import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        boolean check = true;
        for (int i = 0; i < a; i++) {
            int c = Integer.parseInt(st.nextToken());
            if (c > 1) {
                for (int j = 2; j < c; j++) {
                    if((c%j)==0){
                        check=false;
                    }
                }
                if (check){
                    cnt++;
                }
                check=true;
            }
        }
        System.out.println(cnt);
    }
}

