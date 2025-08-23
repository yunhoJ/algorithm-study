
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int K;
    static int result = -1;
    static  int [] tmp ;
    static  int count =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        K = sc.nextInt();

        tmp = new int[num];

        for(int i = 0 ; i < num ; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        merge_sort(arr, 0, arr.length - 1);
        System.out.print(result);
    }
    public static void  merge_sort(int[] A,int p, int r){
        if(p<r){
            int q = (p+r)/2;
            merge_sort(A,p,q);
            merge_sort(A,q+1,r);
            merge(A,p,q,r);
        }

    }

    private static void merge(int[] A, int p, int q, int r) {
        int i =p;
        int j=q+1;
        int t = 0;
        while (i<=q && j<=r){
            if (A[i]<=A[j]){
                tmp[t++]=A[i++];
            }else{
                tmp[t++]=A[j++];
            }
        }
        while (i<=q){
            tmp[t++] =A[i++];
        }
        while (j<= r) {
            tmp[t++] = A[j++];
        }

        t=0;
        i=p;
        while (i<=r){

            count++;
            if(count==K){
                result = tmp[t];
                break;
            }
            A[i++]=tmp[t++];
        }

    }
}
