
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < cnt; i++) {
            int tenp = Integer.parseInt(br.readLine());
            if (tenp == 0) {
                stack.pop();
            } else {
                stack.push(tenp);
            }
        }
        int cnt2=stack.size();
        int sum = 0;
        for (int i = 0; i <cnt2; i++) {
            sum+=stack.pop();

        }
        System.out.println(sum);
    }
}