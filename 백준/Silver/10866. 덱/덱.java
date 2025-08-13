import java.io.*;

import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque =  new ArrayDeque<>();
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i <N ; i++) {
            String[] command=br.readLine().split(" ");

            switch (command[0]){
                case "push_front":
                    deque.addFirst(Integer.parseInt(command[1]));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(command[1]));
                    break;
                case "pop_front":
                    if (deque.isEmpty()){
                        stringBuilder.append("-1\n");
                    }else {
                        stringBuilder.append(deque.pollFirst()).append('\n');;
                    }
                    break;
                case "pop_back":
                    if (deque.isEmpty()){
                        stringBuilder.append("-1\n");
                    }else {
                        stringBuilder.append(deque.pollLast()).append('\n');;
                    }
                    break;
                case "front":
                    if (deque.isEmpty()){
                        stringBuilder.append("-1\n");
                    }else {
                        stringBuilder.append(deque.getFirst()).append('\n');;
                    }
                    break;
                case "back":
                    if (deque.isEmpty()){
                        stringBuilder.append("-1\n");
                    }else {
                        stringBuilder.append(deque.getLast()).append('\n');;
                    }
                    break;
                case "size":
                    stringBuilder.append(deque.size()).append('\n');;
                    break;
                case "empty":
                    if (deque.isEmpty()){
                        stringBuilder.append("1\n");
                    }else {
                        stringBuilder.append("0\n");
                    }


            }
            

        }
        System.out.println(stringBuilder.toString());
    }
}
