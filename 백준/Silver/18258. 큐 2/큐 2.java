

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st  ;
        int last = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i <cnt ; i++) {
            st = new StringTokenizer(br.readLine()," ");
            String temp = st.nextToken();
            switch (temp){
                case "push":
                    last=Integer.parseInt(st.nextToken());
                    queue.add(last);
                    break;
                case "front":
                    if (queue.size() == 0) {
                        bw.write("-1\n");
                    } else {
                        bw.write(queue.peek() + "\n");
                    }
                    break;
                case "back":
                    if (queue.size() == 0) {
                        bw.write("-1\n");
                    } else {
                        bw.write(last + "\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty() ) {
                        bw.write("1\n");
                    } else {
                        bw.write( "0\n");
                    }
                    break;
                case "pop":
                    if (queue.size() == 0) {
                        bw.write("-1\n");
                    } else {
                        bw.write(queue.poll() + "\n");
                    }
                    break;


            }

        }
        bw.flush();
    }
}
