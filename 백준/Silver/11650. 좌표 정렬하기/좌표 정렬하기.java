import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        int[][] arr = new int[cnt][2];
        StringTokenizer st ;
        for (int i = 0; i <cnt ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
         Arrays.sort(arr, new Comparator<int[]>() {
             @Override
             public int compare(int[] o1, int[] o2) {
                 return o1[0]!=o2[0]?o1[0]-o2[0] : o1[1]-o2[1];
             }
         });
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
             bw.write(arr[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
