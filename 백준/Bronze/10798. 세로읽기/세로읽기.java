
import java.io.*;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a[] = new String[5];
        char temp ;
        int max =0;
        for (int i  = 0; i <a.length ; i++) {
            a[i]= br.readLine();
            if(max<a[i].length()) max = a[i].length();
        }

        for (int i = 0; i <max ; i++) {
            for (int j = 0; j <5 ; j++) {
                try {
                    bw.write(a[j].charAt(i));

                }catch (StringIndexOutOfBoundsException e){
                    continue;
                }
            }
        }
        bw.flush();
    }
}

