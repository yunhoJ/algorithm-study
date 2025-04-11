
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int cnt  = Integer.parseInt(br.readLine());
        String arr [] = new String[cnt];

        for (int i = 0; i <cnt ; i++) {
            arr[i]= br.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) != o2.charAt(i)) {
                            return o1.charAt(i) - o2.charAt(i);
                        }
                    }
                } else return o1.length() - o2.length();
                return 0;
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < arr.length; i++) {
            
        
            if(i !=0 && arr[i-1].equals(arr[i]))
                continue;
            bw.write(arr[i] + "\n");
        }
        bw.flush();
    }

}
