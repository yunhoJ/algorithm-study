
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> deque = new LinkedList<>();
        br.readLine();
        String TF[] = br.readLine().split(" ");
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <TF.length ; i++) {
            String temps=st.nextToken();
            if (TF[i].equals("0")){
                
                deque.add(temps);
            }
        }



        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt; i++) {
            deque.addFirst(st.nextToken());
            bw.write(deque.pollLast()+" ");
//            String temp =st.nextToken();
//            for (int j = 0; j < TF.length; j++) {
//                if (TF[j].equals("0")) {
//                    deque.addLast(temp);
//                    temp = deque.pollFirst();
//                } else {
//                    deque.addLast(deque.pollFirst());
//                }
//
//            }
//            bw.write(temp + " ");
        }
        bw.flush();
    }
}