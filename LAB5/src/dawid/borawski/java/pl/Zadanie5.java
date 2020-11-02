package dawid.borawski.java.pl;

import java.util.ArrayList;

public class Zadanie5 {
    public static ArrayList<Integer> reverse(ArrayList<Integer> a){
        int temp;
        int j=0;

        for(int i=a.size();i>0;i--){
            temp=a.get(j);
            if(a.size()/2<i) {
                a.set(j, a.get((i - 1)));
                a.set(i - 1, temp);
                j++;
            }
        }
        return a;
    }
}
