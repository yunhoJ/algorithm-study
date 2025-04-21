import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int arr[] = new int[cnt];
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        int min = 0;
        int[] k_arr = new int[arr.length];
        int num =0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]== arr[i+1]){
                num++;
            }else {
                k_arr[i]=num;
                num=0;
                if(k_arr[i]>min)min=k_arr[i];
            }
        }
        if(num!=0) {
            if(num>min)min=num;
            k_arr[arr.length - 1] = num;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <k_arr.length ; i++) {
            if(k_arr[i]==min) {
                arrayList.add(i);
            }
        }
        System.out.println(Math.round((float) sum / cnt));
        System.out.println(arr[(cnt / 2)]);
        if (arrayList.size()>1) System.out.println(arr[arrayList.get(1)]);
        else System.out.println(arr[arrayList.get(0)]);
        System.out.println(Math.abs(arr[cnt - 1] - arr[0]));
    }
}