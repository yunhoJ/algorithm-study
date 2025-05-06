import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0;i<cnt ;i++){
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            char arr[]=st.nextToken().toCharArray();

            for (char j :arr) {
                for (int k = 0; k <n ; k++) {
                    bw.write(j);
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }

}