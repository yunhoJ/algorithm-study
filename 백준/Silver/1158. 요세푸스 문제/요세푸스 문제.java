
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        Queue<Integer> integerQueue = new LinkedList<>();
        builder.append("<");
        for (int i = 1; i <= N; i++) {
            integerQueue.add(i);
        }

        while (integerQueue.size() != 1) {
            for (int i = 0; i <K-1 ; i++) {
                integerQueue.add(integerQueue.poll());
            }
            builder.append(integerQueue.poll());
            builder.append(", ");
        }
        builder.append(integerQueue.poll());
        builder.append(">");
        System.out.println(builder.toString());
    }
}
