
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> a = new HashSet<>();
        for (int i = 0; i <N ; i++) {
            a.add(br.readLine());
        }
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i <M ; i++) {
            String temp = br.readLine();
            if(a.contains(temp)){
                arr.add(temp);
            }
        }
        arr.sort(String::compareTo);
        System.out.println(arr.size());
        for (int i = 0; i <arr.size() ; i++) {

            System.out.println(arr.get(i));
        }
    }
}
