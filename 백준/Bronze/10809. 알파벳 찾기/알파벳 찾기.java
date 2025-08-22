import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        char al[] = new char[26];
        int result [] = new int[26];
        char init ='a';
        for(int i = 0 ;i<26;i++){
            result[i] =  -1;
            al[i]=init;
            init+=1;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
        char s[] = br.readLine().toCharArray();
        for (int i = 0; i<s.length;i++ ){
            for (int j=0;j<al.length;j++){
                if ((s[i]==al[j])&(result[j]==-1)){
                    result[j]=i;
                }
            }
        }
        for (int i = 0; i <result.length ; i++) {
            bw.write(result[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
