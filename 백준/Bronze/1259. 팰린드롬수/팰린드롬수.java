import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String temp = br.readLine();
            if (temp.equals("0")){
                break;
            }
            String out = "yes";
            char[] arr = temp.toCharArray();
            for (int i = 0; i < arr.length/2; i++) {
                if (arr[i]!=arr[arr.length-1-i]){
                    out="no";
                }
            }
            System.out.println(out);
        }

}
}