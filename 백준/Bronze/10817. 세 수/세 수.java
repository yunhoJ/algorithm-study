import java.io.*;
import java.util.Arrays;

import java.util.Comparator;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1)-Integer.parseInt(o2);
            }
        });
        System.out.println(arr[1]);
        
    }
}