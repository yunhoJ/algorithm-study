import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a  =Integer.parseInt(br.readLine());
        int cnt =0;
        int b= a;
        do {
            cnt++;
            if (a<10 ){
                a=a*10+a;
            }
            else {
                int one = a % 10;
                int ten = a/10;
               a= (a%10)*10 +(one+ten)%10;
            }
        }while (a!=b);
        System.out.println(cnt);
    }
}