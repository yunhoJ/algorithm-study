import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        char num[]=br.readLine().toCharArray();
        int sum = 0;
        br.close();
        for (int i =0;i<a;i++){
            sum+= (num[i]-'0');
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}