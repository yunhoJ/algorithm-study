
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] arr = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        Deque<Character> opDeque = new ArrayDeque<>();

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] >= 'A' &&arr[i] <= 'Z'){
                sb.append(arr[i]);
            }else if (arr[i]=='('){
                opDeque.push(arr[i]);
            }else if (arr[i]==')'){
                while (!opDeque.isEmpty() && opDeque.peek()!='('){
                    sb.append(opDeque.pop());
                }
                opDeque.pop();
            }
            else { // 연산자
                while (!opDeque.isEmpty() && precedence(opDeque.peek()) >= precedence(arr[i])) {
                    sb.append(opDeque.pop());
                }
                opDeque.push(arr[i]);
            }

        }
        while (!opDeque.isEmpty()) {
            sb.append(opDeque.pop());
        }
        System.out.println(sb.toString());

    }
    private static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }
}
