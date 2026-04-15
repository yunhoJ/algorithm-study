import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int d  = Integer.parseInt(br.readLine());

        if(a>=c){
            if(a==c &&(b==0||d>=b)) System.out.println(1);
           else System.out.println(0);
        }
        else if(d>=((float)b/(c-a)))
            System.out.println(1);
        else System.out.println(0);
    }
}