

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while ((str = br.readLine()) != null) {
            int[] result = new int[4];
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    result[1]++;
                } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    result[0]++;
                } else if (str.charAt(i) == ' ') {
                    result[3]++;
                } else {
                    result[2]++;
                }
            }
            sb.append(result[0])
                    .append(" ")
                    .append(result[1])
                    .append(" ")
                    .append(result[2])
                    .append(" ")
                    .append(result[3])
                    .append("\n");

        }
        System.out.println(sb.toString());
    }
}
