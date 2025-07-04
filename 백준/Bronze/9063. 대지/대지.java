import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int temp1 ;
        int temp2 ;
        int max1 = 1000000,max2=1000000,min1=-1000000,min2=-10000000;
        StringTokenizer st;
        if(a==1){
            System.out.println(0);
        }else {
            for (int i = 0; i <a ; i++) {
                st = new StringTokenizer(br.readLine());
                temp1=Integer.parseInt(st.nextToken());
                temp2=Integer.parseInt(st.nextToken());
                if(temp1>min1){
                    min1=temp1;
                }
                if(temp2>min2){
                    min2=temp2;
                }
                if(temp1<max1){
                    max1=temp1;
                }
                if(temp2<max2){
                    max2=temp2;
                }
            }
            System.out.println((min1-max1)*(min2-max2));
        }
    }
}