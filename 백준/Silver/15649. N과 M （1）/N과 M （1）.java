
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class  Main {
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        boolean[] checker = new boolean[N+1];
        backtracking(arr,0,M,checker);
        bw.flush();
    }
    private static void backtracking(int []arr, int init ,int depth,boolean[] checker) throws IOException {
        if (depth==init){
            for (int i = 0; i <init ; i++) {
                bw.write(arr[i]+" ");
            }
            bw.write("\n");
            return;
        }
        for (int i = 1; i <= arr.length ; i++) {
            if (checker[i]){
                continue;
            }
            arr[init]=i;
            checker[i]=true;
            backtracking(arr,init+1,depth,checker);
            checker[i]=false;
        }

    }
}