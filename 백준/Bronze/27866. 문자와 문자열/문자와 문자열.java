import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int cnt = Integer.parseInt(br.readLine());
        System.out.println(a.charAt(cnt-1));}}