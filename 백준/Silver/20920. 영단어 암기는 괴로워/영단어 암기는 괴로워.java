import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int length= Integer.parseInt(st.nextToken());
        Map<String,Integer> voca = new HashMap<>();
        for (int i = 0; i <cnt ; i++) {
            String temp = br.readLine();
            if(temp.length()>=length){
                if(voca.containsKey(temp)){
                    voca.replace(temp,voca.get(temp)+1);
                }
                else {
                    voca.put(temp,1);
                }
            }
        }
        // value 정렬
        List<String> keyset = new ArrayList<>(voca.keySet());

        keyset.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len =voca.get(o1);
                int len2 = voca.get(o2);
                if(len==len2){
                    if(o2.length()==o1.length()){
                        return o1.compareTo(o2);
                    }
                    return o2.length()-o1.length();
                }
                return len2-len;
            }
        });
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i <keyset.size() ; i++) {
            bw.write(keyset.get(i)+"\n");
        }

        bw.flush();
    }
}