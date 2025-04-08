import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[][] arr = new char[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
        String a = "WBWBWBWB";
        String b = "BWBWBWBW";
        char[][] result = new char[9][8];
        for (int i = 0; i <result.length ; i++) {
            if(i%2==0) result[i] = a.toCharArray();
            else result[i]=b.toCharArray();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        int cnt = 100;
        for (int i = 0; i < arr.length-7 ; i++) {
            for (int j = 0; j <arr[i].length-7 ; j++) {
                boolean bw = arr[i][j] == 'W';
               int temp=count(arr,result,bw,i,j);
               if(cnt>temp)cnt = temp;
                }
            }
        System.out.println(cnt);
        }
    public static int count(char[][] arr , char[][] re,boolean bool,int x ,int y){
        int i = bool ? 0 : 1 ;

        int count =0,count2=0;
        for (int k = 0, a=x; k <8 ; k++,a++) {
            for (int j = 0,b=y; j <8 ; j++,b++) {
                if(re[k][j]!=arr[a][b])count++;
            }
        }

        for (int k = 1, a=x; k <9 ; k++,a++) {
            for (int j = 0,b=y; j <8 ; j++,b++) {
                if(re[k][j]!=arr[a][b])count2++;
            }
        }
        return count>count2?count2:count;
    }
}