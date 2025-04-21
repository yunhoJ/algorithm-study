
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        //큐 세팅
        for (int i = 1; i <=num ; i++) {
            queue.add(i);
        }
        while (queue.size()>1){
            queue.remove();
            int temp = queue.remove();
            queue.add(temp);
        }
        System.out.println(queue.poll());

    }
}
