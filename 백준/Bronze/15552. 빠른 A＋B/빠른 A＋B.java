import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws  IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num= Integer.parseInt(sc.readLine());
        StringTokenizer st;
        for (int i =0 ;i<num;i++){
             st = new StringTokenizer(sc.readLine());
             bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
         }
        bw.flush();
        bw.close();
        sc.close();
    }
}