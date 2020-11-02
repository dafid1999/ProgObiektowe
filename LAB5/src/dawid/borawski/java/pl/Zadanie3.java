package dawid.borawski.java.pl;

import java.util.ArrayList;

public class Zadanie3 {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        int sizea= a.size();
        int sizeb= b.size();
        
        ArrayList<Integer> lista= new ArrayList<>();
        
        int ind_a=0;
        int ind_b=0;
        
        for(int i=0;i<sizea+sizeb;i++){
            if(ind_a<sizea&&ind_b<sizeb){
                if(a.get(ind_a)<b.get(ind_b)){
                    lista.add(a.get(ind_a));
                    ind_a++;
                }
                else{
                    lista.add(b.get(ind_b));
                    ind_b++;
                }
            }
            else if(ind_a<sizea){
                lista.add(a.get(ind_a));
                ind_a++;
            }
            else{
                lista.add(b.get(ind_b));
                ind_b++;
            }
        }
        return lista;
    }
}
