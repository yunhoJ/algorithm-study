import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int temp =1;
        int sum = 0;
        for (int i = 1; i <cnt ; i++) {
            temp*=2;
            sum+=temp;
        }
        System.out.println((sum +3)*(sum +3));
    }
}