
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] a = new String[N];
        Map<String,Integer>b = new HashMap<>();
        for (int i = 0; i <N ; i++) {
            a[i]= br.readLine();
            b.put(a[i],i);
        }

        for (int i = 0; i <M ; i++) {
            String find = br.readLine();
            char T=find.charAt(0);

            if (('a' <=T && T <= 'z')
                    || ('A' <= T && T <= 'Z')) {
                System.out.println(b.get(find)+1);
                
                
            } else {
                System.out.println(a[Integer.parseInt(find)-1]);
            }
        }
    }
}