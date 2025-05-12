import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] arr = br.readLine().toCharArray();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < arr.length; i++) {
         if (Character.isLowerCase(arr[i])){
              bw.write(String.valueOf(arr[i]).toUpperCase());
            }
         else{
             bw.write(String.valueOf(arr[i]).toLowerCase());
            }
        }
        bw.flush();
    }
}