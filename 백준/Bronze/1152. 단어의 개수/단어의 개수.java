import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().trim().split(" ");

        if ("".equals(a[0]))
            System.out.println(0);
        else System.out.println(a.length);

    }
}