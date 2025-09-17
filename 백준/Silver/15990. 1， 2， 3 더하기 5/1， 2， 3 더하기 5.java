import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    static  long pay [][] =new long[100002][4];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
//       초기값 세팅
        pay[1][1] = 1;
        pay[1][2] = 0;
        pay[1][3] = 0;

        pay[2][1] = 0;
        pay[2][2] = 1;
        pay[2][3] = 0;

        pay[3][1] = 1;
        pay[3][2] = 1;
        pay[3][3] = 1;

        for (int i = 0; i <T ; i++) {
            bw.write(dp(Integer.parseInt(br.readLine()),0)+"\n");

        }

        bw.flush();
    }

    private static long dp(int i,int check) {
        if (pay[i][1]+pay[i][2]+pay[i][3]!=0){
            if( check==1){
                return pay[i][2]+pay[i][3];    
            } else if (check==2) {
                return pay[i][1]+pay[i][3];
            } else if (check==3) {
                return  pay[i][1]+pay[i][2];
            }else{
                return (pay[i][1] + pay[i][2] + pay[i][3]) % 1000000009;
            }

        }
        pay[i][1] = dp(i-1,1);
        pay[i][2] = dp(i-2,2);
        pay[i][3] = dp(i-3,3);

        if( check==1){
            return (pay[i][2]+pay[i][3])%1000000009;
        } else if (check==2) {
            return (pay[i][1]+pay[i][3])%1000000009;
        } else if (check==3) {
            return  (pay[i][1]+pay[i][2])%1000000009;
        }else{
            return (pay[i][1]+pay[i][2]+pay[i][3])%1000000009;
        }

    }
}

