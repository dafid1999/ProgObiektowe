package pl.edu.uwm.obiektowe.s156783.kolo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<Osoba> lista = new ArrayList(6);
        Osoba[] Ludzie = new Osoba[6];

        Ludzie[0] = new Osoba("Dawid", "Borawski", LocalDate.of(1999,7,19));
        Ludzie[1] = new Osoba("Dwayne", "Johnson", LocalDate.of(1972,5,2));
        Ludzie[2] = new Osoba("Mateusz", "Koniec", LocalDate.of(1988,8,9));
        Ludzie[3] = new Osoba("Jan", "Kowalski", LocalDate.of(1939,1,31));
        Ludzie[4] = new Osoba("Adam", "Nowak", LocalDate.of(1991,7,29));
        Ludzie[5] = new Osoba("Aniela", "Nowak", LocalDate.of(1992,12,1));

        Ludzie[5] = new Pracownik("Aniela", "Nowak", LocalDate.of(1992,12,1),"Pielegniarka",2500.016);
        Ludzie[1] = new Pracownik("Dwayne", "Johnson", LocalDate.of(1972,5,2),"Aktor", 500000.0111);
        Ludzie[2] = new Pracownik("Mateusz", "Koniec", LocalDate.of(1988,8,9),"Posel", 100000.091);

        lista.addAll(Arrays.asList(Ludzie));

        for (Osoba i : lista){
            System.out.println(i.toString());
        }

        double suma=0;
        for(Osoba i: lista){
            if(i instanceof Pracownik){
                suma+=((Pracownik) i).getPensja();
            }
        }
        System.out.println("\nSuma pensji wszystkich pracowników wynosi:\n"+(double)Math.round(suma*100)/100);
    }
}
