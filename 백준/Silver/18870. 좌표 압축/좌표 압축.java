
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int [][] arr = new int[cnt][2];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for (int i = 0; i <cnt ; i++) {
            arr[i][0]=i;
            arr[i][1]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int re[] = new int[cnt];
        int num = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(i!=0&&arr[i][1]!=arr[i-1][1]){
                num++;
            }
            re[arr[i][0]] = num;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < re.length ; i++) {
            bw.write(re[i]+" ");
        }
        bw.flush();
       

    }
}

