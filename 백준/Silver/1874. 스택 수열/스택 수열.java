import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> integerStack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int num = 1;
        for (int i = 0; i <N ; i++) {
            int a = Integer.parseInt(br.readLine());

            while (a>=num){
                integerStack.push(num);
                sb.append("+\n");
                num+=1;
            }
            if (integerStack.pop()==a){
                sb.append("-\n");
            }else{
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }
        System.out.println(sb.toString());
    }
}
