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
        int cnt = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i <cnt ; i++) {
            String temp = br.readLine();
            if(temp.contains("push")){
                String [] temp_list=temp.split(" ");
                arr.add(Integer.parseInt(temp_list[1]));
            }
            if(temp.contains("top")){
                if(arr.size()==0) bw.write(-1+"\n");
                else bw.write(arr.get(arr.size() - 1) +"\n");
            }
            if(temp.contains("size")){
                bw.write(arr.size()+"\n");
            }
            if(temp.contains("pop")){
                if(arr.size()==0) bw.write("-1"+"\n");
                else {
                    bw.write(arr.get(arr.size() - 1) + "\n");
                    arr.remove(arr.size() - 1);
                }
            }
            if(temp.contains("empty")){
                if(arr.size()==0) bw.write(1+"\n");
                else bw.write(0+"\n");
            }

        }
        bw.flush();
    }
}