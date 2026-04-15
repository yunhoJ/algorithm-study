
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <=T ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a= Integer.valueOf(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}