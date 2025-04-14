import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Set<Integer> set =new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <a ; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <b ; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(set.contains(temp)){
                set.remove(temp);
            }else {
                set.add(temp);
            }
        }
        System.out.println(set.size());
    }
}