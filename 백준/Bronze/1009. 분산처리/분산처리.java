

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count =sc.nextInt();
        for (int i = 0; i <count ; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int temp=1;
            for (int j = 0; j < b ; j++) {
                temp = (temp * a) % 10;
            }
            if (temp==0){
                bw.write(10 + "\n");
            }else{
                bw.write(temp + "\n");    
            }
        }
        bw.flush();
    }

}

