import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Character> queue = new LinkedList<>();
        String init_txt = br.readLine();
        int size = init_txt.length();
        for (int i = 0; i <size ; i++) {
            queue.add(init_txt.charAt(i));
        }

        int num = Integer.parseInt(br.readLine());
//        int init_index = size;
        //커서역할
        ListIterator<Character> iter = queue.listIterator(size);
        for (int i = 0; i <num ; i++) {
            String[] tmp = br.readLine().split(" ");

            switch (tmp[0]){
                case "L":
                    if (iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case "D":
                    if (iter.hasNext()) {
                        iter.next();
                    }
                    break;
                case "B":
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case "P":
                    iter.add(tmp[1].charAt(0));
                    break;
            }
        }
        for (char i : queue) {
            bw.write(i);
        }
        bw.flush();
    }
}
