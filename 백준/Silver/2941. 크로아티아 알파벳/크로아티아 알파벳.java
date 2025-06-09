
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input[] = br.readLine().toCharArray();

        int num =input.length;
        for (int i =input.length-1;i>0;i--){
            if (input[i]=='='){
                try {
                    if (input[i - 1] == 'c' || input[i - 1] == 's' || ((input[i - 1] == 'z') && (input[i - 2] != 'd'))) {
                        num -= 1;
                    } else if ((input[i-1]=='z')&&(input[i-2]=='d')) {
                    num-=2;
                    }
                }
                catch(ArrayIndexOutOfBoundsException e ) {
                    if(input[i - 1] == 'c' || input[i - 1] == 's' || input[i - 1] == 'z') num -= 1;
                }
            }
                if(input[i]=='-'){
                if(input[i-1]=='c'||input[i-1]=='d'){
                    num-=1;
                }
            }if(input[i]=='j'){
                if(input[i-1]=='l'||input[i-1]=='n'){
                    num-=1;
                }
            }
        }
        System.out.println(num);
    }
}
