import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> score = Map.of("A+",4.5,"A0",4.0,"B+",3.5,"B0",3.0,"C+",2.5,"C0",2.0,"D+",1.5,"D0",1.0,"F",0.0);

        int cnt=0;
        double sum =0;
        for (int i = 0; i <20 ; i++) {
            String [] input =br.readLine().split(" ");
            if(!input[2].equals("P")){
                cnt+=Float.parseFloat(input[1]);
                sum+=Float.parseFloat(input[1])*score.get(input[2]);
            }
        }
        System.out.println(sum/cnt);
    }
}
