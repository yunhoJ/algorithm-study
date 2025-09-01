import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String a = br.readLine();
        int tmp = a.length()%3;
        if (tmp!=0){
            int fill_cnt = 3-tmp;
            a = "0".repeat(fill_cnt) + a;
        }
        for (int i = 0; i < a.length(); i+=3) {
            int val =(a.charAt(i)- '0') * 4 + (a.charAt(i+1)- '0')*2+ (a.charAt(i+2)- '0');
            sb.append(val);
        }
        System.out.println(sb);
    }
}