
import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int cnt = Integer.parseInt(br.readLine());
     StringTokenizer st ;
        for (int i = 0; i <cnt ; i++) {
            st = new StringTokenizer(br.readLine());
            long a = Integer.parseInt(st.nextToken());
            long b = Integer.parseInt(st.nextToken());

            BigInteger temp = factory2(b,(b-a)).divide(factory(a));
            System.out.println(temp);
//            System.out.println(factory2(b,a));
        }
    }

    private static BigInteger factory(long a) {
        BigInteger bigNumber1 = new BigInteger(String.valueOf(a));

        if (a<=1){
            return bigNumber1;
        }
        else return factory(a-1).multiply(bigNumber1);
    }

    private static BigInteger factory2(long a, long end) {
        BigInteger bigNumber1 = new BigInteger(String.valueOf(a));


        if (a==end+1){
            return bigNumber1;
        }
        else return factory2(a-1,end).multiply(bigNumber1);
    }
}
/*
1 - 1
2 - 10
3 - 100
4 - 1001
5 - 10010


 */