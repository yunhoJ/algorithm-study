
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Set<String> set = new HashSet<>();
       String s = br.readLine();

        for (int i = 1; i <=s.length() ; i++) {
            int a = i;
            for (int j = 0; j <=s.length() ; j++) {

                if(j+i<=s.length()){
                    set.add(s.substring(j,j+i));

                }
            }

        }
        System.out.println(set.size());
    }
}
