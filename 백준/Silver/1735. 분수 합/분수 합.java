import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long a1 = sc.nextLong();
        long b = sc.nextLong();
        long b1 = sc.nextLong();

        long A = a1 * b + b1 * a;
        long B = a1 * b1;
        long gcd=gcd(A,B);
        System.out.println(A/gcd+" "+B/gcd);
    }
    public static long gcd (long a ,long b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}