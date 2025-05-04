import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        String str;
        while ((str = br.readLine()) != null && !str.isEmpty() ) {
            arr.add(Integer.parseInt(str));
        }
        int MAX= arr.get(0);
        int index=0;
        for (int i = 0; i < arr.size(); i++) {
            if(MAX<arr.get(i)){
                MAX=arr.get(i);
                index=i;
            }
        }
        System.out.println(MAX+"\n"+(index+1));
    }
}