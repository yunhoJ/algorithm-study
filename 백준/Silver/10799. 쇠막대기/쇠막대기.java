import java.io.*;

import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
//        Stack<Integer> stack = new Stack<>();
        int bar =0;
        char [] inputChar =br.readLine().toCharArray();

        int result = 0;
        for (int i = 0; i <inputChar.length-1 ; i++) {
            char leftchar = inputChar[i];
            char rightchar = inputChar[i+1];
            // 레이저일경우
            if (leftchar=='(' && rightchar==')'){
//                result+=stack.size();
                result+=bar;
            } else if (leftchar==')' && rightchar=='(') {
                //패스
                continue;

            } else if (leftchar=='(') {
                // 막대기 추가
//                stack.add(1);
                bar+=1;

            } else if (leftchar==')') {
                // 막대기 제거
//                stack.pop();
                bar -=1;
                result+=1;

            }

        }
        System.out.println(result);

    }
}