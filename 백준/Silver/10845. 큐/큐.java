import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static Deque<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            Integer value = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : null;
            processCommand(command, value);
        }
    }

    private static void processCommand(String command, Integer value) {
        switch (command) {
            case "push":
                queue.addLast(value);
                break;
            case "pop":
                printOrMinusOne(queue.pollFirst());
                break;
            case "size":
                System.out.println(queue.size());
                break;
            case "empty":
                System.out.println(queue.isEmpty() ? 1 : 0);
                break;
            case "front":
                printOrMinusOne(queue.peekFirst());
                break;
            case "back":
                printOrMinusOne(queue.peekLast());
                break;
        }
    }

    private static void printOrMinusOne(Integer val) {
        System.out.println(val == null ? -1 : val);
    }
}
