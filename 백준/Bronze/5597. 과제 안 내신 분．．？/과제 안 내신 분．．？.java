import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet<>();
        for (int i=1;i<31;i++){
            set.add(i);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine())!=null && !str.isEmpty()){
            set.remove(Integer.parseInt(str));
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Iterator<Integer> a = set.iterator();
        while (a.hasNext()){
            bw.write(a.next()+"\n");
        }
        bw.flush();
    }
}