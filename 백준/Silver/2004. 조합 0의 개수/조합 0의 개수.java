

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int val=count_p(a,2)-count_p(b,2)-count_p(a-b,2);
        int val2=count_p(a,5)-count_p(b,5)-count_p(a-b,5);
        System.out.println(Math.min(val2,val));

    }

    private static int count_p(int a,int p)
    {
        int cnt = 0;
        while (a>0){
            a/=p;
            cnt+=a;
        }
        return cnt;

    }
}
