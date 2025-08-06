
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                queue(st.nextToken(), st.hasMoreTokens());
            }
            bw.write("\n");
        }
        bw.flush();
    }

    public static void queue(String word, boolean more_word) throws IOException {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            bw.write(stack.pop());

        }
        if (more_word ){
            bw.write(" ");    
        }
        

    }
}
