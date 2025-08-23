import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = br.readLine().toCharArray();

        for(char input: arr){
            bw.write(ROT(input));
        }
        bw.flush();


    }
    private  static  char ROT(char input){
        if (Character.isUpperCase(input)){
            int tmp=(int) input+13;
            if (tmp>(int) 'Z'){
                tmp=tmp - 26;
            }
            return (char) tmp;
        }else if (Character.isLowerCase(input)){
            int tmp=(int) input+13;
            if (tmp>(int) 'z'){
                tmp=tmp - 26;
            }
            return (char) tmp;
        }else{
            return input;
        }

    }
}