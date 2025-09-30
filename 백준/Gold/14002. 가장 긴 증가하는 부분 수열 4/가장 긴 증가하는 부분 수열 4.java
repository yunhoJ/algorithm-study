import java.io.*;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[A];
        int[] reuslt = new int[A];
        String[] reuslt_str = new String[A];
        for (int i = 0; i <A ; i++) {
            reuslt_str[i]=st.nextToken();
            arr[i] = Integer.parseInt(reuslt_str[i]);


        }

        for (int i = 0; i < A; i++) {
            for (int j = 0; j <i ; j++) {
                if (arr[j]<arr[i]){
                    int max = Math.max(reuslt[i], reuslt[j] + 1);
                    if (max==reuslt[j]+1){
                        reuslt_str[i]=reuslt_str[j]+ " "+arr[i];
                    }
                    reuslt[i] = max;

                }
            }
//            reuslt_str[i]=arr[i]+"";
        }
        int max = 0;
        int max_index = 0;
        for (int i = 0; i <A ; i++) {
            if (max<reuslt[i]){
                max=reuslt[i];
                max_index=i;
            }

        }
        System.out.println(max+1);

        System.out.println(reuslt_str[max_index]);
    }
}




