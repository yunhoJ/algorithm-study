import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int[] c= {1,1,2,2,2,8};
        int[] num =new int[6];
        String result ="";
       Scanner sc = new Scanner(System.in);
       for (int i =0 ; i<num.length;i++){
           num[i]=sc.nextInt();
           result+=(c[i]-num[i]+" ");
       }
        System.out.println(result);
    }
}