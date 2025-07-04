
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int cnt = Integer.parseInt(br.readLine());
       Loop1:
        for (int i = 0; i <cnt ; i++) {
            Stack<String> stack = new Stack<>();
            char[] temp=br.readLine().toCharArray();
            for (int j = 0; j <temp.length ; j++) {
                if(temp[j]=='('){

                    stack.push("0");
                }
                else {
                    try {
                        stack.pop();
                    }
                    catch (Exception e){
                        bw.write("NO"+"\n");
                        continue Loop1;
                    }
                }

            }
            if (stack.empty()){
                bw.write("YES"+"\n");
            }else bw.write("NO"+"\n");


        }bw.flush();
    }
}