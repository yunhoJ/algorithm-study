
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int cnt = Integer.parseInt(br.readLine());
        double avg =0;
        double sum = 0;
        double a=0;
        for (int i=0;i<cnt;i++){
            st=new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int score[] = new int[num];
            for (int j=0;j< score.length;j++){
                score[j]=Integer.parseInt(st.nextToken());
                sum+= score[j];
            }
            avg=sum/num;
            for (int j=0;j< score.length;j++){
                if (score[j]>avg){
                    a++;
                }
            }
            System.out.printf("%.3f%%\n",(a/num*100));
            sum=0;
            a=0;
        }
    }
}
