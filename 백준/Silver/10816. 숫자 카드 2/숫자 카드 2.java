
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        int cnt=1;
        for (int i = 0; i <N ; i++) {
            int t = Integer.parseInt(st.nextToken());
            if(map.containsKey(t))
            {
                cnt= map.get(t)+1;
            }else cnt = 1 ;
            map.put(t,cnt);
        }

        int M = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st=new StringTokenizer(br.readLine());

        for (int i = 0; i <M ; i++) {
            Integer a =map.get(Integer.parseInt(st.nextToken()));
            if(a==null){
                bw.write(0+" ");
            }
           else bw.write(a+" ");
        }
        bw.flush();
    }
}
