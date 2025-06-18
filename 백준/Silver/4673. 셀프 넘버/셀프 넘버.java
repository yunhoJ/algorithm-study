

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet<>();
        for (int i=1 ; i<=10000;i++){
            set.add(i);
        }
        for (int i=1;i<=10000;i++){
            set.remove(d(i));
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static int d(int x){
        int result ;
        if (x<10){
            result=x+(x%10);

        } else if (x<100) {
            result=x+(x/10)+(x%10);

        } else if (x<1000) {
            result=x+(x/100)+((x/10)%10)+(x%10);

        }else if(x<10000){
            result=x+(x/1000)+(x/100%10)+(x/10%10)+x%10;
        }
        else result=10001;
        return result;
    }
}

