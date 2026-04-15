import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[Integer.parseInt(st.nextToken())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int cnt = Integer.parseInt(st.nextToken());
        for (int i = 0; i <cnt ; i++) {
            st = new StringTokenizer(br.readLine());
            int A =Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            arr=reverse(arr,A,B);

        }
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+" ");
        }
        bw.flush();

    }
    private static int[] reverse(int [] arr, int a, int b){
//        123
//        01234
        int temp[] = new int[arr.length];
        for (int i = 0; i <temp.length ; i++) {
            temp[i]=arr[i];
        }
        for (int i = a-1 , j=b-1; i <b && j>=a-1 ; i++,j--) {
            temp[j] = arr[i];

        }
        return temp;
    }
}

