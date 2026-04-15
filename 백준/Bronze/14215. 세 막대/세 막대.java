import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a[] = new int[3];
        for (int i = 0; i <3 ; i++) {
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        if(a[2]>=a[0]+a[1]){
            System.out.println((a[0]+a[1])*2-1);
        }
        else System.out.println(a[0]+a[1]+a[2]);
    }
}