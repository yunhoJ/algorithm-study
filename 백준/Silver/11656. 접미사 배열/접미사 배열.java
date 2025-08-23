import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] result = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            result[i] = s.substring(i);
        }

        Arrays.sort(result);

        StringBuilder sb = new StringBuilder();
        for (String str : result) {
            sb.append(str).append("\n");
        }
        System.out.print(sb);
    }
}
