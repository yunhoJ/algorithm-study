import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    static int[] arr = new int[1000001];
    public static void main(String[] args){
        arr[1] = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 2; i <=N; i++) {
            arr[i] = arr[i-1] +1;
            if (i%2==0) {
                arr[i] = Math.min(arr[i],arr[i/2]+1);
            }
            if (i%3==0) {
                arr[i] = Math.min(arr[i],arr[i/3]+1);
            }
        }
        System.out.println(arr[N]);
    }
}

