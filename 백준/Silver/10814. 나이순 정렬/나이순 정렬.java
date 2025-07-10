

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int cnt  = Integer.parseInt(br.readLine());

        String arr[] = new String[cnt];
        StringTokenizer st;
        for (int i = 0; i <cnt ; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a[]=o1.split(" ");
                String b[] =o2.split(" ");
                return Integer.parseInt(a[0])-Integer.parseInt(b[0]);
            }

        });
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+"\n");

        }
        bw.flush();
    }
}

