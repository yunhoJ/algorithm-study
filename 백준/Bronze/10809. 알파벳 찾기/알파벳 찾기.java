import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] inputString = br.readLine().toCharArray();
        int[] result = new int[26];
        Arrays.fill(result, -1);

        for (int i = 0; i <inputString.length ; i++) {
            if (result[(int)inputString[i] - 97]==-1){
                result[(int)inputString[i] - 97] = i;
            }
        }

        for (int answer:result
        ) {
            bw.write(answer+" ");
        }
        bw.flush();
    }
}
