

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = a;
        if (a>b){
            min = b;
        }
        int result_GCD = 1;
        for (int i = 2; i <=min; i++) {
            if (a%i==0 && b%i==0){
                result_GCD = i;
            }

        }
// 최소공배수 계산
        int result_LCM = (a * b) / result_GCD;

        System.out.println(result_GCD);
        System.out.println(result_LCM);

    }
}
