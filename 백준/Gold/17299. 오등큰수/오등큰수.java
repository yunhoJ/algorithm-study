import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[cnt];
        int [] result = new int[cnt];
        int [] change = new int[1000001];

        for (int i = 0; i <cnt ; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            change[num]+=1;
            result[i] =-1;
        }
        Stack<Integer>stack = new Stack<>();
        for (int i = 0; i <cnt ; i++) {
            while (!stack.isEmpty() && change[arr[stack.peek()]]<change[arr[i]]){
                result[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        for (int num : result) {
            bw.write(num + " ");
        }
        bw.flush();

    }

}