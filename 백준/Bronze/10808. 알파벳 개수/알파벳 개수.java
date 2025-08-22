

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] inputString = br.readLine().toCharArray();

        int[] result = new int[26];
        for (char alph:inputString
        ) {
            result[(int)alph - 97]+=1;
        }

        for (int answer:result
        ) {
            bw.write(answer+" ");
        }
        bw.flush();
    }
}
