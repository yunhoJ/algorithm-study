import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        int score = 0, iter=0;
        for (int i=0;i<cnt;i++){
            char ox[]= br.readLine().toCharArray();
            for (int j=0;j<ox.length;j++){
                if(ox[j]=='O'){
                    iter+=1;
                    score+=iter;
                }else iter=0;
            }
            bw.write(score+"\n");
            score=0;
            iter=0;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

