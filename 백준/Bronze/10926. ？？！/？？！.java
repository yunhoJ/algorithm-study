import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A=scanner.nextLine();
        String low=A.toLowerCase();
       if(low.length()<=50){
           System.out.println(low+"??!");
       }
    }
}