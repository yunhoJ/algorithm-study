import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Set<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            String Temp = st.nextToken();
            String Temp2 = st.nextToken();
            if (set.contains(Temp2) || set.contains(Temp)) {
                set.add(Temp);
                set.add(Temp2);
            }
        }
        System.out.println(set.size());


    }
}