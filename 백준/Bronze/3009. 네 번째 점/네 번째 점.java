import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][]a = new String[3][];
        for (int i = 0; i <3 ; i++) {
             a[i]=br.readLine().split(" ");
        }
        String temp;
        if(a[0][0].equals(a[1][0])){
            temp = a[2][0];
        } else if (a[1][0].equals(a[2][0])) {
            temp = a[0][0];
        }else {
            temp = a[1][0];
        }

        if(a[0][1].equals(a[1][1])){
            temp += " "+a[2][1];
        } else if (a[1][1].equals(a[2][1])) {
            temp += " "+a[0][1];
        }else {
            temp += " " + a[1][1];

        }
        System.out.println(temp);

    }
}