

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[]=br.readLine().split(" ");
        BigInteger bigNumber = new BigInteger(a[0]);
        BigInteger bigNumber1 = new BigInteger(a[1]);

        try {
            System.out.println(bigNumber.divide(bigNumber1));
            System.out.println(bigNumber.remainder(bigNumber1) );
        }
        catch (Exception e){
            System.out.println(0);
            System.out.println(bigNumber);
        }
    }
}