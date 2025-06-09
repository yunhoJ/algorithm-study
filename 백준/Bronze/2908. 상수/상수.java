
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        int num[]=new int[3];
        int num2[]=new int[3];
        char a []=st.nextToken().toCharArray();
        char b []=st.nextToken().toCharArray();
        for (int i = 0; i <a.length ; i++) {
            num[i]=Character.getNumericValue(a[i]);
        }
        for (int i = 0; i <a.length ; i++) {
            num2[i]=Character.getNumericValue(b[i]);
        }
        int result =(num[2]*100+num[1]*10+num[0])>(num2[2]*100+num2[1]*10+num2[0])?(num[2]*100+num[1]*10+num[0]):(num2[2]*100+num2[1]*10+num2[0]);
        System.out.println(result);
    }
}
