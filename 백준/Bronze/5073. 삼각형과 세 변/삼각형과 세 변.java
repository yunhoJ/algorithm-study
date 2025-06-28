import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int temp1 = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st.nextToken());
            int temp3 = Integer.parseInt(st.nextToken());

            int[] arr = {temp1,temp2,temp3};
            Arrays.sort(arr);
            if(temp1==0&&temp2==0&&temp3==0){
                break;
            }
            if(arr[0]+arr[1]<=arr[2]){
                System.out.println("Invalid");
            }
            else if(temp1==temp2&&temp1==temp3){
                System.out.println("Equilateral");
            } else if (temp1==temp2||temp2==temp3||temp1==temp3) {
                System.out.println("Isosceles");
            }else {
                System.out.println("Scalene");
            }
        }
    }
}