
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt=0 ;
        for (int i =666; i <3000000 ; i++) {
            String a = String.valueOf(i);
            if(a.contains("666")){
                cnt++;
            }
            if(N==cnt){
                System.out.println(i);
                break;
            }

        }
    }
}
