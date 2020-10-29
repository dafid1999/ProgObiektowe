package dawid.borawski.java.pl;

import java.util.ArrayList;

public class Zadanie3 {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Integer temp;

        for (int i = 0; i < lista.size(); i++) {
            temp = a.get(0);
            for (int j = 0; j < lista.size(); j++) {
                if (temp > a.get(j) & temp < b.get(j)) {
                    temp = a.get(j);
                }
                else if(temp < a.get(j) & temp > b.get(j)){
                    temp = b.get(j);
                }
            }
            lista.add(temp);
        }
        return lista;
    }
}
