import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        Set<Integer> set = new HashSet<>();
        while ((str= br.readLine())!=null && !str.isEmpty()){
            set.add(Integer.parseInt(str)%42);
        }
        System.out.println(set.size());
    }
}