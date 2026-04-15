import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int init = 1;

        while (st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());

            if (temp != init) {
                stack.add(temp);

            }else {
                    init += 1;
            }
            while (!stack.empty()) {
                if (stack.peek()==init) {
                    stack.pop();
                    init += 1;
                }else {
                    break;
                }

            }

        }
        if(stack.empty()){
            System.out.println("Nice");
        }else {
            System.out.println("Sad");
        }

    }
}
