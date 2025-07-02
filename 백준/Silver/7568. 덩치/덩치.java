import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int [][] arr = new int[cnt][2];
        StringTokenizer st ;
        for (int i = 0; i <cnt ; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        int num =0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(i==j)continue;
                if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]){
                    num++;
                }
            }
            System.out.print(num+1+" ");
            num=0;
        }
    }

}