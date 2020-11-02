package dawid.borawski.java.pl;

import java.util.ArrayList;

public class Zadanie4 {
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> lista= new ArrayList<>();

        for(int i=a.size();i>0;i--){
            lista.add(a.get(i-1));
        }

        return lista;
    }
}
