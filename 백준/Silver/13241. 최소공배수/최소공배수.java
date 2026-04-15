import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());
             long temp = Math.max(A,B);

            long sum = 1;
            for (long j = 2; j <temp ; j++) {
                if(A%j==0 && B%j==0){
                    A/=j;
                    B/=j;
                    sum*=j;
                    j--;
                }
            }
            sum*=A;
            sum*=B;

            System.out.println(sum);
        }

}