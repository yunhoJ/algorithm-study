

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Set<String> strings = new HashSet<>();
        int count = 0;
        for (int i = 0; i <num ; i++) {
            String text= br.readLine();
            if(text.equals("ENTER")){
                count+=strings.size();
                strings=new HashSet<>();
            }
            else strings.add(text);
        }
        count+=strings.size();
        System.out.println(count);


    }
}