import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double A=scanner.nextInt();
        double B=scanner.nextInt();
        if(A>0&B<10){
            System.out.println(A/B);
        }
    }
}