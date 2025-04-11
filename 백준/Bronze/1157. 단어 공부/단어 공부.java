import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] input = br.readLine().toUpperCase().toCharArray();
        int [] arr = new int[26];
        Arrays.fill(arr,0);
        for (char a:input) {
            arr[a-'A']+=1;
        }
        int Max =0;
        for (int i = 0; i < arr.length ; i++) {
            if (Max<arr[i]){
                Max=arr[i];
            }
        }int cnt=0;
        int result = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (Max==arr[i]){
                result=i;
                cnt++;
            }
        }
        if (cnt==1){
            System.out.println((char)(result+'A'));
        }else System.out.println('?');
    }
}
