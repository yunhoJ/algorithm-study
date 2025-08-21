import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr_num = new int [N];
        char[] chars = br.readLine().toCharArray();
//        피연산자 초기화
        for (int i = 0; i <N ; i++) {
            arr_num[i]=Integer.parseInt(br.readLine());
        }
        Deque<Double> deque = new ArrayDeque<>();

        for (int i = 0; i <chars.length ; i++) {
            int tmp = (int) chars[i];
            if (tmp<=90 && tmp>=65){
                deque.add((double)arr_num[tmp-65]);
            }
            else{
                double a = deque.removeLast();
                double b=deque.removeLast();
                switch (chars[i])
                {

                    case '+':
                        deque.add(b+a);
                        break;
                    case '-':
                        deque.add(b-a);
                        break;
                    case '*':
                        deque.add(b*a);
                        break;
                    case '/':
                        deque.add(b/a);
                }
            }

        }
        System.out.printf("%.2f\n", deque.removeLast());
    }

}