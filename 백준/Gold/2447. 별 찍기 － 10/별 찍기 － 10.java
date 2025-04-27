
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main {
    static String [][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        arr = new String[cnt][cnt];
        star(0,0,cnt);

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                bw.write(arr[i][j]!=null?arr[i][j]:" ");
            }
            bw.write("\n");
        }
        bw.flush();

    }

    public static void  star(int x,int y, int N){

        if (N==1){
            arr[x][y]="*";
        }
        else{
            for (int i = 0; i <3 ; i++) {
                for (int j = 0; j <3 ; j++) {
                    if (i==1 && j==1){
                        continue;
                    }
                    star(x+i*(N/3),y+j*(N/3),N/3);

                }
            }
        }
    }


}

