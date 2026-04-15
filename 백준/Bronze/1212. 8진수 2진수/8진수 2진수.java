import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String a = br.readLine();
        for (int i = 0; i <a.length() ; i++) {
            String test=get_bin(a.charAt(i)-'0');
            if (i==0){
                sb.append(Integer.parseInt(test));
            }
            else{
                sb.append(test);
            }
        }
        System.out.println(sb.toString());
    }

    private static String get_bin(int tmp) {
        StringBuilder sb = new StringBuilder();
        while (true){
            if (tmp<1){
                break;
            }
            sb.append(tmp%2);
            tmp/=2;
        }
        while (sb.length()<3){
            sb.append(0);
        }
        return sb.reverse().toString();
    }
}
