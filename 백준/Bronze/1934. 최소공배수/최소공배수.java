import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        for (int i = 0; i <a ; i++) {
            st= new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if( A==B ){
                System.out.println(A);
                continue;
            }
            long sum = 1;
            for (int j = 2; j <Math.max(A,B) ; j++) {
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
}