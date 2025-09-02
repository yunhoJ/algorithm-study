
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        boolean arrtest[] = new boolean[1000001];
        arrtest[1] = arrtest[0]=true;

        for (int i = 2; i <=Math.sqrt(1000000) ; i++) {
            if(arrtest[i]==true){
                continue;
            }
            for (int j = i+i; j <arrtest.length ; j+=i) {
                arrtest[j]=true;

            }

        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i <cnt ; i++) {
            int count = 0;
            int temp = Integer.parseInt(br.readLine());
            for (int j = 1; j <=temp/2 ; j++) {
                if(!arrtest[j]&&!arrtest[temp-j]){
                    count++;
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
    }

}
/*
1 - 1
2 - 10
3 - 100
4 - 1001
5 - 10010


 */