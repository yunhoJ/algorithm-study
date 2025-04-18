
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        int a [] = new int[st.length()];
        for (int i = 0; i <a.length ; i++) {
            a[i] = (st.charAt(i)-'0');
        }

        for (int i = 0; i < a.length-1 ; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i:a) {
            System.out.print(i);
        }
    }
}
