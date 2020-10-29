package dawid.borawski.java.pl;

import java.sql.Array;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        System.out.println("Plik startowy LABu5 wystartował poprawnie!");
        ArrayList<Integer>a = new ArrayList<>();
        ArrayList<Integer>b = new ArrayList<>();

        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        System.out.println("Zadanie1");
        wypisz(Zadanie1.append(a,b));
        System.out.println("\nZadanie2");
        wypisz(Zadanie2.merge(a,b));
        System.out.println("\nZadanie3");
        wypisz(Zadanie3.mergeSorted(a,b));
    }
    public static void wypisz(ArrayList<Integer>a){
        for(int i=0;i<a.size();i++){
            System.out.println(i+1+". "+a.get(i));
        }
    }
}
