import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char [] arr = br.readLine().toCharArray();
        String[] result = new String[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < arr.length ; j++) {
                sb.append(arr[j]);

            }
            result[i] = sb.toString();
        }
        Arrays.sort(result);
        for (int i = 0; i < result.length ; i++) {
            System.out.println(result[i]);
        }
    }
}