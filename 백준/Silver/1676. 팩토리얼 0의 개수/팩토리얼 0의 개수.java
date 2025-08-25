import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        BigInteger result =BigInteger.ONE;
        for (int i = 1; i <= start; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        String data = String.valueOf(result);
        int cnt =0;
        for (int i = data.length()-1; i >=0; i--) {

            if ('0'==data.charAt(i)){
                cnt+=1;
            }
            else {
                break;
            }
        }
        System.out.println(cnt);
    }

}