
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i <cnt ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int n = Integer.parseInt(st.nextToken());
            int [] arr =new int[n];
            for (int j = 0; j <n ; j++) {
                arr[j] =Integer.parseInt(st.nextToken());
            }
            long sum=0;
            for (int j = 0; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
//                    System.out.println(arr[j] +"  "+arr[k]);
                    sum += GCD(arr[j],arr[k]);

                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }
    private static int GCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
//    private static int GCD(int a, int b) {
//        int min_value = Math.min(a,b);
//        for (int i = min_value; i >0; i--) {
//            if ((a%i==0)&& (b%i==0)){
//                return i;
//            }
//        }
//        return  0;
//    }

}
