package dawid.borawski.java.pl;

import java.util.ArrayList;

public class Zadanie2 {
    public static ArrayList<Integer> merge (ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i=0;i<(a.size()+b.size());i++){
            if(a.size()>i){
                lista.add(a.get(i));
            }
            if(b.size()>i){
                lista.add(b.get(i));
            }
        }
        return lista;
    }
}
