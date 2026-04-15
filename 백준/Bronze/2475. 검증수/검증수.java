
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());
        int N3 = Integer.parseInt(st.nextToken());
        int N4 = Integer.parseInt(st.nextToken());
        int N5 = Integer.parseInt(st.nextToken());
        int sum = N1*N1 + N2*N2 +N3*N3 +N4*N4 +N5*N5 ;
        System.out.println(sum%10);

    }

}

