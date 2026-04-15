
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String [] a = br.readLine().split(" ");
     int b=   Integer.parseInt(a[0]);
     int c = Integer.parseInt(a[1]);
     int sum = 1;
        for (int i = b; i >b-c ; i--) {
            sum*=i;
        }
        if (c==0) System.out.println(sum);
        else System.out.println(sum/factory(c));
    }
    public static int factory(int a){
        if(a<=1)
        {return a;}
        return factory(a-1)*a;
    }
}