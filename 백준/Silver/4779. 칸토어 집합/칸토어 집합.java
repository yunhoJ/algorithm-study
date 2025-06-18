import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while ((s=br.readLine())!=null && !s.isEmpty()){
            int temp =(int)Math.pow(3,Integer.parseInt(s));
            char[] dash = new char[temp];
            Arrays.fill(dash,'-');

            dash=canto(temp,dash);
            for (int i = 0; i <temp ; i++) {
                bw.write(dash[i]);
            }
            bw.write("\n");

        }
        bw.flush();

    }
    public static char[] canto(int num ,char [] arr){
//        System.out.println(num);
        int temp = num/3;
        int cnt = 0;
        boolean check=false;
        for (int i = temp; i <arr.length ; i++) {
            if (check && cnt>=0){

                if (cnt==0){
                    check = false;
                }else {
                    cnt --;
                }
            }else {
                cnt++;
                if (cnt<=temp){
                    arr[i]=' ';
                    if (cnt==temp) {
                        check = true;
                        cnt --;
                    }
                }
            }
        }
        if (num==1){
            return arr;
        }
//        System.out.println(Arrays.toString(arr));
        return canto(num/3,arr);
    }
}