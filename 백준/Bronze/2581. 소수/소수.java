
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        boolean check ;
        ArrayList<Integer> arr =new ArrayList<>();
        int sum =0;
        for (int i = A; i <=B ; i++) {
            check=true;
            if(i==1) check=false;
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    check=false;
                }
            }
            if (check) {
                arr.add(i);
                sum += i;
            }
        }
        if(arr.isEmpty()) bw.write("-1");
        else bw.write(sum+"\n"+ arr.get(0));
        
        bw.flush();
    }
}

