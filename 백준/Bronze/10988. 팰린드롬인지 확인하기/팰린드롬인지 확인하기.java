
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char []  input = br.readLine().toCharArray();
        int check =1;
        for (int i = 0; i < (input.length)/2; i++) {
            if (input[i]!=input[input.length-1-i]){
                check=0;
            }
        }
        System.out.println(check);
    }
}

