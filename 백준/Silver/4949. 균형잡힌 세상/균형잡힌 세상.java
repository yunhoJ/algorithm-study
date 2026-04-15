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
       
       Stack<String> stack = new Stack<>();
        String str = "";
        while (!(str =br.readLine()).equals(".")){
            boolean check=true;
            char[] arrTemp=str.toCharArray();
           stack.clear();
           for (int i = 0; i <arrTemp.length ; i++) {
               if(arrTemp[i]=='('){
                   stack.push("(");
               } else if (arrTemp[i]=='[') {
                   stack.push("[");
               } else if (arrTemp[i]==')') {
                   if(!stack.empty()){
                       if (stack.peek().equals("(")){
                           stack.pop();
                       }
                       else {
                           check=false;
                           break;
                       }
                   }else {
                       check=false;
                       break;
                   }

               }
               else if (arrTemp[i]==']') {
                   if(!stack.empty()){
                       if (stack.peek().equals("[")){
                           stack.pop();
                       }
                       else {
                           check=false;
                           break;
                       }
                   }else {
                       check=false;
                       break;
                   }

               }
           }
           if(stack.isEmpty()  && check){
              bw.write("yes\n");
           }else bw.write("no\n");
       }
       bw.flush();
    }
}