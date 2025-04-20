import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result =num;
        char[] Alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Loop1:
        for (int i = 0; i <num ; i++) {
            String text = br.readLine();
            int[] Alphabet_num = new int[26];
            Loop2:
            for (int j = 0;j<Alphabet.length; j++){
                Loop3:
                for(int k=0;k<text.length();k++){
                    if(Alphabet[j]==text.charAt(k)){
                        if(Alphabet_num[j]!=0&&text.charAt(k)!=text.charAt(k-1))
                        {
                            result--;
                            break Loop2;
                        }
                        Alphabet_num[j]++;
                    }
                }

            }
        }
        System.out.println(result);


    }
}