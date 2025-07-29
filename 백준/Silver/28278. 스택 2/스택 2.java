import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st ;
        for (int i = 0; i <cnt ; i++) {
            st= new StringTokenizer(br.readLine()," ");
            if( st.countTokens()==1){
                int num = Integer.parseInt(st.nextToken());
                switch (num){
                    case 2:
                        if (!stack.empty()){
                            bw.write(stack.pop()+"\n");
                        }else {
                            bw.write(-1+"\n");
                        }
                        break;
                    case 3:
                        bw.write(stack.size()+"\n");
                        break;
                    case 4:
                        if (!stack.empty()){
                            bw.write(0+"\n");
                        }else {
                            bw.write(1+"\n");
                        }
                        break;
                    case 5:
                        if (!stack.empty()){
                            bw.write(stack.peek()+"\n");
                        }else {
                            bw.write(-1+"\n");
                        }
                        break;
                }
            }else {
                String temp = st.nextToken();

                stack.add(Integer.parseInt(st.nextToken()));
            }
        }
        bw.flush();
        bw.close();
    }

}