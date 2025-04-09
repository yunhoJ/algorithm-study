import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        char str[]=br.readLine().toCharArray();
        if (cnt==1){
            System.out.println(str);
        }else {
            for (int i = 1; i < cnt; i++) {
                char temp[] = br.readLine().toCharArray();
                for (int j = 0; j <temp.length ; j++) {
                    if (str[j]!=temp[j]){
                        str[j]='?';
                    }
                }
            }
            System.out.println(str);
        }
    }
}

