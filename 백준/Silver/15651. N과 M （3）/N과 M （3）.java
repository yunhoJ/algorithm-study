import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] num_arr = new int[N];

        for (int i = 0; i <N ; i++) {
            num_arr[i]=i+1;
        }
//        backTracking(num_arr, M,0);
        backTracking2(num_arr, M,"");
        bw.flush();
    }

    private static void backTracking2(int[] arr, int depth ,String a) throws IOException {
        if (depth==1){
            for (int i = 0; i <arr.length ; i++) {
                    bw.write(a+arr[i]+"\n");
            }
//
            return ;
        }
        for (int i = 0; i <arr.length ; i++) {
            backTracking2(arr,depth-1 ,a+arr[i]+" ");
        }
    }
}