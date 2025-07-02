import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Set<String> set =  new HashSet<>();
        for (int i = 0; i <a ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String temp=st.nextToken();
            if(set.contains(temp)){
                set.remove(temp);
            }else set.add(temp);
        }
        set.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}