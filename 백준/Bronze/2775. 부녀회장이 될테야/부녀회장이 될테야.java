import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test = Integer.parseInt(br.readLine());
        for (int i = 0; i <Test; i++) {
            int floor = Integer.parseInt(br.readLine());
            int dong = Integer.parseInt(br.readLine());
            int arr[][] =new int[floor+1][dong];
            for (int j = 0; j < floor+1; j++) {
                int sum = 0;
                for (int k = 0; k <dong ; k++) {
                    if (j==0) {
                        arr[j][k] = k+1;
                    }
                    else {
                        sum +=arr[j-1][k];
                        arr[j][k]=sum;
                    }
                }
            }
            System.out.println(arr[floor][dong-1]);
        }

    }
}