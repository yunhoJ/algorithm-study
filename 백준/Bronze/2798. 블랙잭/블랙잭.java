
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a[] = br.readLine().split(" ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int card[] = new int[Integer.parseInt(a[0])];
        for (int i = 0; i <card.length ; i++) {
            card[i]=Integer.parseInt(st.nextToken());
        }
        int min=1000000;
        int M = Integer.parseInt(a[1]);
        int result =0;
        
        Loop1:
        for (int i = 0; i <card.length-2 ; i++) {
            for (int j = i+1; j <card.length-1 ; j++) {
                for (int k = j+1; k <card.length ; k++) {
                    result =(card[i]+card[j]+card[k]);
                    if(result ==M){
                        min = 0;

                        break Loop1;
                    } else if (result<M && min>M-result ){
                        min = M-result;

                    }
                }

            }

        }

         System.out.println(M-min);
    }
}

