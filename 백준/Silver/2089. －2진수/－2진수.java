import java.util.Scanner;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println(0);
            return;   // 바로 종료해야 함
        }
        while (a!=0){
            int n = a%(-2);
            a/=-2;
            if (n<0){
                n+=2;
                a+=1;
            }
            sb.append(n);

        }
        System.out.println(sb.reverse().toString());
    }
}
