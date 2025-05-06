import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;
        A=sc.nextInt();
        B=sc.nextInt();
        if((A<100|A>999)|B<100|B>999)
        {
            throw new RuntimeException();
        }
        System.out.println(A*(B%10));
        System.out.println(A*(B%100/10));
        System.out.println(A*(B/100));
        System.out.println(A*(B));
    }
}