
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stacks = new Stack<>();
        boolean checker = false;
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            char word = input.charAt(i);
            if (word == ' ' || word == '<') {
//                스텍 초기화
                while (!stacks.isEmpty()) {
                    System.out.print(stacks.pop());
                }

            }

            if (word == '<' || word == '>') {
                checker = !checker;
            }
            if (checker) {
                System.out.print(word);
                continue;
            }
            if (word == '>') {
                System.out.print(word);
                continue;
            }
            if (word==' '){
                System.out.print(' ');
                continue;
            }
            stacks.add(input.charAt(i));


        }
        while (!stacks.isEmpty()) {
            System.out.print(stacks.pop());
        }

    }
}
