import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Integer, Boolean> primeCache = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            int tmp=Integer.parseInt(br.readLine());
            if (tmp==0){
                break;
            }
            boolean checker = false;
            for (int i = 3; i <= tmp / 2; i += 2) { // 절반까지만 확인
                if (is_prime(i) && is_prime(tmp - i)) {
                    sb.append(tmp).append(" = ").append(i).append(" + ").append(tmp - i).append("\n");
                    checker = true;
                    break;
                }
            }
            if (!checker){
                sb.append("Goldbach's conjecture is wrong.\n");
            }
        }
        System.out.println(sb.toString());
    }

    private static boolean is_prime(int i) {
        if (primeCache.containsKey(i)){
            return primeCache.get(i);
        }
        if (i<2){
            return false;
        }
        for (int j = 3; j *j<=i ; j+=2) {
            if(i%j==0){
                return false;
            }
        }
        primeCache.put(i,true);
        return true;
    }
}