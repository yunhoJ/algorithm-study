import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        double arr[] = new double[count];
        double Max =0;
        double sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i =0; i<arr.length;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            if (Max<arr[i]){
                Max=arr[i];
            }
            sum += arr[i];
        }

        System.out.println(sum/Max*100/count);
    }

}