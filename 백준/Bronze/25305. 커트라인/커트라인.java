import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int score [] =new int[N];
        for (int i = 0; i < N; i++) {
            score[i]=Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i <score.length-1 ; i++) {
            for (int j = i+1; j <score.length ; j++) {
                if(score[i]<score[j]){
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] =temp;
                }
            }
        }
        System.out.println(score[k-1]);
    }
}