package dawid.borawski.java.pl;

import java.util.ArrayList;

public class Zadanie1 {
    public static ArrayList<Integer> append (ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> lista1 = new ArrayList<Integer>(a);
        lista1.addAll(b);
        return lista1;
    }
}
