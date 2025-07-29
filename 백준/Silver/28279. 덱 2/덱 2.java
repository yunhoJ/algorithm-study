


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int cnt = Integer.parseInt(br.readLine());
       Deque <Integer> deque = new LinkedList<>();
       StringTokenizer st;
        for (int i = 0; i <cnt ; i++) {
            st = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(st.nextToken());
            switch (key){
                case 1:
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if (deque.size()!=0){
                        bw.write(deque.pollFirst()+"\n");
                    }else {
                        bw.write(-1+"\n");
                    }
                    break;
                case 4:
                    if (deque.size()!=0){
                        bw.write(deque.pollLast()+"\n");
                    }else {
                        bw.write(-1+"\n");
                    }
                    break;
                case 5:
                        bw.write(deque.size()+"\n");
                    break;
                case 6:
                    if (deque.isEmpty()){
                        bw.write(1+"\n");
                    }else {
                        bw.write(0+"\n");
                    }
                    break;
                case 7:
                    if (!deque.isEmpty()){
                        bw.write(deque.peekFirst()+"\n");
                    }else {
                        bw.write(-1+"\n");
                    }
                    break;
                case 8:
                    if (!deque.isEmpty()){
                        bw.write(deque.peekLast()+"\n");
                    }else {
                        bw.write(-1+"\n");
                    }
                    break;
            }

        }
        bw.flush();
    }
}
