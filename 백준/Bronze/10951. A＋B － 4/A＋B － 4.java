import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        String str;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while ((str=br.readLine())!=null){
            st=new StringTokenizer(str);
           int a = Integer.parseInt(st.nextToken());
           int b =Integer.parseInt(st.nextToken());

           bw.write(a+b+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}